package com.softtek.modelo;

import java.util.Random;

/*7. Realizar la clase Dado su objetivo será lanzar un dado, mostrando el resultado por
pantalla. Se aconseja estructurar el programa de la siguiente forma. En el main se
invoca a los métodos de la clase dado. Una clase dado, que dispondrá de: Un
constructor que usa el método random de Math multiplicado por (6-1)+1.
La llamada a Math.random() devuelve un número aleatorio entre 0.0 y 1.0, excluido
este último valor, es decir, puede devolver 0.346442, 0.2344234, 0.98345,....
En muchas de nuestras aplicaciones no nos servirá este rango de valores. Por ejemplo,
si queremos simular una tirada de dado, queremos números entre 1 y 6 sin decimales.
Debemos echar unas cuentas para obtener lo deseado.
En primer lugar, miramos cuántos valores queremos. En nuestro caso del dado son 6
valores, del 1 al 6 ambos incluido. Debemos entonces multiplicar Math.random() por 6
(que es (maximo-minimimo)+1, es decir, (6-1)+1)Los métodos serán: Seis para
dibujar por pantalla la imagen de los números. Otro para lanzar(), que generará un
número aleatorio entre 1 y 6, invocará al método dibujar que le corresponda.*/
public class Dado {
    private int numeroAleatorio;
    private Random numeroGenerado = new Random();

    public Dado() {
        this.numeroAleatorio = (int) (Math.random() * (6 - 1) + 1);
    }
    public String numero1(){
    return "     \n  *  \n     ";
    }
    public String numero2(){
        return "*    \n     \n     *";
    }
    public String numero3(){
        return "*    \n  *  \n    *";
    }
    public String numero4(){
        return "*   *\n     \n*   *";
    }
    public String numero5(){
        return "*   *\n  *  \n*   *";
    }
    public String numero6(){
        return "* * *\n* * *\n* * *";
    }


    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    public Random getNumeroGenerado() {
        return numeroGenerado;
    }

    public void setNumeroGenerado(Random numeroGenerado) {
        this.numeroGenerado = numeroGenerado;
    }

    public String lanzar() {
        numeroAleatorio = numeroGenerado.nextInt(6) + 1;
        if (numeroAleatorio == 1) {
            return numero1();
        } else if (numeroAleatorio == 2) {
            return numero2();
        } else if (numeroAleatorio == 3) {
            return numero3();
        } else if (numeroAleatorio == 4) {
            return numero4();
        } else if (numeroAleatorio == 5) {
            return numero5();
        } else {
            return numero6();
        }


        }
    }

