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
        <title>Gerenciar Dicionario</title>

    </head>
    <body>
        <h1>Gerenciar Dicionario</h1>

        
        </table>
        <hr>

        <h2>Inserir Palavra nova:</h2>

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

    </body>
</html>
