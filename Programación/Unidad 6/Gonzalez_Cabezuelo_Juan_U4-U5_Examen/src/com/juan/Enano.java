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
        return "Raza: Enano"+" | Altura: "+altura+" | "+super.toString();
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
        return getNombre().toUpperCase() +"-PRUEBA MI HACHA";
    }
}
