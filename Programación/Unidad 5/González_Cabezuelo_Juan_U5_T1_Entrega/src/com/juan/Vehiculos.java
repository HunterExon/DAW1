package com.juan;

public abstract class Vehiculos {
    protected String nombreVehiculo;
    public int num_pasajeros;
    public int pasajeros;

    public Vehiculos(String nombreVehiculo, int num_pasajeros) {
        this.nombreVehiculo = nombreVehiculo;
        this.num_pasajeros = num_pasajeros;
        this.pasajeros=0;
    }
    public void transportar(int pasajeros) {
        if(pasajeros<=this.num_pasajeros) {
            this.pasajeros = pasajeros;
        }else{
            System.out.println("No cabe tanta gente en el vehículo");
        }
    }
    @Override
    public String toString() {
        return "Nombre: " +nombreVehiculo+
                ", Asientos: " +num_pasajeros+
                ", Pasajeros: " +pasajeros;
    }
}
