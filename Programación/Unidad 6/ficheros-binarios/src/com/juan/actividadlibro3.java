package com.juan;

import java.io.*;
/*
Ejercicio propuesto 11.5.2: Crea una versión del ejercicio 11.4.2,
leyendo a un array: un programa que extraiga el contenido de un fichero binario,
volcando a un fichero de texto todos los que sean caracteres imprimibles
(basta con que sean desde la A hasta la Z, junto con el espacio en blanco).
 */

public class actividadlibro3 {
    public static void main(String[] args) {
        final int BUFFER_SIZE = 54;

        try {
            InputStream fe = new FileInputStream(new File("fichero.png"));
            BufferedWriter fs = new BufferedWriter(new FileWriter(new File("datos2.txt")));

            byte[] buf = new byte[BUFFER_SIZE];
            int cont;
            int cont2=0;

            while ((cont = fe.read(buf, 0,buf.length))>0) {
                for (int i = 0; i < buf.length; i++) {
                    if ((buf[i] >= 65 && buf[i]<=90) || (buf[i]>=97 && buf[i]<=122) || buf[i]==7){
                        fs.write(buf[i]);
                        cont2++;
                        if(cont2%80==0){
                            fs.newLine();
                        }
                    }
                }
            }
            fe.close();
            fs.close();
        }catch(Exception errorDeFichero){
            System.out.println("Ha habido problemas: "+errorDeFichero.getMessage());
        }
        System.out.println("Terminado!");
    }
}
