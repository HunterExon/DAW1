package com.juan;

import java.io.*;

class actividadlibro {
/*
Ejercicio propuesto 11.4.2: Crea un programa que extraiga el contenido de un
fichero binario, volcando a un fichero de texto
todos los que sean caracteres imprimibles
(basta con que sean desde la A hasta la Z, junto con el espacio en blanco).
*/
    public static void main( String[] args ) {
        System.out.println("Contando caracteres...");
        int cont = 0;

        try{
            BufferedWriter fs = new BufferedWriter(new FileWriter(new File("datos.txt")));
            FileInputStream entrada=new FileInputStream(new File("fichero.png"));
            int dato;
            while ((dato = entrada.read()) != -1){
                if ((dato >= 65 && dato<=90) || (dato>=97 && dato<=122) || dato==7){
                    fs.write((char)dato);
                    cont++;
                    if(cont%80==0){
                        fs.newLine();
                    }
                }
            }
            fs.close();
            entrada.close();
        }catch (IOException errorDeFichero){
            System.out.println("Ha habido problemas: "+errorDeFichero.getMessage());
        }
        System.out.println();
        System.out.println("Cantidad de caracteres: " + cont);
    }
}