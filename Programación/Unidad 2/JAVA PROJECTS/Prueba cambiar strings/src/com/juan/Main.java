package com.juan;

import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner teclado;
        String cadena;
        teclado = new Scanner(System.in);

        System.out.printf("Introduzca una cadena: ");
        cadena = teclado.nextLine();

        System.out.println("La longitud de la cadena es: " + cadena.length());

        cadena=cadena.replace("u","U");
        cadena=cadena.replace("a","A");
        cadena=cadena.replace("e","E");
        cadena=cadena.replace("i","I");
        cadena=cadena.replace("o","O");

        System.out.printf("La cadena cambiada es: ");
        System.out.println(cadena);
    }
}
