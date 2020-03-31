/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.eddii;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mauri
 */
public class AdmProyecto extends TDAarchivo{
    private File archivo=null;
    private ArrayList<Proyecto> proyectos=new ArrayList();
    
    AdmProyecto (){
        archivo= new File("proyectos.txt");
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    
    public void setProyecto (Proyecto p ){
        proyectos.add(p);
    }
    
    @Override
    void escribir(){
        FileWriter fw= null;
        BufferedWriter bw = null;
        try{
            fw=new FileWriter(archivo, false);
            bw=new BufferedWriter(fw);
            for (Proyecto t: proyectos) {
                bw.write(t.toString()+";");
            }
            bw.flush();
        }
        catch(IOException e){
            
        }
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(AdmCarrera.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(AdmCarrera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    void leer(){
        Scanner sc= null;
        proyectos = new ArrayList();
        if (archivo.exists()){
            try{
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()){
                    String temp =sc.next();
                    String codigo="";
                    for (int i = 0; i < temp.length(); i++) {
                        if (temp.charAt(i)!='$'){
                            codigo+=temp.charAt(i);
                        }
                    }
                    temp=sc.next();
                    String nombre="";
                    for (int i = 0; i < temp.length(); i++) {
                        if (temp.charAt(i)!='$'){
                            nombre+=temp.charAt(i);
                        }
                    }
                    temp=sc.next();
                    String codinv="";
                    for (int i = 0; i < temp.length(); i++) {
                        if (temp.charAt(i)!='$'){
                            codinv+=temp.charAt(i);
                        }
                    }
                    temp=sc.next();
                    String fechainicio="";
                    for (int i = 0; i < temp.length(); i++) {
                        if (temp.charAt(i)!='$'){
                            fechainicio+=temp.charAt(i);
                        }
                    }
                    temp=sc.next();
                    String fechafin="";
                    for (int i = 0; i < temp.length(); i++) {
                        if (temp.charAt(i)!='$'){
                            fechafin+=temp.charAt(i);
                        }
                    }
                    temp=sc.next();
                    String estado="";
                    for (int i = 0; i < temp.length(); i++) {
                        if (temp.charAt(i)!='$'){
                            estado+=temp.charAt(i);
                        }
                    }
                    Proyecto proyecto = new Proyecto(Integer.parseInt(codigo),
                                                     nombre,
                                                     Integer.parseInt(codinv),
                                                     fechainicio,
                                                     fechafin,
                                                     Integer.parseInt(estado));
                    proyectos.add(proyecto);
                }
            }
            catch (FileNotFoundException | ByteOverweightException e){
                
            }
            sc.close();
        }
    }
}
