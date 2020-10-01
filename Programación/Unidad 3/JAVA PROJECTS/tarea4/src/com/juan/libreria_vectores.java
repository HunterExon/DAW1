package com.juan;

import java.util.Scanner;

public class libreria_vectores {
    public static boolean contiene(int[]a,int n){
        boolean dentro=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                dentro=true;
                break;
            }
        }
        return dentro;
    }

    public static int[] unir (int[]a,int[]b){
        int[]c=new int[a.length+b.length];
        int j=0;
        for(int i=0;i<c.length;i++){
            if(i<a.length){
                c[i]=a[i];
            }else if(j<b.length){
                c[i]=b[j];
                j++;
            }else{
                break;
            }
        }
        return c;
    }

    public static int[] mezclar(int[]a,int[]b){
        int[]c=new int[a.length+b.length];
        int j=0;
        int k=0;
        for(int i=0;i<c.length;i++){
            if(a.length>b.length){
                if(i%2!=0 && j<a.length && k<b.length){
                    c[i]=a[j];
                    j++;
                }else if(i%2==0 && k<b.length){
                    c[i]=b[k];
                    k++;
                }else{
                    c[i]=a[j];
                    j++;
                }
            }else{
                if(i%2!=0 && j<a.length){
                    c[i]=a[j];
                    j++;
                }else if(i%2==0 && k<b.length && j<a.length){
                    c[i]=b[k];
                    k++;
                }else{
                    c[i]=b[j];
                    j++;
                }
            }
        }
        return c;
    }

    public static int ocurrencias(int[]a,int n){
        int total=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                total++;
            }
        }
        return total;
    }

    public static int[] insertar(int[]a,int pos, int n){
        int[]c=new int[a.length+1];
        int auxiliar=n;
        for(int i=0;i<a.length;i++){
            if(i==pos){
                auxiliar=a[i];
                a[i]=n;
            }else if(i>pos) {
                a[i] = auxiliar;
            }
        }
        return c;
    }

    public static int[] ordenar_menor(int[]a){
        int[]c=new int[a.length];
        int auxiliar=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    auxiliar=a[i];
                    a[i]=a[j];
                    a[j]=auxiliar;
                }
            }
        }
        return c;
    }

    public static int[] ordenar_mayor(int[]a){
        int[]c=new int[a.length];
        int auxiliar=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]>a[j]){
                    auxiliar=a[i];
                    a[i]=a[j];
                    a[j]=auxiliar;
                }
            }
        }
        return c;
    }

    public static int inicio_aleatorio(){
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("===========================");
        System.out.println("¿Comienzo del aleatorio?-->");
        System.out.println("===========================");
        n = teclado.nextInt();
        return n;
    }
    public static int fin_aleatorio(){
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("======================");
        System.out.println("¿Fin del aleatorio?-->");
        System.out.println("======================");
        n = teclado.nextInt();
        return n;
    }

    public static boolean quiere_repetidos(int[]a,int i, boolean ejecutado){
        Scanner teclado = new Scanner(System.in);
        boolean repetidos=false;
        boolean error=false;
        String respuesta;

        if(!ejecutado) {
            do {
                System.out.println("¿Quiere que se puedan repetir los numeros? (Sí/No)");
                respuesta = teclado.nextLine();
                respuesta = respuesta.toLowerCase();

                if (respuesta.equals("si") || respuesta.equals("no")) {
                    if (respuesta.equals("si")) {
                        repetidos = true;
                    }
                } else {
                    System.out.println("||=ERROR - Introduzca 'Si' o 'No'=||");
                }
            } while (!(respuesta.equals("si") || respuesta.equals("no")));
        }
        if(repetidos){
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    error = true;
                    break;
                }
            }
        }
        return error;
    }

    public static int[] aleatorio(int[]a) {
        int[]c=new int[a.length];
        int x=0;
        int y=0;
        boolean error;
        boolean ejecutado1=false;
        boolean ejecutado2=false;
        for (int i = 0; i < a.length; i++) {
            do {
                do {
                    if(!ejecutado1 || x>=y) {
                        x = inicio_aleatorio();
                        y = fin_aleatorio();
                        ejecutado1=true;
                    }
                    a[i] = (int) (Math.random() * y + x);
                    if(x>=y){
                        System.out.println("||=ERROR - El inicio del aleatorio debe ser menor=||");
                    }
                }while(x>=y);

                error = false;
                error = quiere_repetidos(a,i,ejecutado2);
                ejecutado2=true;

            } while (error);
        }
        return c;
    }

    public static void impresion_estandar(int[]a){
        for(int i= 0;i<a.length;i++){
            if(i==0){
                System.out.print("{ "+a[i]+"  ");
            }else if(i==a.length-1){
                System.out.print(a[i]+" }");
            }else {
                System.out.print(a[i]+"  ");
            }
        }
    }
    public static void impresion_estandar_caracteres(char[]a){
        for(int i= 0;i<a.length;i++){
            if(i==0){
                System.out.print("{"+a[i]+"");
            }else if(i==a.length-1){
                System.out.print(a[i]+"}");
            }else {
                System.out.print(a[i]);
            }
        }
    }

    public static void rellena(int[]a){
        Scanner teclado = new Scanner(System.in);
        for(int i=0; i<a.length;i++){
                System.out.println("Introduzca el termino "+(i+1)+": ");
                a[i]=teclado.nextInt();
        }
    }

    public static int crear_vector_entero() {
        Scanner teclado = new Scanner(System.in);
        int x;
        do {
            System.out.println("Introduzca el número de terminos del vector: ");
            x = teclado.nextInt();
            if (x <= 0) {
                System.out.println("ERROR - Debe ser entero positivo");
            }
        } while (x <= 0);
        return x;
    }

    public static int cuantos_iguales_dos_vectores(int[]a,int[]b){
        int iguales=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    iguales++;
                    break;
                }
            }
        }
        return iguales;
    }

    public static int[][] matriz_bidimensional(){
        Scanner teclado = new Scanner(System.in);
        int x;
        String respuesta;

        do {
            System.out.println("Introduzca el número de terminos de la matriz cuadrada: ");
            x = teclado.nextInt();
            if (x <= 0) {
                System.out.println("ERROR - Debe ser entero positivo");
            }
        } while (x <= 0);

        int[][]c=new int[x][x];

        respuesta=teclado.nextLine();

        do {
            System.out.println("¿Quiere introducir a mano? (Sí/No)");
            respuesta = teclado.nextLine();
            respuesta = respuesta.toLowerCase();

            if (!(respuesta.equals("si") || respuesta.equals("no"))) {
                System.out.println("||=ERROR - Introduzca 'Si' o 'No'=||");
            }
        } while (!(respuesta.equals("si") || respuesta.equals("no")));

        if(respuesta.equals("si")){
            for(int i=0;i<c.length;i++){
                System.out.println("VECTOR 1");
                System.out.println("========");
                rellena(c[i]);
            }
        }else{
            for(int i=0;i<c.length;i++){
                System.out.println("VECTOR "+(i+1));
                System.out.println("========");
                aleatorio(c[i]);
            }
        }
        return c;
    }

    public static int[][] suma(int[][]a){
        int[][]c=new int[a.length+1][a.length+1];
        int colum = 0;
        int fila = 0;
        int total =0;

        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                if(j==c.length-1 && i!=c.length-1){
                    for(int h=0;h<a.length;h++){
                        colum=colum+a[i][h];
                    }
                    c[i][j]=colum;
                    total=total+colum;
                    colum=0;
                }else if(i==c.length-1){
                    if(j==c.length-1){
                        c[i][j]=total;
                    }else {
                        for (int h = 0; h < a.length; h++) {
                            fila = fila + a[h][j];
                        }
                        c[i][j] = fila;
                        total = total + fila;
                        fila = 0;
                    }
                }else{
                    c[i][j]=a[i][j];
                }
            }
        }
        return c;
    }
}

