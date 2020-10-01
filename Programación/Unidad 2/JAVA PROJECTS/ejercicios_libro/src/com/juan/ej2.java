package com.juan;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el tamaño: ");
        byte tam = teclado.nextByte();

        for (int alto = tam; alto > 0; alto--) {
            for (int ancho = tam; ancho > 0; ancho--) {
                if((alto!=tam && alto!=1 && ancho!=tam && ancho!=1)){
                    if((alto==ancho)||(alto+ancho==tam+1)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
