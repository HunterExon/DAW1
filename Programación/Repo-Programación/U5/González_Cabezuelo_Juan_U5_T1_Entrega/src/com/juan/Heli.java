package com.juan;

public class Heli extends Aereo{
    public Heli(String nombreVehiculo, int num_pasajeros, String oaci) {
        super(nombreVehiculo, num_pasajeros, oaci);
    }
    @Override
    public String toString() {
        return "Helicóptero{"+super.toString()+"}\n";
    }
}
