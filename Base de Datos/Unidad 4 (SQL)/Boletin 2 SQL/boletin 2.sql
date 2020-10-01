--1 Mostrar todos los datos de todas las personas.
select * from personas;

--2 Obtén el DNI, apellidos y función de todas las personas.
select dni, apellidos, funcion from personas;

--3 Mostrar los apellidos de las personas que vivan en LORCA.
select apellidos from personas where localidad='LORCA';

--4 Mostrar los apellidos de las personas que vivan en MURCIA o LORCA
select apellidos from personas where localidad='MURCIA' or localidad='LORCA';
 
--5 Seleccionar los datos de aquellas personas que vivan en MURCIA y tengan un salario superior a los 1500 euros.
select * from personas where localidad='MURCIA' and salario > 1500;

--6 Mostrar los datos de las personas que vivan en MURCIA, tengan un salario superior a los 1500 euros y sean DIRECTORES.
select * from personas where localidad='MURCIA' and salario > 1500 and oficio='DIRECTOR';

--7 Mostrar los datos de las personas cuya función sea MÉDICO ordenados por apellidos descendentemente.
select * from personas where funcion='MEDICO' order by apellidos desc;

--8 Mostrar los datos de todas las localidades que hay en la tabla personas sin repeticiones (debes emplear la cláusula DISTINCT)
select distinct Localidad from personas;

--9 Mostrar los datos de las personas que tengan un salario superior a 1500 euros y sean médicos. Ordenar la salida por salario descendentemente.
select * from personas where salario > 1500 and funcion='MEDICO' order by salario desc;

--10 Seleccionar aquellas personas cuyo apellido comience por M.
select * from personas where apellidos like 'M%';

--11 Mostrar los datos de las personas que tengan una M en el apellido y cuya función sea CONSERJE
select * from personas where apellidos like '%M%' and funcion='CONSERJE';

--12 Mostrar aquellas personas que tengan un salario entre 1500 y 200 euros.
select * from personas where salario between 1500 and 200;

--13 Seleccionar los datos de aquellas personas cuya función sea MÉDICO o DIRECTOR (utilizar el operador IN)
select * from personas where funcion IN ('MEDICO','DIRECTOR');

--14 Obtener los datos de aquellas personas cuya función no sea CONSERJE (utilizar el operador NOT IN) y tengan un salario superior a los 1500 euros, ordenados por apellido descendentemente.
select * from personas where funcion not in ('CONSERJE') AND salario > 1500 order by apellidos desc;

--15 Mostrar los datos de las personas que sean de MURCIA o CARTAGENA y que pertenezcan al hospital número 1.
select * from personas where localidad in ('MURCIA','CARTAGENA') and cod_hospital=1;

--16 Obtén los apellidos en mayúsculas de las personas que trabajen en el hospital número 1.
select UPPER(apellidos) from personas where cod_hospital=1;

--17 Con una consulta devuelve los apellidos de todas las personas. Al lado debe aparecer la longitud de cada apellido.
select apellidos, length(apellidos) from personas;

--18 Obtener los apellidos y localidad en minúscula de todas aquellas personas que no trabajen en el hospital número 1.
select lower(apellidos), lower(localidad) from personas where not cod_hospital=1;

--19 Obtener los datos de las personas que trabajen en los hospitales 1 ó 2 y tengan un salario superior a 1500 euros.
select * from personas where cod_hospital in (1,2) and salario > 1500;

--20 Visualizar los datos de aquellas personas que no trabajen en el hospital número 2 y que sean de MURCIA. 
select * from personas where not cod_hospital=2 and localidad='MURCIA';