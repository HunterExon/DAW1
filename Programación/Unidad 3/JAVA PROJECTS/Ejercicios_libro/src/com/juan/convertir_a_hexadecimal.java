package com.juan;

import java.util.Scanner;

public class convertir_a_hexadecimal {
    /*Escribir una función que transforme un numero a hexadecimal*/

    public static String caracter(int x) {
        String caracter;

        switch (x % 16) {
            case 10:
                caracter = "A";
                break;
            case 11:
                caracter = "B";
                break;
            case 12:
                caracter = "C";
                break;
            case 13:
                caracter = "D";
                break;
            case 14:
                caracter = "E";
                break;
            case 15:
                caracter = "F";
                break;
            default:
                caracter = Integer.toString(x % 16);
                break;

        }
        return caracter;
    }

    public static void hexadecimal(int num) {
        String aux = "";
        System.out.print("Convertido a hexadecimal es: $");

        while (num >= 16) {
            aux = aux + caracter(num);
            num = num / 16;
        }

        if (num > 9) {
            aux = aux + caracter(num);
        } else {
            aux = aux + Integer.toString(num);
        }

        for (int i = aux.length() - 1; i >= 0; i--) {
            System.out.print(aux.charAt(i));
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("||PASA A HEXADECIMAL||");
        System.out.println("======================");
        do {
            System.out.println("Introduzca un numero entero positivo: ");
            num = teclado.nextInt();
            if (num < 0) {
                System.out.println("Debe ser entero positivo");
            }
        } while (num < 0);

        hexadecimal(num);
    }
}
