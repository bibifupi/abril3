package com.softtek.presentacion;

public class TiposPrimitivos {
    public static void main(String[] args) {
        System.out.println("Tipos primitivos");

        byte numeroPequeno = 5;
        System.out.println(numeroPequeno);
        short numeroEntero = 350;
        System.out.println(numeroEntero);
        int numero = 56_350;
        System.out.println(numero);
        long numeroLargo = 56_000_000;
        System.out.println(numeroLargo);
        float numeroDecimales = 1_123_45F;
        System.out.println(numeroDecimales);
        double numeroDecimalesGrande = 1_1235_897.098;
        System.out.println(numeroDecimalesGrande);
        boolean estaCasado = false;
        System.out.println(estaCasado);
        char letra = 'a';
        System.out.println(letra);
        //calcular el area de un cuadrado cuyo lado mide 4
        int lado = 4;
        int cuadrado = lado * lado;
        System.out.println(cuadrado);
        //Calcular el área de un circulo cuyo radio es 3
        int radio = 3;
        double circulo = Math.PI * Math.pow(radio, 2);

        System.out.println(circulo);
        //calcular el perimetro de un rectangulo cuya base es 4 y altura 3
        int base = 4;
        int altura = 3;
        int rectangulo = base * altura;
        System.out.println(rectangulo);
    }
}