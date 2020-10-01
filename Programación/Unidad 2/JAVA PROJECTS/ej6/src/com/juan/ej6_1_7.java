package com.juan;

import java.util.Scanner;

public class ej6_1_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 0;

        while (x == 0) {
            System.out.printf("Introduzca un numero: ");
            x = teclado.nextInt();
        }
        while(x != 0){
            System.out.printf("*");
            x--;
        }
    }
}
