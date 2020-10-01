package com.juan;

public abstract class Aereo extends Vehiculos {
    int altitud;
    String oaci;

    public Aereo(String nombreVehiculo, int num_pasajeros, String oaci) {
        super(nombreVehiculo, num_pasajeros);
        this.altitud = 0;
        this.oaci = oaci;
    }
    public String tipo(){
        return "Tipo: "+getClass().getSimpleName()+", Código: "+oaci+", Altura: "+altitud;
    }
    public void altura(int altitud) {
        this.altitud = altitud;
    }
    @Override
    public String toString() {
        return super.toString()+
                ", Altura: " +altitud+
                ", OACI: " + oaci;
    }
}
