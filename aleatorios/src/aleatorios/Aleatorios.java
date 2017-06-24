/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorios;

import java.util.Scanner;

/**
 *
 * @author a15davidmv
 */
public class Aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("¿Cuantos números aleatorios quieres?");
        int num=leer.nextInt();
        System.out.print("Introduzca número mínimo: ");
        int min=leer.nextInt();
        System.out.print("Introduzca número máximo: ");
        int max=leer.nextInt();
        
        System.out.println("");
        for (int i = 0; i < num; i++) {
            System.out.print(" "+aleatorio(min,max));
            
        }
    }
    private static int aleatorio(int maximo,int minimo){
        int a=(int)(Math.random()*(maximo-minimo+1)+minimo);
        return a;
    }
    
}
