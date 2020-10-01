package com.juan;

public class Avion extends Aereo {
    public Avion(String nombreVehiculo, int num_pasajeros, String oaci) {
        super(nombreVehiculo, num_pasajeros, oaci);
    }
    @Override
    public String toString() {
        return "Avion{"+super.toString()+"}\n";
    }
}
