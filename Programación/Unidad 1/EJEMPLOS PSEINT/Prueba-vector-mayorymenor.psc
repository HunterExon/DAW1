//Calcular el mayor elemento del array y cual el menor
Algoritmo funcion1
	i, vector,menor,mayor Es Entero;
	Dimension vector[10];
	vector[0]=5;
	vector[1]=4;
	vector[2]=6;
	vector[3]=2;
	vector[4]=9;
	vector[5]=12;
	vector[6]=31;
	vector[7]=45;
	vector[8]=4;
	vector[9]=2;
	
	menor=vector[0];
	mayor=vector[0];
	Para i<-1 Hasta 9 Con Paso 1 Hacer
		Si vector[i]<menor Entonces
			menor=vector[i];
		SiNo
			Si vector[i]>mayor Entonces
				mayor=vector[i];
			Fin Si
		Fin Si
	Fin Para
	
	ESCRIBIR "El mayor es: ","",mayor;
	ESCRIBIR "El menor es: ","",menor;
FinAlgoritmo