package com.juan;

import java.util.Scanner;

public class ej2 {

    /*Actividad 2: Diseñar una  función a la que se le pasen dos enteros
     y muestre todos los números comprendidos entre ellos.*/

    public static void entre(int x, int y){

        if(x>y){
            if(x==y+1){
                System.out.print("No hay numeros enteros entre ellos");
            }else {
                System.out.print("Entre " + y + " y " + x + " están los numeros: ");
                for (int i = y + 1; i < x; i++) {
                    if(i==x-1){
                        System.out.print(" y "+i);
                    }else if(i==x-2){
                        System.out.print(i);
                    }else{
                        System.out.print(i + ", ");
                    }

                }
            }
        }else if(y>x){
            if(y==x+1){
                System.out.print("No hay numeros enteros entre ellos");
            }else {
                System.out.print("Entre " + x + " y " + y + " están los numeros: ");
                for (int i = x + 1; i < y; i++) {
                    if(i==y-1){
                        System.out.print(" y "+i);
                    }else if(i==y-2){
                        System.out.print(i);
                    }else{
                        System.out.print(i + ", ");
                    }
                }
            }
        }else {
            System.out.print("Ambos números son iguales.");
        }
    }

    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el primer número:");
        num1 = teclado.nextInt();

        System.out.print("Introduzca el segundo número:");
        num2 = teclado.nextInt();

        entre(num1,num2);

    }
}
