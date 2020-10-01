package com.juan;

import java.util.Comparator;

public class ComparaDefensa implements Comparator{
    public int compare (Object o1, Object o2) {
        return ((Personaje) o1).getDefensa() - ((Personaje) o2).getDefensa();
    }
}

