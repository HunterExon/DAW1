package com.jdperez;


import java.util.Arrays;
import java.util.Calendar;

public class Frontera {
    int mNumRegistros;
    Registro registro[];

    public Frontera() {
        registro = new Registro[100];
        int mNumRegistros = 0;
    }

    void addRegistro(Persona p, Calendar c,  Registro.Tipo t) {

        if (mNumRegistros<registro.length) {
            registro[mNumRegistros] = new Registro(p,c,t);
        } else {
            Registro aux[] = new Registro[mNumRegistros+1];
            for (int i = 0; i < registro.length; i++) {
                aux[i] = new Registro(registro[i].getPersona(),registro[i].getMomento(),
                        registro[i].getTipo());
            }
            aux[mNumRegistros] = new Registro(p,c,t);
            registro = aux;
        }
        mNumRegistros++;
    }

    void mostrarPersonas() {
        for (int i = 0; i < this.registro.length; i++) {
            registro[i].MostrarRegistro();
        }
    }

    void busquedaNombre(String nombre) {
        for (int i = 0; i < this.registro.length; i++) {
           if (registro[i].getPersona().getNombre().equals(nombre)) {
               registro[i].MostrarRegistro();
           }
        }
    }

    void busquedaDNI(String dni) {
        for (int i = 0; i < this.registro.length; i++) {
            if (registro[i].getPersona().getDNI().equals(dni)) {
                registro[i].MostrarRegistro();
            }
        }
    }
}
