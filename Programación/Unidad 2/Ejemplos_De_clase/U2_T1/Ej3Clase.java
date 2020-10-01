package com.jdperez;

import java.util.Scanner;

public class Ej3Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String cadena ="";

        System.out.println("Introduce el número a convertir");
        num = sc.nextInt();

        while (num>0) {
            cadena = (num%2) + cadena;
            num = num / 2;
        }

        System.out.println(cadena);
    }
}

