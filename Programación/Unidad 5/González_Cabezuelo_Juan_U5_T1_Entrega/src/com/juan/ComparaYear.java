package com.juan;

import java.util.Comparator;

public class ComparaYear implements Comparator {
    public int compare (Object o1, Object o2) {
        return ((Terrestre) o1).year - ((Terrestre) o2).year;
    }
}
