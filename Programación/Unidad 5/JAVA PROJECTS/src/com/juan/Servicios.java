package com.juan;

public class Servicios extends Persona implements Comparable, CalcularNomina {

    private String cod_servicio;
    private float saldo;
    public Servicios(String dni, String nombre, int edad, String cod_servicio, float saldo) {
        super(dni, nombre, edad);
        this.cod_servicio = cod_servicio;
        this.saldo=saldo;
    }
    @Override
    public float nomina(){return this.saldo;}
    @Override
    public int compareTo(Object o){return cod_servicio.compareTo(((Servicios)o).cod_servicio);}
    @Override
    public String toString() {
        return "Servicio{"+super.toString()+", COD-SERVICIO: '"+cod_servicio+"', "+"SALDO: '"+this.saldo+"'}"+"\n";
    }
}