package com.juan;

import java.util.Scanner;

public class crear_tabla_y_producto_escalar_y_vectorial {

    /*
Ejercicio propuesto 7.4.8: Si has estudiado lo que es un vector,
crea dos arrays de tres elementos, cada uno de los
cuales representará un vector de tres dimensiones.
Pide al usuario los datos para ambos vectores,
luego muéstralos en la forma "(5, 7, -2)",
después calcula (y muestra) su producto escalar y su producto vectorial.
    */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x,y;
        do {
            System.out.println("Introduzca la cantidad de datos de los vectores: ");
            y = teclado.nextInt();
            if(y<=0){
                System.out.println("ERROR - Debe ser entero positivo");
            }
        }while(y<=0);
        do {
            System.out.println("Introduzca la cantidad de vectores: ");
            x = teclado.nextInt();
            if(x<2){
                System.out.println("ERROR - Debe ser entero positivo y mayor a 2");
            }
        }while(x<2);

        int[][] a=new int[x][y];
        for(int i=0; i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print("Introduzca el término en coordenada ("+i+","+j+"): ");
                a[i][j]= teclado.nextInt();
            }
        }
        System.out.println("La matriz quedaría así: ");
        for(int i=0; i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(j==0){
                    System.out.print("("+a[i][j]+", ");
                }else if(j==a[i].length-1){
                    System.out.print(a[i][j]+")");
                }else{
                    System.out.print(a[i][j]+", ");
                }
            }
            System.out.println();
        }
        int[] b=new int[y];
        for(int i=0;i<b.length;i++){
                b[i]=1;
        }
        System.out.println("=======================");
        System.out.println("El producto escalar será: ");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++) {
                b[i] = b[i] * a[j][i];
            }
        }
        int producto_escalar=0;
        for(int i=0;i<b.length;i++){
            producto_escalar=producto_escalar+b[i];
        }
        System.out.print(producto_escalar);

        int[] c=new int[y];
        for(int i=0;i<b.length;i++){
            c[i]=0;
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){

            }
        }

    }
}
