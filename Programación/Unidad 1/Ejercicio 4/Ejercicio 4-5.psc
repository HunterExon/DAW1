//Ejercicio4-5: Crea un programa que pida al usuario dos n�meros y muestre
//su divisi�n si el segundo no es cero, o un mensaje
//de aviso en caso contrario.FinSi
Algoritmo ejercicio4_5
	primernumero ES ENTERO;
	segundonumero ES ENTERO;
	resultado ES ENTERO;
	ESCRIBIR "Dime el primer numero";
	LEER primernumero;
	ESCRIBIR "Dime el segundo numero";
	LEER segundonumero;
	
	Si segundonumero<>0 Entonces
		resultado<- primernumero/segundonumero;
		ESCRIBIR "El resultado es ","", resultado;
	SiNo
		ESCRIBIR "Hay un problema en la operaci�n, el denominador no puede ser cero.";
	Fin Si
	
FinAlgoritmo