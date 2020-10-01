package com.juan;

import java.util.Scanner;

public class ej6_1_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;

        System.out.printf("Introduzca un numero para su cuadrado (pulse 0 para salir): ");
        x = teclado.nextInt();
        while(x!=0) {
            System.out.println("El cuadrado de "+x+" es "+x*x);
            System.out.printf("Introduzca un numero para su cuadrado (pulse 0 para salir): ");
            x = teclado.nextInt();
        }
    }
}

