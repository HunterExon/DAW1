package com.juan;

import java.util.Scanner;

public class ej4 {

    /*Actividad 4: Diseñar una función que reciba como
    parámetros dos números enteros y que devuelva el mayor de los dos.*/

    public static void mayor(int x, int y) {

        if (x > y) {
            System.out.println(x+" es mayor que "+y);
        } else if (y > x) {
            System.out.println(y+" es mayor que "+x);
        } else {
            System.out.print("Ambos números son iguales.");
        }
    }



    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el primer número:");
        num1 = teclado.nextInt();

        System.out.print("Introduzca el segundo número:");
        num2 = teclado.nextInt();

        mayor(num1,num2);

    }
}