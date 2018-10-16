<%-- 
    Document   : Solicitud
    Created on : Sep 29, 2018, 9:47:28 AM
    Author     : itmanager
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Generar Solicitudes</title>
    </head>
    <body>
        <h1>Formulario de solicitudes</h1>
        <form action ="solicitud.do">
            ID Solicitud: <input type="text" name ="txtNombre"/><br />
            Descripción: <input type="text" name ="txtDescripcion"/><br />
            Estado: <input type="text" name ="txtEstado"/><br />
            Tipo Solicitud: <input type="text" name ="txtTiposolicitud"/><br />
            <input type="submit" value ="Generar solicitud"/>
            </form>
            
    </body>
</html>
