//EJERCICIO 3 (ej3.psc)
//Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
//Ejemplo:
//Por favor, introduzca la altura del reloj de arena: 7 
//	*******
//	 *****
//	  ***
//	   *
//	  ***
//	 *****
//	*******

//[HACERLO ENTERO DE NUEVO]


Proceso reloj_arena
	altura, i,u es Entero;
	Escribir "Por favor, introduzca la altura del reloj de arena: ";
	Leer altura;
		
	Mientras  altura%2=0 O altura<3 hacer
		Escribir "Tiene que ser mayor que 3 e impar: ";
		Escribir "Por favor, introduzca la altura del reloj de arena: ";
		Leer altura;
	fin mientras;
	
	Para i<-altura Hasta 1 Con Paso -2 Hacer
		secuencia_de_acciones
	Fin Para
	SiNo
		Escribir "ERROR. DATO NO CORRECTO";
	Fin Si	
FinProceso
