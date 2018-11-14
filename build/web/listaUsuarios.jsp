<%-- 
    Document   : listaUsuarios
    Created on : 12/11/2018, 07:43:58 AM
    Author     : Andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page= "menu.jsp"></jsp:include>
        <h1>Hellaa!</h1>
        <c:forEach var="a" items="${user}">
           |$ {a.id}| |$ {a.nombre}||$ {a.apelliod}||$ {a.cargo}||$ {a.telefono}| |${a.username}| |${a.rol}||$ {a.departamento}|
           <a onclick="return confirm {'Esta seguro?'}" href="UsuariosController?action=delete&id=${a.id}">Delete</a>
           <hr/>

       </c:forEach>
    </body>
</html>
