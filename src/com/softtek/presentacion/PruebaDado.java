package com.softtek.presentacion;

import com.softtek.modelo.Dado;
import java.util.Objects;
import java.util.Scanner;
public class PruebaDado {
    public static void main(String[] args) {
        Dado dado = new Dado();
        Scanner sc = new Scanner(System.in);
        String seguir = "s";
        do {
            System.out.println(dado.lanzar());
            System.out.println("¿Quieres jugar más?");
            seguir=sc.nextLine();
        }while(!Objects.equals(seguir, "n"));

    }
}
