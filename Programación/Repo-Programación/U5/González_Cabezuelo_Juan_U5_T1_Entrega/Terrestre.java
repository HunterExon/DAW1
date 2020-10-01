package com.juan;

public abstract class Terrestre extends Vehiculos implements Comparable {
    String matricula;
    int year;
    enum Color{AZUL, AMARILLO, ROJO, VERDE}
    protected Color color;

    public Terrestre(String nombreVehiculo, int num_pasajeros, String matricula, int year, Color color) {
        super(nombreVehiculo, num_pasajeros);
        this.matricula = matricula;
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString() {
        return  super.toString()+
                ", Matricula: "+matricula+
                ", Año: " +year+
                ", Color: "+color;
    }
    @Override
    public int compareTo(Object o){return matricula.compareTo(((Terrestre)o).matricula);}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrestre terrestre = (Terrestre) o;
        return matricula.equals(terrestre.matricula);
    }
}
