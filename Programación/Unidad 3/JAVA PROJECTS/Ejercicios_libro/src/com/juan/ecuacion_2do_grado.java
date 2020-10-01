package com.juan;

import java.util.Scanner;

public class ecuacion_2do_grado {
    /*Escribir una función que devuelva los resultados de una ecuacion de 2do grado*/

    public static void ecuacion(int a, int b, int c){
        double resultado1,resultado2;

        if(((b*b)-4*a*c)<0){
            System.out.println("La ecuación no tiene soluciones reales");
        }else {
            resultado1 = (-b + (Math.sqrt((b*b) - 4 * a * c)))/ (2 * a);
            resultado2 = (-b - (Math.sqrt((b*b) - 4 * a * c))) / (2 * a);

            System.out.printf("Las soluciones para la ecuación '(%d)x^2+(%d)x+(%d)=0' son: %.2f y %.2f",a,b,c,resultado1,resultado2);
        }
    }

    public static void main(String[] args) {
        int a,b,c;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para la ecuación 'ax^2+bx+c=0' calcula las soluciones de x.");
        System.out.println("Introduce la a: ");
        a = teclado.nextInt();
        System.out.println("Introduce la b: ");
        b = teclado.nextInt();
        System.out.println("Introduce la c: ");
        c = teclado.nextInt();

        ecuacion(a,b,c);
    }
}
