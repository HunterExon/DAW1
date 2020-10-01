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