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
public class Campo {
    private String nombre;
    private int size;
    private String tipo;
    
    public Campo(){    
    }

    public Campo(String nombre, int size, String tipo) {
        this.nombre = nombre;
        this.size = size;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
