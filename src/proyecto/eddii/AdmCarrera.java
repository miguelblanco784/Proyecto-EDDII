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
public class AdmCarrera extends TDAarchivo{
    private File archivo=null;
    private ArrayList<Carrera> carreras = new ArrayList();
    
    AdmCarrera (){
        archivo= new File("carreras.txt");
        carreras=new ArrayList<Carrera>();
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }
    
    public void setCarrera (Carrera p){
        carreras.add(p);
    }

    
    
    
    
    @Override
    void escribir(){
        FileWriter fw= null;
        BufferedWriter bw = null;
        try{
            fw=new FileWriter(archivo, false);
            bw=new BufferedWriter(fw);
            for (Carrera t : carreras) {
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
        carreras = new ArrayList<Carrera>();
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
                    String estado="";
                    for (int i = 0; i < temp.length(); i++) {
                        if (temp.charAt(i)!='$'){
                            estado+=temp.charAt(i);
                        }
                    }
                    Carrera carrera = new Carrera(Integer.parseInt(codigo),
                                                  nombre,
                                                  1);
                    carreras.add(carrera);
                }
            }
            catch (Exception e){
                
            }
            sc.close();
        }
    }
}
