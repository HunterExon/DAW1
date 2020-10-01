package com.juan;

import java.io.*;

public class Main {
    public static void main(String[] args){
        //------------Array de alumnos------------
        Alumno[] alumno = new Alumno[5];
        //------------Array de alumnos------------

        //------------try catch de ejecución para lo solicitado------------
        try {
            //------------alumnos creados en el array------------
            //es necesario introducirlos en un trycatch para que salte el error
            alumno[0] = new Alumno("pepe", "perez", 19, "daw1"); //Si ponemos aquí cualquier edad negativa, saltará el error
            alumno[1] = new Alumno("jose", "anton", 22, "daw1");
            alumno[2] = new Alumno("fran", "garcia", -8, "daw1");
            alumno[3] = new Alumno("juan", "gonzalez", 23, "daw1");
            alumno[4] = new Alumno("rocio", "del real", 26, "daw1");
            //es necesario introducirlos en un trycatch para que salte el error
            //------------alumnos creados en el array------------

            //------------con esto creo el archivo y le paso la información en binario------------
            FileOutputStream fos = new FileOutputStream(new File("alumnos.bin"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //------------con esto creo el archivo y le paso la información en binario------------

            //------------leo cada objeto del array y lo coloco en el archivo------------
            for (int i = 0; i < alumno.length; i++) {
                oos.writeObject(alumno[i]);
            }
            oos.close();
            //------------leo cada objeto del array y lo coloco en el archivo------------

        } catch (Exception errorDeFichero) {
            System.out.println(errorDeFichero.getMessage());
        }
        //------------try catch de ejecución para lo solicitado------------

        //------------try catch para mostrar los datos------------
        try {
            //------------utilizo la función para leer el archivo binario de objetos------------
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.bin"));
            //------------utilizo la función para leer el archivo binario de objetos------------

            //------------creo un array vacio para separarlo del original y rellenarlo
            // con los datos del archivo------------
            Alumno[] alumno2=new Alumno[5];
            //------------creo un array vacio para separarlo del original y rellenarlo
            // con los datos del archivo------------

            //------------for para mostrar cada dato de cada posición del array------------
            for (int i = 0; i < alumno2.length ; i++) {

                //------------aquí leemos con el for cada valor del archivo binario y se lo asignamos
                //a cada posición del array nuevo de lectura que hemos creado arriba------------
                alumno2[i] = (Alumno)ois.readObject();
                //------------aquí leemos con el for cada valor del archivo binario y se lo asignamos
                //a cada posición del array nuevo de lectura que hemos creado arriba------------

                //------------para poder mostrar los datos de cada objeto dentro del array, es necesario
                //utilizar los metodos y/o funciones para sacar por pantalla el dato concreto------------
                System.out.println("Nombre: "+alumno2[i].getNombre()+
                                 " | Apellido: "+alumno2[i].getApellido()+
                                 " | Edad: "+alumno2[i].getEdad()+
                                 " | Curso: "+alumno2[i].getCurso());
                //------------para poder mostrar los datos de cada objeto dentro del array, es necesario
                //utilizar los metodos y/o funciones para sacar por pantalla el dato concreto------------


                /*------------esto sería otra forma de mostrar los datos introducidos sin usar los metodos
                Alumno a;
                while((a=(Alumno)ois.readObject())!=null){
                    System.out.println(a.toString());
                }
                //hay que añadir el toString en la clase Alumno
                 esto sería otra forma de mostrar los datos introducidos sin usar los metodos------------*/
            }
            //------------for para mostrar cada dato de cada posición del array------------

        } catch (Exception errorDeFichero) {
            System.out.println(errorDeFichero.getMessage());
        }
        //------------try catch para mostrar los datos------------
    }
}
