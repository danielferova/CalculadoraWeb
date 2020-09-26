<%-- 
    Document   : Calculadora
    Created on : 25/09/2020, 21:22:58
    Author     : danielferova
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <%@ include file = "Calculadora.html" %> 
    <body>
        <%-- utilizaremos una estructura IF para tener una pagina dinamica--%>
        <%-- UTILIZAMOS SCRIPTLET--%>
        <% if(request.getAttribute("Resultado") == null) {%>
        
           <center>
        <h3>Daniel Fernández</h3>   
        <h1>Bienvenido a CALCULADORA WEB!</h1>
        <h2>Seleccione las operaciones matemáticas que desea realizar</h2>
            </center>   
         <form METHOD="GET" ACTION="Calculadora">  
        <div class="div">
            <p>     
                Ingrese Primer Número: <input type="number" step="0.001" name="n1" placeholder="Ingrese el Primer Número: " required>
            <p>     
                Ingrese Segundo Número: <input type="number" step="0.001" name="n2" placeholder="Ingrese el Segundo Número: " required>   
            <p>     
                <input type="radio" name="suma" value="1" /> Suma
            <p>     
                <input type="radio" name="multiplicacion" value="2" />  Multiplicación
            <p>     
                <input type="radio" name="mayor" value="3" />  Ver el Número Mayor
            <p>     
                <input type="radio" name="potencia" value="4" />  Potencia de n1^n2
            <p>     
                <input type="radio" name="binario" value="5" />  Valor Binario de los dos Números
        </div>
        <center>
            <p>     
                <input type="submit" value="Calcular">
                <input type="reset" value="Vacíar campos" onclick="unselect()">
        </center>
    </form>
    <% }else{ %>
    <center>     
        <h2>El Resultado de las operaciones es: </h2>
        <%=(String) request.getAttribute("Resultado")%>
    </center>  
    <% } %>
    </body>
</html>
