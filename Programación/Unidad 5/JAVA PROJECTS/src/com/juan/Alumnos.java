package com.juan;

    public class Alumnos extends Persona implements Comparable {
        
        private String cod_alumno;
        public Alumnos(String dni, String nombre, int edad, String cod_alumno) {
            super(dni, nombre, edad);
            this.cod_alumno = cod_alumno;
        }
        @Override
        public int compareTo(Object o){return cod_alumno.compareTo(((Alumnos)o).cod_alumno);}
        @Override
        public String toString() {
            return "Alumno{"+super.toString()+", COD-ALUMNO: '"+cod_alumno +"'"+"}"+"\n";
        }
}
