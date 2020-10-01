package com.juan;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [][]tablero=new String [8][8];

        String posicion,letra2="";
        int x=0,y=0;

        System.out.print("Introduzca la posición del alfil: ");
        posicion = teclado.nextLine();

        for(int i=0;i<tablero.length;i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                switch (j){
                    case 0:
                        letra2="a";
                        break;
                    case 1:
                        letra2="b";
                        break;
                    case 2:
                        letra2="c";
                        break;
                    case 3:
                        letra2="d";
                        break;
                    case 4:
                        letra2="e";
                        break;
                    case 5:
                        letra2="f";
                        break;
                    case 6:
                        letra2="g";
                        break;
                    case 7:
                        letra2="h";
                        break;
                }
                tablero[i][j]=letra2+Integer.toString(i+1);
                if(posicion.equals(tablero[i][j])){
                    x=i;
                    y=j;
                }
            }
        }

        int z;
        System.out.println("El álfil puede moverse a las siguientes posiciones: ");
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[i].length;j++){
                z=0;
                do{
                    if(i==x+z && j==y+z){
                        if (!tablero[i][j].equals(posicion)){
                            System.out.print(tablero[i][j] + " ");
                        }
                    }
                    z++;
                }while(x+z<=9 && y+z>=0);
                z=0;
                do{
                    if(i==x+z && j==y-z){
                        if (!tablero[i][j].equals(posicion)){
                            System.out.print(tablero[i][j] + " ");
                        }
                    }
                    z++;
                }while(x+z<=9 && y-z>=0);
                z=0;
                do{
                    if(i==x-z && j==y+z){
                        if (!tablero[i][j].equals(posicion)){
                            System.out.print(tablero[i][j] + " ");
                        }
                    }
                    z++;
                }while(x-z>=0 && y+z<=9);
                z=0;
                do{
                    if(i==x-z && j==y-z){
                        if (!tablero[i][j].equals(posicion)){
                            System.out.print(tablero[i][j] + " ");
                        }
                    }
                    z++;
                }while(x-z<=9 && y-z>=0);
            }
        }
    }
}
