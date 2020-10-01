package com.juan;

import java.io.*;

public class actividad10_12 {
    /*
    Algunos sistemas operativos disponen del comando comp, qe compara dos archivos y
    nos dice si son iguales o distintos. Diseñar este comando de forma que, además, nos
    diga en qué línea y carácter se encuentra la primera diferencia. Utilizar los ficheros
    texto1.txt y texto2.txt
     */

    public static void main(String[] args) {
        String linea1=null;
        String linea2=null;
        int numlinea=0;
        boolean bandera =false;
        try{
            BufferedReader br1 = new BufferedReader(new FileReader(new File("texto1.txt")));
            BufferedReader br2 = new BufferedReader(new FileReader(new File("texto2.txt")));

            while((linea1=br1.readLine())!=null&&((linea2 = br2.readLine())!=null)){
                numlinea++;
                if(!linea1.equals(linea2)){
                    bandera = true;
                    System.out.println("=================================");
                    System.out.println("| Los documentos son diferentes |");
                    System.out.println("=================================");
                    System.out.println("| Línea:"+numlinea);
                    if(linea1.length()>=linea2.length()){
                        for (int i = 0; i < linea2.length(); i++) {
                            if(linea1.charAt(i)!=linea2.charAt(i)){
                                System.out.println("| Caracter: "+(i+1));
                                System.out.println("=================================");
                                break;
                            }else if(i==linea2.length()-1){
                                System.out.println("| Carácter: "+(linea2.length()+1));
                                System.out.println("=================================");
                                break;
                            }
                        }
                    }else{
                        for (int i = 0; i < linea1.length(); i++) {
                            if(linea1.charAt(i)!=linea2.charAt(i)){
                                System.out.println("| Caracter: "+(i+1));
                                System.out.println("=================================");
                                break;
                            }else if(i==linea1.length()-1){
                                System.out.println("| Carácter: "+(linea1.length()+1));
                                System.out.println("=================================");
                                break;
                            }
                        }
                    }
                }
            }
            if(!bandera){
                System.out.println("==============================");
                System.out.println("| Los documentos son iguales |");
                System.out.println("==============================");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}