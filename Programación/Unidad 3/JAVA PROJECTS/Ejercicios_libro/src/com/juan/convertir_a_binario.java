package com.juan;

import java.util.Scanner;

public class convertir_a_binario {
    /*Escribir una función que transforme un numero a binario*/

    public static void binario(int num){
        String aux="";

        System.out.print("Convertido a binario es: ");
        while(num!=0){
            if(num%2==0){
                aux = aux + "0";
            }else{
                aux = aux + "1";
            }
            num = num/2;
        }
        for(int i=aux.length()-1;i>=0;i--){
            System.out.print(aux.charAt(i));
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("==================");
        System.out.println("||PASA A BINARIO||");
        System.out.println("==================");
        do {
            System.out.println("Introduzca un numero entero positivo: ");
            num = teclado.nextInt();
            if(num<0){
                System.out.println("Debe ser entero positivo");
            }
        }while(num<0);

        binario(num);
    }
}
