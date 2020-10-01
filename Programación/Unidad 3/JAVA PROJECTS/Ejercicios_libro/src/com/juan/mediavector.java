package com.juan;

import java.util.Scanner;

public class mediavector {
    /*Ejercicio propuesto 7.4.1: Crea un programa que pida al usuario
    5 números reales, que guardará en un array.
    Luego calculará y mostrará su media (la suma de todos los
    datos, dividida entre la cantidad de datos) y los valores
    que están por encima de la media.*/

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
        double suma=0;
        for(int i=0; i<a.length;i++){
            System.out.println("Introduzca el termino " + (i + 1)+": ");
            a[i] = teclado.nextDouble();
            suma=suma+a[i];
        }
        System.out.println("La media es: "+suma/x);
        System.out.println("Los valores que están por encima de la media son: ");

        for(int i=0; i<a.length;i++){
            if(a[i]>suma/x){
                System.out.print(a[i]+" ");
            }
        }
    }
}
