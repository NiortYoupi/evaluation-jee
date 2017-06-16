package com.sopra.security;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sopra.model.constantes.ConstanteServlet;

/**
 * Servlet Filter implementation class SecurityFilter
 */
@WebFilter("/*")
public class SecurityFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SecurityFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("DESTRUCTION DU FILTRE");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		String myURI = request.getRequestURI();
		
		Set<SecurityMatch> myAcceptedURIs = new HashSet<>();
		boolean needSecurityCheck = true;
		
		//Tout le monde
		myAcceptedURIs.add(new SecurityMatch("js/", SecurityType.Anonyme));
		myAcceptedURIs.add(new SecurityMatch("css/", SecurityType.Anonyme));
		myAcceptedURIs.add(new SecurityMatch("font/", SecurityType.Anonyme));
		myAcceptedURIs.add(new SecurityMatch("fonts/", SecurityType.Anonyme));
		myAcceptedURIs.add(new SecurityMatch("/api", SecurityType.Anonyme));
		myAcceptedURIs.add(new SecurityMatch("/erreur", SecurityType.Anonyme));
		myAcceptedURIs.add(new SecurityMatch("/login", SecurityType.Anonyme));
		
		//Seulement les utilisateurs connecté (en l'occurence seulement les administrateurs ici)
		myAcceptedURIs.add(new SecurityMatch("/home", SecurityType.Logged));
		myAcceptedURIs.add(new SecurityMatch("/logout", SecurityType.Logged));
		myAcceptedURIs.add(new SecurityMatch("/candidats", SecurityType.Logged));
		
		for (SecurityMatch forAcceptedURI : myAcceptedURIs)
		{
			if (forAcceptedURI.isLogged(myURI, (SecurityPersonne)request.getSession().getAttribute(ConstanteServlet.user)))
			{
				needSecurityCheck = false;
				break;
			}
		}
		
		
		if (needSecurityCheck)
		{
			response.sendRedirect(String.format("%s/erreur", request.getContextPath()));
			return;
		}
		
		
		chain.doFilter(request, response);

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("INITIALISATION DU FILTRE");
	}

}
