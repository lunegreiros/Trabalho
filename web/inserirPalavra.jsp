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
        <h1>Inserir palavra nova:</h1>
        <br>
        <section class="flex">
        <html:form action="inserirPalavra">
            <div>
            Palavra:
            <html:text name="inserirPalavraActionForm" property="palavra"/>
            <html:submit value="Inserir"/>
            </div>
            
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
