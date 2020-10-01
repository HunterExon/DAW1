package com.juan;

public class Calificacion implements Comparable{
    private Prueba prueba;
    private double Nota;

    public Calificacion(Prueba prueba, double nota) {
        this.prueba = prueba;
        Nota = nota;
    }
    public Prueba getPrueba(){return prueba;}
    public void setPrueba(Prueba prueba){this.prueba = prueba;}
    public double getNota(){return Nota; }
    public void setNota(int nota){Nota = nota;}

    @Override
    public int compareTo(Object o) {
        return Double.compare(getNota(), ((Calificacion)o).getNota());
    }
}
