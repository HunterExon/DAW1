package com.juan;

import java.util.Scanner;

public class ej6_3_8 {
    public static void main(String[] args) {
        System.out.print("Introduzca un numero: ");
        Scanner teclado = new Scanner(System.in);
        long x = teclado.nextLong();

        System.out.print("Los divisores de "+x+" son: ");

        for(int i=1;i<=x;i++){
            if(x%i==0) {
                System.out.printf("%d, ",i);
            }
        }
    }
}