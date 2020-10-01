package com.juan;

import java.util.Arrays;
import java.util.Scanner;

public class buscaletras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

        do{
            System.out.println("Introduzca el tamaño de la matriz: ");
            x = teclado.nextInt();
            if (x < 2) {
                System.out.println("ERROR - Debe ser entero positivo y mayor a 1");
            }
        }while(x<2);

        char[][] matriz = new char[x][x];

        for(int i=0;i<matriz.length;i++){
            System.out.print("{");
            for(int j=0;j<matriz.length;j++){
                int aleatorio = (int) (Math.random()*26);
                matriz[i][j]=abecedario.charAt(aleatorio);
                if(j==matriz.length-1){
                    System.out.print(matriz[i][j]);
                }else{
                    System.out.print(matriz[i][j] + "-");
                }
            }
            System.out.println("}");
        }

        System.out.println("====================");

        char[][] matriz2 = new char[x][x];

        for(int i=0;i<matriz2.length;i++){
            for(int j=0;j<matriz2.length;j++) {
                matriz2[i][j] = ' ';
            }
        }


        int z,y;
        do {
            do {
                System.out.println("Introduce la fila a buscar: ");
                z = teclado.nextInt();
                if (z > x || z <= 0) {
                    System.out.println("=================================================");
                    System.out.println("==Error, la fila debe estar dentro de la matriz==");
                    System.out.println("==============Vuelva a introducirla==============");
                    System.out.println("=================================================");
                }
            } while (z > x || z <= 0);
            do {
                System.out.println("Introduce la columna a buscar: ");
                y = teclado.nextInt();
                if (y > x || y <= 0) {
                    System.out.println("====================================================");
                    System.out.println("==Error, la columna debe estar dentro de la matriz==");
                    System.out.println("================Vuelva a introducirla===============");
                    System.out.println("====================================================");
                }
            } while (y > x || y <= 0);

            String palabra;
            char letra;
            teclado.nextLine();

            System.out.print("Introduzca una letra: ");
            palabra = teclado.nextLine();
            letra = palabra.toUpperCase().charAt(0);

            if (matriz[z - 1][y - 1] == letra) {
                matriz2[z - 1][y - 1] = letra;
            }
            for (int i = 0; i < matriz2.length; i++) {
                System.out.print("{");
                for (int j = 0; j < matriz2.length; j++) {
                    if (j == matriz2.length - 1) {
                        System.out.print(matriz2[i][j]);
                    } else {
                        System.out.print(matriz2[i][j] + "-");
                    }
                }
                System.out.println("}");
            }
            System.out.println();

            if (Arrays.deepEquals(matriz, matriz2)){
                System.out.println("=========================");
                System.out.println("=ENHORABUENA - HA GANADO=");
                System.out.println("=========================");
            }

        }while(!Arrays.deepEquals(matriz, matriz2));
    }
}
