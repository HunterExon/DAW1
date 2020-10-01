----------------------------------------------------------EJERCICIOS CONSULTAS SIMPLES----------------------------------------------------
--Hacer todas las actividades de consultas hasta la pag 63 (PAG 23 PDF)--
--CASO PRÁCTICO 3--
--Empleados del departamento 20 ordenado por apellido:
SELECT EMP_NO, APELLIDO, OFICIO, DEPT_NO FROM EMPLE
	WHERE DEPT_NO = 20
	ORDER BY APELLIDO;

--Empleados que son analistas, ordenados por el nº de empleado:
SELECT * FROM EMPLE
	WHERE OFICIO = 'ANALISTA'
	ORDER BY EMP_NO;

--Empleados del departamento 10 que son analistas, ordenado or apellido y nºempleado de forma descendente:
SELECT * FROM EMPLE
	WHERE DEPT_NO = 10 AND OFICIO = 'ANALISTA'
	ORDER BY APELLIDO DESC, EMP_NO DESC;

--------ACTIVIDAD PROPUESTA 3----------
--Datos de todos los alumnos--
SELECT * FROM ALUM0405;

--Obtener DNI, NOMBRE, APELLIDOS, CURSO, NIVEL y CLASE--
SELECT DNI, NOMBRE, APELLIDOS, CURSO, NIVEL, CLASE FROM ALUM0405;

--Todos los datos de los alumnos con población en Guadalajara--
SELECT * FROM ALUM0405
	WHERE POBLACION = 'GUADALAJARA';

--Nombre y apellidos de los alumnos con población en Guadalajara--
SELECT NOMBRE, APELLIDOS FROM ALUM0405
	WHERE POBLACION = 'GUADALAJARA';

--Como el segundo, pero ordenados ascendentemente tanto apellidos como nombre
SELECT DNI, NOMBRE, APELLIDOS, CURSO, NIVEL, CLASE FROM ALUM0405
	ORDER BY APELLIDOS ASC, NOMBRE ASC;

--CASO PRÁCTICO 4--
--Uso de alias para los campos DNOMBRE y DEPT_NO--
SELECT DNOMBRE "Departamento", DEPT_NO "Número Departamento" FROM DEPART;

--CASO PRÁCTICO 5--
--Datos de la tabla NOTAS_ALUMNOS--
SELECT * FROM NOTAS_ALUMNOS;

--Nota media de los alumnos de la tabla NOTAS_ALUMNOS (añadimos alias a los campos)
SELECT NOMBRE_ALUMNO "Nombre Alumno", (NOTA1+NOTA2+NOTA3)/3 "Nota Media" FROM NOTAS_ALUMNOS;

--CASO PRÁCTICO 6--
--Nombres de alumnos de NOTAS_ALUMNOS que tienen un 7 en NOTA 1 y su media es mayor que 6:
SELECT NOMBRE_ALUMNO FROM NOTAS_ALUMNOS
	WHERE NOTA1 = 7 AND (NOTA1+NOTA2+NOTA3)/3 >6;

--CASO PRÁCTICO 7--
--Apellidos de la tabla EMPLE que empiecen por J:--
SELECT APELLIDO FROM EMPLE
	WHERE APELLIDO LIKE 'J%';

--Apellidos de la tabla EMPLE que tengan una R en la segunda posición:--
SELECT APELLIDO FROM EMPLE
	WHERE APELLIDO LIKE '_R%';

--Apellidos de la tabla EMPLE que empiecen por A y tengan una O:
SELECT APELLIDO FROM EMPLE
	WHERE APELLIDO LIKE 'A%O%';

--Descripción de la tabla LIBRERIA:--
DESC LIBRERIA;

--Filas de la tabla LIBRERIA donde el tema sea LABORES (con =):--
SELECT * FROM LIBRERIA
	WHERE TEMA = 'LABORES';

--Exactamente igual pero con LIKE:--
SELECT * FROM LIBRERIA
	WHERE TEMA LIKE 'LABORES';

--CASO PRÁCTICO 8--
--Apellidos de la tabla EMPLE donde el departamento sea 10 o 30--
SELECT APELLIDO FROM EMPLE
	WHERE DEPT_NO IN(10,30);

--Apellidos de la tabla EMPLE donde el departamento no sea ni 10 ni 30--
SELECT APELLIDO FROM EMPLE
	WHERE DEPT_NO NOT IN(10,30);

--Apellidos de la tabla EMPLE donde el oficio sea VENDEDOR, ANALISTA o EMPLEADO--
SELECT APELLIDO FROM EMPLE
	WHERE OFICIO IN('VENDEDOR', 'ANALISTA', 'EMPLEADO');

