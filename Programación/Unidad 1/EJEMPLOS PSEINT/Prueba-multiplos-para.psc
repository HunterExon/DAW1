Algoritmo pruebapara
	variable, total, contador, num es ENTERO;
	num=0;
	ESCRIBIR "Introduce el numero del que quieres sacar sus multiplos";
	LEER variable;
	ESCRIBIR "Introduce el numero de multiplos que quieras";
	LEER total;
	
	Para contador<-1 Hasta total Con Paso 1 Hacer
		num=num+variable;
		ESCRIBIR "", num;
	Fin Para
FinAlgoritmo
	