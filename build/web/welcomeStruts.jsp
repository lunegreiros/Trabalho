<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body style="background-color: white">
        
        <logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
            <div  style="color: red">
                ERROR:  Application resources not loaded -- check servlet container
                logs for error messages.
            </div>
        </logic:notPresent>
        
        <h3><bean:message key="welcome.heading"/></h3>
        <p><bean:message key="welcome.message"/></p>
        
    </body>
</html:html>
    
    <table border="0" cellspacing="5" cellpadding="2">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Palavra</th>
                    <th>Alterar Palavra</th>
                    <th>Excluir Palavra</th>
                    <th>Incluir Expressao para essa palavra</th>
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
                                <td>Incluir Expressao</td>
                            </tr>
                    </logic:iterate>
                </logic:present>
            </tbody>
