package com.jdperez;

import java.util.Scanner;

public class Ej1Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        float media = 0;
        String rec = "";

        System.out.println("Introduce el número");
        n1 = sc.nextFloat();

        System.out.println("Introduce el número");
        n2 = sc.nextFloat();

        System.out.println("Introduce el número");
        n3 = sc.nextFloat();

        sc.nextLine();


        media = (n1+n2+n3) /3;

        if (media>=5) {
            System.out.print("la media es: "+media+" ");
            if (media>=5 && media<6) {
                System.out.println("Suficiente");
            } else if(media>=6 && media<7) {
                System.out.println("Bien");
            } else if (media>=7 && media<9){
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
        } else {
            System.out.println("Nota de la recuparación(apto/no apto)");
            rec = sc.nextLine();
            if (rec.equals("apto")) {
                System.out.println("Suficiente 5");
            } else {
                System.out.println("La media es "+media+" Suspenso");
            }
        }

    }
}
