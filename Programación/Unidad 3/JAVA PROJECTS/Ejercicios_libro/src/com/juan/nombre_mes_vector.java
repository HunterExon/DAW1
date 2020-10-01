package com.juan;

import java.util.Scanner;

public class nombre_mes_vector {
    /*Ejercicio propuesto 7.4.4: Crea un programa que prepare un array que
    contenga el nombre de cada mes del año. El usuario introducirá un
    número de mes (por ejemplo, 4 para abril) y el programa le dirá
    el nombre de ese mes.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] meses ={31,28,31,30,31,30,31,31,30,31,30,31};
        String[] nombres={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};

        int mes;
        do{
            System.out.println("Introduzca el mes (para salir introduzca menos de 1 o mas de 12): ");
            mes=teclado.nextInt();
            if(mes>=1 && mes<=12){
                System.out.println("El mes "+nombres[mes-1]+" tiene "+meses[mes-1]+" dias");
            }else{
                System.out.println("---SALIENDO---");
            }
        }while(mes>=1 && mes<=12);
    }
}
