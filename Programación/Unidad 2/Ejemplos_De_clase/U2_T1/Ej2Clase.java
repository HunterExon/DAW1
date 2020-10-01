package com.jdperez;

import java.util.Scanner;

public class Ej2Clase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long numIni = 0;
        long rev = 0;
        long aux = 0;

        System.out.println("Introduce el número:");
        numIni = sc.nextLong();

        aux = numIni;

        while (aux > 0) {
            rev = rev*10 + (aux%10);
            aux = aux / 10;
        }

        if (rev == numIni) {
            System.out.println("Es capicúa");
        } else {
            System.out.println("Pues no");
        }

    }
}
