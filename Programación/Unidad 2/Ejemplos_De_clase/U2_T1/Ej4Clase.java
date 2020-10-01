package com.jdperez;

import java.util.Scanner;

public class Ej4Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 0;

        System.out.println("Introduce la altura");
        altura = sc.nextInt();

        while (altura%2==0 || altura<3) {
            System.out.println("Debe ser impar y mayor o igual que 3");
            System.out.println("Introduce la altura");
            altura = sc.nextInt();
        }

        // Solución Carlos
        for (int i=0; i<altura;i++) {
            for (int j=0;j<altura;j++) {
                if (i+j==altura/2 || i-j == altura/2) {
                    System.out.print("*-----*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        //Solución sin caracteres adicionales
        for (int i=0; i<altura;i++) {
            if (i<=altura/2) {
                for (int j=0;j<(altura/2)-i;j++) {
                    System.out.print("-");
                }
            } else {
                for (int j= altura/2; j<i;j++) {
                    System.out.print("-");
                }
            }
            System.out.println("*-----*");
        }

    }
}
