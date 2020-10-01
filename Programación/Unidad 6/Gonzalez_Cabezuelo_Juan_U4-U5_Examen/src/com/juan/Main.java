package com.juan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Elfo elfo1=new Elfo("Illidan", 600, 100, 45, true, Elfo.habitat.BOSQUE);
        Enano enano1=new Enano("Forjez", 400, 70, 100, false, 1.5);
        Guerrero guerrero1=new Guerrero("Varyan", 600, 80, 95, true, 23);
        Orco orco1=new Orco("Thral", 800, 85, 65, false, 150);
        Mago mago1=new Mago("Viviana", 300, 50, 35, true, 0);

        RPG WorldOfWarcraft = new RPG(5);
        WorldOfWarcraft.AddPersonaje(elfo1);
        WorldOfWarcraft.AddPersonaje(enano1);
        WorldOfWarcraft.AddPersonaje(guerrero1);
        WorldOfWarcraft.AddPersonaje(orco1);
        WorldOfWarcraft.AddPersonaje(mago1);

       //no me da tiempo a terminar el main

    }
}