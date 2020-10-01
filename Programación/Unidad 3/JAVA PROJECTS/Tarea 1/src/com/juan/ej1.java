package com.juan;

import java.util.Scanner;

public class ej1 {
    /*Actividad 1: Diseñar una función eco() a la que se le pasa como
     parámetro un número n, y muestra por pantalla n veces el mensaje "Eco..."*/

    public static void eco(int n){
        for(int i=0; i<n;i++){
            System.out.print("Eco...");
        }
    }

    public static void main(String[] args) {
        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número:");
        numero = teclado.nextInt();
        eco(numero);
    }
}
