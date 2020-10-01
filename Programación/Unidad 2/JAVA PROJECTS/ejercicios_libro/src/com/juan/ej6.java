package com.juan;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String frase;

        System.out.println("Introduzca la frase: ");
        frase = teclado.nextLine();
        frase = frase.toLowerCase();

        String conjunto1 = "eikmpqrstuv";
        String conjunto2 = "pviumterkqs";

        for(int i=0;i<frase.length();i++){
            for(int j=0;j<conjunto1.length();j++){
                if(frase.charAt(i)==conjunto1.charAt(j)){
                    for(int z=0;z<conjunto2.length();z++){
                        if(z==j) {
                            StringBuilder frase2 = new StringBuilder(frase);
                            frase2.setCharAt(i,conjunto2.charAt(z));
                            frase = frase2.toString();
                            break;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println("El mensaje codificado es: "+frase);
    }
}