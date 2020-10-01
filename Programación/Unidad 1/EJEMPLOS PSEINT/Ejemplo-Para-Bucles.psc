//Realizar un algoritmo que sume todos los numeros pares y todos los numeros impares
//menores que 1000
Algoritmo Ejemplo_bucle
	par, impar, i ES ENTERO;
	par=0;
	impar=0;
	
	Para i<-1 Hasta 1000 Con Paso 1 Hacer
		Si i%2=0 Entonces
			par=par+i;
		SiNo
			impar=impar+i;
		Fin Si
	Fin Para
	
	ESCRIBIR "La suma de los pares es: ", par;
	ESCRIBIR "La suma de los impares es: ", impar;
FinAlgoritmo