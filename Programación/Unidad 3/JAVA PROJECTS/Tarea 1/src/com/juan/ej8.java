package com.juan;

import java.util.Scanner;

public class ej8 {
    /*Actividad 8: Escribir una función a la
    que se le pase un número entero y devuelva
    el número de divisores primos que tiene.*/

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

    public static int num_divisores(int x){
        int cont=0;
        for(int i=1;i<=x;i++){
            if(x%i==0) {
                if(primo(i)){
                    cont++;
                }
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número:");
        numero = teclado.nextInt();
        System.out.print("El numero de divisores primos de "+numero+" es: "+num_divisores(numero));
    }
}