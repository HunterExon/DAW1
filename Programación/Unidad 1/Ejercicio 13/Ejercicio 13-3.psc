//Ejercicio13-3: Crea una funci�n EsPar que devuelva el valor l�gico "verdadero" 
//o "falso" seg�n si el n�mero que se indique como par�metro es par o no lo es.
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