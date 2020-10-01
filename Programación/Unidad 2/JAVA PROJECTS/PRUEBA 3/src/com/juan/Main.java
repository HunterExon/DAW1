//Crea un programa que pida un número al usuario y diga si es positivo, negativo o cero.
package com.juan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();

        if(num>0){
            System.out.printf("El numero es positivo");
        }else if(num<0){
            System.out.printf("El numero es negativo");
        }else{
            System.out.printf("El numero es 0");
        }
    }
}
