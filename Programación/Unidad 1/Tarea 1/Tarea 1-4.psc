//EJERCICIO 4 (ej4.psc)
//Escribe un programa que rellene un array de 20 elementos
//con números enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos).
//A continuación el programa mostrará el array y preguntará si el usuario quiere
//resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar
//el array escribiendo los números que se quieren resaltar entre corchetes.	
//Ejemplo:
//	159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13
//¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1
//	159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13	
//NOTA: Utilizar las funciones de pseint para generar los número aleatorios


Proceso multiplo
	Definir array,i,eleccion Como Entero;
	
	Dimension array[20];
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		array[i]<-Aleatorio(1,400);
		Escribir Sin Saltar array[i]," ";
	Fin Para
	
	
	Escribir "";
	Escribir "¿Qué números quiere resaltar? (1- los múltiplos de 5, 2- los múltiplos de 7): ";
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
