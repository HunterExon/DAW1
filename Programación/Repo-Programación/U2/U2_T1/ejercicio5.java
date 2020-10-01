package com.juan;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
/*
Escribe un programa que lea una cadena y luego
escriba un rombo usando los caracteres de la cadena
*/
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int x=0;
        int y=0;
        int h=0;

        System.out.print("Introduzca una cadena: ");
        cadena = teclado.nextLine();

        for(int i=0;i<(cadena.length()*2)-1;i++){
            if(i<cadena.length()) {
                for (int j = 0; j < (cadena.length()*2)-1; j++) {
                    if(j<=cadena.length()-(1-x) && j>=cadena.length()-(1+x)){
                        System.out.print(cadena.charAt(h));
                        if(j>=cadena.length()-1){
                            h--;
                        }else{
                            h++;
                        }
                    }else{
                        System.out.print(" ");
                    }
                }
                x++;
            }else{
                for (int j = 0; j < (cadena.length()*2)-1; j++) {
                    if(j>y && j<((cadena.length()*2)-(2+y))){
                        System.out.print(cadena.charAt(h));
                        if(j>=cadena.length()-1){
                            h--;
                        }else{
                            h++;
                        }
                    }else{
                        System.out.print(" ");
                    }
                }
                y++;
            }
            System.out.println();
            h=0;
        }
    }
}
