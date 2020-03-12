/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.eddii;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class ProyectoEDDII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Calculadora Simple");
        System.out.println("Ingrese su primer numero: ");
        int x = leer.nextInt();
        System.out.println("Ingrese su segundo numero: ");
        int p = leer.nextInt();
        String j = "";
        j += x;
        j += p;
        System.out.println("La respuesta es " + j);
        System.out.println("PROGRAMAR ES MI PASION");

        // TODO code application logic here
    }

}
