package com.juan;

public class Ingredientes {
    /**
     * Clase: Ingredientes
     * Atributos: Nombre y calorias
     */
    private String nombre;
    private int calorias;

    /**
     * Construcctor Ingredientes: Aquí se le pasan los datos del ingrediente
     */
    public Ingredientes(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    /**
     * Construcctor Ingredientes: Aquí se crea el Ingrediente queso por defecto
     */
    public Ingredientes() {
        this.nombre = "Queso";
        this.calorias = 250;
    }

    /**
     * Getter y Setter del nombre
     */
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /***
     * Getter y Setter de calorias
     */
    public int getCalorias() {
        return calorias;
    }
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
