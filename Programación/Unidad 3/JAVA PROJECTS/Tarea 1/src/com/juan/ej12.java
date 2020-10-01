package com.juan;

import java.util.Scanner;

public class ej12 {

    /*
    Actividad 12: Calcular el factorial de n recursivamente.
    Recordar que por definición, el factorial de 0 es 1.
    */

    public static int factorial(int x){
        if(x==0){
            return 1;
        }else{
            return x*factorial(x-1);
        }
    }

    public static void main(String[] args) {
        int num1;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduzca un numero para hacer su factorial: ");
            num1 = teclado.nextInt();
            if(num1<0){
                System.out.println("ERROR - Introduzca un numero entero positivo");
            }
        }while(num1<0);

        System.out.print("El factorial de "+num1+" es: "+factorial(num1)+" --> "+num1);

        if(num1==0){
            System.out.print(" Es el factorial por defecto con valor 1");
        }else {
            for (int i = num1 - 1; i > 0; i--) {
                System.out.print(" x " + i);
            }
            System.out.print(" x 0, valor por defecto de este último como 1");
        }
    }
}