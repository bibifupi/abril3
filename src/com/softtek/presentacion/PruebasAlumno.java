package com.softtek.presentacion;

import com.softtek.modelo.Alumno;

public class PruebasAlumno {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Débora Fuentes", 3);

        alumno.setParcial(0, 8.5);
        alumno.setParcial(1, 7.0);
        alumno.setParcial(2, 9.0);

        System.out.println(("Nombre del alumno: "+alumno.getNombreCompleto()+"\n"));
        System.out.println(alumno.mostrarCalificaciones());
        System.out.println("Promedio: " + alumno.calcularPromedio());
    }
}
