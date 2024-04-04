package com.softtek.modelo;
/*5. Construir una aplicación que imprima por pantalla las tablas de multiplicar. Debe contar
con un constructor que indica la tabla que se va a mostrar. Debe contar con un
método que dé como resultado un string para mostrar diez línea de la tabla del
número dado en el constructor.*/
public class TablaMultiplicar {
    private int numeroTabla; // Número de la tabla de multiplicar

    // Constructor que establece el número de la tabla de multiplicar
    public TablaMultiplicar(int numeroTabla) {
        this.numeroTabla = numeroTabla;
    }

    // Método que devuelve un string con diez líneas de la tabla de multiplicar
    public String obtenerTabla() {
        String texto="";
        for (int i = 1; i <= 10; i++) {
            texto+=numeroTabla+" x "+i+" = "+(numeroTabla * i)+"\n";
        }
        return texto;
    }



}
