//Ejercicio13-2: Crea un programa que pida dos n�meros enteros al usuario 
//y diga si alguno de ellos es m�ltiplo del otro. Crea una funci�n EsMultiplo 
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