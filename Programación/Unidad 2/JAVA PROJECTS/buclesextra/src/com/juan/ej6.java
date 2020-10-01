package com.juan;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        /*
Lo mismo que el 5 pero la pirámide hueca
*/
        int filas;
        char c='*';
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca la altura de la pirámide: ");
        filas = teclado.nextInt();

        System.out.printf("Introduzca el caracter de construcción: ");
        c = teclado.next().charAt(0);

        for (int alto=0;alto<filas;alto++) {
            for (int ancho=1;ancho<=((filas*2)-1);ancho++){
                if(alto==filas-1) {
                    System.out.print(c);
                }else{
                    if (ancho == filas + alto || ancho == filas - alto) {
                        System.out.print(c);
                    } else {
                        System.out.printf(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}