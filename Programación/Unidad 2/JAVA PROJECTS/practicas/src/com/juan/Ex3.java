package com.juan;

import java.util.Scanner;

public class Ex3 {

    /*
    Ejercicio 3:
    Realiza un programa que diga los dígitos que aparecen y los que no aparecen en un
    número entero introducido por teclado. El orden es el que se muestra en
    los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
    largos.

    Ejemplo 1:
    Introduzca un número entero: 67706
    Dígitos que aparecen en el número: 0 6 7
    Dígitos que no aparecen: 1 2 3 4 5 8 9

    Ejemplo 2:
    Introduzca un número entero: 555
    Dígitos que aparecen en el número: 5
    Dígitos que no aparecen: 1 2 3 4 6 7 8 9

    Ejemplo 3:
    Introduzca un número entero: 9876543210
    Dígitos que aparecen en el número: 0 1 2 3 4 5 6 7 8 9
    Dígitos que no aparecen:

    Ejemplo 4:
    Introduzca un número entero: 13247721
    Dígitos que aparecen en el número: 1 2 3 4 7
    Dígitos que no aparecen: 0 5 6 8 9

    */
    public static void main(String[] args) {
        //1-Declaración de variables y el scanner
        long num;
        Scanner teclado = new Scanner(System.in);

        //2-Solicitud del numero que debe introducir el usuario
        System.out.println("Introduzca un número entero: ");
        num = teclado.nextLong();

        //3-Declaración de los Strings a usar
        String contiene = "";
        String noContiene = "";
        //3.1-Este string usará el valor LITERAL del numero del usuario, como cadena.
        String numOriginal = String.valueOf(num);

        //4-Este bucle lo reccorremos de 0 a 9, y si el numero está en la cadena, lo mostramos en el posterior
        //resultado
        for (int i = 0; i <= 9; i++) {
            if (numOriginal.contains(String.valueOf(i))) {
                contiene = contiene + i + " ";
            } else {
                noContiene = noContiene + i + " ";
            }
        }
        System.out.println("Dígitos que aparecen en el número: " + contiene);
        System.out.println("Dígitos que no aparecen: " + noContiene);
    }
}