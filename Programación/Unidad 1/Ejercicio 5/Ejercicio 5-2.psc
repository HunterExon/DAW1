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