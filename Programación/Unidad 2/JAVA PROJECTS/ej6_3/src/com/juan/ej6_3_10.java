package com.juan;

import java.util.Scanner;

public class ej6_3_10 {
    public static void main(String[] args) {

            System.out.print("Introduzca un numero: ");
            Scanner teclado = new Scanner(System.in);
            long x = teclado.nextLong();

            System.out.print("Introduzca otro numero: ");
            long y = teclado.nextLong();

            long menor;
            long mayor;
            if (x > y) {
                menor = y;
                mayor = x;
            }else {
                menor = x;
                mayor = y;
            }

            System.out.println("**************************");
            System.out.print("|| Los numeros primos son: ");

            int cont=0;
            int cont2=0;
            for(long i=menor;i<=mayor;i++){
                for(long j=2;j<i;j++){
                    if(i%j==0){
                        cont++;
                        break;
                    }
                }
                if(cont<1){
                    System.out.printf("%d, ",i);
                    cont2++;
                    }
                cont=0;
            }
        System.out.println();
        System.out.println("**************************");
        System.out.printf("Hay un total de %d numeros primos entre %d y %d",cont2,menor,mayor);
    }
}