package com.juan;

import java.util.Scanner;

public class ej3 {

    /*
Actividad 3: Introducir por teclado un número n;
a continuación solicitar al usuario que teclee n números.
Realizar la media de los números positivos, la media de los
negativos, y contar el número de ceros introducidos.
    */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        int contpos=0;
        int contneg=0;
        int contceros=0;
        float aux=0;
        float aux2=0;
        do {
            System.out.println("Introduzca un numero: ");
            x = teclado.nextInt();
            if(x<=0){
                System.out.println("ERROR - Debe ser entero positivo");
            }
        }while(x<=0);
        System.out.println("Introduzca "+x+" numeros");
        float[] a=new float[x];
        for(int i=0; i<a.length;i++){
            System.out.println("Introduzca el numero " +(i + 1)+": ");
            a[i] = teclado.nextFloat();
        }

        for (int i=0; i<a.length;i++){
            if(a[i]>0){
                aux=aux+a[i];
                contpos++;
            }else if(a[i]<0){
                aux2=aux2+a[i];
                contneg++;
            }else{
                contceros++;
            }
        }
        System.out.println("La media de positivos es "+aux/contpos);
        System.out.println("La media de negativos es "+aux2/contneg);
        System.out.println("Se han introducido "+contceros+" ceros");
    }
}