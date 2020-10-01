package com.juan;

import java.util.Scanner;

public class ejercicio_2 {
    public static void mostrar(int[][] a) {

     for(int i=0;i<a.length;i++) {
         for (int j = 0; j < a[i].length; j++) {
             if (j == a.length - 1) {
                 System.out.print("────┐");
             } else if (j == 0) {
                 System.out.print("┌────┬");
             } else {
                 System.out.print("─────┬");
             }
         }
         System.out.println();

         for (int j = 0; j < a[i].length; j++) {
             if (j == a.length - 1) {
                 System.out.printf(" %2d │", (a[i][j]));
             } else if(j==0){
                 System.out.printf("│ %2d ", (a[i][j]));
             }else{
                 System.out.printf("| %2d  ", (a[i][j]));
             }
         }
         System.out.println();

         for (int j = 0; j < a[i].length; j++) {
             if (j == a.length - 1) {
                 System.out.print("────┘");
             } else if (j == 0) {
                 System.out.print("└────┴");
             } else {
                 System.out.print("─────┴");
             }
         }
         System.out.println();
     }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int termino;
        int sum_fila=0;
        int sum_col=0;
        int cont=0;
        int total=0;
        int[][] a = new int[5][6];

        for(int i=0;i<a.length;i++){
            sum_fila=0;
            if(i<a.length-1) {
                for (int j = 0; j < a[i].length; j++) {
                    if (j == a[i].length - 1) {
                        a[i][j] = (int)Math.floor(sum_fila / j);;
                    } else {
                        cont++;
                        System.out.println("┌─────────────────────┐");
                        System.out.printf("|ESCRIBA EL TÉRMINO %2d|\n", cont);
                        System.out.println("├─────────────────────┤");
                        System.out.print("          ");
                        termino = teclado.nextInt();
                        a[i][j] = termino;
                        total=total+termino;
                        sum_fila = sum_fila + termino;
                        System.out.println("└─────────────────────┘");
                    }
                }
            }else {
                for (int j = 0; j < a.length; j++) {
                    sum_col=0;
                    if(j==a.length-1){
                        a[i][j]=(int)Math.floor(total/cont);
                    }else {
                        for (int h = 0; h < a[j].length-1; h++) {
                            sum_col = sum_col + a[h][j];
                        }
                        a[i][j] = (int)Math.floor(sum_col / i);
                    }
                }
            }
        }
        mostrar(a);
    }
}
