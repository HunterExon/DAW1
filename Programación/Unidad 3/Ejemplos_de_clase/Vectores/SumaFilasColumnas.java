package com.jdperez;

public class SumaFilasColumnas {
    public static int[][] suma(int[][] v) {
        int[][] result = new int[v.length+1][v.length+1];
        int sumaTotal = 0;

        for (int i = 0;i<v.length;i++) {
            int suma = 0;
            for (int j = 0; j<v[i].length;j++)  {
                result[i][j] = v[i][j];
                suma = suma +v[i][j];
            }

            result[i][v.length] = suma;
            sumaTotal += suma;
        }

        for (int i = 0;i<v.length;i++) {
            int suma = 0;
            for (int j = 0; j<v[i].length;j++)  {
                suma = suma + v[j][i];
            }

            result[v.length][i] = suma;
            sumaTotal += suma;

        }

        result[v.length][v.length] = sumaTotal;

        return result;
    }


    public static void main(String[] args) {
        int[][] vector = new int[4][4];
        int[][] resultado;


        for (int i = 0;i<vector.length;i++) {
            for (int j = 0; j<vector[i].length;j++)  {
                vector[i][j] = (int) (Math.random()*10+1);
            }
        }


        for (int i = 0;i<vector.length;i++) {
            for (int j = 0; j<vector[i].length;j++)  {
                System.out.print(vector[i][j]+" ");
            }
            System.out.println();
        }

        resultado = suma(vector);

        for (int i = 0;i<resultado.length;i++) {
            for (int j = 0; j<resultado[i].length;j++)  {
                System.out.print(resultado[i][j]+" ");
            }
            System.out.println();
        }




    }
}
