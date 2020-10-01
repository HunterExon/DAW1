package com.juan;

import java.util.Scanner;

public class ej1 {

    /*
Actividad 1: Diseñar un programa que solicite al usuario
5 números decimales. A continuación, debe mostrar los
números en el mismo orden en que se han introducido.
    */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        do {
            System.out.println("Introduzca el número de terminos del vector: ");
            x = teclado.nextInt();
            if(x<=0){
                System.out.println("ERROR - Debe ser entero positivo");
            }
        }while(x<=0);

        float[] a=new float[x];
        for(int i=0; i<a.length;i++){
            System.out.println("Introduzca el numero decimal " +(i + 1)+": ");
            a[i] = teclado.nextFloat();
        }

        for (int i=0; i<a.length;i++){
            System.out.println("Termino "+(i+1)+": "+a[i]);
        }
    }
}