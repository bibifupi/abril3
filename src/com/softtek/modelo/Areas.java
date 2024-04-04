package com.softtek.modelo;

/* 3. Crear la clase Areas con métodos para calcular el área de un circulo y el área de un
        rectángulo. Desde una clase principal realizar ambos cálculos y mostrarlos por pantalla.*/
public class Areas {
    //1. Atributos
    private double base;
    private double altura;
    private double radio;

    //2. Métodos
    public static double areaCirculo(double radio) {
        return (Math.PI*(Math.pow(radio,2)));
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }


}
