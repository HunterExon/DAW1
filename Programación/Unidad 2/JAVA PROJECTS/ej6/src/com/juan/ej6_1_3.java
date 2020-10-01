package com.juan;

import java.util.Scanner;

public class ej6_1_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x=0;

        while(x==0) {
            System.out.printf("Introduzca un numero para su tabla de multiplicacion: ");
            x = teclado.nextInt();
        }

        int i=1;
        while(i<=10){
            System.out.println(x+" x "+i+" = "+x*i);
            i++;
        }
    }
}
