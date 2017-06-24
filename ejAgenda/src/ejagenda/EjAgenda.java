/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejagenda;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author a15davidmv
 */
public class EjAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ArrayList<Agenda> todas= new ArrayList();
        int op1=0;
        while(op1!=4){
       while(op1<1||op1>4){
        System.out.println("      Bienvenido al programa agenda \n"
                + "  Elija que quiere hacer: \n"
                + " 1. Nueva agenda \n"
                + " 2. Borrar agenda \n"
                + " 3. Cargar agenda \n"
                + " 4. Salir.");
        op1=leer.nextInt();
        if(op1<1||op1>4){
            System.err.println("Opcion incorrecta, introduzca 1,2,3 o 4.");
        }
       }
       switch(op1){
           case 1:
               int x=0;
               while(x<1){
               System.out.println("Introduzca número máximo de contactos.");
               x=leer.nextInt();
               }
               todas.add(new Agenda(x));
               break;
           case 2:
               // eliminar 
               break;
           case 3:
               // Cargar agenda y seguir con el programa
               
               break;
           default:
               System.out.println("Saliendo");
               break;
       
       }
            
       
       // Salir de aqui cuando presiono 4 en el menu grande.
        }
    }
    
}
