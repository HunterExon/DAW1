SubProceso resultado <- EsMayor ( n1,n2 )
	resultado Es Logico;
	Si n1>n2 Entonces
		resultado = Verdadero;
	SiNo
		resultado = Falso;
	Fin Si
Fin SubProceso

Algoritmo funcion1
	num1,num2 Es Entero;
	ESCRIBIR "Introduce el primer numero: ";
	LEER num1;
	ESCRIBIR "Introduce el segundo numero: ";
	LEER num2;
	
	Si EsMayor(num1,num2) Entonces
		ESCRIBIR "El primero es mayor";
	SiNo
		ESCRIBIR "El segundo es mayor";
	Fin Si
FinAlgoritmo