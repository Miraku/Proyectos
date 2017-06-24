/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejagenda;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author a15davidmv
 */
public class Agenda implements Serializable {

    private int max;
    private ArrayList<Contacto> contactos;

    public Agenda(int m) {
        if(m>0){
        max = m;
        }else{
        max=1;
        }
        contactos = new ArrayList();
    }

    public boolean nuevoContacto(Contacto a) {
        boolean d;
        Contacto b = buscarPorNombre(a.getNombre());
        Contacto c = buscarPorNumero(a.getTelefono());
        if (contactos.size() < max) {
            if (b == Contacto.NULO) {
                if (c == Contacto.NULO) {
                    contactos.add(a);
                    d = true;
                } else {
                    System.err.println("El nombre ya estaba registrado");
                    d = false;
                }
            } else {
                System.err.println("El número ya estaba registrado");
                d = false;
            }
        } else {
            System.err.println("No caben más contactos en esta agenda.");
            d = false;
        }
        return d;
    }

    public Contacto buscarPorNombre(String nom) {
        boolean a = false;
        Contacto b = Contacto.NULO;
        for (int i = 0; i < contactos.size() & a == false; i++) {
            if (contactos.get(i).getNombre().compareToIgnoreCase(nom) == 0) {
                b = contactos.get(i);
            }

        }
        return b;
    }

    public Contacto buscarPorNumero(int num) {
        boolean a = false;
        Contacto b = Contacto.NULO;
        for (int i = 0; i < contactos.size() & a == false; i++) {
            if (contactos.get(i).getTelefono() == num) {
                b = contactos.get(i);
            }

        }
        return b;
    }

    public boolean borrar(String nom) {
        if (buscarPorNombre(nom).equals(Contacto.NULO)) {
            return false;
        } else {
            for (int i = 0; i < contactos.size(); i++) {
                if (contactos.get(i).getNombre().compareToIgnoreCase(nom) == 0) {
                }
                contactos.remove(i);
            }
            return true;
        }
    }

    public boolean cambiarNumero(String nom, int num) {
        if (buscarPorNombre(nom).equals(Contacto.NULO)) {
            return false;
        } else {
            for (int i = 0; i < contactos.size(); i++) {
                if (contactos.get(i).getNombre().compareToIgnoreCase(nom) == 0) {
                }
                contactos.get(i).setTelefono(num);
            }
            return true;
        }
    }

    @Override
    public String toString() {
        String a = "";
        for (Contacto contacto : contactos) {
            a = contacto.toString();
        }

        return a;
    }
}
