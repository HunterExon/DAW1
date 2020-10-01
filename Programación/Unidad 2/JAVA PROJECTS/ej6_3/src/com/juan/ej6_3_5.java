package com.juan;

import java.util.Scanner;

public class ej6_3_5 {
    public static void main(String[] args) {
        System.out.printf("Introduzca un numero límite: ");
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();

        for(int i=0;i<=x;i++){
            if(i%3==0 && i%7==0) {
                System.out.println(i);
            }
        }
    }
}