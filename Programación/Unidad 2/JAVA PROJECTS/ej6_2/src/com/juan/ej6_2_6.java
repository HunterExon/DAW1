package com.juan;

import java.util.Scanner;

public class ej6_2_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca un numero para formar el cuadrado: ");
        byte num = teclado.nextByte();

        byte cont=0;
        byte cont2=0;
        do {
            do {
                System.out.printf("*");
                cont++;
            } while (num != cont);

            System.out.println("");
            cont2++;
            cont =0;
        }while(num!=cont2);
    }
}