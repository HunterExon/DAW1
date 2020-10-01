package com.juan;
/*
Queremos hacer las clases necesarias para gestionar el funcionamiento de una Pizzería.
-Todas esas clases estarán en el mismo paquete.
-Los atributos de las clases sólo podrán ser accedidos desde la misma clase.

-La pizzería únicamente sirve Pizzas de las que guardaremos el tamaño (size) que podrá
ser (mediana o familiar) y una lista de hasta 3 ingredientes (no más).
-En caso de no especificar el tamaño todas las pizzas serán de tamaño familiar.
-Esta clase debe tener un método de clase que nos muestre por pantalla todos
los tamaños disponibles para la clase Pizza.

-De los ingredientes únicamente nos interesa el nombre del mismo y el
número de calorías cada 100 gramos.
-En caso de que al crear un ingrediente no se especifique nada el
ingrediente será "Queso" con "250" calorías por cada 100 gramos.

En todo momento debemos:
-Poder saber cuantos ingredientes tiene una Pizza.
-Añadir un ingrediente (si tenemos menos de 3  en caso contrario
esa operación nos devolverá false. No compruebo si está repetido o no).
-Mostrar toda la información de la pizza (tamaño e ingredientes)

-La pizzería guarda todas las pedidos que se le realizan.
-Los pedidos únicamente contendrán una pizza.
-De esos pedidos nos interesa saber la pizza que se pidió y el momento que se realizó
(que es el momento en el que se crea el pedido).
-Como el producto estrella es la "Pizza familiar con jamón ibérico y queso"
deberemos disponer de alguna forma para agilizar la creación de ese tipo de pedidos.
-Para guardar el momento preciso de la creación del pedido usad
Calendar (http://www.w3api.com/wiki/Java:Calendar.getInstance())

Deberemos por tanto:
-Inicialmente reservar espacio para 5 pedidos, aunque si vamos a abrir
una Pizzería con más capacidad podremos darle una capacidad inicial distinta.
-En caso de sobrepasar esa capacidad iremos añadiendo más espacio para guardarlos si es necesario.
-Podremos añadir pedidos.
-Podré mostrar todos los pedidos realizados a la pizzería.
-Podré mostrar la cantidad de pedidos que se han realizado.
*/
public class Main {

    public static void main(String[] args) {
        Ingredientes salami = new Ingredientes("salami",100);
        Ingredientes salchichas = new Ingredientes("salchicha",50);
        Ingredientes queso = new Ingredientes();
        Ingredientes jamon = new Ingredientes("jamon",75);
        Ingredientes cebolla = new Ingredientes("cebolla",25);
        Pizza carbonara = new Pizza (Pizza.size.MEDIANA);

        System.out.println(carbonara.MostrarTamanios());
        System.out.println(carbonara.MostrarDatos());

        carbonara.AddIngredientes(cebolla);
        carbonara.AddIngredientes(queso);
        System.out.println(carbonara.MostrarDatos());
        carbonara.AddIngredientes(jamon);
        System.out.println(carbonara.MostrarDatos());
        carbonara.AddIngredientes(salami);
        carbonara.AddIngredientes(salchichas);
        System.out.println(carbonara.MostrarDatos());


    }
}
