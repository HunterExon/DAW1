package com.juan;

import java.util.Scanner;

public class ej6_2_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x=0;

        do{
            System.out.printf("Introduzca un numero para su tabla de multiplicacion: ");
            x = teclado.nextInt();
        }while(x==0);

        int i=1;
        do{
            System.out.println(x+" x "+i+" = "+x*i);
            i++;
        }while(i<=10);
    }
}
