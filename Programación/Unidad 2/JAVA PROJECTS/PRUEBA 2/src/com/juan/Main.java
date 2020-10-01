//Crea un programa que pida dos números al usuario y responda si son iguales o no lo son usando el operador ">=".
package com.juan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Introduce el primer numero: ");
        Scanner x=new Scanner(System.in);
        int num1=x.nextInt();

        System.out.printf("Introduce el segundo numero: ");
        Scanner y=new Scanner(System.in);
        int num2=x.nextInt();

        if(num1>num2){
            System.out.printf("El primer numero es mayor");
        }else if(num1<num2){
            System.out.printf("El segundo numero es mayor");
        }else{
            System.out.printf("Los dos numeros son iguales");
        }
    }
}
