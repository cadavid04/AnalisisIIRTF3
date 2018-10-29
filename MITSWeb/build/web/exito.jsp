<%-- 
    Document   : exito
    Created on : Sep 29, 2018, 10:14:38 AM
    Author     : itmanager
--%>



<%@page import="com.dominio.SolicitudDTO"%>

<%
    
SolicitudDTO s1 = (SolicitudDTO)request.getSession().getAttribute("solicitud1");

%>    

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de solicitud exitoso</title>
    </head>
    <body>
        <h1>Registro exitoso</h1>
        <p>ID:<%= s1.getIdSolicitud()%></p>
        <p>Descripción:<%= s1.getDescripcion()%></p>
        <p>Estado:<%= s1.getEstado() %> </p>
         <p>Tipo solicitud:<%= s1.getTipoSolicitud()%></p>
    </body>
</html>
