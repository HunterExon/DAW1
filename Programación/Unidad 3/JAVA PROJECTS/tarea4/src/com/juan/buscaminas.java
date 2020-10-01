package com.juan;

import java.util.Scanner;

public class buscaminas {

    public static int BuscaMinas (int fila, int col, char[][] tablero){
        int minas=0;

        if(tablero[fila][col]=='X'){
            return -1;
        }else{
            for(int i=fila;i<=fila+2;i++){
                for (int j=col;j<=col+2;j++){
                    if(tablero[fila][col]=='X'){
                        minas++;
                    }
                }
            }
        }
        return minas;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x,y,z;
        do{
            System.out.println("Introduzca el tamaño del tablero: ");
            x = teclado.nextInt();
            if (x < 2) {
                System.out.println("ERROR - Debe ser entero positivo y mayor a 1");
            }
        }while(x<2);

        char[][] tablero = new char[x][x];

        for(int i=0;i<tablero.length;i++){
            for (int j=0;j<tablero.length;j++){
                int mina = (int) (Math.random()*100+1);
                if (mina>=50){
                    tablero[i][j] = 'X';
                }else{
                    tablero[i][j] = ' ';
                }
            }
        }
        for(int i=0; i<tablero.length;i++){
            libreria_vectores.impresion_estandar_caracteres(tablero[i]);
            System.out.println();
        }

        do{
            System.out.println("Introduzca la fila: ");
            z = teclado.nextInt();
            if (z <= 0 || z>x) {
                System.out.println("ERROR - Debe estar dentro de la tabla");
            }
        }while(z <= 0 || z>x);

        do{
            System.out.println("Introduzca la columna: ");
            y = teclado.nextInt();
            if (y <= 0 || y>x) {
                System.out.println("ERROR - Debe estar dentro de la tabla");
            }
        }while(y <= 0 || y>x);

        System.out.println("Numero de minas "+BuscaMinas(z-1,y-1,tablero));

    }
}