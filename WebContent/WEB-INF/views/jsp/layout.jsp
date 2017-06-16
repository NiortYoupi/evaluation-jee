<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />    
    <!-- Materialize -->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="/evaluation-jee/css/materialize.min.css"
      media="screen,projection" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
      
    <!-- <title>${ pageTitle }</title>  -->
    
    <c:set var="titreCode" scope="request">
      <tiles:insertAttribute name="title" ignore="true" />
    </c:set>
    
    <title><spring:message code="${ titreCode }"></spring:message></title>
  </head>

  <body>
    <tiles:insertAttribute name="navigation" />

    <div class="container">
      <tiles:insertAttribute name="body" />
    </div>
    
  <script type="text/javascript" src="/evaluation-jee/css/materialize.min.css"></script> 
  <script <tiles:insertAttribute name="js" /> ></script>    
  </body>
</html>