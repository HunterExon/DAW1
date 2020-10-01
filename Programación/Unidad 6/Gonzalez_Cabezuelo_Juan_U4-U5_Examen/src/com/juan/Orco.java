package com.juan;

public class Orco extends Personaje implements Atacar{
    private int tonelaje;

    public Orco(String nombre, int energia, int ataque, int defensa, boolean encantado, int tonelaje) {
        super(nombre, energia, ataque, defensa, encantado);
        this.tonelaje=tonelaje;
    }

    public int getTonelaje(){return tonelaje;}
    public void setTonelaje(int tonelaje){this.tonelaje = tonelaje;}

    @Override
    public String toString() {
        return "Raza: Orco"+" | Peso: "+tonelaje+" | "+super.toString();
    }

    @Override
    public String atacarPersonaje(Personaje personaje) {
        if (personaje.getClass().equals(getClass())){
            return "ES DE MI MISMA ESPECIE";
        }else{
            if (isEncantado()){
                personaje.setEnergia(personaje.getEnergia()-((getAtaque()-personaje.getDefensa())*2));
            }else {
                personaje.setEnergia(personaje.getEnergia() - getAtaque() - personaje.getDefensa());
            }
        }
        return getNombre().toUpperCase() +"-POR LA HORDA";
    }
}
