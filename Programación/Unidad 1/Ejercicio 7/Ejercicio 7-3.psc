//Ejercicio7-3: Prepara un programa que divida dos n�meros que introduzca el usuario.
//Si el segundo n�mero es cero, se le deber� avisar y volver a pedir tantas veces como
//sea necesario, hasta que introduzca un n�mero distinto de cero, momento en que se calcular�
//y mostrar� el resultado de la divisi�n.
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