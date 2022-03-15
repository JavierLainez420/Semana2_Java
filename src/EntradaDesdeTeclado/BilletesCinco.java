/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntradaDesdeTeclado;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BilletesCinco {
    public static void main(String[] args) {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String cantidadDinero;
        try { 
            System.out.println("Cantidad:");
            cantidadDinero = leer.readLine();
            String cantidadCinco = BilletesCinco.obtenerBilletesDeCinco(cantidadDinero);
            System.out.println("Cantidad de billeters de $5.00: " + cantidadCinco);
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static String obtenerBilletesDeCinco(String cantidadDinero) {
        double montoDinero = Double.parseDouble(cantidadDinero);
        int billetesCinco = (int) montoDinero/5;
        String resultado = String.valueOf(billetesCinco);
        return resultado;
    }
}

    
