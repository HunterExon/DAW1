package com.juan;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        /*
Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
El programa pedirá la altura. El palo horizontal de la L tendrá una
longitud de la mitad (división entera entre 2) de la altura más uno.
*/
        int filas;
        char c;
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca la altura de la L: ");
        filas = teclado.nextInt();

        System.out.printf("Introduzca el caracter de construcción: ");
        c = teclado.next().charAt(0);

        for (int alto=1;alto<=filas;alto++) {
            for (int ancho=1;ancho<=filas;ancho++){
                if((alto!=filas&&ancho==filas/2)){
                    System.out.print(c);
                }else if((alto!=filas&&ancho!=filas/2)||(ancho<filas/2||ancho>(filas/2)+(filas/2))){
                    System.out.printf(" ");
                }else{
                        System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}