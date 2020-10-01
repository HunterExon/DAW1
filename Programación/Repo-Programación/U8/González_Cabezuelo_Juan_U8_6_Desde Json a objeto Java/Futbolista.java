package com.juan;
import java.util.ArrayList;

public class Futbolista {
    private int dorsal;
    private String nombre;
    private ArrayList<String> demarcaciones;
    private String equipo;

    /*GENERAMOS EL CONSTRUCTOR DE FUTBOLISTA*/
    public Futbolista(int dorsal, String nombre, ArrayList<String> demarcaciones, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcaciones = demarcaciones;
        this.equipo = equipo;
    }

    /*AÑADIMOS TODAS LOS GETTERS Y SETTERS*/
    public int getDorsal(){return dorsal;}
    public void setDorsal(int dorsal){this.dorsal = dorsal;}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public ArrayList<String> getDemarcaciones(){return demarcaciones;}
    public void setDemarcaciones(ArrayList<String> demarcaciones){this.demarcaciones = demarcaciones;}
    public String getEquipo(){return equipo;}
    public void setEquipo(String equipo){this.equipo = equipo;}
}

    /*POR ULTIMO USAMOS EL TOSTRING PARA GENERAL LOS NOMBRES FUTBOLISTAS CORRECTAMENTE*/
    @Override
    public String toString() {
        return "DORSAL: "+dorsal+" | NOMBRE: "+nombre+" | DEMARCACIONES: "+demarcaciones+" | EQUIPO: "+equipo+"\n";
    }
}
