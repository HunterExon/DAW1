package com.juan;

import java.util.Scanner;

public class conif {

    public static void main(String[] args) {
        int num = 0;

        while(num>7 || num<1){
            System.out.printf("Introduzca un numero del 1 al 7: ");
            Scanner teclado = new Scanner(System.in);
            num = teclado.nextInt();
        }
        if(num == 1){
            System.out.printf("Lunes");
        }else if(num == 2){
            System.out.printf("Martes");
        }else if(num == 3){
            System.out.printf("Miercoles");
        }else if(num == 4){
            System.out.printf("Jueves");
        }else if(num == 5){
            System.out.printf("Viernes");
        }else if(num == 6){
            System.out.printf("Sabado");
        }else if(num == 7){
            System.out.printf("Domingo");
        }
    }
}
