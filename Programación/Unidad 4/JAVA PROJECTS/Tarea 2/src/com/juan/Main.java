package com.juan;

public class Main {
    public static void main(String[] args) {
        lista lista=new lista();
        lista.insertPpio(2);
        lista.insertPpio(1);
        lista.insertFinal(3);
        lista.insertFinal(4);
        lista.insertFinal(5);
        lista.insertFinal(6);
        lista.insertFinal(7);
        lista.insertFinal(8);
        lista.insertFinal(9);
        lista.insertPpio(0);
        System.out.println(lista.toString());
    }
}
