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
        <h1>Inserir Expressão</h1>
        <br>
        <section class="flex">
            <html:form action="inserirExpressao">
                <div class="border_none">
                    <p class="small">Código da palavra associada: 
                        <html:text readonly="true" name="inserirExpressaoActionForm" property="id"/>
                    </p>
                </div>
                Expressão:
                <html:text name="inserirExpressaoActionForm" property="expressao"/>
                <html:submit value="Inserir"/>

            </html:form>

        </section>
        <section class="flex">
            <div class="small">
                <html:errors/> <!-- tratamento de erro - feito em arquivo separado -->
            </div>
        </section>

        <br><br><br>

        <hr>
        <section class="flex">
            <form class="form" action="gerenciarDicionario.jsp"><button>Voltar</button></form>
        </section>
    </body>
</html>
