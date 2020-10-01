package com.juan;

import java.io.*;

public class actividad4 {

    public static void main(String[] args) throws IOException {
/*
Actividad4: Realizar un programa que lea un fichero de texto llamado carta.txt,
tenemos que contar los caracteres, las líneas y las palabras. Para facilitar
el procesamiento supondremos que cada palabra está separada de otra por un único espacio en blanco.
*/
        String linea = null;
        int palabras=0;
        int salto=0;
        int caracteres=0;

        File f = new File("carta.txt");

        try{
            BufferedReader br = new BufferedReader(new FileReader(f));
            while ((linea = br.readLine()) != null) {
                caracteres+=linea.length();
                palabras+=linea.split(" ").length;
                salto++;
            }
            br.close();
            System.out.println("Hay "+caracteres+" caracteres, en "+palabras+" palabras y en "+salto+" lineas");

        }catch (IOException errorDeFichero) {
            System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
        }
    }
}
