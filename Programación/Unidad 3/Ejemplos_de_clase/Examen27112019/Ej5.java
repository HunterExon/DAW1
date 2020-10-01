package com.jdperez;

import javax.naming.ldap.UnsolicitedNotification;

public class Ej5 {

    public static void main(String[] args) {
        String[] v1 = {"a","b","c","X"};
        String[] v2 = {"d","e","f"};
        String[] v3 = {"a","b","c","d","e","f"};

        v1 = VectoresExamen.unir(v1,v2);
        v3 = VectoresExamen.rotar(v3,3);

        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i]+" ");
        }

        System.out.println();

        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i]+" ");
        }
    }
}
