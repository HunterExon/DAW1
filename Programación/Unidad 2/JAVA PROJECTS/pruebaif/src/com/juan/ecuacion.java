package com.juan;

import java.util.Scanner;

public class ecuacion {
    public static void main(String[] args) {
        System.out.println("Para una ecuación de primer grado ax + b = 0");
        System.out.printf("Introduzca la a: ");
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextInt();
        System.out.printf("Introduzca la b: ");
        new Scanner(System.in);
        double b = teclado.nextInt();

        System.out.printf("La solución a la ecuacion %.0f x + %.0f = 0 es: ",a,b,(-b)/a);
    }
}
