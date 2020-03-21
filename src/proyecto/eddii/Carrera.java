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
    static String message="Supera el numero de bits";//variable estatica porque no se debe cambiar el nombre
    private int codigo;
    private String nombre;
    private int estado;

    public Carrera(){
    }
    
    public Carrera(int codigo, String nombre, int estado) throws ByteOverweightException {//se le añade el throws para que funcione nuestra excepcion de Bytes
        setCodigo(codigo);
        setNombre(nombre);
        setEstado(estado);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws ByteOverweightException {//Se le añade a cada mutador set el throws exception para que tire la excepcion deseada a momento de ejecicion
        if (codigo<=999){//validacion de que el codigo no puede superar los 3 bytes
            this.codigo=codigo;
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ByteOverweightException {
        if (nombre.length()<=25) {//validacion de que el nombre no puede superar los 25 bytes
          this.nombre=nombre;
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) throws ByteOverweightException {
        if (estado==0||estado==1) {//validacion de que el estado solo puede ser 0 o 1. 0=inactivo, 1=activo
            this.estado=estado;
        }else{
            throw new ByteOverweightException(message);
        }
    }
    
        
}
