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
    private int codigo;
    private int codigo_de_proyecto;
    private String fecha;
    private String revista;
    
    public Publicaciones(){    
    }

    public Publicaciones(int codigo, int codigo_de_proyecto, String fecha, String revista) throws ByteOverweightException {
        setCodigo(codigo);
        setCodigo_de_proyecto(codigo_de_proyecto);
        setFecha(fecha);
        setRevista(revista);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws ByteOverweightException {
        if (codigo<=9999999) {
            this.codigo=codigo;
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public int getCodigo_de_proyecto() {
        return codigo_de_proyecto;
    }

    public void setCodigo_de_proyecto(int codigo_de_proyecto) throws ByteOverweightException {
        if (codigo_de_proyecto<=999999) {
            this.codigo_de_proyecto=codigo_de_proyecto;
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) throws ByteOverweightException {
        if (fecha.length()<=10) {
            this.fecha=fecha;
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public String getRevista() {
        return revista;
    }

    public void setRevista(String revista) throws ByteOverweightException {
        if (revista.length()<=20) {
            this.revista=revista;
        }else{
            throw new ByteOverweightException(message);
        }
    }
    
    
}
