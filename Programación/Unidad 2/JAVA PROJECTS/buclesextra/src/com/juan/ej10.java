package com.juan;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        /*
Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
El programa pedirá la altura. Fíjate que el programa inserta un espacio y
pinta dos asteriscos menos en la base para simular la curvatura
de las esquinas inferiores.
*/
        int filas;
        char c;
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca la altura de la U: ");
        filas = teclado.nextInt();

        System.out.printf("Introduzca el caracter de construcción: ");
        c = teclado.next().charAt(0);

        for (int alto=1;alto<=filas;alto++) {
            for (int ancho=1;ancho<=filas;ancho++){
                if((alto==filas && ancho!=1 && ancho!=filas)||(alto<filas && (ancho==1 || ancho==filas))){
                    System.out.print(c);
                }else{
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}

