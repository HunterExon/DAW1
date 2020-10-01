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


//Ejercicio13-2: Crea un programa que pida dos números enteros al usuario 
//y diga si alguno de ellos es múltiplo del otro. Crea una función EsMultiplo 
//que te ayude a que el proceso principal sea legible.
SubProceso resultado <- EsMultiplo ( n1,n2 )
	resultado es LOGICO;
	Si n2%n1=0 O n1%n2=0 Entonces
		resultado=Verdadero;
	SiNo
		resultado=Falso;
	Fin Si
	
Fin SubProceso


Algoritmo funcion1
	num1,num2 ES ENTERO;
	ESCRIBIR "Introduzca el primer numero:";
	LEER num1;
	ESCRIBIR "Introduzca el segundo numero:";
	LEER num2;
	
	Si EsMultiplo(num1,num2)==Verdadero Entonces
		Escribir "Uno de los dos es multiplo del otro"
	SiNo
		ESCRIBIR "Ninguno es multiplo del otro";
	Fin Si	
FinAlgoritmo




//Ejercicio13-3: Crea una función EsPar que devuelva el valor lógico "verdadero" 
//o "falso" según si el número que se indique como parámetro es par o no lo es.
SubProceso resultado <- EsPar ( n1 )
	resultado es LOGICO;
	Si n1%2=0 Entonces
		resultado=Verdadero;
	SiNo
		resultado=Falso;
	Fin Si
	
Fin SubProceso


Algoritmo funcion1
	num1 ES ENTERO;
	ESCRIBIR "Introduzca el numero:";
	LEER num1;
	
	Si EsPar(num1)==Verdadero Entonces
		Escribir "El numero es par"
	SiNo
		ESCRIBIR "El numero es impar";
	Fin Si	
FinAlgoritmo
