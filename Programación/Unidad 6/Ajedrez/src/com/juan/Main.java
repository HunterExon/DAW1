package com.juan;

public class Main {

    public static void main(String[] args) {
        /*
Nos piden crear una serie de clases para manipular las fichas de los juegos de mesa.
La idea es disponer de una clase abstracta general que englobe el concepto de pieza de
tablero y contenga las características básicas inherentes a una pieza de tablero:
posicionX, posicionY, color (puede ser BLANCO o NEGRO).

Sus subclases son:
Pieza de ajedrez. Nuevamente será una clase abstracta. Se trata de una pieza "móvil",
es decir, que se puede mover en el tablero.
Pieza de damas. Es una clase instanciable, pues pueden existir objetos de tipo "ficha
de las damas". También se trata de una pieza que puede ser movida.
Pieza del juego de los barquitos. También será una clase instanciable, aunque no
compartirá con las otras dos anteriores la capacidad de ser móvil, ya que su posición
será fija durante toda la partida.

Crea la interfaz Movible, que será implementada únicamente por las clases anteriores
que se correspondan con piezas que pueden moverse. Esta interfaz incluirá los siguientes métodos:
boolean esMovible (int x, int y). Este método indicará si es posible mover la pieza
a las coordenadas que se le indican.
void mover (int x, int y). Este método moverá (si es posible) la pieza a las
coordenadas que se le indican. Si no le es posible, no hará ningún cambio en la pieza.

Ahora bien, cada clase implementará estos métodos de una manera diferente según
se trate de un tipo de pieza u otro:
En el caso de las piezas de las damas, consideraremos válido el movimiento
diagonal hacia adelante o hacia atrás tantas posiciones como se quiera:
movimiento damas
En el caso de las piezas del ajedrez, cada pieza (peón, alfil,...) tiene unas
reglas de movimiento diferentes, por lo que sería necesario definir una clase
por cada tipo de pieza diferente del ajedrez para que implemente sus reglas de
movimiento. Por razones de tiempo solo implementaremos la clase Torre, cuyo
movimiento se realiza de esta forma:

Algunas consideraciones que debemos tener en cuenta sobre el desarrollo de estas clases son:
Crea los constructores que consideres, teniendo en cuenta que no deben existir
constructores que permitan crear piezas con valores inválidos y si ello fuera a
suceder, asignaremos valores por defecto a los atributos (los que decidas) .
Respecto a los métodos get y set de los atributos posicionX, posicionY, color,
¿deberían ser en este caso todos públicos? Por ejemplo, ¿tiene sentido poder
hacer un setColor una vez creada la pieza? ¿tiene sentido hacer setPosicionX o para hacer
eso deberíamos usar algún método más específico?

La clase PiezaTablero debe sobrescribir el método toString para que desde el programa
principal se pueda mostrar en pantalla el contenido (ubicación y color) de cualquier objeto
que herede de ella.
Para cualquier tipo de pieza (barquitos, ajedrez, damas) se supone un tablero de 8x8
donde la casilla inferior izquierda tendrá las coordenadas (1,1) y la superior derecha (8,8).
Esto significa que los métodos de la interfaz Movible deben tenerlo en cuenta a la hora de
analizar la posibilidad de un movimiento (para no salirse del tablero).
Comenta el código con explicaciones útiles sobre las decisiones que hayas tomado, así
como el sentido de los atributos, y todo lo que facilite la comprensión del codigo
Una vez tengamos lista esta biblioteca de clases tendremos que hacer un pequeño programa
que pruebe parte de la funcionalidad de esos elementos. Para ello desarrollaremos una
aplicación que rellene un array de piezas movibles con distintos objetos de cada una
de las piezas disponibles que pueden moverse para después intentar aplicarles algún
movimiento y observar si ese movimiento es posible o no. Una vez realizados los
movimientos posibles, debe mostrarse el array de tal forma que veamos cada una de las piezas.
         */
    }
}
