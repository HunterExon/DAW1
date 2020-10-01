//Pedimos dos numeros por pantalla y debemos calcular
//x^c y c^x

Algoritmo Ejemplo_potencias
	x, c, d, i Es Entero
	ESCRIBIR "Introduzca el primer numero: ";
	LEER x;
	ESCRIBIR "Introduzca el segundo numero: ";
	LEER c;
	
	d=1;
	Para i<-1 Hasta c Con Paso 1 Hacer
		d=d*x
	Fin Para	
	ESCRIBIR "", x, "^", "", c, " = ", "" d;
	
	d=1;
	Para i<-1 Hasta x Con Paso 1 Hacer
		d=d*c
	Fin Para
	ESCRIBIR "", c, "^", "", x, " = ", "" d;
FinAlgoritmo