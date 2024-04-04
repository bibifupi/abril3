package com.softtek.presentacion;

public class ProbarString {
    /*
        Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”
        • Mostrar la cadena toda en mayúsculas
        • Mostrar la cadena en minúsculas
        • Mostrar solo la palabra Nunca
        • Mostrar solo la palabra mosca
        • Mostrar la palabra cabeza
        • Mostrar la posición de la letra primera m
        • Devolver la longitud de la cadena
         */
    public static void main(String[] args) {
        String frase = "Nunca mates una mosca sobre la cabeza de un tigre.";
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println(frase.substring(0,5));
        System.out.println(frase.substring(16,21));
        System.out.println(frase.substring(31,37));
        System.out.println(frase.indexOf("m"));
        System.out.println(frase.length());
        System.out.println(frase.substring(frase.indexOf("N"),frase.lastIndexOf("a")));


    }

}
