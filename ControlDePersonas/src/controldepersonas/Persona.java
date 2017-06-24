/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldepersonas;

/**
 *
 * @author a15davidmv
 */
public class Persona {

    private String nombre;
    private final String DNI;
    private char sexo;
    private int edad;
    private int peso;
    private int altura;

    Persona() {
        this("",0,' ',0,0);
    }

    Persona(String nombre, int edad, char sexo) {
        this(nombre,edad,sexo,0,0);
    }

    Persona(String nombre, int edad, char sexo, int peso, int altura) {
        this.nombre = nombre;
        this.DNI = generarDNI();
        comprobarSexo(sexo);
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public int calcularIMC() {
        final int poco = -1, sobrepeso = 1, normal = 0;
        float imc;
        if(altura!=0){
        imc = peso / ((altura * altura)/10000);
        }else{
        return poco;
        }

        if (imc > 25) {
            return sobrepeso;
        } else if (imc > 18.5) {
            return normal;
        } else {
            return poco;
        }
    }

    public boolean esMayorDeEdad() {
        return edad>=18;
        
    }

    private void comprobarSexo(char sexo) {
        if(sexo=='M'||sexo=='m'){
        this.sexo='M';
        }else{
        this.sexo='H';
        }
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\n"
                + "Edad: "+edad+"\n"
                + "DNI: "+DNI+"\n"
                + "Sexo: "+sexo+"\n"
                + "Peso: "+peso+"\n"
                + "Altura: "+altura;
    }

    private String generarDNI() {
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        int numero=(int)(Math.random()*100000000);
        return Integer.toString(numero)+letras.charAt(numero%23);
    }
}
