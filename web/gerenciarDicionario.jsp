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
        <title>Dicionário</title>
        <link rel="stylesheet" href="flexbox_1.css">
        <style>
            @import url('https://fonts.googleapis.com/css?family=Roboto&display=swap');
        </style>
    </head>
    <body>
        <header class="header">
            <div class="white-text">
                <img src="img/Group2.png" alt="logo">
                Dicionário de Palavras e Expressões de Lugar-Comum
            </div>
        </header>
        <h1>Gerenciar Dicionário</h1>
        <section class="flex">
            <logic:present name="inserirExpressaoActionForm">
                <br>
                <h2>Expressão "<bean:write name="inserirExpressaoActionForm" property="expressao"/>" inserida!</h2>
            </logic:present>
            <logic:present name="inserirPalavraActionForm">
                <br>
                <h2>Palavra "<bean:write name="inserirPalavraActionForm" property="palavra"/>" inserida!</h2>
            </logic:present>
                <br><br>
            <logic:notPresent name="consultarPalavraActionForm">
                <logic:redirect action="consultarPalavra"/>
            </logic:notPresent>
            </section>
            <section class="flex">
            <logic:present name="consultarPalavraActionForm">
                <table>
                    <tr>
                        <th width="50%">Palavra</th>
                        <th width="25%">Incluir Expressão</th>
                        <th width="25%">Excluir Palavra</th>
                    </tr>
                    <logic:iterate name="consultarPalavraActionForm" property="palavras" id="palavra">
                        <tr>
                            <td>
                                <bean:write name="palavra" property="palavra"/>
                            </td>
                            <td class="opt">
                                <html:link action="inserirExpressao" paramName="palavra" paramProperty="id" paramId="id">Inserir</html:link>
                                </td>
                                <td class="opt">
                                <html:link action="excluirPalavra" paramName="palavra" paramProperty="id" paramId="id">Excluir</html:link>
                                </td>
                            </tr>
                    </logic:iterate>
                </table>
            </logic:present>
        </section>
        <section class="flex">
            <div class="small">
                <html:errors/> <!-- tratamento de erro - feito em arquivo separado -->
            </div>
        </section>

        <br><br><br>

        <hr>
        <section class="flex">
            <form class="form" action="index.jsp"><button>Voltar</button></form>
            <form class="form" action="inserirPalavra.jsp"><button>Inserir nova palavra</button></form>
        </section>


    </body>
</html>
