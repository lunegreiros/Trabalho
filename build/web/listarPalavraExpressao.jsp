<%-- 
    Document   : inserirPalavra
    Created on : 23/10/2019, 13:10:41
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
        <title>Palavra e expressões</title>
        <style type="text/css">
            ul {
                float:left;
            }
            * html li {margin-left:25px;}
        </style>
    </head>
    <body>
        <h1>Dicionario de Expressoes de Lugar-Comum</h1>
        <table border="0" cellspacing="5" cellpadding="2">
            <thead>
                <tr>
                    <th>Palavra</th>
                </tr>
            </thead>
            <tbody>
                <logic:notPresent name="listarPalavraExpressaoActionForm">
                    <logic:redirect action="consultarPalavra"/>
                </logic:notPresent>
                <html:form action="listarPalavraExpressao">
                <table border="1">
                    <tbody>
                        <tr>
                            <td>Palavra</td>
                            <td><bean:write name="listarPalavraExpressaoActionForm" property="stringPalavra"/></td>
                        </tr>
                    </tbody>
                </table>
            </html:form>
            <logic:present name="listarPalavraExpressaoActionForm">
                <table>
                    <logic:iterate name="listarPalavraExpressaoActionForm" property="expressoes" id="expressao">
                        <tr>
                            <td><bean:write name="expressao" property="expressao"/></td>
                        </tr>
                    </logic:iterate>
                </table>
            </logic:present>
        </tbody>
         <form action="index.jsp"><button>Nova pesquisa</button></form>
        <html:errors/> <!-- tratamento de erro - feito em arquivo separado -->
</body>
</html>
