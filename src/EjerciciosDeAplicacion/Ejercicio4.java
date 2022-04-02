/*
Una  empresa  de  venta  de  computadoras  paga  a  su  personal  de  ventas  un  salario  de $300,00 más una comisión de $50,00
por computadora vendida. Diseñar un programa para calcular  el  salario  de  un  vendedor  en  un  determinado  mes,  conociendo
el  nº  de computadoras vendidas. Al salario devengado se debe de retener el 10% en concepto de renta. Imprimir el nombre del
vendedor, el salario devengado y la retención de la renta.
 */
package EjerciciosDeAplicacion;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
       int nComputadoras;
       
        System.out.println("Ingrese el nombre del vendedor:");
        nombre = leer.nextLine();
        
        System.out.println("Ingrese las computadoras vendidas en el mes");
        nComputadoras= Integer.parseInt(leer.nextLine());
       
        double  salario = calsalario(nComputadoras);
        double renta = calcrenta(salario);
        
        System.out.println("IMPRESION DE DATOS");   
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: $300.00");
        System.out.println("El descuento de renta es de: " + renta);
        System.out.println("Salario con comision con el descuento: " + (salario - renta));
       
    }
    
    private static double calsalario (int nComputadoras){
        double salario;
        salario = (nComputadoras * 50.00) + 300.00;
        return salario;
    }
    
    private static double calcrenta (double salario){
    double renta;
    renta = salario * 0.10;
    return renta;
    }
    
}
