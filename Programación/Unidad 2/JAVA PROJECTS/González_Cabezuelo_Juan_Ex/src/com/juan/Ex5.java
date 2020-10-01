package com.juan;

import java.util.Scanner;

public class Ex5 {
    /*
    Ejercicio 5:
    Dada una cadena mostrar por pantalla la cantidad de vocales que tiene.

    Ejemplo:
    Entrada: cad = "Hola tu"
    Salida: La cantidad de vocales es 3
    */
    public static void main(String[] args) {
        //0-Introducimos las primeras variables y declaramos el scanner
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int cont = 0;

        //1-Solicitamos la cadena al usuario y le quitamos tan espacios como mayúsculas, dejándolo
        //junto y en minúsculas
        System.out.println("Introduzca una cadena para sacar las vocales que contiene: ");
        cadena = teclado.nextLine();
        cadena = cadena.replace(" ", "");
        cadena = cadena.toLowerCase();

        //2-Hacemos un for en el que comprobamos si hay vocales con un charat.
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                //2.1-Contamos las vocales que hay por cada una que salga
                cont++;
            }
        }
        //3-Se muestra por pantalla el resultado final
        System.out.println("La cantidad de vocales es " + cont);
    }
}