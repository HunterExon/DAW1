package com.juan;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
/*
Calcula la nota de un trimestre de la asignatura Programación.
El programa pedirá las tres notas que ha sacado el alumno en los
tres primeros controles.
Si la media de los dos controles da un número mayor o igual a 5,
el alumno está aprobado y se mostrará la media y la nota correspondiente.
Atendiendo a esa media el alumno tendrá las siguientes notas:

Suficiente si la media en mayor o igual que 5 y menor que 6.
Bien si la media es mayor o igual que 6 y menor que 7.
Notable si la media es mayor o igual que 7 y menor que 9.
Sobresaliente en culaquier otro caso.

En caso de que la media sea un número menor que 5, el alumno habrá
tenido que hacer el examen de recuperación que se califica como apto
o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario,
se mantienela nota media anterior.
*/
        Scanner teclado = new Scanner(System.in);
        float nota=-1;
        int opcion;
        int num=0;
        float media=0;
        String palabra;

        do {
            System.out.print("------MENU------");
            System.out.println();
            System.out.println("1-Introducir una nota");
            System.out.println("2-Realizar media");
            System.out.print("--Elija una opción: ");
            opcion = teclado.nextInt();

            if(opcion!=1 && opcion!=2){
                System.out.println("ERROR: Por favor, introduzca una opción correctamente");
            }

            switch (opcion){
                case 1:
                    num++;
                    System.out.printf("Nota Examen %d: ",num);
                    nota = teclado.nextFloat();
                    media=media+nota;
                    break;
                case 2:
                    media=media/num;
                    if (media<5){
                        do {
                            System.out.print("\n¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
                            palabra = teclado.next();

                            if (palabra.equals("apto")) {
                                System.out.println("Tu nota de Programación es 5 - Suficiente");
                            } else if (palabra.equals("no apto")) {
                                System.out.printf("Tu nota de Programación es %.2f - Suspenso",media);
                            } else{
                                System.out.println("Por favor, introduzca [apto] o [no apto]");
                            }
                        }while(!palabra.equals("apto") && !palabra.equals("no apto"));
                        break;
                    }else if(media>=5){
                        System.out.printf("Tu nota de Programación es %.2f- ",media);
                        if(media>=5 && media<6){
                            System.out.print("Suficiente");
                        }else if(media>=6 && media<7){
                            System.out.print("Bien");
                        }else if(media>=7 && media<9) {
                            System.out.print("Notable");
                        }else{
                            System.out.print("Sobresaliente");
                        }
                        break;
                    }else{
                        System.out.println("ERROR: Introduzca al menos una nota");
                    }
            }
        } while ((opcion!=1 && opcion!=2));
    }
}