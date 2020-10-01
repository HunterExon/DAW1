package com.juan;

import java.util.Scanner;

public class ej8 {

    /*
Actividad 8: Crear una tabla bidimensional de tamaño 5x5 y
rellenarla de la siguiente forma: la posición [n,m] debe
contener n+m. Después, se debe mostrar su contenido.
    */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x,y;
        do {
            System.out.println("Introduzca la cantidad de datos de la coordenada X: ");
            x = teclado.nextInt();
            if(x<=0){
                System.out.println("ERROR - Debe ser entero positivo");
            }
        }while(x<=0);
        do {
            System.out.println("Introduzca la cantidad de datos de la coordenada Y: ");
            y = teclado.nextInt();
            if(y<=0){
                System.out.println("ERROR - Debe ser entero positivo");
            }
        }while(y<=0);

        int[][] a=new int[x][y];
        for(int i=0; i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=i+j;
                if(j==0) {
                    System.out.print("(" + a[i][j] + "-");
                }else if(j==a[i].length-1){
                    System.out.print(a[i][j]+")");
                }else{
                    System.out.print(a[i][j]+"-");
                }
            }
            System.out.println();
        }
    }
}