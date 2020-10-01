package com.juan;

import java.util.Scanner;

public class ej5 {

    /*Actividad 5: Repetir el ejercicio anterior con una versión
    que calcule el máximo de 3 números. Piensa un poco, no
    hagas el algoritmo de comparación de los 3 números desde cero.*/

    public static void mayor(int num, int num2, int num3) {
        if (num >= num2 && num >= num3) {
            if (num > num2) {
                if (num > num3) {
                    if (num3 > num2) {
                        System.out.printf("El primer numero (%d) es mayor que el tercero (%d) y este mayor que el segundo (%d)", num, num3, num2);
                    } else if (num3 < num2) {
                        System.out.printf("El primer numero (%d) es mayor que el segundo (%d) y este mayor que el tercero (%d)", num, num2, num3);
                    } else {
                        System.out.printf("El primer numero (%d) es mayor que el segundo (%d) y que el tercero (%d) que son iguales", num, num2, num3);
                    }
                } else {
                    System.out.printf("El primer numero (%d) y el tercero (%d) son iguales y mayores que el segundo (%d)", num, num3, num2);
                }
            } else if (num > num3) {
                System.out.printf("El primer numero (%d) y el segundo (%d) son iguales y mayores que el tercero (%d)", num, num2, num3);
            } else {
                System.out.printf("El primer (%d), segundo (%d) y tercer (%d) numero son iguales", num, num2, num3);
            }
        } else if (num2 >= num && num2 >= num3) {
            if (num2 > num) {
                if (num2 > num3) {
                    if (num3 > num) {
                        System.out.printf("El segundo numero (%d) es mayor que el tercero (%d) y este mayor que el primero (%d)", num2, num3, num);
                    } else if (num3 < num) {
                        System.out.printf("El segundo numero (%d) es mayor que el primero (%d) y este mayor que el tercero (%d)", num2, num, num3);
                    } else {
                        System.out.printf("El segundo numero (%d) es mayor que el primero (%d) y que el tercero (%d) que son iguales", num2, num, num3);
                    }
                } else {
                    System.out.printf("El segundo numero (%d) y el tercero (%d) son iguales y mayores que el primero (%d)", num2, num3, num);
                }
            } else if (num2 > num3) {
                System.out.printf("El segundo numero (%d) y el primero (%d) son iguales y mayores que el tercero (%d)", num2, num, num3);
            } else {
                System.out.printf("El primer (%d), segundo (%d) y tercer (%d) numero son iguales", num, num2, num3);
            }
        } else if (num3 >= num && num3 >= num2) {
            if (num3 > num) {
                if (num3 > num2) {
                    if (num2 > num) {
                        System.out.printf("El tercer numero (%d) es mayor que el segundo (%d) y este mayor que el primero (%d)", num3, num2, num);
                    } else if (num2 < num) {
                        System.out.printf("El tercer numero (%d) es mayor que el primero (%d) y este mayor que el segundo (%d)", num3, num, num2);
                    } else {
                        System.out.printf("El tercer numero (%d) es mayor que el primero (%d) y que el segundo (%d) que son iguales", num3, num, num2);
                    }
                } else {
                    System.out.printf("El tercer numero (%d) y el segundo (%d) son iguales y mayores que el primero (%d)", num3, num2, num);
                }
            } else if (num3 > num2) {
                System.out.printf("El tercer numero (%d) y el primero (%d) son iguales y mayores que el segundo (%d)", num3, num, num2);
            } else {
                System.out.printf("El primer (%d), segundo (%d) y tercer (%d) numero son iguales", num, num2, num3);
            }
        }
    }


    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el primer número:");
        num1 = teclado.nextInt();

        System.out.print("Introduzca el segundo número:");
        num2 = teclado.nextInt();

        System.out.print("Introduzca el tercer número:");
        num3 = teclado.nextInt();

        mayor(num1, num2, num3);

    }
}