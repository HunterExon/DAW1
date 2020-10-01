//Ejercicio7-2: Haz un programa que permita calcular la suma de pares de números.
//Pedirá dos números al usuario y mostrará su suma, volviendo a repetir hasta que ambos
//números introducidos sean 0. Esta vez deberás usar "Repetir", por lo que tu solución 
//no será igual que la del ejercicio 6.2, que empleaba "Mientras".
Algoritmo Ejercicio7_2
	num1, num2 es ENTERO;
	num1=1;
	num2=1;
	Repetir
		ESCRIBIR "Introduce el primer numero";
		LEER num1;
		ESCRIBIR "Introduce el segundo numero"
		LEER num2;
		
		ESCRIBIR "La suma es ", num1+num2;
	Hasta Que num1==0 & num2==0
FinAlgoritmo