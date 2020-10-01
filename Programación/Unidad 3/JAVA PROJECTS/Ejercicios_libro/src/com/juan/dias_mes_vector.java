package com.juan;

import java.util.Scanner;

public class dias_mes_vector {
    /*Ejercicio propuesto 7.4.3: Crea un programa que prepare un array
    que contenga la cantidad de días que hay en cada mes del año.
    A partir de entonces el usuario introducirá un número de mes
    (por ejemplo, 4 para abril) y el programa le responderá cuántos
    días tiene ese mes. Se repetirá hasta que el usuario introduzca
    un mes menor que 1 o mayor que 12.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] meses ={31,28,31,30,31,30,31,31,30,31,30,31};

        int mes;
        do{
            System.out.println("Introduzca el mes (para salir introduzca menos de 1 o mas de 12)");
            mes=teclado.nextInt();
            if(mes>=1 && mes<=12){
                System.out.println("El mes "+mes+" tiene "+meses[mes-1]+" dias");
            }else{
                System.out.println("---SALIENDO---");
            }
        }while(mes>=1 && mes<=12);
    }
}
