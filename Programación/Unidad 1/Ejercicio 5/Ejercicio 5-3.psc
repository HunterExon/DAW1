//Ejercicio5-3: Crea un programa que pida un número al usuario un
//número de mes (por ejemplo, el 4) y escriba el nombre del mes 
//correspondiente (por ejemplo, "abril"). Debes usar la orden SEGUN.
Algoritmo ejercicio5_3
	mes ES ENTERO;
	ESCRIBIR "Dime un mes del año del 1 al 12";
	LEER mes;
	
	Segun dia Hacer
		1:
			ESCRIBIR "ENERO";
		2:
			ESCRIBIR "FEBRERO";
		3:
			ESCRIBIR "MARZO";
		4:
			ESCRIBIR "ABRIL";
		5:
			ESCRIBIR "MAYO";
		6:
			ESCRIBIR "JUNIO";
		7:
			ESCRIBIR "JULIO";
		8:
			ESCRIBIR "AGOSTO";
		9:
			ESCRIBIR "SEPTIEMBRE";
		10:
			ESCRIBIR "OCTUBRE";
		11:
			ESCRIBIR "NOVIEMBRE";
		12:
			ESCRIBIR "DICIEMBRE";
		De Otro Modo:
			ESCRIBIR "HA INTRODUCIDO UN NUMERO ERRÓNEO";
	Fin Segun
FinAlgoritmo