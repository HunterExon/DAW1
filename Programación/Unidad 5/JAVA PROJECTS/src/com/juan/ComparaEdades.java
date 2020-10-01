package com.juan;
import java.util.Comparator;

public class ComparaEdades implements Comparator {
    @Override
    public int compare (Object o1, Object o2){
        return ((Cliente)o1).edad - ((Cliente)o2).edad;
        /*
        Cliente c1 = (Cliente)o1;
        Cliente c2 = (Cliente)o2
        return(c1.edad-c2.edad);
         */
    }
}
