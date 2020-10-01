//Ejercicio8-1: Crea un programa que escriba los n�meros del 5 al 15,
//ambos incluidos.
Algoritmo Ejercicio8_1
	i Es Entero
	Para i<-5 Hasta 15 Con Paso 1 Hacer
		ESCRIBIR "", i;
	Fin Para
FinAlgoritmo

	
//Ejercicio8-2: Crea un programa que escriba los m�ltiplos del 3,
//desde el 3 hasta el 30, usando un paso de tama�o 3.
Algoritmo Ejercicio8_2
	i Es Entero
	Para i<-3 Hasta 30 Con Paso 3 Hacer
		ESCRIBIR "", i;
	Fin Para
FinAlgoritmo


//Ejercicio8-3: Crea un programa que escriba los m�ltiplos del 3,
//desde el 3 hasta el 30, contando del uno al diez pero mostrando
//ese contador multiplicado por tres.
Algoritmo Ejercicio8_3
	i Es Entero
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		ESCRIBIR "", i*3;
	Fin Para
FinAlgoritmo


//Ejercicio8-4: Crea un programa que escriba los n�meros del 20 al 10,
//descendiendo.
Algoritmo Ejercicio8_4
	i Es Entero
	Para i<-20 Hasta 10 Con Paso -1 Hacer
		ESCRIBIR "", i;
	Fin Para
FinAlgoritmo
	
//Ejercicio8-5: Crea un programa que escriba la tabla de multiplicar del 5:
//desde "5 x 0 = 0" hasta "5 x 10 = 50"
Algoritmo Ejercicio8_5
	i Es Entero
	a ES ENTERO 
	a=0;
	Para i<- Hasta 10 Con Paso 1 Hacer
		ESCRIBIR "5 x ", a, " = ", i*5;
		a=a+1;
	Fin Para
FinAlgoritmo

		
//Ejercicio8-6: Tambi�n se puede contar usando una orden "mientras" o una orden
//"repetir", si usas una variable como contador e incrementas (o disminuyes) su valor
//en cada pasada de forma manual. Compru�balo creando un programa que escriba los n�meros
//del 1 al 15 usando "mientras" en vez de "para".
Algoritmo Ejercicio8_6
	i ES ENTERO
	i=1;
	Mientras i<=15 Hacer
		ESCRIBIR "", i;
		i=i+1;
	Fin Mientras
FinAlgoritmo

			
			
			
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

			
//Ejercicio8-8: Dibuja un tri�ngulo creciente de asteriscos, del tama�o que indique el usuario.
//Por ejemplo, si escoge 4, el resultado deber�a ser:
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