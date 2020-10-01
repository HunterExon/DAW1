package com.juan;

import java.util.Arrays;
import java.util.Scanner;

public class examentarde5 {
    public static int[] corteza(int[][] matriz) {
        int z = 0;
        int[] resultado = new int[2*matriz[0].length+(2*(matriz.length-2))];

        for (int j = 0; j < matriz[0].length; j++) {
            resultado[z] = matriz[0][j];
            z++;
        }
        for (int i = 1; i < matriz.length; i++) {
            resultado[z] = matriz[i][matriz[i].length - 1];
            z++;
        }
        for (int j = matriz[matriz.length-1].length-2; j >= 0 ; j--) {
            resultado[z] = matriz[matriz.length - 1][j];
            z++;
        }
        for (int i = matriz.length-2; i > 0 ; i--){
            resultado[z] = matriz[i][0];
            z++;
        }
        return resultado;
}

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas, columnas;

        do {
            System.out.println("==============================================");
            System.out.println("||Introduzca el número de filas de la matriz||");
            System.out.println("==============================================");
            filas = teclado.nextInt();

            if (filas < 2) {
                System.out.println("==ERROR== Introduzca un número de filas de mínimo 2");
            }
        } while (filas < 2);

        do {
            System.out.println("=================================================");
            System.out.println("||Introduzca el número de columnas de la matriz||");
            System.out.println("=================================================");
            columnas = teclado.nextInt();

            if (columnas < 1) {
                System.out.println("==ERROR== Introduzca un número de columnas de mínimo 1");
            }
        } while (columnas < 1);

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        for(int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
        System.out.println();
        int[] resultado = corteza(matriz);
        System.out.print("El resultado de 'corteza' es este: ");
        System.out.println(Arrays.toString(resultado));
    }
}

