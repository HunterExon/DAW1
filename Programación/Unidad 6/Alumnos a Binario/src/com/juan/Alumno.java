package com.juan;

import java.io.Serializable;

public class Alumno implements Serializable {
    //------------atributos de alumno------------
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
    //------------atributos de alumno------------

    //------------constructor------------
    Alumno(String nombre, String apellido, int edad, String curso) throws ExcepcionEdadNegativa {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
        //vamos a generar la excepción aquí para cuando se ponga la edad negativa
        if(edad<=0){
            throw new ExcepcionEdadNegativa("No se puede introducir una edad negativa");
        }
        //vamos a generar la excepción aquí para cuando se ponga la edad negativa
    }
    //------------constructor------------

    //------------getters and setters------------
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido = apellido;}
    public int getEdad(){return edad;}
    public void setEdad(int edad) throws ExcepcionEdadNegativa {this.edad = edad;
        //hay que colocar la excepción en todos aquellos sitios que sean susceptibles de fallar
        if(edad<=0){
            throw new ExcepcionEdadNegativa("No se puede introducir una edad negativa");
        }
        //hay que colocar la excepción en todos aquellos sitios que sean susceptibles de fallar
    }
    public String getCurso(){return curso;}
    public void setCurso(String curso){this.curso = curso;}
    //------------getters and setters------------

    //------------esto es necesario para poder ejecutar la segunda forma de sacar los datos por pantalla------------
    //se puede editar el return para que salga como tu quieres que salga
    @Override
    public String toString() {
        return  "Nombre: "+nombre+
                " | Apellido: "+apellido+
                " | Edad: "+edad+
                " | Curso: "+curso;
    }
    //se puede editar el return para que salga como tu quieres que salga
    //------------esto es necesario para poder ejecutar la segunda forma de sacar los datos por pantalla------------
}
