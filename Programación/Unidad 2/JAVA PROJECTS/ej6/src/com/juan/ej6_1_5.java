package com.juan;

import java.util.Scanner;

public class ej6_1_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pass=0;

        while(pass!=1234) {
            System.out.printf("Contraseña: ");
            pass = teclado.nextInt();
                if(pass!=1234){
                    System.out.println("ERROR");
                }
        }
        System.out.println("CONTRASEÑA CORRECTA");
    }
}
