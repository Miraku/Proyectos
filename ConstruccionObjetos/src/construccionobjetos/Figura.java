/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccionobjetos;

import java.awt.Color;

/**
 *
 * @author a15davidmv
 */
public class Figura {

    private Color ColorFigura;
    private int[] Posicion = new int[2];

    Figura(Color color) {
        EstableceColor(color);
    }

    Figura(Color color, int[] Posicion) {
        EstableceColor(color);
        EstableceCentro(Posicion);
    }

    public void EstableceColor(Color color) {
        ColorFigura = color;
    }

    public Color DimeColor() {
        return ColorFigura;
    }

    public void EstableceCentro(int[] Posicion) {
        this.Posicion[0] = Posicion[0];
        this.Posicion[1] = Posicion[1];
    }

    public int[] DimeCentro() {
        return Posicion;
    }

}
