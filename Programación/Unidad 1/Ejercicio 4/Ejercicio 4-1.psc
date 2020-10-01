//Ejercicio4-1: Crea un programa que pida dos números al 
//usuario y responda si son iguales o no lo son.
Algoritmo ejercicio4_1
	primernumero ES ENTERO;
	ESCRIBIR "Dime un numero";
	LEER primernumero;
	
	Si primernumero > 0 O primernumero = 0 Entonces
		ESCRIBIR "Es mayor o igual que cero"; 
	SiNo
		ESCRIBIR "Es negativo";
	Fin Si
	
FinAlgoritmo