package com.juan;

import java.util.Scanner;

public class ej4_5 {
    /*Diseña una función a la que se le pasan las horas y
    minutos de dos intstantes de tiempo con el prototipo

    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2)

    La función devolverá la cantidad de minutos que existen de
    diferencia entre los dos instantes utilizados.*/

    public static int diferenciaMin(int dia1, int hora1, int minuto1, int dia2, int hora2, int minuto2) {
        int cont = 0;

        while (dia1 < dia2 || (dia1 == dia2 && hora1 < hora2) || (dia1 == dia2 && hora1 == hora2 && minuto1 < minuto2)) {
            if (minuto1 == 59) {
                minuto1 = 0;
                hora1++;
                if (hora1 == 23) {
                    hora1 = 0;
                    dia1++;
                } else {
                    hora1++;
                }
            } else {
                minuto1++;
            }
            cont++;
        }
        return cont;
    }


    public static void main(String[] args) {
        int dia1, dia2, hora1, hora2, minuto1, minuto2;
        Scanner teclado = new Scanner(System.in);

        do {
            /*----------------------------------PRIMER DIA----------------------------------*/
            do {
                System.out.print("Introduzca el primer día: ");
                dia1 = teclado.nextInt();

                if (dia1 > 7) {
                    System.out.println("ERROR - El día debe ir de 1 a 7 (dia de la semana)");
                }
            } while (dia1 > 7);
            do {
                System.out.print("Introduzca la primera hora: ");
                hora1 = teclado.nextInt();

                if (hora1 > 23) {
                    System.out.println("ERROR - Las horas deben ir desde 0 a 23");
                }
            } while (hora1 > 23);
            do {
                System.out.print("Introduzca los primeros minutos: ");
                minuto1 = teclado.nextInt();

                if (minuto1 > 59) {
                    System.out.println("ERROR - Los minutos deben ir de 0 a 59");
                }
            } while (minuto1 > 59);
            /*----------------------------------PRIMER DIA----------------------------------*/

            /*----------------------------------SEGUNDO DIA----------------------------------*/
            do {
                System.out.print("Introduzca el segundo día: ");
                dia2 = teclado.nextInt();

                if (dia2 > 7) {
                    System.out.println("ERROR - El día debe ir de 1 a 7 (dia de la semana)");
                }
            } while (dia2 > 7);
            do {
                System.out.print("Introduzca la segunda hora: ");
                hora2 = teclado.nextInt();

                if (hora2 > 23) {
                    System.out.println("ERROR - Las horas deben ir desde 0 a 23");
                }
            } while (hora2 > 23);
            do {
                System.out.print("Introduzca los segundos minutos: ");
                minuto2 = teclado.nextInt();

                if (minuto2 > 59) {
                    System.out.println("ERROR - Los minutos deben ir de 0 a 59");
                }
            } while (minuto2 > 59);
            /*----------------------------------SEGUNDO DIA----------------------------------*/

            if((dia1>dia2)||(dia1==dia2&&hora1>hora2)||(dia1==dia2&&hora1==hora2&&minuto1>minuto2)){
                System.out.println("ERROR - La primera fecha debe ser mayor que la segunda");
            }
        }while((dia1>dia2)||(dia1==dia2&&hora1>hora2)||(dia1==dia2&&hora1==hora2&&minuto1>minuto2));

        System.out.println("Entre el "+dia1+" a las "+hora1+":"+minuto1+" y el "+dia2+" a las "+hora2+":"+minuto2+" han pasado: "+diferenciaMin(dia1,hora1,minuto1,dia2,hora2,minuto2)+" minutos.");
    }
}
