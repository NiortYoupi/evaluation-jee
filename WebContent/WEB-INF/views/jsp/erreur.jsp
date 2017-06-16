<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<p><spring:message code="error.texte" /></p>

<form method="GET" action="account/login">
    <button class="btn waves-effect waves-light" type="submit" name="action"><spring:message code="error.login" />
      <i class="material-icons right">send</i>
    </button>
</form>