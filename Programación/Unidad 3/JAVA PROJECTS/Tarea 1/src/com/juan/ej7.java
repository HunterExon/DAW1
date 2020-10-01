package com.juan;

import java.util.Scanner;

public class ej7 {
    /*Actividad 7: Diseñar una función que nos diga si un número es primo.*/

    public static void primo(int n){
        boolean cont=false;
        for(int i=2;i<n;i++){
            if(n%i==0) {
                cont=true;
                break;
            }
        }
        if (cont){
            System.out.print("No es un numero primo.");
        }else{
            System.out.print("Es un numero primo.");
        }
    }

    public static void main(String[] args) {
        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número:");
        numero = teclado.nextInt();
        primo(numero);
    }
}
