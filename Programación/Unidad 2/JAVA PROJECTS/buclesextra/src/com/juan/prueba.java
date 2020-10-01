package com.juan;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {

        int aleatorio = (int) (Math.random() *100);
        Scanner rocio = new Scanner(System.in);
        int n;
        int cont=1;

        System.out.println("======================================");
        System.out.println("|El numero secreto está entre 0 y 100|");
        System.out.println("======================================");

        do {
            System.out.print("Prueba "+cont+":");
            n=rocio.nextInt();
            if(n>aleatorio) {
                System.out.println("El numero introducido es mayor al secreto");
            }else if(n<aleatorio){
                System.out.println("El numero introducido es menor al secreto");
            }
            System.out.println("-------------------------");
            cont++;
        }while(n!=aleatorio || n!=-1);
    }
}
