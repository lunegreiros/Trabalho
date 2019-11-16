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
        <title>Dicionario</title>
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
                    <th>Palavras</th>
                </tr>
            </thead>
            <tbody>
                <logic:notPresent name="consultarPalavraActionForm">
                    <logic:redirect action="consultarPalavra"/>
                </logic:notPresent>
                <logic:present name="consultarPalavraActionForm">
                    <logic:iterate name="consultarPalavraActionForm" property="palavras" id="palavra">
                        <tr>
                            <td><html:link action="listarPalavraExpressao" paramName="palavra" paramProperty="id" paramId="idPalavra"><bean:write name="palavra" property="palavra"/></html:link></td>
                        </tr>
                    </logic:iterate>
                </logic:present>
            </tbody>
        </table>
            <form action="gerenciarDicionario.jsp"><button>Gerenciar Dicionario</button></form>
           
            <html:errors/> <!-- tratamento de erro - feito em arquivo separado -->
    </body>
</html>
