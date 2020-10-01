package com.juan;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_1 {

    public static int maxMatriz(int[][] a){
        int mayor;

        mayor = a[0][0];
        for(int i=0; i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>mayor){
                    mayor=a[i][j];
                }
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas,columnas;

        do{
            System.out.println("==============================================");
            System.out.println("||Introduzca el número de filas de la matriz||");
            System.out.println("==============================================");
            filas = teclado.nextInt();

            if(filas<2){
                System.out.println("==ERROR== Introduzca un número de filas de mínimo 2");
            }
        }while(filas<2);

        do{
            System.out.println("=================================================");
            System.out.println("||Introduzca el número de columnas de la matriz||");
            System.out.println("=================================================");
            columnas=teclado.nextInt();

            if(columnas<1){
                System.out.println("==ERROR== Introduzca un número de columnas de mínimo 1");
            }
        }while(columnas<1);

        int[][] matriz = new int [filas][columnas];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                 matriz[i][j] = (int)(Math.random()*1000);
            }
        }

        for(int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }

        System.out.println("El número mayor es "+maxMatriz(matriz));
    }
}
