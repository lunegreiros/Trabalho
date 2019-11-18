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



        <h1>Palavra e Expressões</h1>
        <section>
            <article class="row">
                <h2 class="column col-left">Palavra:</h2>
                <h2 class="column col-right">Expressões associadas:</h2>
            </article>
            <article class="row">
                <logic:notPresent name="listarPalavraExpressaoActionForm">
                    <logic:redirect action="consultarPalavra"/>
                </logic:notPresent>
                <html:form action="listarPalavraExpressao">
                    <div class="column col-left">
                        <bean:write name="listarPalavraExpressaoActionForm" property="stringPalavra"/>
                    </div>
                </html:form>
                <div class="column col-right">
                    <ul>
                        <logic:present name="listarPalavraExpressaoActionForm">
                            <logic:iterate name="listarPalavraExpressaoActionForm" property="expressoes" id="expressao">
                                <li><bean:write name="expressao" property="expressao"/></li>
                                </logic:iterate>
                            </logic:present>
                    </ul>
                </div>
            </article>


        </section>
        <br><br><br>
        <hr>
        <section class="flex">
            <form class="form" action="index.jsp">
                <button>Nova Pesquisa</button>
            </form>
        </section>
        <html:errors/> <!-- tratamento de erro - feito em arquivo separado -->
    </body>
</html>
