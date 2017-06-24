/*
Programa que lea un número por teclado y que devuelva el doble y el triple 
 */
package dobleytriple;

import java.util.Scanner;

/**
 *
 * @author a15davidmv
 */
public class DobleyTriple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int a;
        
        System.out.println("Introduzca un número");
        a=leer.nextInt();
        
        doble(a);
        triple(a);
        
    }

    private static void doble(int a) {
        System.out.println("El doble es "+(a*2));
    }
    private static void triple(int a){
        System.out.println("El triple es "+(a*3));
    }
    
}
