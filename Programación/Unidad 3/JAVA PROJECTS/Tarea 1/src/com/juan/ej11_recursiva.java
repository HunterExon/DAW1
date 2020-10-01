package com.juan;

import java.util.Scanner;

public class ej11_recursiva {

    /*
    Actividad 11: Realizar una función que calcule a elevado a n,
    donde a es real, y n entero no negativo. Realizar una
    versión iterativa y otra recursiva.
    */

    public static int potencia(int x, int y){
        if(y==1){
            return x;
        }else{
            return potencia(x,y-1)*x;
        }
    }

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la base de la potencia: ");
        num1 = teclado.nextInt();

        do {
            System.out.print("Introduzca el exponente de la potencia: ");
            num2 = teclado.nextInt();
            if(num2<=0){
                System.out.println("ERROR - Introduzca un numero entero positivo");
            }
        }while(num2<=0);

        System.out.print("La potencia de "+num1+"^"+num2+" es: "+potencia(num1,num2));
    }
}
