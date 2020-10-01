package com.juan;

import java.util.Scanner;

public class Ex1 {
    /*
    Ejercicio 1:
    Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han encargado
    realizar un programa que pinte un 8 por pantalla usando la letra M. Se pide al usuario
    la altura, que debe ser un número entero impar mayor o igual que 5. Si el número
    introducido no es correcto, el programa deberá mostrar un mensaje de error. A
    continuación, se muestran algunos ejemplos. La anchura de la figura siempre será de 6
    caracteres.

    Ejemplo 1:
    Por favor, introduzca la altura (número impar mayor o igual a 5): 8
    La altura introducida no es correcta

    Ejemplo 2:
    Por favor, introduzca la altura (número impar mayor o igual a 5): 3
    La altura introducida no es correcta

    Ejemplo 3:
    Por favor, introduzca la altura (número impar mayor o igual a 5): 5
    MMMMMM
    M    M
    MMMMMM
    M    M
    MMMMMM
    Ejemplo 4:
    Por favor, introduzca la altura (número impar mayor o igual a 5): 9
    MMMMMM
    M    M
    M    M
    M    M
    MMMMMM
    M    M
    M    M
    M    M
    MMMMMM
    */

    public static void main(String[] args) {
        //0-Declaración de variables y funcion scanner
        int alto;
        Scanner teclado = new Scanner(System.in);

        //1-Restricciones para la introducción de datos
        do {
            System.out.println("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
            alto = teclado.nextInt();
            //1.1-Mensaje de error cuando no se introduce lo correcto
            if (alto % 2 == 0 || alto < 5) {
                System.out.println("La altura introducida no es correcta");
            }
        } while (alto % 2 == 0 || alto < 5);

        //2-Bucle para empezar a pintar
        //2.1-Primer for para la altura de la figura
        for (int i = 0; i < alto; i++) {
            //2.2-Segundo for para el ancho de la figura
            for (int j = 0; j < 6; j++) {
                //2.2.1-Condicional if para saber si escribo o no a la hora de dibujar
                if ((i == 0) || (i == alto - 1) || (i == alto / 2) || (j == 0) || (j == 5)) {
                    System.out.print("M");
                    //2.2.2-Cuando no se cumpla la condición, ponemos espacios en blanco
                } else {
                    System.out.print(" ");
                }
            }
            //2.2.2-Esto realizará los saltos de línea tras terminar cada fila de la figura.
            System.out.println();
        }
    }
}