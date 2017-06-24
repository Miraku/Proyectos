/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccionobjetos;

/**
 *
 * @author a15davidmv
 */
public class Producto {

    private String codigo;
    private double precio;

    Producto(String codigo, double precio) {
        //this.codigo = codigo;
        //this.precio = precio;
        setCodigo(codigo);
        setPrecio(precio);
    }

    Producto() {
        this.codigo = "";
        this.precio = 0;
    }

    public void imprimir() {
        System.out.println("El producto " + this.codigo + " vale " + this.precio + "Soles");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }
}
