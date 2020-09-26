/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoraweb;

/**
 *
 * @author danielferova
 */
public class Calculador {
    private double n1;
    private double n2;

    public Calculador(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
      public double operacionSuma(){
    return n1+n2;
    }
      
    public double operacionMultiplicacion(){
    return n1*n2;   
    }
    
    public String operacionMayor(){
    String resultado = "";
    if(n1>n2){
        resultado+=n1;
    return resultado;
    } else if(n2>n1){
        resultado+= n2;
    return resultado;
    } else {
            resultado+=n1 + " iguales " + n2;
            return resultado;
      }
    }
    
    public double operacionPotencia(){
    return Math.pow(n1, n2);
    }
    
    public int operacionBinaria (double num){
       //variables de tipo enteras
        int n = (int)num;
        int x= n;
        int exp=0;
        int r = 0;
        int binario = 0;
        
     while(x>0){
                r=(x%2);
                binario =  (int) (binario+r * Math.pow(10, exp));
                exp++;
                x= (x/2);
            }
            return binario;
    }
}
