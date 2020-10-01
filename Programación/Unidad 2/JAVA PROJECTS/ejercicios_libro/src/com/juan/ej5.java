package com.juan;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String frase;

        System.out.println("Introduzca la frase: ");
        frase = teclado.nextLine();

        frase = frase.replace(" ","");
        frase = frase.toLowerCase();
        boolean contador=true;

        for(int i=0;i<frase.length()/2;i++){
            if (frase.charAt(i)!=frase.charAt(frase.length()-1-i)) {
                contador = false;
                break;
            }
        }
        if(contador){
            System.out.println("La frase es un palíndromo");
        }else{
            System.out.println("La frase no es un palíndromo");
        }
    }
}