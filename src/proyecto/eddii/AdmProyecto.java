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
import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class AdmProyecto extends TDAarchivo{
    private File archivo=null;
    private B_Tree proyectos;
    
    AdmProyecto (B_Tree proyectos){
        archivo= new File("proyectos.txt");
        setProyectos(proyectos);
    }

    public B_Tree getProyectos() {
        return proyectos;
    }

    public void setProyectos(B_Tree proyectos) {
        this.proyectos = proyectos;
    }
    
    
    @Override
    void escribir(){
        FileWriter fw= null;
        BufferedWriter bw = null;
        try{
            fw=new FileWriter(archivo, false);
            bw=new BufferedWriter(fw);
            for (int i = 0; i < proyectos.size(); i++) {
                //no comprendo la variable Key de B_Tree asi que no los puedo extraerlos del arbol
            }
        }
        catch(IOException e){
            
        }
    }
    
    @Override
    void leer(){
        Scanner sc= null;
        proyectos = new B_Tree();
        if (archivo.exists()){
            try{
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()){
                    Proyecto proyecto = new Proyecto(sc.nextInt(),
                                                     sc.next(),
                                                     sc.nextInt(),
                                                     sc.next(),
                                                     sc.next(),
                                                     sc.nextInt());
                    //no comprendo las variables Key y Value de B_Tree asi que no los puedo agregar al arbol por ahora
                }
            }
            catch (FileNotFoundException | ByteOverweightException e){
                
            }
        }
    }
}
