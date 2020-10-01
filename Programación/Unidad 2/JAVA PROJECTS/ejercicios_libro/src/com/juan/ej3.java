package com.juan;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        int edad;
        int num_alumnos=0;
        int sum_edad=0;
        int mayores=0;
        Scanner teclado = new Scanner(System.in);


        do {
            System.out.print("Introduzca una edad ");
            edad = teclado.nextInt();

            if(edad>0) {
                num_alumnos++;
                sum_edad=sum_edad+edad;
                if(edad>=18){
                    mayores++;
                }
            }
        }while(edad<0);

        System.out.println("Hay "+num_alumnos+" en la escuela");
        System.out.println("La suma de todas las edades es "+sum_edad);
        System.out.println("La media es "+((double)sum_edad/(double)num_alumnos));
        System.out.println("Y hay "+mayores+" alumnos mayores de edad");
    }
}
