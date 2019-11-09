<%-- 
    Document   : inserirPalavraOK
    Created on : 23/10/2019, 21:35:58
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
        <title>Página de resultado</title>
    </head>
    <body>
        <h1>Palavra inserida!</h1>
        <!-- corrigir essa listagem do nome da palavra inserida -->
        <h2>Palavra: <bean:write name="inserirPalavraActionForm" property="palavra"/></h2>

        <!-- opcao para nova pesquisa -->
        <form action="index.jsp">
            <button type="submit">Voltar ao Dicionário</button>
        </form>

        <br>

        <hr>
        <!-- opcao para inserir palavras e expressoes -->

        <form action="inserirPalavra.jsp">
            <button type="submit">Novas Palavras</button>
        </form>
        <form action="inserirExpressao.jsp">
            <button type="submit">Novas Expressões</button>
        </form>
    </body>
</html>
