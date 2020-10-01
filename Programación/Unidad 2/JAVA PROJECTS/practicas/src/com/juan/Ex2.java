package com.juan;

import java.util.Scanner;

public class Ex2 {

    /*
    Ejercicio 2:
    Escribe un programa que permita partir un número introducido por teclado en dos
    partes. Las posiciones se cuentan de izquierda a derecha empezando por
    el 1. Suponemos que el usuario introduce correctamente los datos, es decir, el número
    introducido tiene dos dígitos como mínimo y la posición en la que
    se parte el número está entre 2 y la longitud del número. No se permite en este
    ejercicio el uso de funciones de manejo de String (por ej. para extraer
    subcadenas dentro de una cadena).

    Ejemplo:
    Por favor, introduzca un número entero positivo: 406783
    Introduzca la posición a partir de la cual quiere partir el número: 5
    Los números partidos son el 4067 y el 83.
    */
    public static void main(String[] args) {
        //0-Función scanner
        Scanner teclado = new Scanner(System.in);

        //1-Declaración de variable y petición de datos de la misma con sus respectivas restricciones
        int num;
        do {
            System.out.println("Por favor, introduzca un número entero positivo y mínimo dos digitos: ");
            num = teclado.nextInt();
            //1.1-Mensaje de error cuando no se introduce lo que se le pide al usuario
            if (num < 10) {
                System.out.println("ERROR - Debe ser entero positivo y mínimo de dos digitos");
            }
        } while (num < 10);

        //2-Creación y utilización de un bucle While para contabilizar el numero de digitos del numero introducido
        int aux = num;
        int cont = 0;
        while (aux > 0) {
            aux /= 10;
            cont++;
        }

        //3-Declaración de variable y petición de datos de la misma con sus respectivas restricciones
        int pos;
        do {
            System.out.println("Introduzca la posición a partir de la cual quiere partir el número: ");
            pos = teclado.nextInt();

            //3.1-Mensaje de error cuando no se introduce lo que se le pide al usuario
            if (pos < 2 || pos > cont) {
                System.out.println("ERROR - Debe estar entre 2 y " + cont);
            }
        } while (pos < 2 || pos > cont);

        //4-Primera muestra del resultado
        System.out.println();
        System.out.print("Los números partidos son el ");

        //5-Realizamos un bucle for para así saber cual es el numero con el que nos quedaremos en primer lugar
        aux = num;
        //5.1-Con este booleano lo que quiero saber es si el numero partido, queda con un cero en el trozo de la dereca en el primer lugar
        boolean cero = false;
        for (int i = pos; i <= cont; i++) {
            aux = aux / 10;
            //5.2-Aquí es cuando levantamos la bandera, averiguamos si el numero partido tiene un cero a la izquierda
            //mirando para ello que sea el PENULTIMO numero a contar, y por lo tanto si es así levantamos bandera.
            if (aux % 10 == 0 && i == cont - 1) {
                cero = true;
            }
        }
        //5.3-Aqui mostramos ya el primer trozo y seguimos completando enunciado
        System.out.print(aux);

        System.out.print(" y el ");

        //6-Aquí es donde mostramos el "0" si la bandera está levantada
        if (cero) {
            System.out.print("0");
        }

        //7-Ultimo for para calcular cuantas veces hemos tenido que multiplicar por 10 el numero
        //para realizar el primer corte, así restamos el numero original al nuevo y obtenemos el segundo trozo
        //que se mostrará a continuación
        for (int i = pos; i <= cont; i++) {
            aux = aux * 10;
        }
        System.out.print(num - aux);
    }
}
