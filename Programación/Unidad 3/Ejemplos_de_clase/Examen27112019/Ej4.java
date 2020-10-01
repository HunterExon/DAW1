package com.jdperez;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ej4 {

    public static int[] filtraPrimos(int[] v) {

        int numPrimos = 0;

        for (int i = 0; i < v.length ; i++) {
            boolean esPrimo = true;

            if (v[i]==1) {
                numPrimos++;
            } else {
                for (int j=2;j<v[i];j++) {
                    if (v[i]%j == 0 ) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    numPrimos++;
                }
            }
        }

        if (numPrimos==0) {
            int[] resultado = {-1};
            return resultado;
        } else {

            int[] resultado = new int[numPrimos];
            int posicionActual = 0;

            for (int i = 0; i < v.length ; i++) {
                boolean esPrimo = true;

                if (v[i]==1) {
                    resultado[posicionActual] = 1;
                    posicionActual++;
                } else {
                    for (int j=2;j<v[i];j++) {
                        if (v[i]%j == 0 ) {
                            esPrimo = false;
                            break;
                        }
                    }

                    if (esPrimo) {
                        resultado[posicionActual] = v[i];
                        posicionActual++;
                    }
                }
            }

            return resultado;
        }

    }

    public static void main(String[] args) {

        int[] datos = {1,44,55,17,5,7,81};


        System.out.println(Arrays.toString(filtraPrimos(datos)));
    }
}
