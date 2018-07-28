<%-- 
    Document   : contas
    Created on : 14/07/2018, 13:47:21
    Author     : Caroline
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Contas</title>
    </head>
    <body>
        <h1>Cadastro De Contas</h1>
        
        <form id="contact_form" action="#" method="POST" enctype="multipart/form-data">
    
            <div class="row">
                <label class="required" for="name">Agencia:</label><br />
                <input id="name" class="input" name="agencia" type="text" value="" size="30" /><br />
             </div>
            <div class="row">
                <label class="required" for="name">Conta:</label><br />
                <input id="name" class="input" name="conta" type="text" value="" size="30" /><br />
                <input type="radio" name="conta" value="corrente" checked> Corrente
                <input type="radio" name="conta" value="poupanca"> Poupança<br>
             </div>
            <div class="row">
                <label class="required" for="name">Cliente:</label><br />
                <input id="name" class="input" name="cliente" type="text" value="" size="30" /><br />
             </div> <br>
            <input id="submit_button" type="submit" value="Enviar" />
            <input id="limpar" type="reset" value="Limpar" />
        </form><br>
        
        <a href="relatorio">Relatórios</a>
        
    </body>
</html>
