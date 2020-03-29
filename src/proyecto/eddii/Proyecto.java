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
public class Proyecto {
    static String message="Supera el numero de bits";
    private Campo codigo;
    private Campo nombre;
    private Campo codigo_investigador;
    private Campo fecha_inicio;
    private Campo fecha_fin;
    private Campo estado;

    public Proyecto() {
    }

    public Proyecto(int codigo, String nombre, int codigo_investigador, String fecha_inicio, String fecha_fin, int estado) throws ByteOverweightException {
        setCodigo(codigo);
        setNombre(nombre);
        setCodigo_investigador(codigo_investigador);
        setFecha_inicio(fecha_inicio);
        setFecha_fin(fecha_fin);
        setEstado(estado);
    }

    public Campo getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws ByteOverweightException {
        if (codigo<=999999) {
            this.codigo=new Campo(Integer.toString(codigo),6,"int");
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public Campo getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ByteOverweightException {
        if (nombre.length()<=50) {
            this.nombre=new Campo(nombre,50,"String");
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public Campo getCodigo_investigador() {
        return codigo_investigador;
    }

    public void setCodigo_investigador(int codigo_investigador) throws ByteOverweightException {
        if (codigo_investigador<=99999) {//validacion de 10 bytes 
            this.codigo_investigador= new Campo(Integer.toString(codigo_investigador),5,"int");
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public Campo getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) throws ByteOverweightException {
        if (fecha_inicio.length()<=10) {//validacion de 10 bytes
            this.fecha_inicio=new Campo(fecha_inicio,10,"String");
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public Campo getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) throws ByteOverweightException {
        if (fecha_fin.length()<=10) {
            this.fecha_fin=new Campo(fecha_fin,10,"String");
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public Campo getEstado() {
        return estado;
    }

    public void setEstado(int estado) throws ByteOverweightException {
        if (estado==1||estado==2||estado==3||estado==4) {//cada uno de los numero representa uno de las multiples opcioness de estado
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
        registro+="|"+getNombre().getNombre();
        for (int i = 0; i < (getNombre().getSize())-(getNombre().getNombre().length()); i++) {
            registro+="$";
        }
        registro+="|"+getCodigo_investigador();
        for (int i = 0; i < (getCodigo_investigador().getSize())-(getCodigo_investigador().getNombre().length()); i++) {
            registro+="$";
        }
        registro+="|"+getFecha_inicio().getNombre();
        for (int i = 0; i < (getFecha_inicio().getSize())-(getFecha_inicio().getNombre().length()); i++) {
            registro+="$";
        }
        registro+="|"+getFecha_fin().getNombre();
        for (int i = 0; i < (getFecha_fin().getSize())-(getFecha_fin().getNombre().length()); i++) {
            registro+="$";
        }
        registro+="|"+getEstado().getNombre();
        return registro;
    }
    
}
