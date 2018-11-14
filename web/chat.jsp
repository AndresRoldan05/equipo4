<%-- 
    Document   : chat
    Created on : 13/11/2018, 10:07:35 PM
    Author     : Andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
 <head>
   <title>Modulo Leccion</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head> 
 <body>
    <h1>CHAT SKY</h1>
       <div>
          <div>
            <label>Nombre :</label>
            <input> type= "text" id="usuario" placeholder="usuario"</input>
          </div>
          <div>
            <label>Mensaje :</label>
            <textarea id="mensaje"></textarea>
          </div>
          <div>
            <button id="btnEnviar">Enviar</button>
          </div>
          <div id="conversacion"></div>
       </div>
        <scritp src="/codigo.js"></script>
      </div>

 </body>

</html>


