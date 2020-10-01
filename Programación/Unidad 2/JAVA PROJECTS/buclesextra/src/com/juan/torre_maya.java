package com.juan;

import java.util.Scanner;

public class torre_maya {
    public static void main(String[] args) {
        int altura;
        Scanner juan = new Scanner(System.in);

        do{
            System.out.println("Introduzca la altura: ");
            altura = juan.nextInt();
                if(altura%2==0 || altura<3){
                    System.out.println("ERROR - Altura impar o menor a 3");
                }
        }while(altura%2==0 || altura<3);

        int decremento=altura-1;
        int incremento=1;

        for(int i=0;i<altura;i++){
            if(i%2==0){
                for(int j=0;j<decremento;j++){
                    System.out.print("-");
                }
                for(int j=0;j<incremento;j++){
                    System.out.print("*");
                }
                for(int j=0;j<4;j++){
                    System.out.print("*");
                }
                for(int j=0;j<incremento;j++){
                    System.out.print("*");
                }
            }else{
                for(int j=0;j<decremento;j++){
                    System.out.print("-");
                }
                for(int j=0;j<incremento;j++){
                    System.out.print("*");
                }
                for(int j=0;j<4;j++){
                    System.out.print("-");
                }
                for(int j=0;j<incremento;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
            incremento++;
            decremento--;
        }







    }
}
