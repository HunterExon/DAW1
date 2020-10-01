//Ejercicio7-3: Prepara un programa que divida dos números que introduzca el usuario.
//Si el segundo número es cero, se le deberá avisar y volver a pedir tantas veces como
//sea necesario, hasta que introduzca un número distinto de cero, momento en que se calculará
//y mostrará el resultado de la división.
Algoritmo Ejercicio7_3
	num1, num2 es ENTERO;
	num1=1;
	num2=1;
	
	ESCRIBIR "Introduce el dividendo";
	LEER num1;
	Repetir
		ESCRIBIR "Introduce el divisor";
		LEER num2;
		Si num2==0 Entonces
			ESCRIBIR "ERROR. El divisor no puede ser 0. Introduzcalo de nuevo";
		Fin Si
	Hasta Que num2<>0
	num1=num1/num2;
	ESCRIBIR "La division es: " num1;
FinAlgoritmo