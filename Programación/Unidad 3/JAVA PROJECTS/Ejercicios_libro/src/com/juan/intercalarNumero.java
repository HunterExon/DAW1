package com.juan;

import java.util.Scanner;

public class intercalarNumero {
    /*Escribir una función que pida dos numeros y los intercale*/

    public static String intercalar(int num1, int num2) {
        String aux;
        String aux2="";
        if(Integer.toString(num1).length()>Integer.toString(num2).length()){
            aux=Integer.toString(num2);
        }else{
            aux=Integer.toString(num1);
        }

        for(int i=0;i<=aux.length();i++){
            if(i==aux.length()){
                if(Integer.toString(num1).length()>Integer.toString(num2).length()){
                    for(int j=i;j<Integer.toString(num1).length();j++){
                        aux2=aux2+Integer.toString(num1).charAt(j);
                    }
                }else{
                    aux2=aux2+Integer.toString(num1).charAt(i);
                    for(int j=i;j<Integer.toString(num2).length();j++){
                        aux2=aux2+Integer.toString(num2).charAt(j);
                    }
                }
            }else{
                aux2 = aux2 + Integer.toString(num1).charAt(i);
                aux2 = aux2 + Integer.toString(num2).charAt(i);
            }
        }
        return aux2;
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("||JUNTAR DOS NUMEROS||");
        System.out.println("======================");
        do {
            System.out.println("Introduzca un numero entero positivo: ");
            num1 = teclado.nextInt();
            if (num1 < 0) {
                System.out.println("Debe ser entero positivo");
            }
        } while (num1 < 0);
        do {
            System.out.println("Introduzca un segundo numero entero positivo: ");
            num2 = teclado.nextInt();
            if (num2 < 0) {
                System.out.println("Debe ser entero positivo");
            }
        } while (num2 < 0);

        System.out.println("El numero intercalado es: "+intercalar(num1,num2));
    }
}