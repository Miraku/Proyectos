/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author a15davidmv
 */
public class Dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] dados = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte dado1, dado2;

        //tirada de dados
        for (int i = 0; i < 1000; i++) {
            dado1 = (byte) (Math.random() * 6 + 1);
            dado2 = (byte) (Math.random() * 6 + 1);
            dados[dado1 + dado2 - 2]++;

        }

        for (int i = 0; i < dados.length; i++) {
            System.out.println("El número " + (i + 2) + " se ha salido el " + dados[i] / 10 + "% de las veces.");
        }
    }

}
