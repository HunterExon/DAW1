//Solicita un numero y calcula el factorial
Algoritmo Ejemplo_factorial
	x, i, sol  Es Entero
	sol=1;
	ESCRIBIR "Introduzca el numero para obtener el factorial: ";
	LEER x;
	
	ESCRIBIR sin saltar "El factorial de ", "", x, " es "
	Para i<-x Hasta 1 Con Paso -1 Hacer
		Si i==1 Entonces
			ESCRIBIR SIN SALTAR "", i, "  = ";
		SiNo
			ESCRIBIR sin saltar "", i, " x "; 
			sol=sol*i
		Fin Si
	Fin Para
	ESCRIBIR sin saltar "", sol;
	ESCRIBIR "";
FinAlgoritmo