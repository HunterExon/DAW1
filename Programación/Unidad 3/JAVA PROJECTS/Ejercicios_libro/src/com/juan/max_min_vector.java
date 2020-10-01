package com.juan;

import java.util.Scanner;

public class max_min_vector {
    /*Ejercicio propuesto 7.4.2: Crea un programa que pida al usuario
    8 números enteros, los guarde en un array, halle y muestre el
    valor más alto que contiene (su máximo) y el valor más bajo que
    contiene (su mínimo). Pista: puedes empezar suponiendo que el primer
    valor es el máximo provisional; a partir de ahí, recorre todos los
    demás con un "for"; si alguno de los datos es mayor que el máximo
    provisional, pasará a ser el nuevo máximo; el mínimo se calculará de
    forma similar.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        do {
            System.out.println("Introduzca el número de terminos del vector: ");
            x = teclado.nextInt();
            if(x<=0){
                System.out.println("ERROR - Debe ser entero positivo");
            }
        }while(x<=0);

        int[] a=new int[x];
        for(int i=0; i<a.length;i++){
                System.out.println("Introduzca el termino " +(i + 1)+": ");
                a[i] = teclado.nextInt();
        }

        int max=a[0],min=a[0];
        for(int i=0; i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }else if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("El valor máximo es "+max+" y el valor mínimo es "+min);
    }
}
