package com.juan;

        import java.util.Scanner;

public class ej4_4 {
    /*Escribir una función a la que se pasen como parámetros de
    entrada una cantidad de dias, horas y minutos. La función
    calculará y devolverá el número de segundos que existen
    en los datos de entrada*/

    public static int segundos(int x, int y, int z){
        int cont=(x*86400)+(y*3600)+(z*60);
        return cont;
    }

    public static void main(String[] args) {
        int dias, horas, minutos;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una cantidad de días, horas y minutos:");
        dias = teclado.nextInt();
        horas = teclado.nextInt();
        minutos = teclado.nextInt();

        System.out.println("En "+dias+" dias, "+horas+" horas "+minutos+" y minutos hay: "+segundos(dias,horas,minutos)+" segundos.");
    }
}
