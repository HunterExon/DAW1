//EJERCICIO 2 (ej2.psc)
//Escribe un programa que cambie un d�gito dentro de un n�mero dando la posici�n
//y el valor nuevo. Las posiciones se cuentan de izquierda a derecha empezando por el 1.
//Ejemplo:
//Por favor, introduzca un n�mero entero positivo: 123456
//Introduzca la posici�n dentro del n�mero: 5
//Introduzca el nuevo d�gito: 7
//	El n�mero resultante es 123476	
//NOTA: Una pista, utilizar las funciones para texto que nos proporciona pseint

Proceso digito
	i,posicion es Entero;
	ntotal,ndigito,ntotal2 es Caracter;
	
	ntotal2="";
	
	Escribir "Por favor, introduzca un n�mero entero positivo: ";
	leer ntotal;
	
	si CONVERTIRANUMERO(ntotal)>0 Entonces
		Escribir "Introduzca la posicion dentro del numero";
		leer posicion;
		Escribir "Introduzca el nuevo d�gito: ";
		Leer ndigito;
		
	Para i<-0 Hasta Longitud(ntotal) Con Paso 1 Hacer
		
		Si i==posicion Entonces
			ntotal2=ntotal2 + ndigito;
		SiNo
			ntotal2=ntotal2 + Subcadena(ntotal,i,i);
			
		Fin Si
		
	Fin Para
	
	Escribir "El n�mero resultante es ", ntota2;
	SiNo
	escribir "NUMERO INCORRECTO"
	FinSi
FinProceso
