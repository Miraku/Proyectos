/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejarraymetodos;

import java.util.Scanner;

/**
 *
 * @author a15davidmv
 */
public class EjArrayMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short[][] datos = new short[10][3];

        encuesta(datos);

        System.out.println("El porcentaje de hombres es: " + porcentajeG(datos, 1) + "%");
        System.out.println("El porcentaje de mujeres es: " + porcentajeG(datos, 2) + "%");
        System.out.println("El porcentaje de hombres que trabajan es: " + porcentajeT(datos, 1) + "%");
        System.out.println("El porcentaje de mujeres que trabajan es: " + porcentajeT(datos, 2) + "%");
        System.out.println("El promedio del sueldo de los hombres: " + promedio(datos, 1) + "€");
        System.out.println("El promedio del sueldo de las mujeres: " + promedio(datos, 2) + "€");

    }

    private static void encuesta(short[][] datos) {
        for (int i = 0; i < 10; i++) {
            Scanner leer = new Scanner(System.in);
            System.out.println("ENCUESTA Nº" + i+1);
            System.out.println("¿Eres chico o chica? 1-> chico, 2-> chica");
            datos[i][0] = leer.nextShort();
            System.out.println("¿Trabajas? 1-> si, 2-> no");
            datos[i][1] = leer.nextShort();
            System.out.println("Introduzca su sueldo");
            datos[i][2] = leer.nextShort();
            System.out.println("");
        }
    }

    private static int porcentajeG(short[][] datos, int i) {
        int suma = 0;
        for (int j = 0; j < datos.length; j++) {
            if (datos[j][0] == i) {
                suma++;
            }
        }
        return (suma/ datos.length)*100;
    }

    private static int porcentajeT(short[][] datos, int i) {
        int suma = 0;
        for (int j = 0; j < datos.length; j++) {
            if (datos[j][0] == i & datos[j][2] == 1) {
                suma++;
            }
        }
        return (suma/ datos.length)*100;
    }

    private static int promedio(short[][] datos, int i) {
        int sueldo=0;
        for (int j = 0; j < datos.length; j++) {
            if(datos[j][0]==i){
            sueldo=sueldo+datos[j][2];
            }
            
        }
        sueldo=(sueldo/datos.length)*100;
        return sueldo;
    }

}
