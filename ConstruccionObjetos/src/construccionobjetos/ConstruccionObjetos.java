/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccionobjetos;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author a15davidmv
 */
public class ConstruccionObjetos {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int op=0;
        while(op<1||op>5){
        System.out.println("A que prueba quiere acceder?\n"
                + "1. Empleado \n"
                + "2. Figura \n"
                + "3. Bombero \n"
                + "4. Profesor \n"
                + "5. Producto");
        op=leer.nextInt();
        }
        switch(op){
            case 1:
        //Prueba Empleado
        Empleado agente = new Empleado();

        agente.SetEdad(52);
        agente.SetNombre("Marcos");
        agente.SetSalario(200);
        System.out.print("El salario de " + agente.GetNombre() + ", de " + agente.GetEdad() + " años, ");
        if (agente.SalarioPlus(50)) {
            System.out.println("tiene su sueldo modificado y ahora cobra " + agente.GetSalario() + "€");
        } else {
            System.out.println("tiene su sueldo intacto y cobra " + agente.GetSalario() + "€");
        }
        break;
            case 2:
        //Prueba Figura
        System.out.println("");

        int[] posicion = {2, 3};
        Color blanco = new Color(1, 2, 3);
        Figura circulo = new Figura(blanco, posicion);

        System.out.println("La figura tiene como centro [" + circulo.DimeCentro()[0] + "]][" + circulo.DimeCentro()[1] + "] y como color el " + circulo.DimeColor().getRed()
                + "," + circulo.DimeColor().getGreen() + "," + circulo.DimeColor().getBlue() + " como código RGB.");

        System.out.println("");
        break;
        // Prueba Bombero
            case 3:
        Bombero novato = new Bombero("Avelino", "Martínez Sánchez", 29, false, true);

        System.out.print(novato.GetNombre() + " " + novato.GetApellidos() + " de " + novato.GetEdad());
        if (novato.GetCasado()) {
            System.out.print(" está casado ");
        } else {
            System.out.print(" está soltero ");
        }
        if (novato.GetEspecialista()) {
            System.out.println("y es un especialista");
        } else {
            System.out.println("y es un bombeero, con la mangueeera.");
        }

        System.out.println("");
        break;
            case 4:
        //Prueba profesor
        Profesor nulo = new Profesor();
        Profesor majo = new Profesor("Alex", "Méndez Martínez", 22, true, true);
        int a = 0;
        while (a < 2) {
            if (a == 1) {
                nulo = majo;
            }
            System.out.print(nulo.GetNombre() + " " + nulo.GetApellidos() + " de " + nulo.GetEdad());
            if (nulo.GetCasado()) {
                System.out.print(" está casado ");
            } else {
                System.out.print(" está soltero ");
            }
            if (nulo.GetEspecialista()) {
                System.out.println("y es un catedrático");
            } else {
                System.out.println("y es un proefesor normal.");
            }
            a++;
        }
        break;
            case 5:
        //Prueba Producto
        Producto nuevo = new Producto("as213", 2.33);

        System.out.println("El producto de código " + nuevo.getCodigo() + " vale " + nuevo.getPrecio() + " €");
        break;
        
    }
    }

}
