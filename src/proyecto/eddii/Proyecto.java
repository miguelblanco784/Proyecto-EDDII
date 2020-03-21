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
    private int codigo;
    private String nombre;
    private int codigo_investigador;
    private String fecha_inicio;
    private String fecha_fin;
    private int estado;

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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws ByteOverweightException {
        if (codigo<=999999) {
            this.codigo=codigo;
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ByteOverweightException {
        if (nombre.length()<=50) {
            this.nombre=nombre;
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public int getCodigo_investigador() {
        return codigo_investigador;
    }

    public void setCodigo_investigador(int codigo_investigador) throws ByteOverweightException {
        if (codigo_investigador<=99999) {//validacion de 10 bytes 
            this.codigo_investigador=codigo_investigador;
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) throws ByteOverweightException {
        if (fecha_inicio.length()<=10) {//validacion de 10 bytes
            this.fecha_inicio=fecha_inicio;
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) throws ByteOverweightException {
        if (fecha_fin.length()<=10) {
            this.fecha_fin=fecha_fin;
        }else{
            throw new ByteOverweightException(message);
        }
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) throws ByteOverweightException {
        if (estado==1||estado==2||estado==3||estado==4) {//cada uno de los numero representa uno de las multiples opcioness de estado
            this.estado=estado;
        }else{
            throw new ByteOverweightException(message);
        }
    }
    
    
    
}
