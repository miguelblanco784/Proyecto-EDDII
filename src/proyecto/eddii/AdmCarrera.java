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

/**
 *
 * @author mauri
 */
public class AdmCarrera extends TDAarchivo{
    private File archivo=null;
    private ArrayList<Carrera> carreras;
    
    AdmCarrera (B_Tree carreras){
        archivo= new File("carreras.txt");
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    
    
    
    
    @Override
    void escribir(){
        FileWriter fw= null;
        BufferedWriter bw = null;
        try{
            fw=new FileWriter(archivo, false);
            bw=new BufferedWriter(fw);
            for (Carrera t : carreras) {
                bw.write(t.getCodigo().getNombre()+";");
                bw.write(t.getNombre().getNombre()+";");
                bw.write(t.getEstado().getNombre()+";");
            }
        }
        catch(IOException e){
            
        }
    }
    
    @Override
    void leer(){
        Scanner sc= null;
        carreras = new ArrayList();
        if (archivo.exists()){
            try{
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()){
                    Carrera carrera = new Carrera(sc.nextInt(),
                                                  sc.next(),
                                                  sc.nextInt());
                    carreras.add(carrera);
                }
            }
            catch (FileNotFoundException | ByteOverweightException e){
                
            }
        }
    }
}
