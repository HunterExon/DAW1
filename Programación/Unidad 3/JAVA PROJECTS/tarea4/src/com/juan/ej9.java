package com.juan;

import java.util.Scanner;

public class ej9 {

    /*
Actividad 9: Definir una función que tome como parámetros
dos tablas, la primera con 6 números de una apuesta de la
primitiva, y la segunda con los 6 números de la combinación
ganadora. La función devolverá el número de aciertos.
    */

    static void ordena(int[]a){
        int auxiliar=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    auxiliar=a[i];
                    a[i]=a[j];
                    a[j]=auxiliar;
                }
            }
        }
    }
    static void aleatorio(int[]a){
        boolean error;
        for(int i=0; i<a.length;i++){
            do {
                a[i] = (int) (Math.random() * 49 + 1);
                error=false;
                for(int j=0;j<i;j++){
                    if(a[i]==a[j]){
                        error=true;
                        break;
                    }
                }
            }while(error);
        }
        ordena(a);
        impresion(a);
    }
    static void impresion(int[]a){
        for(int i= 0;i<6;i++){
            if(i==0){
                System.out.print(a[i]+"-");
            }else if(i==5){
                System.out.print(a[i]);
            }else {
                System.out.print(a[i]+"-");
            }
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[]a=new int[6];
        int[]b=new int[6];
        int aciertos=0;

        System.out.println("==============================");
        System.out.println("||La combinación ganadora es|| ");
        System.out.print("||");
        aleatorio(a);
        System.out.println("||");
        System.out.println("=============================");
        System.out.println("||Su boleto de primitiva es|| ");
        System.out.print("||");
        aleatorio(b);
        System.out.println("||");
        for (int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(a[i]==b[j]){
                    aciertos++;
                    break;
                }
            }
        }
        System.out.println("||¡Con "+aciertos+" aciertos!||");
        System.out.println("=============================");
    }
}