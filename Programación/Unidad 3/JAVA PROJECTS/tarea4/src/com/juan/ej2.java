package com.juan;

import java.util.Scanner;

public class ej2 {

    /*
Actividad 2: Escribir una aplicación que solicite al usuario
cuántos números desea introducir. A continuación, se
introducirá por teclado esa cantidad de números enteros,
y por último, los mostrará en el orden inverso al introducido..
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

        for (int i=a.length-1; i>=0;i--){
            System.out.println("Termino "+(i+1)+": "+a[i]);
        }
    }
}