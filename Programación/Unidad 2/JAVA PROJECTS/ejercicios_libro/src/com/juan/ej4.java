package com.juan;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el tamaño: ");
        byte tam = teclado.nextByte();

        int x=0;
        int y=0;
        int z=0;

        for (int alto = tam; alto > 0; alto--) {
            for (int ancho = tam; ancho > 0; ancho--) {
                if((alto!=tam && alto!=1) && (ancho!=tam && ancho!=1)){
                    if(((ancho==x+z||ancho==tam-z)&&(alto==y && y<tam))||(alto==x+z||alto==tam-z)&&(ancho==y&&y<tam)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
            y=2;
            z=z+2;
            y=y+1;
            x=x+2;
        }
    }
}

