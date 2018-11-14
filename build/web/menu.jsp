<%-- 
    Document   : menu
    Created on : 12/11/2018, 07:44:17 AM
    Author     : Andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
 <c:if test="${empty login}">
    |<a href="login.jsp">Login</a>|
    |<a href="registrar.jsp">Registrar</a>
    |<a href="chat.jsp">Rchat</a>
    

 </c:if>

  <c:if test="${not empty login}">
    |<a href="UsuariosController?action=logout">Logout</a>|
    |<a href="UsuariosController?action=list">usuarios</a>

 </c:if>
    |<a href="about.jsp">About</a>|
    

<hr/>