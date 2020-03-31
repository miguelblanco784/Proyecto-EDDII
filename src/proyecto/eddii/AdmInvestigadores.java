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
public class AdmInvestigadores extends TDAarchivo {
    private File archivo=null;
    private ArrayList<Investigador> investigadores;
    
    AdmInvestigadores (){
        archivo= new File("investigadores.txt");
        investigadores = new ArrayList<Investigador>();
    }

    public ArrayList<Investigador> getInvestigadores() {
        return investigadores;
    }

    public void setInvestigadores(ArrayList<Investigador> investigadores) {
        this.investigadores = investigadores;
    }
    
    
    public void setInvestigador (Investigador p ){
        investigadores.add(p);
    }
    
    
    @Override
    void escribir(){
        FileWriter fw= null;
        BufferedWriter bw = null;
        try{
            fw=new FileWriter(archivo, false);
            bw=new BufferedWriter(fw);
            for (Investigador t: investigadores) {
                bw.write(t.getCodigo().getNombre()+";");
                bw.write(t.getNombre().getNombre()+";");
                bw.write(t.getFechadeingreso().getNombre()+";");
                bw.write(t.getCodigo_carrera().getNombre()+";");
                bw.write(t.getEstado().getNombre()+";");
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
        investigadores = new ArrayList<Investigador>();
        if (archivo.exists()){
            try{
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()){
                    Investigador investigador = new Investigador(sc.nextInt(),
                                                                 sc.next(),
                                                                 sc.next(),
                                                                 sc.nextInt(),
                                                                 sc.nextInt());
                    investigadores.add(investigador);
                    //no comprendo las variables Key y Value de B_Tree asi que no los puedo agregar al arbol por ahora
                }
            }
            catch (FileNotFoundException | ByteOverweightException e){
                
            }
            sc.close();
        }
    }
}
