package com.juan;

import java.util.Scanner;

public class ej6 {

    /*Actividad 6: Crear una función que, mediante un booleano,
    indique si el carácter que se pasa como parámetro de entrada corresponde con una vocal.*/

    public static boolean vocal(char a) {
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            return true;
        }else{
            return false;
        }
    }



    public static void main(String[] args) {
        String palabra;
        char letra;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una letra: ");
        palabra = teclado.next();
        palabra = palabra.toLowerCase();
        letra = palabra.charAt(0);

        if(vocal(letra)){
            System.out.println(letra+ " es una vocal");
        }else{
            System.out.println(letra+ " no es una vocal");
        }
    }
}