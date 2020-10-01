package com.juan;

import java.util.Scanner;

public class ej9 {
    /*Actividad 9: Implementar la función divisoresPrimos() que muestra,
    por consola, todos los divisores primos del número que se le pasa como parámetro*/


    public static boolean primo(int n){
        boolean cont=true;
        for(int i=2;i<n;i++){
            if(n%i==0) {
                cont=false;
                break;
            }
        }
        return cont;
    }

    public static void divisores(int x){
        for(int i=1;i<=x;i++){
            if(x%i==0) {
                if(primo(i)){
                    System.out.printf("%d, ",i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número:");
        numero = teclado.nextInt();
        System.out.print("Los divisores primos de "+numero+" son: ");
        divisores(numero);
    }
}