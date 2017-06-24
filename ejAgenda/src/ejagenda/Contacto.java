/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejagenda;

import java.io.Serializable;

/**
 *
 * @author a15davidmv
 */
public class Contacto implements Serializable{
    public static final Contacto NULO=new Contacto("","",-1,-1);
    private String nombre;
    private String direccion;
    private int cp;
    private int telefono;
    
    Contacto(String n, String d, int c,int t){
    nombre=n;
    direccion=d;
    cp=c;
    telefono=t;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCp() {
        return cp;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
    return "Contacto: "+nombre+"\n"
            + "Dirección: "+direccion+"\n"
            + "Código Postal: "+cp+"\n"
            + "Teléfono: "+telefono;
    }
    
}
