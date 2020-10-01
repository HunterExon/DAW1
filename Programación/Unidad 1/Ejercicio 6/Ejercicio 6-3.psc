Algoritmo Ejercicio6_3
	suma, num1, num2 es ENTERO;
	num1=AZAR(101);
	num2=AZAR(101);
	ESCRIBIR "Calcule la suma de ", num1, " y ", num2;
	LEER suma;
	
	Mientras suma<>num1+num2 Hacer
		ESCRIBIR "FALLO. Introduzcalo de nuevo"
		LEER suma;
	Fin Mientras
	ESCRIBIR "CORRECTO";
FinAlgoritmo