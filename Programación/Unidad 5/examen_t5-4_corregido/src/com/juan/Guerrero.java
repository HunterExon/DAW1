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
        return "\n--(Raza: Humano"+" | Tipo: Guerrero"+" | Edad: "+edad+" | "+super.toString();
    }

    @Override
    public void atacarPersonaje(Personaje personaje) {
        int danio=0;

        if (personaje.getClass().equals(getClass())){
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
        System.out.println(getNombre().toUpperCase() + "- POR LA ALIANZA");
        System.out.println("{"+personaje.getNombre().toUpperCase()+" ha perdido "+danio+" puntos de energía}");
        System.out.println("{LE QUEDAN "+personaje.getEnergia()+" puntos de energía}");
        System.out.println("______________________");
    }
}
