package com.jdperez;

import java.util.Scanner;

public class Ej5Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "";

        System.out.println("Introduce la palabra");
        palabra = sc.nextLine();

        for (int i=0;i<palabra.length()*2-1;i++) {

            if (i<palabra.length()) {
                //Parte Superior

                // Espacios en blanco
                for (int j = 0; j < palabra.length() - i-1; j++) {
                    System.out.print("-");
                }

                //Hacia adelante
                for (int j = 0; j <= i; j++) {
                    System.out.print(palabra.charAt(j));
                }

                //Hacia atrás
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(palabra.charAt(j));
                }

            } else {
                //Parte inferior del rombo

                // Espacios en blanco
                for (int j=0;j< i-(2*palabra.length()/2-1);j++) {
                    System.out.print("-");
                }

                // Hacia adelante
                for (int j=0;j< (palabra.length()*2-1-i);j++) {
                    System.out.print(palabra.charAt(j));
                }


                // Hacia atrás
                for (int j= (palabra.length()-1)*2-i-1; j>=0;j--) {
                    System.out.print(palabra.charAt(j));
                }

            }



            System.out.println();
        }

    }
}
