//Ejercicio7-1: Crea un programa que pida al usuario un c�digo de usuario y una contrase�a.
//Deber� repetirse hasta que el c�digo sea "1" y la contrase�a sea "1234".
Algoritmo Ejercicio7_1
	pass, cod es ENTERO;
	pass=0;
	cod=0;
	
	Repetir
		ESCRIBIR "Introduce el codigo de usuario";
		LEER cod;
		Si cod <> 1 Entonces
			ESCRIBIR "ERROR. C�digo incorrecto"
		Fin Si
	Hasta Que cod==1
	
	Repetir
		ESCRIBIR "Introduce la contrase�a";
		LEER pass;
		Si pass <> 1234 Entonces
			ESCRIBIR "ERROR. Contrase�a incorrecta"
		Fin Si
	Hasta Que pass==1234
	ESCRIBIR "Bienvenido";
FinAlgoritmo