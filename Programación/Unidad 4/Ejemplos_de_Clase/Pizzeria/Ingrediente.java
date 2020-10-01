package com.jdperez;

public class Ingrediente {
    private String nombre;
    private double calorias;

    Ingrediente() {
        this.nombre = "Queso";
        this.calorias = 250;
    }

    Ingrediente(String nombre, double cal) {
        this.nombre = nombre;
        this.calorias = cal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
}
