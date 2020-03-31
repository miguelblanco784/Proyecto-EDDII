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
    private Campo codigo;
    private Campo nombre;
    private Campo fechadeingreso;
    private Campo codigo_carrera;
    private Campo estado;

    public Investigador() {
    }

    public Investigador(int codigo, String nombre, String fechadeingreso, int codigo_carrera, int estado) throws ByteOverweightException {
        setCodigo(codigo);
        setNombre(nombre);
        setFechadeingreso(fechadeingreso);
        setCodigo_carrera(codigo_carrera);
        setEstado(estado);
    }

    public Campo getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws ByteOverweightException {
        if (codigo<=9999) {
            this.codigo=new Campo(Integer.toString(codigo),4,"int");
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public Campo getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ByteOverweightException {
        if (nombre.length()<=30) {//validacion de 30 bytes
            this.nombre=new Campo(nombre,30,"String");
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public Campo getFechadeingreso() {
        return fechadeingreso;
    }

    public void setFechadeingreso(String fechadeingreso) throws ByteOverweightException {
        if (fechadeingreso.length()<=10) {//validacion de 10 bytes
            this.fechadeingreso=new Campo(fechadeingreso,10,"String");
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public Campo getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(int codigo_carrera) throws ByteOverweightException {
        if (codigo_carrera<=999) {
            this.codigo_carrera=new Campo(Integer.toString(codigo_carrera),3,"int");
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public Campo getEstado() {
        return estado;
    }

    public void setEstado(int estado) throws ByteOverweightException {
        if (estado==0||estado==1) {//validacion de que el estado solo puede ser 0 o 1. 0=inactivo, 1=activo
            this.estado=new Campo(Integer.toString(estado),1,"int");
        }else{
            throw new ByteOverweightException(message);
        }
    }
    
    public String toString(){
        String registro="";
        registro+=getCodigo().getNombre();
        for (int i = 0; i < (getCodigo().getSize())-(getCodigo().getNombre().length()); i++) {
            registro+="$";
        }
        registro+=";"+getNombre().getNombre();
        for (int i = 0; i < (getNombre().getSize())-(getNombre().getNombre().length()); i++) {
            registro+="$";
        }
        registro+=";"+getFechadeingreso().getNombre();
        for (int i = 0; i < (getFechadeingreso().getSize())-(getFechadeingreso().getNombre().length()); i++) {
            registro+="$";
        }
        registro+=";"+getCodigo_carrera().getNombre();
        for (int i = 0; i < (getCodigo_carrera().getSize())-(getCodigo_carrera().getNombre().length()); i++) {
            registro+="$";
        }
        registro+=";"+getEstado().getNombre();
        return registro;
    }
}
