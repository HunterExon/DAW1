package com.juan;

import java.util.Arrays;

public class RPG {
    private Personaje[] personajes;
    private int num_Personajes;

    public RPG() {
        this.personajes = new Personaje[10];
        this.num_Personajes = 0;
    }
    public RPG(int numero) {
        this.personajes = new Personaje[numero];
        this.num_Personajes = numero;
    }

    private void BorrarMuertos() {
        int cont = 0;
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] == null) {
                break;
            } else {
                if (personajes[i].getEnergia() <= 0) {
                    if (i < personajes.length - 1) {
                        for (int j = i + 1; j < personajes.length; j++) {
                            if (j < personajes.length - 1) {
                                this.personajes[j] = null;
                                cont++;
                            } else {
                                this.personajes[j] = this.personajes[j + 1];
                                cont++;
                            }
                        }
                    } else {
                        this.personajes[i] = null;
                        cont++;
                    }
                }
            }
        }
        this.personajes = Arrays.copyOf(personajes, personajes.length - cont);
        this.num_Personajes = personajes.length;
    }

    public void AddPersonaje(Personaje personaje) {
        BorrarMuertos();
            if (num_Personajes < 10) {
                this.personajes = Arrays.copyOf(personajes, personajes.length + 1);
                this.personajes[num_Personajes] = personaje;
                this.num_Personajes = personajes.length;
            } else {
                System.out.println("============================================");
                System.out.println("| No se pueden añadir mas de 10 personajes |");
                System.out.println("============================================");
            }
        }

    public void MostrarEstado() {
        Arrays.sort(this.personajes);
        String mostrar = "PERSONAJES--[ \n";
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null) {
                mostrar += personajes[i].toString();
            }
        }
        System.out.println(mostrar);
        System.out.println("]");
    }
    public void MostrarxAtaque() {
        Arrays.sort(this.personajes, new ComparaAtaque());
        String mostrar = "PERSONAJES--[ \n";
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null) {
                mostrar += personajes[i].toString();
            }
        }
        System.out.println(mostrar);
        System.out.println("]");

    }
    public void MostrarxDefensa() {
        Arrays.sort(this.personajes, new ComparaDefensa());
        String mostrar = "PERSONAJES--[ \n";
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null) {
                mostrar += personajes[i].toString();
            }
        }
        System.out.println(mostrar);
        System.out.println("]");
    }
}





