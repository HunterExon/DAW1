//Ejercicio5-1: Haz un programa que pida al usuario un n�mero 
//de d�a de la semana (del 1 al 7) y escriba el nombre de ese
//d�a (por ejemplo, "martes" para el d�a 2). Debes emplear la orden SEGUN.
Algoritmo ejercicio5_1
	dia ES ENTERO;
	ESCRIBIR "Dime un dia de la semana del 1 al 7";
	LEER dia;
	
	Segun dia Hacer
		1:
			ESCRIBIR "LUNES";
		2:
			ESCRIBIR "MARTES";
		3:
			ESCRIBIR "MIERCOLES";
		4:
			ESCRIBIR "JUEVES";
		5:
			ESCRIBIR "VIERNES";
		6:
			ESCRIBIR "SABADO";
		7:
			ESCRIBIR "DOMINGO";
		De Otro Modo:
			ESCRIBIR "HA INTRODUCIDO UN NUMERO ERR�NEO";
	Fin Segun
FinAlgoritmo