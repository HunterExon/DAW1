package com.juan;

public class prueba {
    public static void main(String[] args) {
        int[][]c=libreria_vectores.matriz_bidimensional();
        for(int i=0; i<c.length;i++){
            libreria_vectores.impresion_estandar(c[i]);
            System.out.println();
        }


        c=libreria_vectores.suma(c);


        System.out.println("La matriz creada es: ");
        System.out.println("====================");
        for(int i=0; i<c.length;i++){
            if(i!=c.length-1) {
                libreria_vectores.impresion_estandar(c[i]);
            }else{
                for(int j= 0;j<c.length;j++){
                    if(j==0){
                        System.out.print("{ "+c[i][j]+" ");
                    }else if(j==c.length-1){
                        System.out.print(c[i][j]+"}");
                    }else {
                        System.out.print(c[i][j]+" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("====================");

    }
}
