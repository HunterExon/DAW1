package com.juan;

import java.util.Scanner;

public class ej9_1 {
    public static void main(String[] args) {
        /*
Actividad 9-1: Introducir por teclado dos palabras
e indicar cuál de ellas es la más corta.
*/
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca dos palabras: ");
        String palabra1 = teclado.next();
        String palabra2 = teclado.next();


        if(palabra1.length()>palabra2.length()){
            System.out.print("La primera palabra es mayor que la segunda");
        }else if(palabra1.length()==palabra2.length()){
            System.out.print("Las dos palabras miden lo mismo");
        }else{
            System.out.print("La segunda palabra es mayor que la primera");
        }
    }
}