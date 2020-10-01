package com.juan;

import java.util.Scanner;

public class ej9_4 {
    public static void main(String[] args) {
        /*
Actividad 9-4: Diseñar un programa que pida una frase al usuario,
e indique si el carácter de la posición central es o no un espacio.
*/
        Scanner teclado = new Scanner(System.in);
        String cadena = "0";

        System.out.println("Introduzca la cadena: ");
        cadena = teclado.nextLine();

        char medio = cadena.charAt(cadena.length()/2);

        if(medio==' '){
            System.out.println("El caracter central es un espacio");
        }else{
            System.out.println("El caracter central no es un espacio");
        }
    }
}