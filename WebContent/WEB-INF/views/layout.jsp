<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

    <!-- ... -->

    <title><tiles:insertAttribute name="title" /></title>
  </head>

  <body>
    <tiles:insertAttribute name="navigation" />

    <div class="container">
      <tiles:insertAttribute name="body" />
    </div>
  </body>
</html>