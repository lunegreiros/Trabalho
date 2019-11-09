<%-- 
    Document   : inserirExpressao
    Created on : 05/11/2019, 16:04:45
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
        <title>Inserir Expressão</title>
    </head>
    <body>
        <h1>Dicionario de Expressoes de Lugar-Comum</h1>
        <h2>Inserir Expressões</h2>

        <html:form action="inserirExpressao">
            <!--tabela vem aqui-->
            <table border="0" cellspacing="5" cellpadding="2">
                <tbody>
                    <tr>
                        <td>Expressao: </td>
                        <!--"name" chama o bean inserirPalavraActionForm-->
                        <!--"property" associa-se c/ o VO/bean no campo nome-->
                        <td><html:text name="inserirExpressaoActionForm" property="expressao"/></td>
                    </tr>
                    <tr>
                        <td>Palavra Associada: </td>
                        <td>"colocar indice de palavra associada"</td>
                    </tr>
                    <tr>
                        <td colspan="2" ><html:submit value="Inserir"/></td>
                    </tr>
                </tbody>
            </table>

        </html:form>
        <html:errors/> <!-- tratamento de erro - feito em arquivo separado -->
        <hr>
        <form action="inserirPalavra.jsp">
            <button type="submit">Inserir Palavra</button>
        </form>

    </body>
</html>
