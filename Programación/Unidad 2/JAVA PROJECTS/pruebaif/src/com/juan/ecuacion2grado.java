package com.juan;

import java.util.Scanner;

public class ecuacion2grado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Para una ecuación de segundo grado ax^2 + bx + c= 0");

        System.out.printf("Introduzca la a: ");
        double a = teclado.nextInt();

        System.out.printf("Introduzca la b: ");
        double b = teclado.nextInt();

        System.out.printf("Introduzca la c: ");
        double c = teclado.nextInt();

        if(b*b-4*a*c<0){
            System.out.printf("La ecuación no tiene soluciones reales");
        }else {
            double termino = (Math.sqrt((b*b)-(4*a*c)));
            System.out.printf("La solución 1 es x = %.2f", ((-b) + (termino))/(2*a));
            System.out.println("");
            System.out.printf("La solución 2 es x = %.2f", ((-b) - (termino))/(2*a));
        }
    }
}