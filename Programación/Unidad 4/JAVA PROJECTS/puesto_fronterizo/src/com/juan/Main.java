package com.juan;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

//IR A LA PAGINA 208 PARA RESOLVER

        Registro.Tipo t = new Registro.Tipo();
        Calendar m = new Calendar();
        Persona p = new Persona();
        Registro r =new Registro();




        do {
            System.out.println("===============MENU===============");
            System.out.println("||1.Paso de Frontera            ||");
            System.out.println("||2.Mostrar todas las personas  ||");
            System.out.println("||3.Búsqueda por nombre         ||");
            System.out.println("||4.Búsqueda por DNI            ||");
            System.out.println("||5.Introducir un nuevo registro||");
            System.out.println("||0.Salir                       ||");
            System.out.println("==================================");
            opcion=teclado.nextInt();
            switch (opcion){
                default:
                    System.out.println("==================================");
                    System.out.println("||Introduzca una opción correcta||");
                    System.out.println("==================================");
                    break;
                case 1:
                    System.out.println("Registro de hoy: ");
                    Registro.MostrarRegistro();
                    break;
                case 2:
                    Frontera.mostrarPersonas();
                    break;
                case 3:
                    String nombre;
                    System.out.print("Introduzca el nombre a buscar: ");
                    nombre = teclado.nextLine();
                    System.out.println();
                    Frontera.busquedaNombre(nombre);
                    break;
                case 4:
                    String dni;
                    System.out.print("Introduzca el DNI a buscar: ");
                    dni = teclado.nextLine();
                    System.out.println();
                    Frontera.busquedaDNI(dni);
                    break;

                case 5:
                    System.out.print("Introduzca nombre: ");
                    String p = teclado.nextLine();

                    Frontera.addRegistro(,,);
                    break;
            }
        }while(opcion>5 || opcion<0);
    }
}
