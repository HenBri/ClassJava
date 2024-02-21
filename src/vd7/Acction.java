package vd7;

import javax.swing.*;
@FunctionalInterface // con esto definimos q es lamda
public interface Acction {
    public void comprar(String producto, int peso);
    // para q sea LAMDA solo funciona cunado la interfaz solo tiene un metodo
}
