package com.juan;

import java.util.Scanner;

public class ejercicio_1 {
    public static void mostrar(int[] a) {

        System.out.print("┌─────────┬");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print("────┐");
            } else {
                System.out.print("─────┬");
            }
        }
        System.out.println();
        System.out.print("│Mesa no  ");

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.printf("│ %2d │", (i + 1));
            } else {
                System.out.printf("│  %2d ", (i + 1));
            }
        }
        System.out.println();
        System.out.print("├─────────┼");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print("────┤");
            } else {
                System.out.print("─────┼");
            }
        }
        System.out.println();
        System.out.print("│Ocupación");

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.printf("│ %2d │", (a[i]));
            } else {
                System.out.printf("│  %2d ", (a[i]));
            }
        }
        System.out.println();

        System.out.print("└─────────┴");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print("────┘");
            } else {
                System.out.print("─────┴");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n_mesas;
        int aleatorio;
        int n_comensales;
        boolean mesa_vacia = false;
        boolean lleno = false;

        do {
            System.out.println("=========================================");
            System.out.println("|=Introduzca el número de mesas que hay=|");
            System.out.println("=========================================");
            n_mesas = teclado.nextInt();

            if (n_mesas <= 0) {
                System.out.println("===========================================");
                System.out.println("|=ERROR - Debe tener como mínimo una mesa=|");
                System.out.println("===========================================");
            }
        } while (n_mesas <= 0);

        int[] a = new int[n_mesas];
        for (int i = 0; i < a.length; i++) {
            aleatorio = (int) (Math.random() * 5);
            a[i] = aleatorio;
        }

        do {
            mostrar(a);
            do {
                System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
                n_comensales = teclado.nextInt();

                if (n_comensales > 4) {
                    System.out.println("Lo siento, no admitimos grupos de " + n_comensales + ", haga grupos de 4 personas como máximo e intente de nuevo");
                }
            } while (n_comensales > 4);

            if (n_comensales > 0) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] == 0) {
                        mesa_vacia = true;
                        a[i] = n_comensales;
                        System.out.println("Por favor, siéntense en la mesa número " + (i + 1) + ".");
                        break;
                    }
                }

                if (!mesa_vacia) {
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] + n_comensales <= 4) {
                            a[i] = a[i] + n_comensales;
                            lleno = false;
                            System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (i + 1) + ".");
                            break;
                        } else {
                            lleno = true;
                        }
                    }
                }
                if (lleno) {
                    System.out.println("Lo siento, en estos momentos no queda sitio.");
                }
            } else if (n_comensales < -1) {
                System.out.println("ERROR - Introduzca un término válido");
            }
            mesa_vacia = false;
        } while (n_comensales != -1);
        System.out.println("┌────────┐");
        System.out.println("│SALIENDO|");
        System.out.println("└────────┘");
    }
}
