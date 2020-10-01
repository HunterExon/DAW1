//EJERCICIO 4 (ej4.psc)
//Escribe un programa que rellene un array de 20 elementos
//con n�meros enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos).
//A continuaci�n el programa mostrar� el array y preguntar� si el usuario quiere
//resaltar los m�ltiplos de 5 o los m�ltiplos de 7. Seguidamente se volver� a mostrar
//el array escribiendo los n�meros que se quieren resaltar entre corchetes.	
//Ejemplo:
//	159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13
//�Qu� n�meros quiere resaltar? (1 � los m�ltiplos de 5, 2 � los m�ltiplos de 7): 1
//	159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13	
//NOTA: Utilizar las funciones de pseint para generar los n�mero aleatorios


Proceso multiplo
	Definir array,i,eleccion Como Entero;
	
	Dimension array[20];
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		array[i]<-Aleatorio(1,400);
		Escribir Sin Saltar array[i]," ";
	Fin Para
	
	
	Escribir "";
	Escribir "�Qu� n�meros quiere resaltar? (1- los m�ltiplos de 5, 2- los m�ltiplos de 7): ";
	Leer eleccion;
	
	Si eleccion==1 Entonces		
		Para i<-0 Hasta 19 Con Paso 1 Hacer
			Si array[i]%5==0 Entonces
				Escribir Sin Saltar " ","[",array[i],"]"," ";
			SiNo
				Escribir Sin Saltar " ",array[i]," ";
			Fin Si
		Fin Para
		
	SiNo
		si eleccion==2 entonces
			
			Para i<-0 Hasta 19 Con Paso 1 Hacer
				Si array[i]%7==0 Entonces
					Escribir Sin Saltar " ","[",array[i],"]"," ";
				SiNo
					Escribir Sin Saltar " ",array[i]," ";
				Fin Si
			Fin Para
			
			
		SiNo
			
			Escribir "ERROR: NUMERO NO ES NI 5 NI 7";
			
		FinSi
	Fin Si
	
FinProceso
