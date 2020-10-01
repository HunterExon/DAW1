package com.juan;

import java.io.*;

class actividadlibro2 {
    /*
Ejercicio propuesto 11.5.1: Crea un programa que lea los primeros 54 bytes de un
fichero BMP (su cabecera) y compruebe si los dos primeros bytes de esos
54 corresponden a las letras B y M. Si no es así, mostrará el mensaje
"No es un BMP válido"; si lo son, escribirá el mensaje "Parece un BMP válido"
    */
    public static void main(String[] args) {
        final int BUFFER_SIZE = 54;

        try {
            InputStream fe = new FileInputStream(new File("fichero.png"));

            byte[] buf = new byte[BUFFER_SIZE];
            int cont;

            while ((cont = fe.read(buf, 0,buf.length))>0) {
                if(buf[1]=='P' && buf[2]=='N' && buf[3]=='G'){
                    System.out.println("PNG correcto");
                    return;
                }else{
                    System.out.println("No es un PNG");
                    return;
                }
            }
            fe.close();
        }catch(Exception errorDeFichero){
            System.out.println("Ha habido problemas: "+errorDeFichero.getMessage());
        }
        System.out.println("Terminado!");
    }
}
