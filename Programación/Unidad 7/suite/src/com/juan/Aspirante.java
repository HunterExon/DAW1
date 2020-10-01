package com.juan;

import java.util.*;

class Aspirante implements Comparable{
    private String DNI;
    private String Nombre;
    private int Telefono;
    private static int numAspirantes=0;
    private int id;
    TreeSet<Calificacion> calificaciones;

    public Aspirante(String DNI, String nombre, int telefono) {
        this.DNI = DNI;
        Nombre = nombre;
        Telefono = telefono;
        this.id= ++numAspirantes;
    }

    public void addCalificacion(Calificacion c) {
        this.calificaciones.add(c);
    }
    public int media() {
        int media=0;
        Iterator it = calificaciones.iterator();

        while(it.hasNext()){
            media+=((Calificacion)it.next()).getNota();
        }
        media=media/calificaciones.size();
        return media;
    }
    public String getDNI(){return DNI;}
    public void setDNI(String DNI){this.DNI = DNI;}
    public String getNombre(){return Nombre;}
    public void setNombre(String nombre){Nombre = nombre;}
    public int getTelefono(){return Telefono;}
    public void setTelefono(int telefono){Telefono = telefono;}

    @Override
    public int compareTo(Object o) {
        return getDNI().compareTo(((Aspirante)o).getDNI());
    }

    @Override
    public String toString() {
        return "Aspirante{" +
                "DNI='" + DNI + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Telefono=" + Telefono +
                ", id=" + id +
                ", calificaciones=" + calificaciones +
                '}'+"\n";
    }
}
