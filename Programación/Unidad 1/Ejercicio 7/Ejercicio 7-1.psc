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