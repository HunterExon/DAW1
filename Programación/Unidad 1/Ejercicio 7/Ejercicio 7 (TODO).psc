//Ejercicio7-1: Crea un programa que pida al usuario un código de usuario y una contraseña.
//Deberá repetirse hasta que el código sea "1" y la contraseña sea "1234".
Algoritmo Ejercicio7_1
	pass, cod es ENTERO;
	pass=0;
	cod=0;
	
	Repetir
		ESCRIBIR "Introduce el codigo de usuario";
		LEER cod;
		Si cod <> 1 Entonces
			ESCRIBIR "ERROR. Código incorrecto"
		Fin Si
	Hasta Que cod==1
		
	Repetir
		ESCRIBIR "Introduce la contraseña";
		LEER pass;
		Si pass <> 1234 Entonces
			ESCRIBIR "ERROR. Contraseña incorrecta"
		Fin Si
	Hasta Que pass==1234
	ESCRIBIR "Bienvenido";
FinAlgoritmo


//Ejercicio7-2: Haz un programa que permita calcular la suma de pares de números.
//Pedirá dos números al usuario y mostrará su suma, volviendo a repetir hasta que ambos
//números introducidos sean 0. Esta vez deberás usar "Repetir", por lo que tu solución 
//no será igual que la del ejercicio 6.2, que empleaba "Mientras".
Algoritmo Ejercicio7_2
		num1, num2 es ENTERO;
		num1=1;
		num2=1;
		Repetir
			ESCRIBIR "Introduce el primer numero";
			LEER num1;
			ESCRIBIR "Introduce el segundo numero"
			LEER num2;
			
			ESCRIBIR "La suma es ", num1+num2;
		Hasta Que num1==0 & num2==0
FinAlgoritmo


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
	ESCRIBIR "La division es: ", num1;
FinAlgoritmo
