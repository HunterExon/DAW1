package com.jdperez;

import java.util.Scanner;

public class CuadradosConcentricos {

    public static void main(String[] args) {

        int tam = 0;
        int numCuad = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño del cuadrado exterior");
        tam = sc.nextInt();

        while (tam % 2 == 0 || tam < 3) {
            System.out.println("El tamaño debe ser impar y mayor que 3");
            System.out.println("Introduce el tamaño del cuadrado exterior");
            tam = sc.nextInt();
        }


        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                // La condición tiene 4 partes 
                // Primera parte -> Filas hasta la mitad
                // Segunda parte -> Filas desde la mitad en adelante
                // Tercera parte -> Columnas hasta la mitad
                // Cuarta parte -> Columnas desde la mitad en adelante
                if ((i % 2 == 0 && j >= i && j <= tam - 1 - i) || (i%2==0 && i+j >= tam-1 && j<=i)
                        || (j%2==0 && i>=j && j<=tam-i-1) || (j%2==0 && i+j>=tam-1 && i<=j)) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }

            }

            System.out.println();
        }
    }
}
