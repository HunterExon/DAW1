package com.juan;

public class Moto extends Terrestre {
    public Moto(String nombreVehiculo, int num_pasajeros, String matricula, int year, Color color) {
        super(nombreVehiculo, num_pasajeros, matricula, year, color);
    }
    @Override
    public String toString() {
        return "Motocicleta{"+super.toString()+"}\n";
    }
}
