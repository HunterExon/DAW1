//Ejercicio6-1: Crea un programa que pida al usuario una contraseña, 
//de forma repetitiva mientras que no introduzca "1234". Cuando finalmente
//escriba la contraseña correcta, se le dirá "Bienvenido" y terminará el programa.
Algoritmo Ejercicio6_1
	pass es ENTERO;
	pass=0;
	
	Mientras pass<>1234 Hacer
		ESCRIBIR "Introduce la contraseña";
		LEER pass;
	Fin Mientras
	
	ESCRIBIR "Bienvenido";
FinAlgoritmo