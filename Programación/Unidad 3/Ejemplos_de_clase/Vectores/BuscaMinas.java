package com.jdperez;

public class BuscaMinas {

    public static int buscaminas (int fila, int col, char[][] tablero)  {
        int minas = 0;

        if (tablero[fila][col] =='X') {
            return -1;
        } else {
            for (int i = fila-1 ; i<=fila+1 ;i++) {
                for (int j = col-1; j <=col+1 ; j++) {
                    if (i>=0 && j>=0 && i<tablero.length && j<tablero[i].length) {
                        if (tablero[i][j] == 'X') {
                            minas++;
                        }
                    }

                }
            }
        }

        return minas;
    }
    
    public static void main(String[] args) {
        char[][] tablero = new char[10][10];

        for (int i=0;i<tablero.length;i++) {
            for (int j=0;j<tablero[i].length;j++) {
                int numero = (int) (Math.random()*100+1);

                if (numero>=50) {
                    tablero[i][j] = 'X';
                } else {
                    tablero[i][j] = ' ';
                }
            }
        }

        for (int i=0;i<tablero.length;i++) {
            for (int j=0;j<tablero[i].length;j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }

        System.out.println("Número de minas"+
                buscaminas(0,9,tablero));
    }
}
