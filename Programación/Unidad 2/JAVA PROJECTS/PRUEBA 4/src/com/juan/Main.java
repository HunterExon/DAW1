//Haz un programa que pida al usuario dos números y diga cuántos de ellos son positivos.
package com.juan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduce el primer numero: ");
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();

        System.out.println("Introduce el segundo numero: ");
        Scanner y=new Scanner(System.in);
        int num2=y.nextInt();

        if(num>0 && num2>0){
            System.out.printf("Los dos numeros son positivos");
        }else if(num<0 && num2>0){
            System.out.printf("El primero es negativo y el segundo positivo");
        }else if(num>0 && num2<0){
            System.out.printf("El primero es positivo y el segundo negativo");
        }else{
            System.out.printf("Los dos numeros son negativos");
        }
    }
}
