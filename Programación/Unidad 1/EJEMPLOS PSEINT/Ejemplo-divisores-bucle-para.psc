//Muestra por pantalla los divisores de un numero solicitado
Algoritmo Ejemplo_divisores
	x, i  Es Entero
	ESCRIBIR "Introduzca el numero del que obtener sus divisores: ";
	LEER x;
	
	ESCRIBIR Sin Saltar "Los divisores de ", "", x, " son " ;
	Para i<-1 Hasta x Con Paso 1 Hacer
		Si x%i=0 Entonces
			Si x==i Entonces
				ESCRIBIR sin saltar "", i;
			SiNo
				ESCRIBIR Sin Saltar "", i, ", ";	
			Fin Si
		FinSi
	Fin Para
	ESCRIBIR "";
FinAlgoritmo