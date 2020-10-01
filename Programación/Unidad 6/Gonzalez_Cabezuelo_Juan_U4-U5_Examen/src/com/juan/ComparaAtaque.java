package com.juan;

import java.util.Comparator;

public class ComparaAtaque implements Comparator{
    public int compare (Object o1, Object o2) {
        return ((Personaje) o1).getAtaque() - ((Personaje) o2).getAtaque();
    }
}

