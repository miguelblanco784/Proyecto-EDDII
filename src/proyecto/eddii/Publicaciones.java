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
public class Publicaciones {
    static String message="Supera el numero de bits";
    private Campo codigo;
    private Campo codigo_de_proyecto;
    private Campo fecha;
    private Campo revista;
    
    public Publicaciones(){    
    }

    public Publicaciones(int codigo, int codigo_de_proyecto, String fecha, String revista) throws ByteOverweightException {
        setCodigo(codigo);
        setCodigo_de_proyecto(codigo_de_proyecto);
        setFecha(fecha);
        setRevista(revista);
    }
    
    public Campo getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws ByteOverweightException {
        if (codigo<=9999999) {
            this.codigo=new Campo(Integer.toString(codigo),7,"int");
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public Campo getCodigo_de_proyecto() {
        return codigo_de_proyecto;
    }

    public void setCodigo_de_proyecto(int codigo_de_proyecto) throws ByteOverweightException {
        if (codigo_de_proyecto<=999999) {
            this.codigo_de_proyecto=new Campo(Integer.toString(codigo_de_proyecto),6,"int");
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public Campo getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) throws ByteOverweightException {
        if (fecha.length()<=10) {
            this.fecha=new Campo(fecha,10,"String");
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public Campo getRevista() {
        return revista;
    }

    public void setRevista(String revista) throws ByteOverweightException {
        if (revista.length()<=20) {
            this.revista=new Campo(revista,20,"String");
        }else{
            throw new ByteOverweightException(message);
        }
    }
    
    public String toString(){
        String registro="";
        registro+=getCodigo();
        for (int i = 0; i < (getCodigo().getSize())- (getCodigo().getNombre().length()); i++) {
            registro+="$";
        }
        registro+=";"+getCodigo_de_proyecto();
        for (int i = 0; i < (getCodigo_de_proyecto().getSize())-(getCodigo_de_proyecto().getNombre().length()); i++) {
            registro+="$";
        }
        registro+=";"+getFecha().getNombre();
        for (int i = 0; i < (getFecha().getSize())-(getFecha().getNombre().length()); i++) {
            registro+="$";
        }
        registro+=";"+getRevista().getNombre();
        for (int i = 0; i < (getRevista().getSize())-(getRevista().getNombre().length()); i++) {
            registro+="$";
        }
        return registro;
    }
    
}
