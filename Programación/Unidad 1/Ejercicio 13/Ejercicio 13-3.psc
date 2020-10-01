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