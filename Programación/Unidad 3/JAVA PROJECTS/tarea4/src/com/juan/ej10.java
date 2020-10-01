package com.juan;

import java.util.Scanner;

public class ej10 {

    /*
Actividad 10: Escribir la función rellenaPares() a la que se le
pasa como parámetro una tabla unidimensional que debe rellenar
de la siguiente forma: se leerá por teclado una serie de números,
guardando en la tabla los pares hasta que esté llena, e ignorando
los impares. La función tiene que devolver la cantidad de impares desechados.
    */
    static int rellena(int[]a){
        Scanner teclado = new Scanner(System.in);
        int impares=0;
        for(int i=0; i<a.length;i++){
            do{
                System.out.println("Introduzca el termino "+(i+1)+": ");
                a[i]=teclado.nextInt();
                if(a[i]%2!=0){
                    impares++;
                }
            }while(a[i]%2!=0);
        }
        return impares;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        int impares=0;
        do {
            System.out.println("Introduzca la cantidad de datos del vector: ");
            x = teclado.nextInt();
            if(x<=0){
                System.out.println("ERROR - Debe ser entero positivo");
            }
        }while(x<=0);

        int[] a=new int[x];
        impares = rellena(a);


        System.out.println("=========================");
        System.out.println("||La tabla quedaría así||");
        for(int i=0;i<a.length;i++){
            if(i==0){
                System.out.print("("+a[i]+"-");
            }else if(i==a.length-1){
                System.out.print(a[i]+")");
            }else{
                System.out.print(a[i]+"-");
            }
        }
        System.out.println();
        System.out.println("Con un total de "+impares+" impares desechados");
        System.out.println("=========================");
    }
}