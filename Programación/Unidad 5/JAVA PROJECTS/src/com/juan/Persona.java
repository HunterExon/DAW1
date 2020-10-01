package com.juan;

public class Persona {
    protected String dni;
    private String nombre;
    private int edad;

    public Persona(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getdni(){return dni;}
    public void setdni(String dni){this.dni = dni;}
    public String getnombre(){return nombre;}
    public void setnombre(String nombre){this.nombre = nombre;}
    public int getedad(){return edad;}
    public void setedad(int edad){this.edad = edad;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona that = (Persona) o;
        return getdni().equals(that.getdni());
    }
    @Override
    public String toString() {
        return "DNI: '"+dni+'\''+", NOMBRE: '"+nombre+'\''+", EDAD: '"+edad+"'";
    }
}
