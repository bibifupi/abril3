package com.softtek.presentacion;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //indica la opcion correcta para x=6, y=5 y z=6;
        //a) x=6; y=++x; z=y--  b)x=6; y=++x; z=--y;
        //c) x=5; y=x++; z=y--  d)x=5; y=++x; z=y--;
        //D ES LA CORRECTA

        //Declarar variable y decrementar

        int numero2 = 100;
        numero2 = numero2-5;
        System.out.println("numero2->"+numero2);
        numero2 -=5;
        System.out.println("numero2->"+numero2);
        numero2--;
        System.out.println("numero2->"+numero2);

        //Multiplicar
        int numero3= 7;
        numero3=numero3 * 3;
        System.out.println("numero3->"+numero3);
        numero3*=2;
        System.out.println("numero3->"+numero3);

        //Division - dividir entre 10 y luego entre 5
        int numero4=100;
        numero4 = numero4 /10;
        System.out.println("numero 4->"+numero4);
        numero4 /=5;
        System.out.println("numero 4->"+numero4);
    }
}
