package com.juan;

import java.util.Arrays;
import java.util.Scanner;

public class examentarde3 {
    public static String convierteenmorse(int n) {
        String resultado="";
        String [] morse = {"-----",".----","..---","...--","...._",".....","-....","--...","---..","----."};

        for(int i=0;i<Integer.toString(n).length();i++) {
            for (int j = 0; j < morse.length; j++) {
                if(Integer.toString(n).charAt(i)==Integer.toString(j).charAt(0)){
                    resultado=resultado+morse[j]+"||";
                    break;
                }
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.println("===============================================");
            System.out.println("||Introduzca un número para convertir a morse||");
            System.out.println("===============================================");
            numero = teclado.nextInt();

            if (numero < 0) {
                System.out.println("==ERROR== Introduzca un número entero positivo o 0");
            }
        } while (numero < 0);

        System.out.println();
        System.out.println(convierteenmorse(numero));

    }
}
