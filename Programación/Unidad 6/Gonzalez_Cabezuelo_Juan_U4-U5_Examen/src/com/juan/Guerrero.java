package com.juan;

public class Guerrero extends Hombre implements Atacar {
    private int edad;

    public Guerrero(String nombre, int energia, int ataque, int defensa, boolean encantado, int edad){
        super(nombre, energia, ataque, defensa, encantado);
        this.edad=edad;
    }

    public int getEdad(){return edad;}
    public void setEdad(int edad){this.edad = edad;}

    @Override
    public String toString() {
        return "Raza: Humano"+" | Tipo: Guerrero"+" | Edad: "+edad+" | "+super.toString();
    }

    @Override
    public String atacarPersonaje(Personaje personaje) {
        if (personaje.getNombre().equals(getNombre())){
            return "ES DE MI MISMA ESPECIE";
        }else{
            if (isEncantado()){
                personaje.setEnergia(personaje.getEnergia()-((getAtaque()-personaje.getDefensa())*2));
            }else {
                personaje.setEnergia(personaje.getEnergia() - getAtaque() - personaje.getDefensa());
            }
        }
        return getNombre().toUpperCase() +"-POR LA ALIANZA";
    }
}
