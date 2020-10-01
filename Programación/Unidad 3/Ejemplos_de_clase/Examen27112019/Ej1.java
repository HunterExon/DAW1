package com.jdperez;

import java.util.Scanner;

public class Ej1 {

    public static int maxMatriz(int[][] matriz) {

        int mayor = matriz[0][0];

        for (int i=0;i<matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]> mayor) {
                    mayor = matriz[i][j];
                }
            }
        }

        return mayor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        int anchura = 0;

        System.out.println("Introduzca la altura");
        altura = sc.nextInt();

        System.out.println("Introduzca la anchura");
        anchura = sc.nextInt();

        int[][] datos = new int[altura][anchura];

        for (int i=0;i<altura;i++) {
            for (int j = 0; j < anchura; j++) {
                datos[i][j] = (int) (Math.random()*1000);
            }
        }

        for (int i=0;i<altura;i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print(datos[i][j]+"   |");
            }
            System.out.println();
        }


        System.out.println("El elemento mayor de la matriz es "+maxMatriz(datos));

    }
}
