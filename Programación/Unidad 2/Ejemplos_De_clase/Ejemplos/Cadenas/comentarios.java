package com.jdperez;

import java.util.Scanner;

public class EjLibro62 {
    public static void main(String[] args) {
        String frase = new String();
        Scanner sc = new Scanner(System.in);
        boolean comentario = false;
        String aux = new String();

        System.out.println("Introduce la frase con comentarios");
        frase = sc.nextLine();

        for (int i=0;i<frase.length();i++) {
            if ( i<frase.length()-1 && comentario == false &&
                    frase.charAt(i) == '/' &&
                    frase.charAt(i+1)=='*') {
                    comentario = true;
                    aux = "";
            } if (i>0 && comentario == true && frase.charAt(i)=='/' &&
                  frase.charAt(i-1) == '*') {
                    comentario = false;
            } else {
                if (!comentario) {
                    System.out.print(frase.charAt(i));
                } else {
                    aux = aux+ frase.charAt(i);
                }
            }
        }

        if (comentario) {
            System.out.println(aux);
        }
    }
}
