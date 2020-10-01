package com.juan;

public class Estadistica {
    private int goles;
    private int pases;
    private int faltas;

    /*GENERAMOS EL CONSTRUCTOR PARA ESTADISTICAS*/
    public Estadistica(int goles, int pases, int faltas) {
        this.goles = goles;
        this.pases = pases;
        this.faltas = faltas;
    }
    /*GENERAMOS LOS GETTES Y SETTERS*/
    public int getGoles(){return goles;}
    public void setGoles(int goles){this.goles = goles;}
    public int getPases(){return pases;}
    public void setPases(int pases){this.pases = pases;}
    public int getFaltas(){return faltas;}
    public void setFaltas(int faltas){this.faltas = faltas;}

    /*CREAMOS UN TO STRING PARA QUE SE MUESTRE COMO DESEAMOS*/
    @Override
    public String toString() {
        return "GOLES: "+goles+" :: PASES: "+pases+" :: FALTAS: "+faltas"\n";
    }
}
