//Ejercicio5-1: Haz un programa que pida al usuario un número 
//de día de la semana (del 1 al 7) y escriba el nombre de ese
//día (por ejemplo, "martes" para el día 2). Debes emplear la orden SEGUN.
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
			ESCRIBIR "HA INTRODUCIDO UN NUMERO ERRÓNEO";
	Fin Segun
FinAlgoritmo

//Ejercicio5-2: Crea una variante del ejercicio 5.1, en la que 
//emplees varios SI-ENTONCES en vez de SEGUN.
Algoritmo ejercicio5_2
	dia ES ENTERO;
	ESCRIBIR "Dime un dia de la semana del 1 al 7";
	LEER dia;
	
	Si dia=1 Entonces
		ESCRIBIR "LUNES";
	SiNo
		Si dia=2 Entonces
			ESCRIBIR "MARTES";
		SiNo
			Si dia=3 Entonces
				ESCRIBIR "MIERCOLES";
			SiNo
				Si dia=4 Entonces
					ESCRIBIR "JUEVES";
				SiNo
					Si dia=5 Entonces
						ESCRIBIR "VIERNES";
					SiNo
						Si dia=6 Entonces
							ESCRIBIR "SABADO";
						SiNo
							Si mes=7 Entonces
								ESCRIBIR "DOMINGO";
							SiNo
								ESCRIBIR "HA INTRODUCIDO UN NUMERO ERRÓNEO";
							Fin Si
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
Fin Si
FinAlgoritmo

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


//Ejercicio5-4: Crea una variante del ejercicio 5.3, en la que
//emplees varios SI-ENTONCES en vez de SEGUN.
Algoritmo ejercicio5_4
	mes ES ENTERO;
	ESCRIBIR "Dime un mes del año del 1 al 12";
	LEER mes;
	
	Si mes=1 Entonces
		ESCRIBIR "ENERO";
	SiNo
		Si mes=2 Entonces
			ESCRIBIR "FEBRERO";
		SiNo
			Si mes=3 Entonces
				ESCRIBIR "MARZO";
			SiNo
				Si mes=4 Entonces
					ESCRIBIR "ABRIL";
				SiNo
					Si mes=5 Entonces
						ESCRIBIR "MAYO";
					SiNo
						Si mes=6 Entonces
							ESCRIBIR "JUNIO";
						SiNo
							Si mes=7 Entonces
								ESCRIBIR "JULIO";
							SiNo
								Si mes=8 Entonces
									ESCRIBIR "AGOSTO";
								SiNo
									Si mes=9 Entonces
										ESCRIBIR "SEPTIEMBRE";
									SiNo
										Si mes=10 Entonces
											ESCRIBIR "OCTUBRE";
										SiNo
											Si mes=11 Entonces
												ESCRIBIR "NOVIEMBRE";
											SiNo
												Si mes=12 Entonces
													ESCRIBIR "DICIEMBRE";
												SiNo
													ESCRIBIR "HA INTRODUCIDO UN NUMERO ERRÓNEO";
												Fin Si
											Fin Si
										Fin Si
									Fin Si
								Fin Si
							Fin Si
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo