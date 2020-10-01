package com.juan;

import java.io.Serializable;

public class Perro implements Serializable, Comparable {
    private String nombre;
    private int Edad;
    private int Peso;
    private boolean Vacunas;
    enum raza {DALMATA,COQUER,LABRADOR};
    private raza tipo;
    private Propietario propietario;

    public Perro(String nombre, int edad, int peso, boolean vacunas, raza tipo, Propietario propietario) {
        this.nombre = nombre;
        Edad = edad;
        Peso = peso;
        Vacunas = vacunas;
        this.tipo = tipo;
        this.propietario = propietario;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public int getPeso(){return Peso;}
    public void setPeso(int peso){Peso = peso;}
    public boolean isVacunas(){return Vacunas;}
    public void setVacunas(boolean vacunas){Vacunas = vacunas;}
    public raza getTipo(){return tipo;}
    public void setTipo(raza tipo){this.tipo = tipo;}
    public Propietario getPropietario(){return propietario;}
    public void setPropietario(Propietario propietario){this.propietario = propietario;}
    public int getEdad(){return Edad;}
    public void setEdad(int edad){Edad = edad;}

    @Override
    public int compareTo(Object p){return getPeso()- ((Perro) p).getPeso();}

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", Edad=" + Edad +
                ", Peso=" + Peso +
                ", Vacunas=" + Vacunas +
                ", tipo=" + tipo +
                ", propietario=" + propietario +
                '}';
    }
}
