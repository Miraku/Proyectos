/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldepersonas;
import java.util.Scanner;
/**
 *
 * @author a15davidmv
 */
public class ControlDePersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        
        System.out.println("Introduzca un nombre");
        String nombre=leer.nextLine();
        System.out.println("Introduzca la edad");
        int edad=leer.nextInt();
        leer.nextLine();
        System.out.println("Introduzca el sexo (H o M)" );
        char sexo=leer.nextLine().charAt(0);
        System.out.println("Introduzca el peso");
        int peso=leer.nextInt();
        System.out.println("Introduzca la altura (en cm)");
        int altura=leer.nextInt();
        
        Persona uno=new Persona(nombre,edad,sexo,peso,altura);
        Persona dos=new Persona(nombre,edad,sexo);
        Persona tres=new Persona();
        
        dos.setAltura(160);
        dos.setPeso(75);
        
        tres.setNombre("Carla");
        tres.setEdad(22);
        tres.setSexo('m');
        tres.setAltura(167);
        tres.setPeso(65);
        
        Menu(uno);
        Menu(dos);
        Menu(tres);
        
                
        }
        
    
    public static void Menu(Persona cero){
    
    System.out.println("");
        
        switch(cero.calcularIMC()){
            case -1:
                if(cero.getSexo()=='H'){
                System.out.println(cero.getNombre()+" está demasiado delgado");
                }else{
                System.out.println(cero.getNombre()+" está demasiado delgada");
                }
                break;
            case 0:
                if(cero.getSexo()=='H'){
                System.out.println(cero.getNombre()+" está perfecto");
                }else{
                System.out.println(cero.getNombre()+" está perfecta");
                }
                break;
            case 1:
                if(cero.getSexo()=='H'){
                System.out.println(cero.getNombre()+" está demasiado gordo");
                }else{
                System.out.println(cero.getNombre()+" está demasiado gorda");
                }
            break;
        }
        
        if(cero.esMayorDeEdad()){
            System.out.println(cero.getNombre()+" es mayor de edad");
        }else{
            System.out.println(cero.getNombre()+" es menor de edad");
        }
        
            System.out.println(cero.toString());
        
    }
    
}

