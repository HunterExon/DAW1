--1 Mostrar el apellido, oficio y número de departamento de cada empleado.
select apellidos,oficio,dept_no from emple;

--2 Mostrar el número, nombre y localización de cada departamento.
select * from depart;
select dept_no,dnombre,loc from depart;

--3 Mostrar todos los datos de todos los empleados.
select * from emple;

--4 Datos de los empleados ordenados por apellidos.
select * from emple order by apellidos;

--5 Datos de los empleados ordenados por número de departamento descendentemente.
select * from emple order by dept_no desc;

--6 Datos de los empleados ordenados por número de departamento descendentemente y dentro de cada departamento ordenados por apellido ascendentemente.
select * from emple order by dept_no desc,apellidos asc;

--8 Mostrar los datos de los empleados cuyo salario sea mayor que 2000000.
select * from emple where salario > 2000000;

--9 Mostrar los datos de los empleados cuyo oficio sea ʻANALISTAʼ.
select * from emple where oficio='ANALISTA';

--10 Seleccionar el apellido y oficio de los empleados del departamento número 20.
select apellidos,oficio from emple where dept_no=20;

--11 Mostrar todos los datos de los empleados ordenados por apellido.
select * from emple order by apellidos;

--12 Seleccionar los empleados cuyo oficio sea ʻVENDEDORʼ. Mostrar los datos ordenados por apellido.
select * from emple where oficio='VENDEDOR' order by apellidos;

--13 Mostrar los empleados cuyo departamento sea 10 y cuyo oficio sea ʻANALISTAʼ. Ordenar el resultado por apellido.
select * from emple where dept_no=10 and oficio='ANALISTA' order by apellidos;

--14 Mostrar los empleados que tengan un salario mayor que 200000 o que pertenezcan al departamento número 20.
select * from emple where salario > 200000 or dept_no=20;

--15 Ordenar los empleados por oficio, y dentro de oficio por nombre.
select * from emple order by oficio,nombre;

--16 Seleccionar de la tabla EMPLE los empleados cuyo apellido empiece por ʻAʼ.
select * from emple where apellidos like 'A%';

--17 Seleccionar de la tabla EMPLE los empleados cuyo apellido termine por ʻZʼ.
select * from emple where apellidos like '%Z';

--18 Seleccionar de la tabla EMPLE aquellas filas cuyo APELLIDO empiece por ʻAʼ y el OFICIO tenga una ʻEʼ en cualquier posición.
select * from emple where apellidos like 'A%' and oficio like '%E%';

--19 Seleccionar los empleados cuyo salario esté entre 100000 y 200000. Utilizar el operador BETWEEN.
select * from emple where salario between 100000 and 200000;

--20 Obtener los empleados cuyo oficio sea ʻVENDEDORʼ y tengan una comisión superior a 100000.
select * from emple where oficio='VENDEDOR' and comision > 100000;

--21 Seleccionar los datos de los empleados ordenados por número de departamento, y dentro de cada departamento ordenados por apellido.
select * from emple order by dept_no,apellidos;

--22 Número y apellidos de los empleados cuyo apellido termine por ʻZʼ y tengan un salario superior a 300000.
select dept_no,apellidos where apellidos like '%Z' and salario > 300000;

--23. Datos de los departamentos cuya localización empiece por ʻBʼ.
select * from depart where loc like 'B%';

--24. Datos de los empleados cuyo oficio sea ʻEMPLEADOʼ, tengan un salario superior a 100000 y pertenezcan al departamento número 10.
select * from emple where oficio='EMPLEADO' and salario > 100000 and dept_no=10;

--25. Mostrar los apellidos de los empleados que no tengan comisión.
select apellidos from emple where oficio is null;

--26. Mostrar los apellidos de los empleados que no tengan comisión y cuyo apellido empiece por ʻJʼ.
select apellidos from emple where apellidos like 'J%' and comision is null;

--27. Mostrar los apellidos de los empleados cuyo oficio sea ʻVENDEDORʼ, ʻANALISTAʼ o ʻEMPLEADOʼ.
select apellidos from emple where oficio='VENDEDOR' or oficio='ANALISTA' or oficio='EMPLEADO';

--28. Mostrar los apellidos de los empleados cuyo oficio no sea ni ʻANALISTAʼ ni ʻEMPLEADOʼ, y además tengan un salario mayor de 200000.
select apellidos from emple where not(oficio='ANALISTA' or oficio='EMPLEADO') and salario > 200000;

--29 Seleccionar de la tabla EMPLE los empleados cuyo salario esté entre 2000000 y 3000000 (utilizar BETWEEN).
select * from emple where salario between 2000000 and 3000000;

--30 Seleccionar el apellido, salario y número de departamento de los empleados cuyo salario sea mayor que 200000 en los departamentos 10 ó 30.
select apellidos,salario,dept_no from emple where salario > 200000 and (dept_no=10 or dept_no=30);

--31. Mostrar el apellido y número de los empleados cuyo salario no esté entre 100000 y 200000 (utilizar BETWEEN).
select apellidos, emp_no from emple where salario not between 100000 and 200000;

--32.Obtener el apellidos de todos los empleados en minúscula.
select lower(apellidos) from emple; 

--33.En una consulta concatena el apellido de cada empleado con su oficio.
select concat(apellidos,oficio) from emple;

--34. Mostrar el apellido y la longitud del apellido (función LENGTH) de todos los empleados, ordenados por la longitud de los apellidos de los empleados descendentemente.
select apellidos, length(apellidos) from emple order by length(apellidos) desc;

--35.Obtener el año de contratación de todos los empleados (función YEAR).
select apellidos, year(fecha_alt) from emple;

--36. Mostrar los datos de los empleados que hayan sido contratados en el año 1992.
select * from emple where year(fecha_alt)=1992;

--37. Mostrar los datos de los empleados que hayan sido contratados en el mes de febrero de cualquier año (función MONTHNAME).
select * from emple where MONTHNAME(fecha_alt)="February";

--38. Para cada empleado mostrar el apellido y el mayor valor del salario y la comisión que tienen. (NO TIENE SENTIDO, HE HECHO EL MAX SALARIO POR DEPARTAMENTO)
select dept_no, apellidos, comision, max(salario) from emple group by dept_no;

--39. Mostrar los datos de los empleados cuyo apellido empiece por 'A' y hayan sido contratados en el año 1990.
select * from emple where apellidos like 'A%' and year(fecha_alt)=1990;

--40. Mostrar los datos de los empleados del departamento 10 que no tengan comisión
select * from emple where dept_no=10 and comision is null;