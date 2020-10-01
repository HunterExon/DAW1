package com.juan;

public class Elfo extends Personaje implements Atacar {
    enum habitat {BOSQUE,COSTA};
    private habitat tipo;

    public Elfo(String nombre, int energia, int ataque, int defensa, boolean encantado, habitat tipo) {
        super(nombre, energia, ataque, defensa, encantado);
            this.tipo = tipo;
    }

    public habitat getTipo(){return tipo;}
    public void setTipo(habitat tipo){this.tipo = tipo;}

    @Override
    public String toString() {
        return "Raza: Elfo"+" | Tipo: "+tipo+" | "+super.toString();
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
        return getNombre().toUpperCase() +"-MI ARCO NUNCA FALLA";
    }
}