package com.juan;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        /*
Escribe un programa que muestre en tres columnas,
el cuadrado y el cubo de los 5 primeros números
enteros a partir de uno que se introduce por teclado.
 */
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduzca un numero: ");
        int numero = teclado.nextInt();

        System.out.println("||NUMEROS-CUADRADO-CUBO||");
        System.out.println("=========================");

        for(int i=0;i<5;i++){
            System.out.printf("|| %3d || %3d || %3d ||",numero,numero*numero,numero*numero*numero);
            System.out.println();
            numero++;
        }
    }
}
