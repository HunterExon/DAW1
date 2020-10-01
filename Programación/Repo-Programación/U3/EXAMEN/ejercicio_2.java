package com.juan;

public class ejercicio_2 {
    public static int[] insertarValor(int[]vector, int numero, int posicion){

        int[]unido=new int[vector.length+1];
        for(int i=0;i<vector.length;i++){
            unido[i]=vector[i];
        }

        int auxiliar=numero;
        int auxiliar2;

        for(int i=0;i<unido.length;i++){
            if(i==posicion){
                auxiliar=unido[i];
                unido[i]=numero;
            }else if(i>posicion) {
                auxiliar2=unido[i];
                unido[i] = auxiliar;
                auxiliar=auxiliar2;
            }
        }
        return unido;
    }


    public static void main(String[] args) {
        int[]vector = {1,2,3,4,5};

        vector= insertarValor(vector,8,3);

        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
    }
}
