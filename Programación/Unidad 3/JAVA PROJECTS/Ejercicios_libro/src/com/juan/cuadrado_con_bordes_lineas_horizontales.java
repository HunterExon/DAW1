package com.juan;

import java.util.Scanner;

public class cuadrado_con_bordes_lineas_horizontales {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        char caracter;
        do {
            System.out.println("Introduzca la dimensión del cuadrado: ");
            x = teclado.nextInt();
            if (x <= 1) {
                System.out.println("ERROR - Debe ser entero positivo y mayor que 1");
            }
        } while (x <= 1);

        System.out.print("Introduzca el caracter de construcción: ");
        caracter = teclado.next().charAt(0);


        String[][] a = new String[x][x];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(x%2!=0) {
                    if (i == 0 || i == a.length - 1 || j == 0 || j == a[i].length - 1 || i % 2 == 0) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }else{
                    if (i == 0 || i == a.length - 1 || j == 0 || j == a[i].length - 1 || (i % 2 == 0 && i!=a[i].length-2)) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}