//Ejercicio4-4: Haz un programa que pida al
//usuario dos números y diga cuántos 
//de ellos son positivos.
Algoritmo ejercicio4_4
	primernumero ES ENTERO;
	segundonumero ES ENTERO;
	ESCRIBIR "Dime el primer numero";
	LEER primernumero;
	ESCRIBIR "Dime el segundo numero";
	LEER segundonumero;
	
	Si primernumero>=0 Y segundonumero>=0 Entonces
		ESCRIBIR "Los dos son positivos";
	SiNo
		Si primernumero<0 Entonces
			Si segundonumero<0 Entonces
				ESCRIBIR "Los dos son negativos";
			SiNo
				ESCRIBIR "El primero es negativo y el segundo positivo";
			Fin Si
		SiNo
			ESCRIBIR "El segundo es negativo y el primero positivo";
		Fin Si
	Fin Si
	
FinAlgoritmo



