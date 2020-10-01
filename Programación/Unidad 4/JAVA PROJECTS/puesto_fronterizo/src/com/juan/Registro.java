package com.juan;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

    public class Registro {
        private Persona persona;
        private Calendar momento;
        enum Tipo { ENTRADA,SALIDA};
        private Tipo tipo;

        public Registro(Persona persona, Calendar momento, Tipo tipo) {
            this.persona = persona;
            this.momento = Calendar.getInstance();
            this.tipo = Tipo.SALIDA;
        }
        public Registro(Persona persona, Tipo tipo) {
            this.persona = persona;
            this.momento = Calendar.getInstance();
            this.tipo = tipo;
        }

        Persona getPersona() {
            return persona;
        }
        public void setPersona(Persona persona) {
            this.persona = persona;
        }

        Calendar getMomento() {
            return momento;
        }
        public void setMomento(Calendar momento) {
            this.momento = momento;
        }

        Tipo getTipo() {
            return tipo;
        }
        public void setTipo(Tipo tipo) {
            this.tipo = tipo;
        }

        public void MostrarRegistro(){
            System.out.println("=====================================");
            System.out.println("Nombre: "+this.persona.getmNombre());
            System.out.println("DNI: "+this.persona.getmDNI());
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
            System.out.println("Momento: "+dateFormat.format(this.momento));
            System.out.println("Tipo: "+this.tipo.toString());
        }
    }
