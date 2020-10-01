package com.juan;

import java.util.Arrays;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        /*
        Cliente[] tablaClientes = new Cliente[5];

        tablaClientes[0] = new Cliente("435","Jorge",34,6200);
        tablaClientes[1] = new Cliente("235","Ana",20,3200);
        tablaClientes[2] = new Cliente("125","Julio",20,4100);
        tablaClientes[3] = new Cliente("465","Hector",30,5200);
        tablaClientes[4] = new Cliente("115","Anne",28,1200);

        Arrays.sort(tablaClientes);
        System.out.println("Por DNI: "+Arrays.toString(tablaClientes));

        Arrays.sort(tablaClientes, new ComparaNombres());
        System.out.println("Por Nombres: "+Arrays.toString(tablaClientes));

        Arrays.sort(tablaClientes, new ComparaEdades());
        System.out.println("Por edades: "+Arrays.toString(tablaClientes));
         */
        Libro[] libro = new Libro[3];
        Revista[] revista = new Revista[2];
        Enciclopedia[] enciclopedia = new Enciclopedia[3];

        enciclopedia[0] = new Enciclopedia("123456", "Animalicos", 2019,8);
        enciclopedia[1] = new Enciclopedia("345678", "Carlos se las busca", 2020,2);
        enciclopedia[2] = new Enciclopedia("888888", "Se va a lleva er navajaso", 2020,3);
        libro[0] = new Libro("222222", "La Ruta Prohibida", 2007);
        libro[1] = new Libro("333333", "Los Otros", 2016);
        libro[2] = new Libro("111111", "La rosa del mundo", 1995);
        revista[0] = new Revista("444555", "Año Cero", 2019, 344);
        revista[1] = new Revista("002244", "National Geographic", 2003, 443);

        System.out.println(libro[0].toString());
        System.out.println(libro[1].toString());
        System.out.println(libro[2].toString());

        System.out.println(revista[0].toString());
        System.out.println(revista[1].toString());

        libro[0].presta();

        if (libro[0].estaPrestado()) {
            System.out.println("El libro está prestado");
        }else{
            System.out.println("El libro no está prestado");
        }
        libro[1].presta();
        libro[0].devuelve();

        if (libro[0].estaPrestado()) {
            System.out.println("El libro está prestado");
        }else{
            System.out.println("El libro no está prestado");
        }
        libro[2].presta();
        System.out.println(libro[1].toString());
        System.out.println(libro[2].toString());

        Arrays.sort(libro);
        System.out.println("Por ISBN: \n"+Arrays.deepToString(libro));

        Arrays.sort(revista);
        System.out.println("Por ISBN: \n"+Arrays.deepToString(revista));

        Arrays.sort(enciclopedia);
        System.out.println("Por ISBN: \n"+Arrays.deepToString(enciclopedia));
    }
}
