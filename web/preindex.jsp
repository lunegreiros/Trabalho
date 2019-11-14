<%-- 
    Document   : preindex
    Created on : 11/11/2019, 21:15:06
    Author     : luneg
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <logic:redirect action="consultarPalavra"/>
    </head>
    <body>
        <h1>Hello World!</h1>
        <html:errors/> <!-- tratamento de erro - feito em arquivo separado -->
    </body>
</html>
