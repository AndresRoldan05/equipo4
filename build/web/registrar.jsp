<%-- 
    Document   : registrar
    Created on : 12/11/2018, 07:45:26 AM
    Author     : Andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="style.css">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.theme.min.css">

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <h1>Registrar!</h1>
        <div class ="container well">
<form action="UsuariosController?action=insert" method="post">
<table>
    <tr>
<th> <label><b>id:</b></label></th>
<th> <input type="text" placeholder="Enter id" class="form-control" name="id" required=""/>
</th>
</tr>
<tr>
<th> <label><b>nombre:</b></label></th>
<th> <input type="text" placeholder="Enter nombre" class="form-control" name="nombre" required=""/>
</th>
</tr>
<tr>
<th> <label><b>apellido:</b></label></th>
<th> <input type="text" placeholder="Enter apellido" class="form-control" name="apellido" required=""/>
</th>
</tr>
<tr>
<th> <label><b>cargo:</b></label></th>
<th> <input type="text" placeholder="Enter cargo" class="form-control" name="cargo" required=""/>
</th>
</tr>
<tr>
<th> <label><b>telefono:</b></label></th>
<th> <input type="text" placeholder="Enter telefono" class="form-control" name="telefono" required=""/>
</th>
</tr>
<tr>
<th> <label><b>Username:</b></label></th>
<th> <input type="text" placeholder="Enter Username" class="form-control" name="username" required=""/>
</th>
</tr>
<tr>
<th><label><b>Password:</b></label></th>
<th><input type="password" placeholder="Enter Password" class="form-control" name="password" required=""/></th>
</tr>
<tr>
<th><label><b>rol:</b></label></th>
<th><input type="text" placeholder="Enter rol" class="form-control" name="rol" required=""/></th>
</tr>
<tr>
<th> <label><b>direccion:</b></label></th>
<th> <input type="text" placeholder="Enter direccion" class="form-control" name="direccion" required=""/>
</th>
</tr>
<tr>
<th> <label><b>departamento:</b></label></th>
<th> <input type="text" placeholder="Enter departamento" class="form-control" name="departamento" required=""/>
</th>
</tr>

<tr>
<th> <label><b>nacimiento:</b></label></th>
<th> <input type="text" placeholder="Enter nacimiento" class="form-control" name="nacimiento" />
</th>
</tr>

<div class="break"></div>

<tr>
<td colspan="2">
 <input class="btn icon-btn btn-success" type="submit" name="action" value="Insertar">
 <span class="glyphicon glyphicon-ok-sign"></span>

 <input class="btn btn-info btn-lg" type="reset" name="action" value="Reset">
 <span class="glyphicon glyphicon-remove"></span>
</td>
</tr>
</table>
</form>
<br>
</div>
    </body>
</html>
