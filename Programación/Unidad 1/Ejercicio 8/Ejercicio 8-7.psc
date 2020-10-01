//Ejercicio8-7: A partir del ejemplo que dibuja un rectángulo de asteriscos, crea un que dibuje
//un cuadrado (deberá pedir sólo un dato, el lado, y ambas órdenes "para" deberán tener ese
//valor como límite).
Algoritmo Ejercicio8_7
	a, i, c ES ENTERO
	ESCRIBIR "Introduce el lado del cuadrado: "
	LEER a;
	
	Para i<-1 Hasta a Con Paso 1 Hacer
		Para c<-1 Hasta a Con Paso 1 Hacer
			ESCRIBIR Sin Saltar "*";
		Fin Para
		ESCRIBIR "";
	Fin Para
	
FinAlgoritmo