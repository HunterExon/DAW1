package com.juan;

import java.util.Scanner;

public class ej4_3 {
    /*Implementar la función,

        static double distancia(double x1, double y1, double x2, double y2)

      que calcula y devuelve la distancia euclídea que separa los puntos
      (x1,y1) y (x2,y2)
    */

    public static double distancia(double x1, double y1, double x2, double y2){
        double dist;

        dist=Math.sqrt((Math.pow((x1-x2),2))+(Math.pow((y1-y2),2)));

        return dist;
    }

    public static void main(String[] args) {
        double x1, x2, y1, y2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la 'x' de la primera coordenada: ");
        x1 = teclado.nextDouble();
        System.out.println("Introduzca la 'y' de la primera coordenada: ");
        y1 = teclado.nextDouble();

        System.out.println("Introduzca la 'x' de la segunda coordenada: ");
        x2 = teclado.nextDouble();
        System.out.println("Introduzca la 'y' de la segunda coordenada: ");
        y2 = teclado.nextDouble();

        System.out.println("La distancia euclídea es: "+distancia(x1,y1,x2,y2));
    }
}
