package com.softtek.presentacion;

import com.softtek.modelo.TablaMultiplicar;

public class PruebaMultiplicar {
    public static void main(String[] args) {
        TablaMultiplicar tabla= new TablaMultiplicar(5);

        System.out.println(tabla.obtenerTabla());
    }
}
