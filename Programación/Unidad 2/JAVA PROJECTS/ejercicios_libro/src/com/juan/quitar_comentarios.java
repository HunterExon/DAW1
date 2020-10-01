package com.juan;

import java.util.Scanner;

public class quitar_comentarios {
    public static void main(String[] args) {
        String codigo;
        boolean comentario =false;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba su código C con comentarios: ");
        codigo= teclado.nextLine();


        for(int i=0;i<codigo.length();i++){
                if(codigo.charAt(i)=='/'&& i!=codigo.length()-1){
                    if(codigo.charAt(i+1)=='*') {
                        comentario = true;
                        for (int j = i; j < codigo.length(); j++) {
                            if (codigo.charAt(j) == '/' && codigo.charAt(j - 1) == '*') {
                                comentario = true;
                                break;
                            } else {
                                comentario = false;
                            }
                        }
                    }
                }
                if (comentario && codigo.charAt(i)=='/'&& codigo.charAt(i-1)=='*') {
                    if(i==codigo.length()-1){
                        break;
                    }else {
                        i++;
                        comentario = false;
                    }
                }
                if(!comentario){
                    System.out.print(codigo.charAt(i));
                }
        }
    }
}
