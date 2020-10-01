package com.juan;

    public class Profesores extends Persona implements Comparable, CalcularNomina {

        private String cod_profesor;
        private float saldo;
        public Profesores(String dni, String nombre, int edad, String cod_profesor, float saldo) {
            super(dni, nombre, edad);
            this.cod_profesor = cod_profesor;
            this.saldo=saldo;
        }
        @Override
        public float nomina(){return this.saldo;}
        @Override
        public int compareTo(Object o){return cod_profesor.compareTo(((Profesores)o).cod_profesor);}
        @Override
        public String toString() {
            return "Profesor{"+super.toString()+", COD-PROFESOR: '"+cod_profesor+"', "+"SALDO: '"+this.saldo+"'}"+"\n";
        }
}
