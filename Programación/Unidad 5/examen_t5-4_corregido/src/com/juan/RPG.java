package com.juan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class RPG {

    private ArrayList<Personaje> personajes;

    public RPG(){
        this.personajes=new ArrayList<>();
    }

    public void addPersonaje(Personaje p) {
            if (personajes.size()==10) {
                System.out.println("______________________");
                System.out.println("No se pueden añadir más personajes a la partida");
                System.out.println("______________________");
            } else {
                this.personajes.add(p);
            }
    }

    public void mostrarEstado() {
        personajes.sort(new Comparator<Personaje>() {
            @Override
            public int compare(Personaje o1, Personaje o2) {
                return o1.getEnergia()-o2.getEnergia();
            }
        });
        System.out.println("\nORDENADOS POR ENERGÍA"+personajes);
    }

    public void mostrarxAtaque() {
        personajes.sort(new Comparator<Personaje>() {
            @Override
            public int compare(Personaje o1, Personaje o2) {
                return o1.getAtaque()-o2.getAtaque();
            }
        });
        System.out.println("\nORDENADOS POR ATAQUE"+personajes);
    }

    public void mostrarxDefensa() {
        personajes.sort(new Comparator<Personaje>() {
            @Override
            public int compare(Personaje o1, Personaje o2) {
                return o1.getDefensa()-o2.getDefensa();
            }
        });
        System.out.println("\nORDENADOS POR DEFENSA"+personajes);
    }
    public void borrarMuertos() {
        for (int i = 0; i < personajes.size() ; i++) {
            if (personajes.get(i).getEnergia()<=0) {
                personajes.remove(personajes.get(i));
            }
        }
        HayGanador();
    }
    public void HayGanador(){
        if(personajes.size()==1){
            System.out.println("\n=================================");
            System.out.println("|  "+ personajes.get(0).getNombre()+" - ES EL GANADOR  |");
            System.out.println("=================================");
        }
    }
}
