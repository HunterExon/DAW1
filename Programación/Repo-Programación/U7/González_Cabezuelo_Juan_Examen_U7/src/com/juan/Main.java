package com.juan;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
Queremos desarrollar una aplicación para la gestión de un concurso canino internacional.
Para ello crearemos una clase llamada Concurso en donde guardaremos todos los perros del
concurso, el nombre del concurso y la localidad en la que se va a celebrar.

Como los concursos de los perros son por razas dentro de la clase Concurso tendremos
que crear la estructura de datos necesaria para acceder mediante el nombre de la raza,
que es único, al conjunto de perros de dicha raza.

De cada uno de los perros debemos guardar la siguiente lista de atributos:
-El nombre del perro.
-La edad (un entero, no hace falta que sea una fecha de nacimiento).
-El peso del perro.
-Si tienen o no tienen todas las vacunas requeridas.
-El Propietario del perro.
-Y por supuesto la raza del mismo.

De los propietarios de los perros deberemos guardar a su vez los siguiente datos:
-El nombre.
-Los apellidos.
-El número de socio de la Sociedad Canina Mundial.
-El país de origen.

La clase tiene que tener los siguientes metodos.
-Un método addDog() que recibe como parámetros la raza y un perro y que añadirá a
la estructura de datos ese perro en la raza determinada o mostrará un mensaje de
error en caso de que estemos intentando introducir en la raza un perro que no sea de dicha raza.

-El método disqualifyDog() que recibe como parámetro un perro y los elimina del
concurso borrándolo de la estructura de datos que contienen los datos de los
perros participantes organizados por razas. En caso de ese perro no esté escrito
deberá mostrar el siguiente mensaje "Perro no inscrito".

-El método ownerDogs() que mostrará por pantalla todos los perros de un dueño determinado
(sea de la raza que sean). Este método recibe como parámetro el número de socio de la
Sociedad Canina y mostrará el mensaje "Este socio no tiene perros inscritos" en caso de
que el socio no tenga ningún perro en este concurso.

-El método perrosporPeso() que mostrará la lista de perros de una raza, que se recibe
como parámetro, ordenados por peso de manera decreciente.

-El método perrosporEdad() que mostrará la lista de perros de una raza, que se recibe
como parámetro, ordenados por edad de manera decreciente.

Como cuando hay un concurso las inscripciones de los mismos se realizan en varios días
y para no perder todos los inscritos debemos también de tener dos métodos en la clase:
-cargarPerros() que leerá todos los perros desde el fichero binario "perros.dat" y los
colocará en el conjunto de perros de su raza.

-guardarPerros() que escribirá todos los perros cargados en el fichero "perros.dat".
Estos perros serán guardados de manera individual sin tener que estar, en esa escritura,
 organizados por raza.

Usar dicha clase y todos sus métodos en la la clase Main. Deberéis tener, al menos,
3 razas, 10 perros y 3 dueños (combinados de la manera que queráis).
         */
        Scanner teclado=new Scanner(System.in);
        ArrayList<Perro> lista=new ArrayList<>();
        ArrayList<Perro> listaraza=new ArrayList<>();
        String raza;

        Propietario pp1=new Propietario("Juan", "González Cabezuelo", 5647, "Spain");
        Propietario pp2=new Propietario("Rocio", "Del Real", 7894, "Spain");
        Propietario pp3=new Propietario("Remi", "Gaillard", 3654, "France");

        Perro p1=new Perro("Dumas", 10, 18, true, Perro.raza.COQUER, pp1);
        Perro p2=new Perro("Luna", 4, 22, true, Perro.raza.DALMATA, pp1);
        Perro p3=new Perro("Togo", 6, 16, true, Perro.raza.COQUER, pp2);
        Perro p4=new Perro("Bruno", 8, 15, false, Perro.raza.LABRADOR, pp1);
        Perro p5=new Perro("Stein", 7, 12, true, Perro.raza.COQUER, pp3);
        Perro p6=new Perro("Deku", 2, 21, true, Perro.raza.LABRADOR, pp3);
        Perro p7=new Perro("Kacchan", 6, 8, false, Perro.raza.DALMATA, pp2);
        Perro p8=new Perro("Luke", 5, 14, true, Perro.raza.DALMATA, pp3);
        Perro p9=new Perro("Leia", 7, 17, true, Perro.raza.COQUER, pp2);
        Perro p10=new Perro("Anakin", 3, 6, true, Perro.raza.LABRADOR, pp2);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        lista.add(p8);
        lista.add(p9);
        lista.add(p10);

        do {
            System.out.println("Introduce la Raza del Concurso: ");
            raza = teclado.nextLine();
            raza=raza.toUpperCase();

            if((!raza.equals("COQUER"))&&(!raza.equals("DALMATA"))&&(!raza.equals("LABRADOR"))){
                System.out.println("Las razas deben ser: Coquer, Dalmata o Labrador");
            }
        }while((!raza.equals("COQUER"))&&(!raza.equals("DALMATA"))&&(!raza.equals("LABRADOR")));

        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getTipo()==Perro.raza.valueOf(raza)){
                listaraza.add(lista.get(i));
            }
        }
        Concurso concurso = new Concurso("Concurso "+raza, "Sevilla", listaraza);

        System.out.println("1===============");
        concurso.disqualifyDog(p1);
        System.out.println("1===============");
        System.out.println("2===============");
        concurso.addDog("DALMATA", p2);
        System.out.println("2===============");
        System.out.println("3===============");
        concurso.ownerDogs(5647);
        System.out.println("3===============");
        System.out.println("4===============");
        concurso.perrosporPeso("DALMATA");
        System.out.println("4===============");
        System.out.println("5===============");
        concurso.perrosporEdad("LABRADOR");
        System.out.println("5===============");

        lista.addAll(concurso.cargarPerros(raza));
        concurso.guardarPerros(lista);
    }
}
