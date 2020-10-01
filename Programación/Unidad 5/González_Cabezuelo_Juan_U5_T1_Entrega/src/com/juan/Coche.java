package com.juan;

public class Coche extends Terrestre{
    public Coche(String nombreVehiculo, int num_pasajeros, String matricula, int year, Color color) {
        super(nombreVehiculo, num_pasajeros, matricula, year, color);
    }
    @Override
    public String toString() {
        return "Coche{"+super.toString()+"}\n";
    }
}
