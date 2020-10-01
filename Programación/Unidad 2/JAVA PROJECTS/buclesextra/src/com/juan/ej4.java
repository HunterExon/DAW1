package com.juan;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        /*
Escribe un programa que lea una lista de diez números
y determine cuántos son positivos, y cuántos son negativos.
*/
        int positivos = 0;
        int negativos = 0;
        int neutros = 0;
        for (int i=10;i>0;i--) {
            Scanner teclado = new Scanner(System.in);
            System.out.printf("Introduzca 10 numeros (quedan %d): ",i);
            int numero = teclado.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                neutros++;
            }
        }
        System.out.printf("Hay un total de %d postivos, %d negativos y %d ceros",positivos,negativos,neutros);

    }

}
