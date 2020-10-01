package com.juan;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
/*
Realiza un programa lea un número entero positivo de la pantalla y que lo pase a binario.
*/
        Scanner teclado = new Scanner(System.in);
        int num;
        String aux="";

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
}
