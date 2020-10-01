package com.juan;

import java.time.LocalDate;
import java.util.Scanner;

public class horoscopo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes = 0;
        int dia = 0;
        int anio =0;

        while(anio> LocalDate.now().getYear() || anio<0) {
            System.out.printf("Introduzca el año de nacimiento ");
            anio = teclado.nextInt();
        }
        /*
        do{
            System.out.printf("Introduzca el año de nacimiento ");
            anio = teclado.nextInt();
        }while(anio> LocalDate.now().getYear() || anio<0);
         */


        while(mes>12 || mes<1) {
            System.out.printf("Introduzca el mes de nacimiento ");
            mes = teclado.nextInt();
        }
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            while(dia>31 || dia<1) {
                System.out.printf("Introduzca el dia de nacimiento");
                dia = teclado.nextInt();
            }
        }else if(mes==2){
            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
                while(dia>29 || dia<1) {
                    System.out.printf("Introduzca el dia de nacimiento");
                    dia = teclado.nextInt();
                }
            else
                while(dia>28 || dia<1) {
                    System.out.printf("Introduzca el dia de nacimiento");
                    dia = teclado.nextInt();
                }
        }else{
            while(dia>30 || dia<1) {
                System.out.printf("Introduzca el dia de nacimiento");
                dia = teclado.nextInt();
            }
        }
        if((dia>=22 && mes==12)||(dia<=20 && mes==1)){
            System.out.printf("Eres Capricornio");
        }else if((dia>=21 && mes==1)||(dia<=19 && mes==2)){
            System.out.printf("Eres Acurio");
        }else if((dia>=20 && mes==2)||(dia<=20 && mes==3)){
            System.out.printf("Eres Piscis");
        }else if((dia>=21 && mes==3)||(dia<=19 && mes==4)){
            System.out.printf("Eres Aries");
        }else if((dia>=20 && mes==4)||(dia<=20 && mes==5)){
            System.out.printf("Eres Tauro");
        }else if((dia>=21 && mes==5)||(dia<=20 && mes==6)){
            System.out.printf("Eres Geminis");
        }else if((dia>=21 && mes==6)||(dia<=22 && mes==7)){
            System.out.printf("Eres Cancer");
        }else if((dia>=23 && mes==7)||(dia<=22 && mes==8)){
            System.out.printf("Eres Leo");
        }else if((dia>=23 && mes==8)||(dia<=22 && mes==9)){
            System.out.printf("Eres Virgo");
        }else if((dia>=23 && mes==9)||(dia<=22 && mes==10)){
            System.out.printf("Eres Libra");
        }else if((dia>=23 && mes==10)||(dia<=21 && mes==11)){
            System.out.printf("Eres Escorpio");
        }else if((dia>=22 && mes==11)||(dia<=20 && mes==12)){
            System.out.printf("Eres Sagitario");
        }
    }
}