package com.juan;

import java.util.Scanner;

public class dibujar_con_matriz {

    /*
Ejercicio propuesto 7.4.10: Crea un programa que cree un array de 5x5
caracteres, lo rellene con puntos, excepto la segunda fila,
que estará rellena de letras "A" y luego muestra el contenido
del array en pantalla. Deberá aparecer algo como:
    */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x,y,z;
        do {
            System.out.println("Introduzca la cantidad de caracteres: ");
            y = teclado.nextInt();
            if (y <= 0) {
                System.out.println("ERROR - Debe ser entero positivo");
            }
        } while (y <= 0);
        do {
            System.out.println("Introduzca la cantidad de lineas: ");
            x = teclado.nextInt();
            if (x < 2) {
                System.out.println("ERROR - Debe ser entero positivo y mayor a 2");
            }
        } while (x < 2);
        do {
            System.out.println("Introduzca la fila donde quiere las letras: ");
            z = teclado.nextInt();
            if (z > x) {
                System.out.println("ERROR - Debe ser entero positivo y menor o igual que el numero de lineas ("+x+")");
            }
        } while (z > x);


        String[][] a = new String[x][y];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i==z-1) {
                    a[i][j] = "A";
                }else{
                    a[i][j] = ".";
                }
            }
        }
        System.out.println("La matriz quedaría así: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}