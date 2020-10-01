package com.jdperez;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        int[][] tablero = new int[8][8];
        String cols = "abcdefgh";
        int x,y;
        Scanner sc = new Scanner(System.in);
        String coordenadas;
        char fila,columna;

        System.out.println("Introduce coordenadas:");
        coordenadas = sc.nextLine();

        fila = coordenadas.charAt(1);
        columna = coordenadas.charAt(0);
        x = cols.indexOf(columna);
        y = Math.abs(Character.valueOf(fila)-tablero.length);




        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                //Estoy en la diagonal
            }
        }

    }
}
