//Ejercicio6-1: Crea un programa que pida al usuario una contrase�a, 
//de forma repetitiva mientras que no introduzca "1234". Cuando finalmente
//escriba la contrase�a correcta, se le dir� "Bienvenido" y terminar� el programa.
Algoritmo Ejercicio6_1
	pass es ENTERO;
	pass=0;
	
	Mientras pass<>1234 Hacer
		ESCRIBIR "Introduce la contrase�a";
		LEER pass;
	Fin Mientras

	ESCRIBIR "Bienvenido";
FinAlgoritmo


//Ejercicio6-2: Haz un programa que permita calcular la suma de pares de n�meros.
//Pedir� dos n�meros al usuario y mostrar� su suma, volviendo a repetir hasta que
//ambos n�meros introducidos sean 0.

Algoritmo Ejercicio6_2
	num1, num2 es ENTERO;
	Mientras num1<>0 & num2<>0 Hacer
		ESCRIBIR "Introduce el primer numero";
		LEER num1;
		ESCRIBIR "Introduce el segundo numero"
		LEER num2;
		
		ESCRIBIR "", num1+num2;
	Fin Mientras
FinAlgoritmo

//Ejercicio6-3: Crea un programa que genere dos n�meros al azar entre el 0 y el 100,
//y pida al usuario que calcule e introduzca su suma. Si la respuesta no es correcta,
//deber� volver a pedirla tantas veces como sea necesario hasta que el usuario acierte.
//Pista: como ver�s en el apartado 10, para generar un n�mero al azar del 0 al 100 puedes
//hacer numero <- AZAR(101)

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





