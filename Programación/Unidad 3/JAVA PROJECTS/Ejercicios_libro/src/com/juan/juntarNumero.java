package com.juan;

import java.util.Scanner;

public class juntarNumero {
    /*Escribir una función que pida dos numeros y los una*/

    public static int juntar(int num1, int num2) {
        String aux;
        int aux2;
        aux=Integer.toString(num1)+Integer.toString(num2);
        aux2=Integer.valueOf(aux);

        return aux2;
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("||JUNTAR DOS NUMEROS||");
        System.out.println("======================");
        do {
            System.out.println("Introduzca un numero entero positivo: ");
            num1 = teclado.nextInt();
            if (num1 < 0) {
                System.out.println("Debe ser entero positivo");
            }
        } while (num1 < 0);
        do {
            System.out.println("Introduzca un segundo numero entero positivo: ");
            num2 = teclado.nextInt();
            if (num2 < 0) {
                System.out.println("Debe ser entero positivo");
            }
        } while (num2 < 0);

        System.out.println("El numero concatenado es: "+juntar(num1,num2));
    }
}