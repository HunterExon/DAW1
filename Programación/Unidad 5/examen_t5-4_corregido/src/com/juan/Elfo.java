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
        return "\n--(Raza: Elfo"+" | Tipo: "+tipo+" | "+super.toString();
    }

    @Override
    public void atacarPersonaje(Personaje personaje) {
        int danio=0;

        if (personaje.getClass().equals(getClass())) {
            System.out.println("______________________");
            System.out.println(getNombre().toUpperCase() +"- !ES DE MI MISMA ESPECIE¡");
            System.out.println("______________________");
        } else {
            if (isEncantado()) {
                personaje.setEnergia(personaje.getEnergia() - ((getAtaque() - personaje.getDefensa()) * 2));
                danio=(getAtaque() - personaje.getDefensa()) * 2;
                if (personaje.getEnergia() < 0) {
                    personaje.setEnergia(0);
                }
            } else {
                personaje.setEnergia(personaje.getEnergia() - getAtaque() - personaje.getDefensa());
                danio=(getAtaque() - personaje.getDefensa());
                if (personaje.getEnergia() < 0) {
                    personaje.setEnergia(0);
                }
            }
        }
        System.out.println("______________________");
        System.out.println(getNombre().toUpperCase() + "- MI ARCO NUNCA FALLA");
        System.out.println("{"+personaje.getNombre().toUpperCase()+" ha perdido "+danio+" puntos de energía}");
        System.out.println("{LE QUEDAN "+personaje.getEnergia()+" puntos de energía}");
        System.out.println("______________________");
    }
}
