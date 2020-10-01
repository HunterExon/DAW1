package com.juan;

import java.time.LocalTime;

public class hora {

    public static void main(String[] args) {
        LocalTime hora = LocalTime.now();
        if(hora.getHour()<12 && hora.getHour()>=6){
            System.out.printf("Buenos Dias");
        }else if(hora.getHour()<=21 && hora.getHour()>=12){
            System.out.printf("Buenas Tardes");
        }else{
            System.out.printf("Buenas Noches");
        }
    }
}