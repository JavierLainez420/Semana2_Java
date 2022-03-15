/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntradaDesdeTeclado;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculadora {
    public static void main(String[] args) {     
    double cantidad1=0, cantidad2=0;
    BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
    try{
            System.out.println("Ingresar cantidad 1:");
            cantidad1 = Double.parseDouble(leer.readLine());
            
            System.out.println("Ingresar cantidad 2:");
            cantidad2 = Double.parseDouble(leer.readLine());
            
            System.out.println("El resultado de la suma es            : " + Calculadora.suma(cantidad1, cantidad2));
            System.out.println("El resultado de la resta es           : " + Calculadora.resta(cantidad1, cantidad2));
            System.out.println("El resultado de la multiplicacion es  : " + Calculadora.multiplicacion(cantidad1, cantidad2));
            System.out.println("El resultado de la division es        : " + Calculadora.division(cantidad1, cantidad2));


    
    }   
    catch(Exception e){
            System.out.println(e.getMessage());
}
        System.out.println(cantidad1 + " " + cantidad2);
    }

    private static double suma(double cantidad1, double cantidad2) {
        double suma = cantidad1 + cantidad2;
        return suma;
    }

    private static double resta(double cantidad1, double cantidad2) {
        double resta = cantidad1 - cantidad2;
        return resta;
    }

    private static double multiplicacion(double cantidad1, double cantidad2) {
        double multiplicacion = cantidad1 * cantidad2;
        return multiplicacion;
    }

    private static double division(double cantidad1, double cantidad2) {
        double division = cantidad1 / cantidad2;
        return division;
    }
}

