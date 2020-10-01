package com.juan;
import java.util.Comparator;

public class ComparaNombres implements Comparator {
    @Override
    public int compare (Object o1, Object o2){
        return ((Cliente)o1).nombre.compareTo(((Cliente)o2).nombre);
    }
}
