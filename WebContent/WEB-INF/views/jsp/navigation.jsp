<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<nav>
  <div class="nav-wrapper">
    <div class="container">
      <a class="brand-logo"> <spring:message code="${ titreCode }"></spring:message></a>
      <c:choose>
	      <%-- Si l'administrateur n'est pas connecté --%>
	      <c:when test="${ typeUtilisateur ==null }">
			  </c:when>
			  
			  <%-- Si l'administrateur est connecté --%>
			  <c:when test="${ typeUtilisateur !=null }">
			    <ul id="nav-mobile" class="right hide-on-med-and-down">
            <li><a href="${ pageContext.request.contextPath }/account/home"><spring:message
                  code="nav.home" /></a></li>
          </ul>
			  </c:when>
			</c:choose>
    </div>
   </div>
</nav>