<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<h1><spring:message code="home.h1" arguments="${administrateur.prenom}, ${administrateur.nom}" /></h1>
<a class="btn red waves-effect waves-light" href="${ pageContext.request.contextPath }/logout">
  <spring:message code="home.button.deconnexion" /> <i class="material-icons right">lock_open</i>
</a>