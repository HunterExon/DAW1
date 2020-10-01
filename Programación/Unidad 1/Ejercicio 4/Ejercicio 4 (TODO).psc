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


//Ejercicio4-2: Haz una variante del ejemplo 004b,
//usando el operador ">=".
Algoritmo ejercicio4_2
	primernumero ES ENTERO;
	ESCRIBIR "Dime un numero";
	LEER primernumero;
	
	Si primernumero >= 0 Entonces
		ESCRIBIR "Es mayor o igual que cero"; 
	SiNo
		ESCRIBIR "Es negativo";
	Fin Si
	
FinAlgoritmo

//Ejercicio4-3: Crea un programa que pida un número al
//usuario y diga si es positivo, negativo o cero.
Algoritmo ejercicio4_3
	primernumero ES ENTERO;
	ESCRIBIR "Dime un numero";
	LEER primernumero;
	
	Si primernumero <= 0 Entonces
		Si primernumero=0 Entonces
			ESCRIBIR "El numero es cero";
		SiNo
			ESCRIBIR "El numero es negativo";
		Fin Si
	SiNo
		ESCRIBIR "Es positivo";
	Fin Si
	
FinAlgoritmo


//Ejercicio4-4: Haz un programa que pida al
//usuario dos números y diga cuántos 
//de ellos son positivos.
Algoritmo ejercicio4_4
	primernumero ES ENTERO;
	segundonumero ES ENTERO;
	ESCRIBIR "Dime el primer numero";
	LEER primernumero;
	ESCRIBIR "Dime el segundo numero";
	LEER segundonumero;
	
	Si primernumero>=0 Y segundonumero>=0 Entonces
		ESCRIBIR "Los dos son positivos";
	SiNo
		Si primernumero<0 Entonces
			Si segundonumero<0 Entonces
				ESCRIBIR "Los dos son negativos";
			SiNo
				ESCRIBIR "El primero es negativo y el segundo positivo";
			Fin Si
		SiNo
			ESCRIBIR "El segundo es negativo y el primero positivo";
		Fin Si
	Fin Si
	
FinAlgoritmo



//Ejercicio4-5: Crea un programa que pida al usuario dos números y muestre
//su división si el segundo no es cero, o un mensaje
//de aviso en caso contrario.FinSi
Algoritmo ejercicio4_5
	primernumero ES ENTERO;
	segundonumero ES ENTERO;
	resultado ES ENTERO;
	ESCRIBIR "Dime el primer numero";
	LEER primernumero;
	ESCRIBIR "Dime el segundo numero";
	LEER segundonumero;
	
	Si segundonumero<>0 Entonces
		resultado<- primernumero/segundonumero;
		ESCRIBIR "El resultado es ","", resultado;
	SiNo
		ESCRIBIR "Hay un problema en la operación, el denominador no puede ser cero.";
	Fin Si
	
FinAlgoritmo


//Ejercicio4-6: Prepara un programa que pida al usuario tres 
//números y diga cuál es el mayor de los tres.
Algoritmo ejercicio4_6
	primernumero ES ENTERO;
	segundonumero ES ENTERO;
	tercernumero ES ENTERO;
	ESCRIBIR "Dime el primer numero";
	LEER primernumero;
	ESCRIBIR "Dime el segundo numero";
	LEER segundonumero;
	ESCRIBIR "Dime el tercer numero";
	LEER tercernumero;

	Si primernumero>segundonumero Entonces
		Si primeronumero>tercernumero Entonces
			ESCRIBIR "El mayor es ", "", primernumero;
		SiNo
			ESCRIBIR "El mayor es ", "", tercernumero;
		Fin Si
	SiNo
		Si segundonumero>tercernumero Entonces
			ESCRIBIR "El mayor es ", "", segundonumero;
		SiNo
			ESCRIBIR "El mayor es ", "", tercernumero;
		Fin Si
	Fin Si
FinAlgoritmo
