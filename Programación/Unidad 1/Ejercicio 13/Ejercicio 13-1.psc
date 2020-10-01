//Ejercicio13-1: Crea un procedimiento EscribirCentrado, que reciba como
//parámetro un texto y lo escriba centrado en pantalla (suponiendo una 
//anchura de 80 columnas; pista: deberás escribir 40 - longitud/2 espacios 
//antes del texto).
SubProceso EscribirCentrado ( text )
	x,i ES ENTERO;
	x=LONGITUD(text);
	
	Para i<-1 Hasta (80-x)/2 Con Paso 1 Hacer
		ESCRIBIR Sin Saltar " ";
	Fin Para
	
	ESCRIBIR Sin Saltar "" text;
	
	Para i<-1 Hasta (80-x)/2 Con Paso 1 Hacer
		ESCRIBIR Sin Saltar " ";
	Fin Para
Fin SubProceso

Algoritmo funcion1
	text1 ES CARACTER;
	ESCRIBIR "Introduzca el texto a centrar: ";
	LEER text1;
	
	EscribirCentrado(text1);
	
FinAlgoritmo