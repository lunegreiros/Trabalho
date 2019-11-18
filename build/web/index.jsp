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
        <h1>Palavras</h1>
        <section class="flex">
            <logic:notPresent name="consultarPalavraActionForm">
                <logic:redirect action="consultarPalavra"/>
            </logic:notPresent>
            <logic:present name="consultarPalavraActionForm">
                <!--iterator aqui para cada div-->
                <logic:iterate name="consultarPalavraActionForm" property="palavras" id="palavra">
                    <div>
                        <html:link action="listarPalavraExpressao" paramName="palavra" paramProperty="id" paramId="idPalavra"><bean:write name="palavra" property="palavra"/></html:link>
                    </div>
                </logic:iterate>
            </logic:present>
        </section>
        <br><br><br>

            <hr>
            <section class="flex">
                <form class="form" action="gerenciarDicionario.jsp">
                    <button>Gerenciar Dicionário</button>
                </form>
            </section>

            <html:errors/> <!-- tratamento de erro - feito em arquivo separado -->
        </body>
    </html>
