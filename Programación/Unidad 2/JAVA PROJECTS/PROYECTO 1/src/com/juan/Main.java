//MOSTRAR POR PANTALLA SI UNA PERSONA ES NIÑO(0-12) ADOLESCENTE(12-30), ADULTO(30-50) O ANCIANO(50<x)
package com.juan;
public class Main {
    public static void main(String[] args) {
        int edad=49;

        if(edad<12) {
            System.out.println("Es un niño");
        }else if(edad>=12 && edad<30){
            System.out.println("Es un adolescente");
        }else if(edad>=30 && edad<50){
            System.out.println("Es un adulto");
        }else{
            System.out.println("Es un anciano");
        }
    }
}