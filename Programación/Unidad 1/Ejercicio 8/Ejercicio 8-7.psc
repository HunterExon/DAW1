//Ejercicio8-7: A partir del ejemplo que dibuja un rect�ngulo de asteriscos, crea un que dibuje
//un cuadrado (deber� pedir s�lo un dato, el lado, y ambas �rdenes "para" deber�n tener ese
//valor como l�mite).
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