//Ejercicio4-3: Crea un programa que pida un número al
//usuario y diga si es positivo, negativo o cero.
Algoritmo ejercicio4_3
	primernumero ES ENTERO;
	ESCRIBIR "Dime un numero";
	LEER primernumero;
	
	Si primernumero <= 0 Entonces
		Si primernumero=0 Entonces
			ESCRIBIR "El numero es cero";
		SiNo
			ESCRIBIR "El numero es negativo";
		Fin Si
	SiNo
		ESCRIBIR "Es positivo";
	Fin Si
	
FinAlgoritmo