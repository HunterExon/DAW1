Algoritmo multiplosrepetir
	variable, total, contador, num es ENTERO;
	num=0;
	contador=0;
	ESCRIBIR "Introduce el numero del que quieres sacar sus multiplos";
	LEER variable;
	ESCRIBIR "Introduce el numero de multiplos que quieras";
	LEER total;
	
	Repetir
		num=num+variable;
		ESCRIBIR "", num;
		contador=contador+1;
	Hasta Que contador=total
FinAlgoritmo