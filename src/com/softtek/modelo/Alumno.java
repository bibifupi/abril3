package com.softtek.modelo;

/*6. Construir una aplicación que muestre por pantalla el nombre de alumno y su nota final.
Para ello construir una clase Alumno que contenga:
• Un campo que sea una matriz para almacenar las calificaciones de los parciales.
• El constructor deberá inicializar las variables de NombreCompleto y dimensionar
    el array de Parciales.
• Una propiedad de escritura para asignar los valores de los parciales.
• Un método para calcular el promedio de los parciales.
• Un método para mostrar las calificaciones de los parciales.*/
public class Alumno {
    private String nombreCompleto;
    private double[] parciales;




    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : parciales) {
            suma += calificacion;
        }
        return suma / parciales.length;
    }

    public String mostrarCalificaciones() {
        String texto="";
        for (int i = 0; i < parciales.length; i++) {
            texto+="Parcial nº" + (i + 1) + ": " + parciales[i]+" ";
        }
        return texto;
    }

    public Alumno(String nombreCompleto, int cantidadParciales) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = new double[cantidadParciales];
    }

    public Alumno() {
    }

    public void setParcial(int numeroParcial, double calificacion) {
        if (numeroParcial >= 0 && numeroParcial < parciales.length) {
            parciales[numeroParcial] = calificacion;
        } else {
            //Debería hacerse con una excepcion
            System.out.println("La cantidad de parciales no coincide");
        }
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double[] getParciales() {
        return parciales;
    }

    public void setParciales(double[] parciales) {
        this.parciales = parciales;
    }

}



