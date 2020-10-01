package com.juan;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        /*
Escribe un programa que muestre los n primeros términos
de la serie de Fibonacci. El primer término de la serie
de Fibonacci es 0, el segundo es 1 y el resto se calcula
sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
El número n se debe introducir por teclado.
*/
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduzca el numero de terminos que desea de fibonacci: ");
        int numero = teclado.nextInt();
        int x = 0;
        int y = 1;
        int z;

        System.out.printf("%d, %d, ",x,y);

        for(int i=0;i<numero;i++){
            System.out.printf("%d, ",x+y);
            z=y;
            y=x+y;
            x=z;
        }

    }
}
