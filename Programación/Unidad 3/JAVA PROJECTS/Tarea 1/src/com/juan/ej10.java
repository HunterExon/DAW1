package com.juan;

import java.util.Scanner;

public class ej10 {

    /*Actividad 10: Escribir una función que decida
    si dos números enteros positivos son amigos.
    Dos números son amigos si la suma de los divisores propios
    (distinto de él mismo) del primer número es igual al segundo
    número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)*/

    public static int divisores(int x){
        int cont=0;
        for(int i=1;i<x;i++){
            if(x%i==0) {
                cont=cont+i;
            }
        }
        return cont;
    }

    public static void amigos(int x, int y){
        if(divisores(x)==y){
            if(divisores(y)==x){
                System.out.println(x+" y "+y+" son números amigos.");
            }else{
                System.out.println(x+" y "+y+" no son números amigos.");
            }
        }else{
            System.out.println(x+" y "+y+" no son números amigos.");
        }
    }

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduzca el primer número:");
            num1 = teclado.nextInt();
            if(num1<=0){
                System.out.println("ERROR - Introduzca un numero entero positivo");
            }
        }while(num1<=0);
        do {
            System.out.print("Introduzca el segundo número:");
            num2 = teclado.nextInt();
            if(num2<=0){
                System.out.println("ERROR - Introduzca un numero entero positivo");
            }
        }while(num2<=0);

        amigos(num1,num2);
    }
}
