package com.juan;

import java.util.Scanner;

public class cuadrado_concentrico_matriz {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        char caracter;
        do {
            System.out.println("Introduzca la dimensión del cuadrado: ");
            x = teclado.nextInt();
            if (x <= 3 || x%2==0) {
                System.out.println("ERROR - Debe ser entero positivo, impar y mayor que 3");
            }
        } while (x <= 3 || x%2==0);

        System.out.print("Introduzca el caracter de construcción: ");
        caracter = teclado.next().charAt(0);


        String[][] a = new String[x][x];
        int inicio=0;
        int end=x-1;

        while(inicio<=end) {
            for (int i = inicio; i <= end; i++) {
                for (int j = inicio; j <= end; j++) {
                    if (i == inicio || i == end || j == inicio || j == end) {
                        a[i][j] = (caracter+" ");
                    } else {
                        a[i][j] = "  ";
                    }
                }
            }
            inicio = inicio +2;
            end = end -2;
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}