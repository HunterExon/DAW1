package com.jdperez;

public class Etiqueta {
    private String nombre;
    private String direccion;
    private String otros;

    public Etiqueta(String nombre, String direccion, String otros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.otros = otros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    @Override
    public String toString() {
        return "Nombre:"+nombre+"\n"+
               "Dirección"+direccion+"\n"+
               "Otros:"+otros+"\n";
    }

}
