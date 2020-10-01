package com.juan;

import java.io.*;
import java.util.*;

public class Concurso implements Serializable{
    private String nombre;
    private String localidad;
    private ArrayList<Perro> perros;

    public Concurso(String nombre, String localidad, ArrayList<Perro> perros) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.perros = perros;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getLocalidad(){return localidad;}
    public void setLocalidad(String localidad){this.localidad = localidad;}
    public ArrayList<Perro> getPerros(){return perros;}
    public void setPerros(ArrayList<Perro> perros){this.perros = perros;}

    public void addDog(String raza, Perro p) {
        raza=raza.toUpperCase();

        if (p.getTipo()!= Perro.raza.valueOf(raza)){
            System.out.println("Este perro no es de esa raza");
        } else {
            perros.add(p);
        }
    }

    public void disqualifyDog(Perro p){
        if (perros.contains(p)){
            perros.remove(p);
        } else {
            System.out.println("Perro no inscrito");
        }
    }

    public void ownerDogs(int numero_socio){
        int cont=0;
        for (int i = 0; i < perros.size(); i++) {
            if (perros.get(i).getPropietario().getNumero_socio()==numero_socio){
                System.out.println(perros.get(i).toString());
                cont++;
            }
        }
        if(cont==0){
            System.out.println("Este socio no tiene perros inscritos");
        }
    }

    public void perrosporPeso(String raza){
        raza=raza.toUpperCase();
        perros.sort(Perro::compareTo);
        for (int i = 0; i < perros.size(); i++) {
            if(perros.get(i).getTipo()==Perro.raza.valueOf(raza)){
                System.out.println(perros.get(i).toString());
            }
        }
    }

    public void perrosporEdad(String raza){
        raza=raza.toUpperCase();
        perros.sort(new Comparator<Perro>() {
            @Override
            public int compare(Perro p1, Perro p2) {
                return p1.getEdad()-p2.getEdad();
            }
        });
        for (int i = 0; i < perros.size(); i++) {
            if(perros.get(i).getTipo()==Perro.raza.valueOf(raza)){
                System.out.println(perros.get(i).toString());
            }
        }
    }

    public ArrayList<Perro> cargarPerros(String raza) {
        ArrayList<Perro>lista=new ArrayList<>();
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("perros.dat"));
            while(true){
                Perro p = (Perro)ois.readObject();
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public void guardarPerros(ArrayList<Perro> Perros) {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("perros.dat"));

            for(Perro p : Perros){
                oos.writeObject(p);
            }
            oos.close();
        }catch (
                IOException e) {
            System.out.println(e.getMessage());
        }
    }


















    @Override
    public String toString() {
        return "Concurso{" +
                "nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", perros=" + perros +
                '}';
    }
}
