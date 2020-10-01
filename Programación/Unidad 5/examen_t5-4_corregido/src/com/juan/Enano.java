package com.juan;

public class Enano extends Personaje implements Atacar {
    private double altura;

    public Enano(String nombre, int energia, int ataque, int defensa, boolean encantado, double altura) {
        super(nombre, energia, ataque, defensa, encantado);
        this.altura=altura;
    }

    public double getAltura(){return altura;}
    public void setAltura(double altura){this.altura = altura;}

    @Override
    public String toString() {
        return "\n--(Raza: Enano"+" | Altura: "+altura+" | "+super.toString();
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
        System.out.println(getNombre().toUpperCase() + "- PRUEBA MI HACHA");
        System.out.println("{"+personaje.getNombre().toUpperCase()+" ha perdido "+danio+" puntos de energía}");
        System.out.println("{LE QUEDAN "+personaje.getEnergia()+" puntos de energía}");
        System.out.println("______________________");
    }
}