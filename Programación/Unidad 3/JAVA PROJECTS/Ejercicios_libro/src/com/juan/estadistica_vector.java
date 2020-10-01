package com.juan;

import java.util.Scanner;

public class estadistica_vector {
    /*Ejercicio propuesto 7.4.5: Si has estudiado estadística,
    crea un programa que pida al usuario 10 números reales de
    doble precisión, los guarde en un array y luego muestre su
    media aritmética, varianza y desviación típica.*/

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

        double[] a=new double[x];
        double suma =0;
        for(int i=0; i<a.length;i++){
            System.out.println("Introduzca el termino " +(i + 1)+": ");
            a[i] = teclado.nextDouble();
            suma=suma+a[i];
        }

        double media=suma/x;
        System.out.println();
        System.out.printf("La media es %.2f",media);

        double aux=0;
        for(int i=0;i<a.length;i++){
            aux=aux+((a[i]-media)*(a[i]-media));
        }
        System.out.println();
        System.out.printf("La varianza es %.2f",aux/x);
        System.out.println();
        System.out.printf("La desviación típica es %.2f",Math.sqrt((aux/x)));
    }
}
