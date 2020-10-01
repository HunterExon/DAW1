//Realizar un programa que calcule el valor de 1 vector de 10 numeros
Algoritmo funcion1
	i, vector,x Es Entero;
	Dimension vector[10];
	x=0;
	
	vector[0]=1;
	vector[1]=4;
	vector[2]=6;
	vector[3]=2;
	vector[4]=9;
	vector[5]=12;
	vector[6]=31;
	vector[7]=45;
	vector[8]=4;
	vector[9]=2;
	
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		x=x+vector[i];
	Fin Para
	
	ESCRIBIR "La media es: ","",x/10;	
FinAlgoritmo