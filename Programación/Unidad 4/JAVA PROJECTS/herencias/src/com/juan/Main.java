package com.juan;

public class Main {

    public static void main(String[] args) {
        HoraExacta r = new HoraExacta(12, 30, 58);
        HoraExacta a = new HoraExacta(12,31,58);
        HoraExacta b = new HoraExacta(21,31,59);
        System.out.println(r.toString());
        for (int i = 1; i <= 61; i++) {
            r.inc();
        }
        System.out.println(r.toString());
        System.out.println(r.equals(a));
        r.setHora(21);
        System.out.println(r.toString());
        System.out.println(r.equals(b));

    }
}
