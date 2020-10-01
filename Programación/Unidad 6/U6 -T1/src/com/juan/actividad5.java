package com.juan;

import java.io.*;

public class actividad5 {

    public static void main(String[] args) throws IOException {
/*
Actividad5: En el archivo numeros.txt disponemos de una serie de números
(uno por cada línea). Diseñar un programa que procese el fichero y
nos muestre el menor y el mayor.
*/
        String linea = null;
        int mayor=0;
        int menor=0;
        boolean inicio=false;



        try{
            BufferedReader br = new BufferedReader(new FileReader(new File("numeros.txt")));
            while ((linea = br.readLine()) != null) {
                if(!inicio){
                    mayor=Integer.parseInt(linea);
                    menor=Integer.parseInt(linea);
                    inicio=true;
                }
                if(Integer.parseInt(linea)>mayor){
                    mayor=Integer.parseInt(linea);
                }
                if(Integer.parseInt(linea)<menor){
                    menor=Integer.parseInt(linea);
                }
            }
            br.close();
        }catch (IOException errorDeFichero) {
            System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
        }
        System.out.println("El mayor es "+mayor+" y el menor es "+menor+".");
    }
}
