/*Obtener el valor total a pagar que resulta de sumar a los empleados del departamento 3000 una
bonificación de 500.000, en orden alfabético del empleado*/
SELECT nomEmp, salEmp, (salEmp+comisionE) AS TOTAL, (salEmp+comisionE+500000) AS TOTAL_CON_BENEFICIO FROM empleados WHERE codDepto='3000';

/*Hallar los empleados cuyo nombre no contiene la cadena "MA"*/
SELECT nomEmp FROM empleados WHERE lower(nomemp) NOT LIKE '%ma%';

/*Listar el salario, la comisión, el salario total (salario + comisión), documento de identidad del empleado y nombre,
de aquellos empleados que tienen comisión superior a 1.000.000, ordenar el informe por el número del documento de identidad*/
SELECT salEmp,comisionE,(comisionE+salEmp) AS TOTAL, concat(nomEmp,' | DNI : ',nDIEmp)
AS INFO FROM empleados
WHERE comisionE>1000000
ORDER BY nDIEmp ASC;

/*Obtener el nombre y el departamento de los empleados con cargo 'Secretaria' o 'Vendedor', que no trabajan en el departamento de “PRODUCCION”,
cuyo salario es superior a $1.000.000, ordenados por fecha de incorporación.*/
SELECT e.nomEmp,d.codDepto,d.nombreDpto,e.fecIncorporacion FROM empleados e INNER JOIN departamentos d ON
e.codDepto=d.codDepto WHERE (lower(cargoE)='secretaria' OR lower(cargoE)='vendedor') 
AND (nombreDpto NOT LIKE 'PRODUCCIÓN') AND (salEmp>1000000)
ORDER BY fecIncorporacion;

/*Mostrar cada una de las comisiones y el número de empleados que las reciben. Solo si tiene comisión.*/
SELECT  comisionE, COUNT(*) FROM empleados WHERE comisionE > 0 GROUP BY comisionE;

/*Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.*/
SELECT nomEmp FROM empleados WHERE salEmp >= (SELECT AVG(salEmp) FROM empleados) ORDER BY codDepto;

/*Mostrar el código y nombre de cada jefe, junto al número de empleados que dirige. Solo los que tengan más de dos empleados
y ordenados de mayor a menor*/
SELECT jefeID, nomEmp, COUNT(*) AS NUM_EMPLEADOS FROM empleados GROUP BY jefeID HAVING COUNT(*)>2 ORDER BY COUNT(*);
 