//Ejercicio4-6: Prepara un programa que pida al usuario tres 
//números y diga cuál es el mayor de los tres.
Algoritmo ejercicio4_6
	primernumero ES ENTERO;
	segundonumero ES ENTERO;
	tercernumero ES ENTERO;
	ESCRIBIR "Dime el primer numero";
	LEER primernumero;
	ESCRIBIR "Dime el segundo numero";
	LEER segundonumero;
	ESCRIBIR "Dime el tercer numero";
	LEER tercernumero;
	
	Si primernumero>segundonumero Entonces
		Si primeronumero>tercernumero Entonces
			ESCRIBIR "El mayor es ", "", primernumero;
		SiNo
			ESCRIBIR "El mayor es ", "", tercernumero;
		Fin Si
	SiNo
		Si segundonumero>tercernumero Entonces
			ESCRIBIR "El mayor es ", "", segundonumero;
		SiNo
			ESCRIBIR "El mayor es ", "", tercernumero;
		Fin Si
	Fin Si
FinAlgoritmo