package com.jdperez;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Registro {

    private Persona persona;
    private Calendar momento;
    public enum Tipo { ENTRADA,SALIDA};
    private  Tipo tipo;

    public Registro(Persona persona) {
        this.persona = persona;
        this.momento = Calendar.getInstance();
        this.tipo = Tipo.SALIDA;
    }

    public Registro(Persona persona, Tipo tipo) {
        this.persona = persona;
        this.momento = Calendar.getInstance();
        this.tipo = tipo;
    }

    public Registro(Persona persona, Calendar momento, Tipo tipo) {
        this.persona = persona;
        this.momento = momento;
        this.tipo = tipo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Calendar getMomento() {
        return momento;
    }

    public void setMomento(Calendar momento) {
        this.momento = momento;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    void MostrarRegistro() {
        System.out.println("Nombre:"+this.persona.getNombre());
        System.out.println("DNI:"+this.persona.getDNI());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        System.out.println("Momento:"+dateFormat.format(this.momento));
        System.out.println("Tipo:"+this.tipo.toString());
        System.out.println("---------------------------------");
    }
}

