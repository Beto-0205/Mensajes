<%-- 
    Document   : eliminar
    Created on : 26 feb 2023, 15:26:26
    Author     : José Humberto Cortez Cruz
--%>

<%@page import="com.mycompany.mensajes.MensajeDao"%>
<%@page import="com.mycompany.mensajes.Mensaje"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            Mensaje mensaje = new Mensaje(Integer.valueOf(id));
            MensajeDao mensajeDao = new MensajeDao();
            mensajeDao.eliminar(mensaje);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        %>
    </body>
</html>
