package com.juan;

import java.io.*;

class leerficherobinario {

    public static void main( String[] args ) {
        System.out.println("Contando caracteres...");
        int cont = 0;

        try{
            FileInputStream entrada=new FileInputStream(new File("fichero.png"));
            int dato;
            while ((dato = entrada.read()) != -1){
                if ((dato >= 65 && dato<=90) || (dato>=97 && dato<=122) || dato==7){
                    System.out.print((char)dato);
                    cont++;
                    if(cont%30==0){
                        System.out.println();
                    }
                }
            }
            entrada.close();
        }catch (IOException errorDeFichero){
            System.out.println("Ha habido problemas: "+errorDeFichero.getMessage());
        }
        System.out.println();
        System.out.println("Cantidad de caracteres: " + cont);
    }
}