--Apellidos de la tabla EMPLE donde el departamento no sea ni VENDEDOR, ni ANALISTA ni EMPLEADO--
SELECT APELLIDO FROM EMPLE
	WHERE OFICIO NOT IN('VENDEDOR', 'ANALISTA', 'EMPLEADO');

--CASO PRÁCTICO 9--
--Apellido y salario de los Empleados de la tabla EMPLE donde el salario está entre 1500 y 2000--
SELECT APELLIDO, SALARIO FROM EMPLE
	WHERE SALARIO BETWEEN 1500 AND 2000;

--Apellido y salario de los Empleados de la tabla EMPLE donde el salario no está entre 1500 y 2000--
SELECT APELLIDO, SALARIO FROM EMPLE
	WHERE SALARIO NOT BETWEEN 1500 AND 2000;

--CASO PRÁCTICO 1O--
--Apellido, salario y numero de departamento de los Empleados de la tabla EMPLE donde el salario es mayor de 2000 y estan en los departamentos 10 o 20--
SELECT APELLIDO, SALARIO, DEPT_NO FROM EMPLE
	WHERE SALARIO >2000 AND (DEPT_NO = 10 OR DEPT_NO = 20);

SELECT APELLIDO, SALARIO, DEPT_NO FROM EMPLE
	WHERE SALARIO >2000 AND DEPT_NO = 10 OR DEPT_NO = 20;

SELECT APELLIDO, SALARIO, DEPT_NO FROM EMPLE
	WHERE SALARIO >2000 AND DEPT_NO IN (10, 20);
	
	
	
----------------------------------------------------------EJERCICIOS SUBCONSULTAS---------------------------------------------------------
--Hacer todas las actividades de subconsultas desde la pag 64 (PAG 24 PDF) hasta el final menos la 6 de la pag 73 (PAG 33 PDF)--

--CASO PRÁCTICO 11--
--Apellido de los empleados con el mismo oficio que 'GIL'--
SELECT APELLIDO FROM EMPLE
	WHERE OFICIO = (SELECT OFICIO FROM EMPLE
						WHERE APELLIDO = 'GIL');
						
--------ACTIVIDAD PROPUESTA 4----------
--Apellido, oficio, salario y fecha de alta de aquellos con oficio igual que jimenez o con salario mayor que fernandez--
SELECT APELLIDO, OFICIO, SALARIO, FECHA_ALT FROM EMPLE
	WHERE OFICIO = (SELECT OFICIO FROM EMPLE
						WHERE APELLIDO = 'JIMENEZ') 
	OR SALARIO >= (SELECT SALARIO FROM EMPLE
						WHERE APELLIDO = 'FERNANDEZ');
						
--CASO PRÁCTICO 12--
--Datos empleados que trabajen en madrid o barcelona--
SELECT * FROM EMPLE
	WHERE DEPT_NO IN (SELECT DEPT_NO FROM DEPART
						WHERE LOC IN ('MADRID','BARCELONA'));--Se pone IN porque estamos seleccionando varios datos validos.
						
--Igual que el anterior solo que esta vez con un OR--
SELECT * FROM EMPLE
	WHERE DEPT_NO IN (SELECT DEPT_NO FROM DEPART
						WHERE LOC = 'MADRID' OR LOC = 'BARCELONA'); --Se pone IN porque estamos seleccionando varios datos validos.
						
--Apellidos y Oficio de todos los empleados del departamento 20 cuyo trabajo sea identico al de cualquiera de los empleados del departamento de ventas.--
SELECT APELLIDO, OFICIO FROM EMPLE
	WHERE DEPT_NO = 20
	AND OFICIO IN (SELECT OFICIO FROM EMPLE
						WHERE DEPT_NO = (SELECT DEPT_NO FROM DEPART
											WHERE DNOMBRE = 'VENTAS'));
												
--Apellido Y salario de los empleados con el mismo oficio y salario que GIL--
SELECT APELLIDO, SALARIO FROM EMPLE
	WHERE OFICIO = (SELECT OFICIO FROM EMPLE
						WHERE APELLIDO = 'GIL')
	AND SALARIO = (SELECT SALARIO FROM EMPLE
						WHERE APELLIDO = 'GIL');

--Igual que el anterior pero mas compacto--
SELECT APELLIDO, SALARIO FROM EMPLE
	WHERE (OFICIO,SALARIO) = (SELECT OFICIO,SALARIO FROM EMPLE
									WHERE APELLIDO = 'GIL');
									
--------ACTIVIDAD PROPUESTA 5----------
--Apellidos y oficios de los empleados que tienen el mismo trabajo que jimenez.--
SELECT APELLIDO, OFICIO FROM EMPLE
	WHERE OFICIO = (SELECT OFICIO FROM EMPLE
						WHERE APELLIDO = 'JIMENEZ');

