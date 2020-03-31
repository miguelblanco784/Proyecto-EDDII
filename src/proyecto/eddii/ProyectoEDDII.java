/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.eddii;

import java.util.Scanner;
import java.security.Key;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
/**
 *
 * @author migue
 */
public class ProyectoEDDII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Scanner leer = new Scanner(System.in);
        System.out.println("Calculadora Simple");
        System.out.println("Ingrese su primer numero: ");
        int x = leer.nextInt();
        System.out.println("Ingrese su segundo numero: ");
        int p = leer.nextInt();
        String j = "";
        j += x;
        j += p;
        System.out.println("La respuesta es " + j);
        System.out.println("PROGRAMAR ES MI PASION");*/
        try {
            Carrera ejemplo=new Carrera(12,"Ingenieria en sistemas",1);
            B_Tree carreras = new B_Tree();
            System.out.println(ejemplo.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO code application logic here
    }

}
