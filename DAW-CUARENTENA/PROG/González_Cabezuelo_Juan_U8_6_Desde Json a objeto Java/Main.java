package com.juan;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*VAMOS A AÑADIR DIRECTAMENTE TODOS LOS FUTBOLISTAS EN EL ARRAY LIST*/
        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(new Futbolista(1, "Casillas", new ArrayList<>(Arrays.asList("Portero")) ,"Real Madrid"));
        futbolistas.add(new Futbolista(15, "Ramos", new ArrayList<>(Arrays.asList("Lateral derecho", "Medio centro")) ,"Real Madrid"));
        futbolistas.add(new Futbolista(3, "Pique", new ArrayList<>(Arrays.asList("Central")) ,"FC Barcelona"));
        futbolistas.add(new Futbolista(5, "Puyol", new ArrayList<>(Arrays.asList("Central")) ,"FC Barcelona"));
        futbolistas.add(new Futbolista(11, "Capdevila", new ArrayList<>(Arrays.asList("Lateral izquierdo")) ,"Villareal"));
        futbolistas.add(new Futbolista(14, "Xabi Alonso", new ArrayList<>(Arrays.asList("Defensa mediocampo", "Mediocampo")) ,"Real Madrid"));
        futbolistas.add(new Futbolista(16, "Busquets", new ArrayList<>(Arrays.asList("Defensa mediocampo")) ,"FC Barcelona"));
        futbolistas.add(new Futbolista(8, "Xavi Hernandez", new ArrayList<>(Arrays.asList("Mediocampo")) ,"FC Barcelona"));
        futbolistas.add(new Futbolista(18, "Pedrito", new ArrayList<>(Arrays.asList("Extremo izquierdo", "Falso extremo")) ,"FC Barcelona"));
        futbolistas.add(new Futbolista(6, "Iniesta", new ArrayList<>(Arrays.asList("Extremo derecho", "Mediocampo")) ,"FC Barcelona"));
        futbolistas.add(new Futbolista(7, "Villa", new ArrayList<>(Arrays.asList("Delantero centro")) ,"FC Barcelona"));

        /*UNA VEZ CREADOS, GENERAMOS EL OBJETO JSON Y EL STRING PARA AÑADIR*/
        Gson gson = new Gson();
        String json = gson.toJson(futbolistas);

        /*CON ESTO VAMOS A ALMACENAR LOS FUTBOLISTAS PARA DESPUÉS SOLO SACAR O QUE QUEREMOS*/
        Type listType = new TypeToken<ArrayList<Futbolista>>() {}.getType();
        ArrayList<Futbolista> arrayFutbolistas = new ArrayList<>();
        arrayFutbolistas = gson.fromJson(json, listType);

        /*POR ULTIMO RECORREMOS EL ARRAY PARA BUSCAR POR RAMOS Y SU DEMARCACIÓN*/
        for (Futbolista f: arrayFutbolistas) {
            if (f.getNombre().equals("Ramos")) {
                System.out.println(f.getDemarcaciones());
            }
        }
    }
}
