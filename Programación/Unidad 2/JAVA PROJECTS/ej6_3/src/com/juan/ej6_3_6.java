package com.juan;

import java.util.Scanner;

public class ej6_3_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca el alto: ");
        byte alto = teclado.nextByte();

        System.out.printf("Introduzca el ancho: ");
        byte ancho = teclado.nextByte();

        for (int i = alto; i > 0; i--) {
            for (int j = ancho; j > 0; j--) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
