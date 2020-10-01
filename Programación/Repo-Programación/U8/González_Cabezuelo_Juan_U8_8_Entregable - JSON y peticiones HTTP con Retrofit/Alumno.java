package com.juan;
import java.util.ArrayList;

public class Alumno {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    private ArrayList<Asignatura> asignaturas;

    /*CREAMOS EL CONSTRUCTOR PARA ALUMNOS CON LOS DATOS REQUERIDOS*/
    public Alumno(int id, String nombre, String apellidos, int edad, ArrayList<Asignatura> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.asignaturas = asignaturas;
    }

    /*GENERAMOS LOS GETTERS Y LOS SETTERS*/
    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getApellidos(){return apellidos;}
    public void setApellidos(String apellidos){this.apellidos = apellidos;}
    public int getEdad(){return edad;}
    public void setEdad(int edad){this.edad = edad;}
    public ArrayList<Asignatura> getAsignaturas(){return asignaturas;}
    public void setAsignaturas(ArrayList<Asignatura> asignaturas){this.asignaturas = asignaturas;}

    /*UTILIZAMOS EL TO STRING PARA QUE LO MUESTRE COMO DESEAMOS*/
    @Override
    public String toString() {
        return "ID: "+id+" | NOMBRE: "+nombre+" | APELLIDO: "+apellidos+" | EDAD: "+edad+" | ASIGNATURAS: "+asignaturas+"\n";
    }
}
