/*
-Iniciar el servicio.
-Abrir CMD como administrador.
-Escribir "mysql -u root -p"
-Ingresar la pass "root"
-Escribir "show databases;"
-Escribir "use empleados;"
-Escribir "show tables;"
-Escribir "describe emple;"
-Escribir "describe depart;"
-EMPEZAR A HACER CONSULTAS-
*/

select * from cat; --Mostramos todos los datos de la tabla cat.
select * from emp; --Mostramos todos los datos de la tabla emp.

describe emp; --Con este comando mostramos el diseño de la tabla.

select empno, ename from emp
	order by ename desc; --Aquí seleccionamos empno y ename de la tabla emp y lo ordenamos descendentemente.

select empno, ename, job, deptno from emp
	where deptno=10; --Aquí seleccionamos todos los datos puestos de la tabla emp donde uno de ellos (deptno) vale 10.
	
select empno, ename, job, deptno from emp
	where deptno=10 AND job='PRESIDENT'; --Aquí hacemos lo mismo que arriba solo que además tiene que tener de trabajo "PRESIDENT".
	
select empno, ename, job, deptno from emp
	where deptno=10 OR job='MANAGER'; --Aquí es casi igual que arriba, pedimos todos los datos pero ahora nos devuelve
									--aquellos con el valor 10 en deptno o el trabajo "MANAGER".
	
select empno, ename, job, deptno from emp
	where deptno=10 OR job='MANAGER' AND deptno=20; --No hace falta poner el paréntesis porque prioriza el AND, 
													--sin embargo si queremos podemos hacerlo por sintaxis que lo da por bueno.
	
select * from emp
	where comm is not null; --Aquí seleccionamos todas los datos donde "comm" tiene valor.
	
select * from emp
	where comm is not null AND sal > 1500; --Aquí estamos seleccionando todas las que tienen comisión y el salario es mayor 1500.
	
select * from emp
	where deptno=10 OR deptno=20; --Aquí selecciona todos los datos de aquellos cuyo deptno sea 10 o 20.
	
select * from emp
	where deptno in (10,20); --Es lo mismo que el anterior solo que simplificado, poniendo la lista de posibles valores entre paréntesis.
	
select * from emp
	where sal>=2000 AND sal<=4000; --Aquí se piden los datos donde sal esté comprendido entre 2000 y 4000.

select * from emp
	where sal between 2000 AND 4000; --Exactamente igual que arriba solo que con between.
	
select * from emp
	where sal between 2000 AND 4000
	AND deptno=20; --Exactamente igual que arriba solo que filtrando ademas solo los del deptno=20.

select * from emp
	where ename like 'A%'; --Aquí nos entrega todos los datos de aquellos que su nombre empieza por A. El "%" es lo mismo que el "*" en acces,
						   --es decir, es igual a "lo que sea".
						   
select * from emp
	where ename like 'A%N'; --Lo mismo que arriba pero ahora empieza por "A" y termina por "N".
	
select * from emp
	where ename like '_A%'; --Esto lo que indica es que coja los datos de aquellos cuyo nombre tenga una A en la segunda posición.
							--El "_" es lo mismo que el "?" en acces, es decir, significa "cualquier caracter pero solo uno".
							
