/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.eddii;
/**
 *
 * @author Francisco Pagoaga
 */
public class Carrera {
    static String message="Supera el numero de bits";
    private int codigo;
    private String nombre;
    private int estado;

    public Carrera(){
    }
    
    public Carrera(int codigo, String nombre, int estado) throws BitOverweightException {
        setCodigo(codigo);
        setNombre(nombre);
        setEstado(estado);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws BitOverweightException {
        if (codigo<=999){
            this.codigo=codigo;
        }else{
            throw new BitOverweightException(message);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws BitOverweightException {
        if (nombre.length()<=25) {
          this.nombre=nombre;
        }else{
            throw new BitOverweightException(message);
        }
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) throws BitOverweightException {
        if (estado==0||estado==1) {
            this.estado=estado;
        }else{
            throw new BitOverweightException(message);
        }
    }
    
        
}
