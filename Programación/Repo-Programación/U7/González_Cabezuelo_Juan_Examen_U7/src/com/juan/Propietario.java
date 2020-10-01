package com.juan;

public class Propietario {
    private String nombre;
    private String apellidos;
    private int numero_socio;
    private String pais;

    public Propietario(String nombre, String apellidos, int numero_socio, String pais) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numero_socio = numero_socio;
        this.pais = pais;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getApellidos(){return apellidos;}
    public void setApellidos(String apellidos){ this.apellidos = apellidos;}
    public int getNumero_socio(){return numero_socio;}
    public void setNumero_socio(int numero_socio){this.numero_socio = numero_socio;}
    public String getPais(){return pais;}
    public void setPais(String pais){this.pais = pais;}

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numero_socio=" + numero_socio +
                ", pais='" + pais + '\'' +
                '}';
    }
}
