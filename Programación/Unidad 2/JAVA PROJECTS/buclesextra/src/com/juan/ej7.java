package com.juan;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        /*
Realiza un programa que pida un número por teclado
y que luego muestre ese número al revés.
*/

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca un numero: ");
        int num = teclado.nextInt();
        String texto = Integer.toString(num);
        int longitud = texto.length();

        for(int i=longitud-1;i>=0;i--){
            System.out.print(texto.charAt(i));
        }
    }
}
