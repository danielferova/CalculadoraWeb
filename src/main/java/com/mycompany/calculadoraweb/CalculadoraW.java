/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoraweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author danielferova
 */
@WebServlet(name = "Calculadora", urlPatterns = {"/Calculadora"})
public class CalculadoraW extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        double n1 = Double.parseDouble(request.getParameter("n1"));
        double n2 = Double.parseDouble(request.getParameter("n2")); 
        String cadena = "";
        Calculador calculador = new Calculador(n1, n2);
          
        if (request.getParameter("suma") != null) {
            
            cadena+="<h1>'Suma'</h1>" + calculador.operacionSuma();
        }
        if (request.getParameter("multiplicacion") != null) {
            cadena+="<h1>'Multiplicación'</h1>" + calculador.operacionMultiplicacion();
        }
        if (request.getParameter("mayor") != null) {
            cadena+="<h1>'Número Mayor'</h1>" + calculador.operacionMayor();
        }
        if (request.getParameter("potencia") != null) {
            cadena+="<h1>Potencia: </h1>" + calculador.operacionPotencia();
        }
        if (request.getParameter("binario") != null) {
            cadena+="<h1> 'Números Binarios' </h1>";
            cadena+="<p>Número en decimales "+n1+" convirtiendolo es: "+calculador.operacionBinaria(n1)+" en Números Binarios</p>";
            cadena+="<br>";
            cadena+="<p>Número en decimales "+n2+" convirtiendolo es: "+calculador.operacionBinaria(n2)+" en Números Binarios</p>";
        }
        request.setAttribute("Resultado", cadena);
        RequestDispatcher d = request.getRequestDispatcher("index.jsp");
        d.forward(request, response);   
    }  
   }
   
    

