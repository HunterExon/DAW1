//EJERCICIO 1 (ej1.psc)
//Escribe un algoritmo que calcule el sueldo semanal de un trabajador teniendo en cuenta lo siguiente:
//El sueldo para las primeras 40 horas es 10€
//A partir de la hora 41 (incluida) el trabajado cobrará 15€ hora
//Por ejemplo:
//	Introduzca el número de horas trabajadas durante la semana: 36
//			El sueldo semanal que le corresponde es de 360
//	Introduzca el número de horas trabajadas durante la semana: 50
//			El sueldo semanal que le corresponde es de 550

Proceso sueldo_semanal
	nhoras,i,dinero es Entero;
	
	dinero=0;
	
	Escribir "Introduzca el número de horas trabajadas durante la semana: ";
	Leer num_horas;
	
	Para i<-1 Hasta nhoras Con Paso 1 Hacer
		Si i<=40 Entonces
			dinero=dinero+10;
		SiNo
			dinero=dinero+15;
		Fin Si
	Fin Para
	Escribir "El sueldo semanal que le corresponde es de ", dinero;
FinProceso
