/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccionobjetos;

public class Bombero {

    private String nombre = "";
    private String apellidos = "";
    private int edad = 0;
    private boolean casado = false;
    private boolean especialista = false;

    Bombero(String nombre, String apellidos, int edad, boolean casado, boolean especialista) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.casado = casado;
        this.especialista = especialista;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String GetNombre() {
        return nombre;
    }

    public void SetApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String GetApellidos() {
        return apellidos;
    }

    public void SetEdad(int edad) {
        this.edad = edad;
    }

    public int GetEdad() {
        return edad;
    }

    public void SetCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean GetCasado() {
        return casado;
    }

    public void SetEspecialista(boolean especialista) {
        this.especialista = especialista;
    }

    public boolean GetEspecialista() {
        return especialista;
    }
}
