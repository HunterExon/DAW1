package com.juan;

import java.util.Scanner;

public class conswitch {

    public static void main(String[] args) {
        int num = 0;

        while(num>7 || num<1){
            System.out.printf("Introduzca un numero del 1 al 7: ");
            Scanner teclado = new Scanner(System.in);
            num = teclado.nextInt();
        }
        switch (num){
            case 1:
                System.out.printf("Lunes");
                break;
            case 2:
                System.out.printf("Martes");
                break;
            case 3:
                System.out.printf("Miercoles");
                break;
            case 4:
                System.out.printf("Jueves");
                break;
            case 5:
                System.out.printf("Viernes");
                break;
            case 6:
                System.out.printf("Sabado");
                break;
            case 7:
                System.out.printf("Domingo");
        }
    }
}