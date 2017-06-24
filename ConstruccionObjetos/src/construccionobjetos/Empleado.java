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
public class Empleado {

    private String nombre = "";
    private int edad = 0;
    private int salario = 0;

    public String GetNombre() {
        return nombre;
    }

    public void SetNombre(String nuevo) {
        nombre = nuevo;
    }

    public int GetEdad() {
        return edad;
    }

    public void SetEdad(int nuevo) {
        edad = nuevo;
    }

    public int GetSalario() {
        return salario;
    }

    public void SetSalario(int nuevo) {
        salario = nuevo;
    }

    public boolean SalarioPlus(int plus) {
        if (edad >= 40) {
            salario = salario + plus;
            return true;
        } else {
            return false;
        }
    }

}
