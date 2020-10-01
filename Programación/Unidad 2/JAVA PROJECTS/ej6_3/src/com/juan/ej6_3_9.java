package com.juan;

import java.util.Scanner;

public class ej6_3_9 {
    public static void main(String[] args) {
        System.out.print("Introduzca un numero: ");
        Scanner teclado = new Scanner(System.in);
        long x = teclado.nextLong();

        boolean cont=false;
        for(int i=2;i<x;i++){
            if(x%i==0) {
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
}