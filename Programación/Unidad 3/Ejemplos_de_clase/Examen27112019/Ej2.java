package com.jdperez;

import java.util.Arrays;

public class Ej2 {

    public static int[] insertarValor(int[] v,int dato, int posicion) {

        int[] resultado = new int[v.length+1];

        for (int i = 0; i < v.length ; i++) {
            if (i<posicion) {
                resultado[i] = v[i];
            } else {
                resultado[i+1] = v[i];
            }
        }

        resultado[posicion] = dato;

        return resultado;
    }

    public static void main(String[] args) {
        int[] v= {1,2,3,4,5};

        v = insertarValor(v,8,3);

        System.out.println(Arrays.toString(v));

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+" ");
        }

    }
}