--Apellido, oficio y salario de los empleados del departamento de fernandez con el mismo salario que este.--
SELECT APELLIDO, OFICIO, SALARIO FROM EMPLE
	WHERE (DEPT_NO,SALARIO) = (SELECT DEPT_NO,SALARIO FROM EMPLE
						WHERE APELLIDO = 'FERNANDEZ');
						
--CASO PRÁCTICO 13--
--Apellido, oficio, numero de empleado (emp_no), nombre de departamento (dnombre) y localidad.--
SELECT APELLIDO,OFICIO,EMP_NO,DNOMBRE,LOC FROM EMPLE,DEPART
	WHERE EMPLE.DEPT_NO = DEPART.DEPT_NO;
	
--Nombre de Alumno, asignatura y nota.--
SELECT APENOM,NOTA,NOMBRE FROM ALUMNOS,NOTAS,ASIGNATURAS
	WHERE ALUMNOS.DNI = NOTAS.DNI
	AND NOTAS.COD = ASIGNATURAS.COD;
	
--Nombre de los Alumnos matriculados en FOL--
SELECT APENOM FROM ALUMNOS
	WHERE DNI IN (SELECT DNI FROM NOTAS
					WHERE COD = (SELECT COD FROM ASIGNATURAS
									WHERE NOMBRE = 'FOL'));
									
--------ACTIVIDAD PROPUESTA 6----------
--Nombre de los alumnos que tengan una nota entre 7 y 8 en la asignatura de FOL.--
SELECT APENOM FROM ALUMNOS
	WHERE DNI IN (SELECT DNI FROM NOTAS
					WHERE COD = (SELECT COD FROM ASIGNATURAS
									WHERE NOMBRE = 'FOL')
					AND NOTA BETWEEN 7 AND 8);
					
--Nombre Y NOTA de los alumnos que tengan una nota entre 7 y 8 en la asignatura de FOL.--
SELECT APENOM,NOTA FROM ALUMNOS,NOTAS
	WHERE ALUMNOS.DNI = NOTAS.DNI
	AND COD = (SELECT COD FROM ASIGNATURAS
					WHERE NOMBRE = 'FOL')
	AND NOTA BETWEEN 7 AND 8;
	
--Nombre de asignaturas que no tengan suspensos.--
SELECT DISTINCT NOMBRE FROM ASIGNATURAS,NOTAS
	WHERE ASIGNATURAS.COD = NOTAS.COD
	AND NOMBRE NOT IN (SELECT NOMBRE FROM ASIGNATURAS,NOTAS
							WHERE ASIGNATURAS.COD = NOTAS.COD
							AND NOTA BETWEEN 0 AND 4);
	
--------ACTIVIDADES COMPLEMENTARIAS----------
/* 1 */ sql> select apellido,oficio,loc from emple,depart 
			 where oficio='ANALISTA';
			 
/* 2 */sql> select * from emple 
			where oficio='EMPLEADO'
			and dir=(select emp_no from emple 
					 where apellido='CEREZO');
					 
/* 3 */sql> select * from emple 
			where oficio='EMPLEADO' 
			and dept_no=(select dept_no from depart 
						 where dnombre='VENTAS');
						 
/* 4 */sql> select * from depart 
			where dept_no not in(select dept_no from emple);
			
/* 5 */sql> select * from depart 
			where dept_no in(select dept_no from emple);
			
/* 7 */sql> select * from libreria 
			where ejemplares between 8 and 15;
			
/* 8 */sql> select * from libreria 
			where estante not between 'B' and 'D';
			
/* 9 */sql> select tema from libreria 
			where ejemplares< (select ejemplares from libreria 
								where tema='MEDICINA');
								
/* 10 */sql> select tema from libreria 
			 where ejemplares not between 15 and 20;
			 
/* 11 */sql> select asignaturas.nombre from asignaturas,alumnos,notas 
		where asignaturas.cod=notas.cod and notas.dni=alumnos.dni 
		and nombre like '%o%o%o%' and pobla='Madrid';
		
/* 12 */ select apenom from alumnos,notas 
		 where alumnos.dni=notas.dni 
		 and pobla='Madrid' and nota<5;
		 
/* 13 */ select apenom from asignaturas,alumnos,notas 
		 where asignaturas.cod=notas.cod and notas.dni=alumnos.dni 
		 and nota in (select nota from notas 
					  where nombre='fol'
					  and apenom='Díaz Fernández, María');
					  
/* 14 */ select * from asignaturas 
		 where nombre not in (select nombre from asignaturas,notas 
							  where asignaturas.cod=notas.cod);
							  
/* 15 */ select apenom from alumnos,notas 
		 where notas.dni=alumnos.dni and cod=1;
		 
/* 16 */ select apenom from alumnos 
		 where apenom not in(select apenom from alumnos,notas 
							 where notas.dni=alumnos.dni 
							 and cod=1);	