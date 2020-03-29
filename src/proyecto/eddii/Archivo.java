/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.eddii;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Francisco Pagoaga
 */
public class Archivo {
    private String texto;
    
    public Archivo(){   
    }
    
    public Archivo(String texto){
        this.texto=texto;
    }
    
    public void Escritura(){
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw=new FileWriter(texto,true);
            bw= new BufferedWriter(fw);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
