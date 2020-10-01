package com.juan;

import java.util.Calendar;

public class Prueba {
    private String Nombre;
    enum TIPO {ORAL,ESCRITO};
    private TIPO tipo;
    private Calendar fecha;

    public Prueba(String nombre, TIPO tipo) {
        Nombre = nombre;
        this.tipo = tipo;
        this.fecha = Calendar.getInstance();
    }

    public String getNombre(){return Nombre;}
    public void setNombre(String nombre){Nombre = nombre;}
    public Calendar getFecha(){return fecha;}
    public void setFecha(Calendar fecha){this.fecha = fecha;}
}
