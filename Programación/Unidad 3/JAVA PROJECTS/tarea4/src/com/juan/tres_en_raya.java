package com.juan;

import java.util.Scanner;

public class tres_en_raya {
    public static boolean comprobacion (char[][] matriz, char letra) {
        boolean ganador=false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j]==letra){
                    ganador=true;
                }else{
                    ganador=false;
                    break;
                }
            }
            if(ganador){
                break;
            }
            for(int j = 0; j < matriz.length; j++){
                if(matriz[j][i]==letra){
                    ganador=true;
                }else{
                    ganador=false;
                    break;
                }
            }
            if(ganador){
                break;
            }
            for(int j = 0; j < matriz.length; j++){
                if(matriz[j][j]==letra){
                    ganador=true;
                }else{
                    ganador=false;
                    break;
                }
            }
            if(ganador){
                break;
            }
            for(int j = matriz.length-1; j > 0; j--){
                if(matriz[j][j]==letra){
                    ganador=true;
                }else{
                    ganador=false;
                    break;
                }
            }
            if(ganador){
                break;
            }
        }
        return ganador;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x=3;
        char[][] matriz = new char[x][x];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++) {
                matriz[i][j] = ' ';
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("-------------");
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                if (j == matriz.length - 1) {
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.print(matriz[i][j] + " | ");
                }
            }
            System.out.println(" |");
        }
        System.out.println("-------------");

        int turno=0;
        boolean ocupada, ganador;
        char letra;
        int jugador;
        do {
            int z, y;
            if(turno%2==0){
                jugador=1;
            }else{
                jugador=2;
            }

            System.out.println("=================");
            System.out.println("=TURNO JUGADOR "+jugador+"=");
            System.out.println("=================");
            do {
                ocupada=false;
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
                if(matriz[z][y]!=' '){
                    ocupada=true;
                    System.out.println("====================================================");
                    System.out.println("==Error, la coordenada introducida está ocupada ya==");
                    System.out.println("================Vuelva a introducirla===============");
                    System.out.println("====================================================");
                }
            }while(ocupada);

            if(turno%2==0){
                letra = 'X';
                matriz[z-1][y-1]=letra;
            }else{
                letra = 'O';
                matriz[z-1][y-1]=letra;
            }

            for (int i = 0; i < matriz.length; i++) {
                System.out.println("-------------");
                System.out.print("| ");
                for (int j = 0; j < matriz.length; j++) {
                    if (j == matriz.length - 1) {
                        System.out.print(matriz[i][j]);
                    } else {
                        System.out.print(matriz[i][j] + " | ");
                    }
                }
                System.out.println(" |");
            }
            System.out.println("-------------");

            ganador=comprobacion(matriz,letra);
            turno++;

            if(ganador){
                System.out.println("=========================");
                System.out.println("=ENHORABUENA JUGADOR "+jugador+"- HA GANADO=");
                System.out.println("=========================");
            }
            if(turno==9){
                System.out.println("=======================");
                System.out.println("=EL JUEGO HA TERMINADO=");
                System.out.println("=======================");
            }
        }while(turno<9 || !ganador);
    }
}
