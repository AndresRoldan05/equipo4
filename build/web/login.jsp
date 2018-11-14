<%-- 
    Document   : login
    Created on : 12/11/2018, 07:43:01 AM
    Author     : Andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="style.css">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.theme.min.css">

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
            <h1>Login E Modulo!</h1>
        <c:if test="${param.error==1}">
            <font color="red">Usuario Invalido. Intentelo de nuevo</font>
        </c:if>
        <div class ="container well">
            <h1>Informacion Personal</h1>
            <form action="UsuariosController?action=login" method="post">

            <table>
               <tr>
                    <th> <label><b>Username:</b></label></th>
                    <th> <input type="text" placeholder="Enter Username" class="form-control" name="username" required=""/>
                    </th>
               </tr>
               <tr>
                     <th><label><b>Password:</b></label></th>
                     <th><input type="password" placeholder="Enter Password" class="form-control" name="password" required=""/></th>
               </tr>


               <div class="break"></div>
               </div>

               <tr>
                      <td colspan="2">
                       <input class="btn btn-info btn-lg" type="submit" name="action" value="Login">
                       <span class="glyphicon glyphicon-lock"></span>

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
