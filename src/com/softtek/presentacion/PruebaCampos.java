package com.softtek.presentacion;
import com.softtek.modelo.Campos;
public class PruebaCampos {
    public static void main(String[] args) {
        Campos campos = new Campos(10);

        campos.incrementa();

        System.out.println("El valor de x es: " + campos.muestra());
    }
}
