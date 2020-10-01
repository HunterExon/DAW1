package com.juan;

public class Main {

    public static void main(String[] args) {
        RPG juego = new RPG();

        Elfo e1=new Elfo("Illidan", 600, 100, 45, false, Elfo.habitat.BOSQUE);
        Enano en1=new Enano("Forjez", 400, 70, 30, false, 1.5);
        Guerrero g1=new Guerrero("Varyan", 600, 80, 50, true, 23);
        Orco o1=new Orco("Thrall", 800, 85, 42, false, 150);
        Mago m1=new Mago("Jaina", 300, 50, 35, true, 0);

        juego.addPersonaje(e1);
        juego.addPersonaje(g1);
        juego.addPersonaje(en1);
        juego.addPersonaje(m1);
        juego.addPersonaje(o1);

        m1.encantar(en1);

        e1.atacarPersonaje(en1);
        m1.encantar(e1);
        e1.atacarPersonaje(en1);
        juego.mostrarEstado();
        g1.atacarPersonaje(en1);
        o1.atacarPersonaje(en1);

        juego.borrarMuertos();
        juego.mostrarEstado();
        juego.borrarMuertos();
        juego.mostrarxAtaque();
        juego.mostrarxDefensa();
    }

}
