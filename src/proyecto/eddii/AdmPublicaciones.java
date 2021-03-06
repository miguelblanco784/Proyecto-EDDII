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
public class AdmPublicaciones extends TDAarchivo {
    private File archivo=null;
    private ArrayList<Publicaciones> publicaciones = new ArrayList();
    
    AdmPublicaciones (){
        archivo= new File("publicaciones.txt");
        publicaciones = new ArrayList<Publicaciones>();
    }

    public ArrayList<Publicaciones> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicaciones> publicaciones) {
        this.publicaciones = publicaciones;
    }
    
    public void setPublicacion (Publicaciones p ){
        publicaciones.add(p);
    }
    
    @Override
    void escribir(){
        FileWriter fw= null;
        BufferedWriter bw = null;
        try{
            fw=new FileWriter(archivo, false);
            bw=new BufferedWriter(fw);
            for (Publicaciones t: publicaciones) {
                bw.write(t.getCodigo().getNombre()+";");
                bw.write(t.getCodigo_de_proyecto().getNombre()+";");
                bw.write(t.getFecha().getNombre()+";");
                bw.write(t.getRevista().getNombre()+";");
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
        publicaciones = new ArrayList<Publicaciones>();
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
                    String codproyecto="";
                    for (int i = 0; i < temp.length(); i++) {
                        if (temp.charAt(i)!='$'){
                            codproyecto+=temp.charAt(i);
                        }
                    }
                    temp=sc.next();
                    String fecha="";
                    for (int i = 0; i < temp.length(); i++) {
                        if (temp.charAt(i)!='$'){
                            fecha+=temp.charAt(i);
                        }
                    }
                    temp=sc.next();
                    String revista="";
                    for (int i = 0; i < temp.length(); i++) {
                        if (temp.charAt(i)!='$'){
                            revista+=temp.charAt(i);
                        }
                    }
                    Publicaciones publicacion = new Publicaciones(Integer.parseInt(codigo),
                                                                  Integer.parseInt(codproyecto),
                                                                  fecha,
                                                                  revista);
                    publicaciones.add(publicacion);
                    //no comprendo las variables Key y Value de B_Tree asi que no los puedo agregar al arbol por ahora
                }
            }
            catch (FileNotFoundException | ByteOverweightException e){
                
            }
        }
    }
}
