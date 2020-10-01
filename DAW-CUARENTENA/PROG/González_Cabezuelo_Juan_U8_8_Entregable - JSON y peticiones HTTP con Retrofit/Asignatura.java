package com.juan;

public class Asignatura {
    private int id;
    private String nombre;
    private int alumnoId;

    /*CREAMOS EL CONSTRUCTOR PARA LAS ASIGNATURAS*/
    public Asignatura(int id, String nombre, int alumnoId) {
        this.id = id;
        this.nombre = nombre;
        this.alumnoId = alumnoId;
    }

    /*GENERAMOS LOS GETTERS Y SETTERS*/
    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public int getAlumnoId(){return alumnoId;}
    public void setAlumnoId(int alumnoId){this.alumnoId = alumnoId;}

    /*CREAMOS UN TO STRING PARA QUE LO MUESTRE COMO DESEAMOS*/
    @Override
    public String toString() {
        return "| ID: "+id+" :: NOMBRE: "+nombre+" :: ALUMNO-ID: "+alumnoId+"\n";
    }
}
