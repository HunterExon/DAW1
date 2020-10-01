package com.juan;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        /*
Realiza un programa que pinte una X hecha de asteriscos.
El programa debe pedir la altura. Se debe comprobar que
la altura sea un número impar mayor o igual a 3, en caso
contrario se debe mostrar un mensaje de error.
*/
        int filas;
        char c;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.printf("Introduzca la altura de la X: ");
            filas = teclado.nextInt();
            if(filas%2==0||filas<3){
                System.out.println("ERROR. Por favor, introduzca un numero impar mayor que 3");
            }
        }while(filas%2==0||filas<3);

        System.out.printf("Introduzca el caracter de construcción: ");
        c = teclado.next().charAt(0);

        for (int alto=1;alto<=filas;alto++) {
            for (int ancho=1;ancho<=filas;ancho++){
                if((alto==ancho)||(alto+ancho==filas+1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}