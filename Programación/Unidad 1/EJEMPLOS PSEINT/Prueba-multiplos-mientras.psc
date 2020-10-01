Algoritmo multiplosmientras
	variable, total, contador, num es ENTERO;
	num=1;
	contador=0;
	ESCRIBIR "Introduce el numero del que quieres sacar sus multiplos";
	LEER variable;
	ESCRIBIR "Introduce el numero de multiplos que quieras";
	LEER total;

	Mientras contador<total Hacer
		Si num%variable=0 Entonces
			ESCRIBIR "", num;
			contador=contador+1;
		Fin Si
		num=num+1;
	Fin Mientras	
FinAlgoritmo
