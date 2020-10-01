package com.juan;

import java.util.Scanner;

public class ej6_2_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        int y;

        do{
            System.out.printf("Introduzca un primer numero: ");
            x = teclado.nextInt();

            System.out.printf("Introduzca un segundo numero: ");
            y = teclado.nextInt();

            if (x!=0 && y!=0) {
                System.out.println("La suma de " + x + " + " + y + " es " +(x+y));
                System.out.println("***********");
            }else{
                System.out.println("***********");
                System.out.println("SALIENDO");
                System.out.println("***********");
            }
        }while(x!=0 && y!=0);
    }
}

