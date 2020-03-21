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
public class Investigador {
    static String message="Supera el numero de bits";
    private int codigo;
    private String nombre;
    private String fechadeingreso;
    private int codigo_carrera;
    private int estado;

    public Investigador() {
    }

    public Investigador(int codigo, String nombre, String fechadeingreso, int codigo_carrera, int estado) throws ByteOverweightException {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechadeingreso = fechadeingreso;
        this.codigo_carrera = codigo_carrera;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws ByteOverweightException {
        if (codigo<=9999) {
            this.codigo=codigo;
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ByteOverweightException {
        if (nombre.length()<=30) {//validacion de 30 bytes
            this.nombre=nombre;
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public String getFechadeingreso() {
        return fechadeingreso;
    }

    public void setFechadeingreso(String fechadeingreso) throws ByteOverweightException {
        if (fechadeingreso.length()<=10) {//validacion de 10 bytes
            this.fechadeingreso=fechadeingreso;
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public int getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(int codigo_carrera) throws ByteOverweightException {
        if (codigo_carrera>=999) {
            this.codigo_carrera=codigo_carrera;
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
