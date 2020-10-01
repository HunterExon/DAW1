package com.juan;

public class ejercicio_3 {
    public static int[] filtraCon7(int x[]){
        int aux;
        int cont=0;

        for (int i=0;i<x.length;i++){
            aux=x[i];
            while(aux!=0){
                if(aux%10==7 || aux==7){
                    cont++;
                    break;
                }
                aux=aux/10;
            }
        }

        int vector[] = new int[cont];
        int i=0;

            for (int j = 0; j < x.length; j++) {
                aux = x[j];
                while (aux != 0) {
                    if (aux % 10 == 7 || aux == 7) {
                        vector[i] = x[j];
                        i++;
                        break;
                    }
                    aux = aux / 10;
                }
            }
        return vector;
    }

    public static void main(String[] args) {
        int[] prueba = {1, 2, 3, 4, 5, 6, 7, 87, 13, 76, 12};
        for (int i = 0; i < filtraCon7(prueba).length; i++) {
            System.out.print(filtraCon7(prueba)[i]+"   ");
        }
    }
}
