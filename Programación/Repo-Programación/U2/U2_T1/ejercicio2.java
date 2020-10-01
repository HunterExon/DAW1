package com.juan;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
/*
Escribe un programa que diga si un número introducido por teclado es o no capicúa.
Los números capicúa se leen igual hacia delante y hacia atrás.
El programa debe aceptar números de cualquier longitud siempre que lo
permita el tipo, en caso contrario el ejercicio no se dará por bueno.
Se recomienda usar long en lugar de int ya que el primero admite números más largos.
*/
        Scanner teclado = new Scanner(System.in);
        long num;
        long aux;
        long aux2 = 0;

        System.out.println("Introduce un numero: ");
        num = teclado.nextLong();
        aux=num;

        while (num > 0) {
            aux2 = (aux2 * 10) + (num % 10);
            num /= 10;
        }
        //System.out.println("El numero al reves es: " + aux2);

        if (aux2 == aux) {
            System.out.printf("El numero %d es capicua",aux);
        } else {
            System.out.printf("El número %d no es capicua",aux);
        }
    }
}
