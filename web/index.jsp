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
        <title>INDEX</title>

    </head>
    <body>
        <h1>Dicionario de Expressoes de Lugar-Comum</h1>

        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Palavra</th>
                    <th>Alterar</th>
                    <th>Excluir</th>
                </tr>
            </thead>
            <tbody>
                <logic:notPresent name="inserirPalavraActionForm">
                    <logic:redirect action="inserirPalavra"/>
                </logic:notPresent>
                <logic:present name="inserirPalavraActionForm">
                    <logic:iterate name="inserirPalavraActionForm" property="palavras" id="palavra">
                        <tr>
                            <td><bean:write name="palavra" property="id"/></td>
                            <td><bean:write name="palavra" property="palavra"/></td>
                            <td><html:link action="alteraPalavra" paramName="palavra" paramProperty="id" paramId="id">Alterar</html:link></td>
                            <td><html:link action="excluiPalavra" paramName="palavra" paramProperty="id" paramId="id">Excluir</html:link></td>
                            </tr>
                    </logic:iterate>
                </logic:present>
            </tbody>
        </table>

        <h2>Inserir Palavras</h2>

        <html:form action="inserirPalavra">
            <!--tabela vem aqui-->
            <table border="0" cellspacing="5" cellpadding="2">
                <tbody>
                    <tr>
                        <td>Palavra: </td>
                        <!--"name" chama o bean inserirPalavraActionForm-->
                        <!--"property" associa-se c/ o VO/bean no campo nome-->
                        <td><html:text name="inserirPalavraActionForm" property="palavra"/></td>
                    </tr>
                    <tr>
                        <td colspan="2" ><html:submit value="Inserir"/></td>
                    </tr>
                </tbody>
            </table>

        </html:form>
        <html:errors/> <!-- tratamento de erro - feito em arquivo separado -->
        <hr>
        <form action="inserirExpressao.jsp">
            <button type="submit">Inserir Expressões</button>
        </form>
    </body>
</html>
