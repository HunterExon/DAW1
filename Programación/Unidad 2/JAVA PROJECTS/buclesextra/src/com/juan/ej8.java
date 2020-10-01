package com.juan;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        /*
Realiza una programa que calcule las horas
transcurridas entre dos horas de dos días de la semana.
No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7)
o como una cadena (de “lunes” a “domingo”). Se debe comprobar
que el usuario introduce los datos correctamente y que el
segundo día es posterior al primero.
*/
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca un dia: ");
        int dia1 = teclado.nextInt();

        System.out.printf("Introduzca una hora: ");
        int hora1 = teclado.nextInt();

        System.out.printf("Introduzca otro dia: ");
        int dia2 = teclado.nextInt();

        System.out.printf("Introduzca otra hora: ");
        int hora2 = teclado.nextInt();

        int cont=0;

        while(dia1<dia2||(dia1==dia2&&hora1<hora2)){
           if(hora1==23){
               hora1=0;
               dia1++;
           }else{
               hora1++;
           }
           cont++;
        }
        System.out.printf("Han pasado %d horas",cont);
    }
}