<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<form:form method="post" modelAttribute="admin">
  <input type="hidden" name="action" value="login" />
  
  <div class="input-field">
    <i class="material-icons prefix">account_circle</i>
    <input id="name" type="text" class="validate" name="username" value="${ admin.username }" />
    <label for="name"><spring:message code="login.form.label.username"/></label>
    <form:errors class="red-text" path="username" />
  </div>
  
  <div class="input-field">
    <i class="material-icons prefix">vpn_key</i>
    <input id="password" type="password" class="validate" name="password" value="${admin.password }" />
    <label for="name"><spring:message code="login.form.label.password"/></label>
    <form:errors class="red-text" path="password" />
  </div>
  
  <button class="btn waves-effect waves-light" type="submit">
    <spring:message code="login.form.submit" /> <i class="material-icons right">send</i>
  </button>
</form:form>