package com.juan;

public class vectoresExamen {
        public static int[] rotar(int[]vector, int posiciones){

        int auxiliar;
        int auxiliar2=vector[0];

        for(int i=0;i<posiciones;i++){
            auxiliar=vector[vector.length-1];

            for(int j = 0; j<vector.length; j++) {
                if(j==0){
                    auxiliar2=vector[j];
                    vector[j]=auxiliar;
                }else {
                    auxiliar=vector[j];
                    vector[j] = auxiliar2;
                    auxiliar2=auxiliar;
                }
            }
        }
        return vector;
    }

    public static int[] unir(int[] vector1, int[] vector2) {
        int[] resultado = new int[vector1.length + vector2.length];
        int j = 0;

        for (int i = 0; i < resultado.length; i++) {
            if (i < vector2.length) {
                resultado[i] = vector2[i];
            } else if (j < vector1.length) {
                resultado[i] = vector1[j];
                j++;
            } else {
                break;
            }
        }
        return resultado;
    }
}
