package com.juan;

public class ejercicio_4 {

    public static int[] filtraPrimos(int[]vector) {
        boolean primo;
        int cont_primos=0;
        int contador;

        for (int i = 0; i < vector.length; i++) {
            primo = true;
            contador = 2;
            do {
                if (vector[i] % contador == 0) {
                    primo = false;
                    break;
                }
                contador++;
            } while (contador < vector[i]);

            if(primo) {
                cont_primos++;
            }
        }

        int[] vector2;

        if(cont_primos==0){
            vector2 = new int[1];
            vector2[0]=-1;
        }else {
            int j=0;
            vector2 = new int[cont_primos];
            for (int i = 0; i < vector.length; i++) {
                primo = true;
                contador = 2;
                do {
                    if (vector[i] % contador == 0) {
                        primo = false;
                        break;
                    }
                    contador++;
                } while (contador < vector[i]);

                if (primo) {
                    vector2[j] = vector[i];
                    j++;
                }
            }
        }
        return vector2;
    }


    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

        int[] resultado=filtraPrimos(vector);
        System.out.print("El resultado de 'filraPrimos' es este: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
