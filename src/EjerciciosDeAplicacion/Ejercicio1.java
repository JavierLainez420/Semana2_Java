/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeAplicacion;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el precio de la computadora");
        double precio = leer.nextDouble();

        double rebaja = calcularRebaja(precio);
        double iva = calcularIva(precio);
        double total = calcularPrecioComputadora(precio, rebaja, iva);
        
        System.out.println("El precio de la computadora es de : " + precio);
        System.out.println("La rebaja del 15% sobre el precio es de :" + rebaja);
        System.out.println("El iva del precio de la compu es: " + iva);
        System.out.println("El precio total de la compu con el IVA es de : " + total);
        
    }

    private static double calcularRebaja(double precio) {
    double total_rebaja = precio * 0.15;
    return total_rebaja;
    }

    private static double calcularIva(double precio) {
    double total_iva = precio * 0.13;
    return total_iva;
    }

    private static double calcularPrecioComputadora(double precio, double rebaja, double iva) {

        double precio_total = (precio - rebaja) + iva;
        return precio_total;
    }
    
}
