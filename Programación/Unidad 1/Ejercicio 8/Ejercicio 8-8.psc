//Ejercicio8-8: Dibuja un triángulo creciente de asteriscos, del tamaño que indique el usuario.
//Por ejemplo, si escoge 4, el resultado debería ser:
//*
//**
//***
//****
Algoritmo Ejercicio8_8
	a, i, c, d ES ENTERO
	ESCRIBIR "Introduce la altura del triangulo: "
	LEER a;
	c=1;
	
	Para d<-1 Hasta a Con Paso 1 Hacer
		Para i<-1 Hasta c Con Paso 1 Hacer
			ESCRIBIR Sin Saltar "*";
		Fin Para
		c=c+1;
		ESCRIBIR "";		
	Fin Para
FinAlgoritmo