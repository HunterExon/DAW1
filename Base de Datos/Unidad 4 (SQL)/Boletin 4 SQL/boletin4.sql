--1. Obtener todos los datos de todos los empleados.
SELECT * FROM emple;

--2. Obtener todos los datos de todos los departamentos.
SELECT * FROM depart;

--3. Obtener todos los datos de todos los departamentos ordenados por nombre.
SELECT * FROM depart ORDER BY dnombre;

--4. Obtén los salarios y las comisiones de los empleados del departamento 30.
SELECT apellidos, salario, ifnull(comision, 0) FROM emple WHERE dept_no = 30;

--5. Obtén las comisiones de todos los empleados. Obtén las comisiones de los empleados de forma que no se repitan.
SELECT apellidos, comision FROM emple;

--6. Obtén el nombre de empleado y su comisión SIN FILAS repetidas.
SELECT apellidos, comision FROM emple;

--7. Obtén los nombres de los empleados y sus salarios, de forma que no se repitan filas.
SELECT apellidos, salario FROM emple;

--8. Obtén las comisiones de los empleados y sus números de departamento, de forma que no se repitan filas.
SELECT comisiones, dept_no FROM emple;

--9. Obtén los nuevos salarios de los empleados del departamento 30, que resultarán de sumar a su salario una gratificación de 1000. 
--Muestra también los nombres de los empleados.
SELECT apellidos, salarios+1000 FROM emple WHERE dept_no = 30;

--10. Lo mismo que la anterior, pero mostrando también su salario original, y haz que la columna que almacena 
--el nuevo salario se denomine NUEVO SALARIO.
SELECT apellidos, salario, salario+1000 AS NUEVO SALARIO;

--11. Halla los empleados que tienen una comisión superior a la mitad de su salario.
SELECT apellidos FROM emple WHERE comision>salario/2;

--12. Halla los empleados que no tienen comisión, o que la tengan menor o igual que el 25% de su salario.
SELECT apellidos FROM emple WHERE comision IS NULL OR comision<=salario*0,25;

--13. Obtén una lista de nombres de empleados y sus salarios, de forma que en la salida aparezca en todas las 
--filas \Nombre:" y \Salario:" antes del respectivo campo. Hazlo de forma que selecciones exactamente tres expresiones.
SELECT CONCAT(‘\Nombre: ‘,apellidos), CONCAT(\Salario: ‘, salario) FROM emple;

--14. Hallar el código, salario y comisión de los empleados cuyo código sea mayor que 7500.
SELECT emp_no, salario, comision FROM emple WHERE emp_no>7500;

--15. Obtén todos los datos de los empleados que estén (considerando una ordenación ASCII por nombre) a partir de la J, inclusive.
SELECT * FROM emple WHERE apellidos > J ORDER BY apellidos;

--16. Obtén el salario, comisión y salario total (salario+comisión) de los empleados con comisión, 
--ordenando el resultado por número de empleado.
SELECT salario, comision, salario+comision FROM emple WHERE comision IS NOT NULL
ORDER BY emp_no;

--17. Lista la misma información, pero para los empleados que no tienen comisión.
SELECT salario, comision, salario+IFNULL(comision, 0) FROM emple WHERE comision IS
NULL ORDER BY emp_no;

--18. Muestra el nombre de los empleados que, teniendo un salario superior a 1000, tengan como jefe al empleado cuyo código es 7698.
SELECT apellidos FROM emple WHERE salario>1000 AND dir=7698;

--19. Halla el conjunto complementario del resultado del ejercicio anterior.
SELECT apellidos FROM emple WHERE NOT salario=1000 AND NOT dir=7698;

--20. Indica para cada empleado el porcentaje que supone su comisión sobre su salario, ordenando el resultado por el nombre del mismo.
SELECT apellidos, (comision*100)/salario FROM emple ORDER BY apellidos;

--21. Hallar los empleados del departamento 10 cuyo nombre no contiene la cadena TA.
SELECT apellidos FROM emple WHERE dept_no=10 AND NOT apellidos LIKE ‘%TA%’;

--22. Obtén los empleados que no son supervisados por ningún otro.
SELECT apellidos FROM emple WHERE dir IS NULL;

--23. Obtén los nombres de los departamentos que no sean Ventas (VENTAS)ni investigación (INVESTIGACIÓN). 
--Ordena el resultado por la localidad del departamento.
SELECT dnombre FROM depart WHERE NOT dnombre LIKE ‘VENTAS’ OR NOT dnombre
LIKE ‘INVESTIGACION’ ORDER BY loc;

--24. Deseamos conocer el nombre de los empleados y el código del departamento de los administrativos(EMPLEADOS) 
--que no trabajan en el departamento 10, y cuyo salario es superior a 800, ordenado por fecha de contratación.
SELECT apellidos, dept_no FROM emple WHERE NOT oficio LIKE ‘EMPLEADOS’ AND NOT
dept_no=10 AND salario>800 ORDER BY fecha_alt;

--25. Para los empleados que tengan comisión, obtén sus nombres y el cociente entre su salario y su comisión 
--(excepto cuando la comisión sea cero), ordenando el resultado por nombre.
SELECT apellidos, salario/comision FROM emple WHERE NOT comision IS NULL ORDER BY
apellidos;

--26. Lista toda la información sobre los empleados cuyo nombre completo tenga exactamente 5 caracteres.
SELECT * FROM emple WHERE length(apellidos)=5; --(no coge las ñ)
SELECT * FROM emple WHERE apellidos LIKE ‘_____’;

--27. Lo mismo, pero para los empleados cuyo nombre tenga al menos cinco letras.
SELECT * FROM emple WHERE apellidos LIKE ‘_____%’;

--28. Halla los datos de los empleados que, o bien su nombre empieza por A y su salario es superior a 1000, 
--o bien reciben comisión y trabajan en el departamento 30.
SELECT * FROM emple WHERE (nombre LIKE ‘A%’ AND salario > 1000) OR comision NOT
NULL AND ndpart = 30;

--29. Halla el nombre, el salario y el sueldo total de todos los empleados, ordenando el resultado primero por 
--salario y luego por el sueldo total. En el caso de que no tenga comisión, el sueldo total debe reflejar solo el salario.
SELECT nombre,salario, SUM(salario+IFNULL(comision,0)) FROM emple ORDER BY salario,
SUM(salario+IFNULL(comision,0));

--30. Obtén el nombre, salario y la comisión de los empleados que perciben un salario que está entre la mitad de la 
--comisión y la propia comisión.
SELECT apellidos, salario, comision FROM emple WHERE salario BETWEEN comision/2 AND
comision;

--31. Obtén el complementario del anterior.
SELECT apellidos, salario, comision FROM emple WHERE salario NOT BETWEEN comision/2
AND comision OR comision IS NULL;

--32. Lista los nombres y empleos de aquellos empleados cuyo empleo acaba en ADO y cuyo nombre empieza por A.
SELECT apellidos, oficio FROM emple WHERE oficio LIKE ‘%ADO’ AND apellidos LIKE ‘A%’;

--33. Intenta resolver la pregunta anterior con un predicado simple, es decir, de forma que en la 
--cláusula WHERE no haya conectores lógicos como AND, OR, etc. Si ayuda a resolver la pregunta, 
--se puede suponer que el nombre del empleado tiene al menos cinco letras.

--34. Halla los nombres de los empleados cuyo nombre tiene como máximo cinco caracteres.
SELECT apellidos FROM emple WHERE apellidos LIKE ‘_____’;

--35. Suponiendo que el año próximo la subida del sueldo total de cada empleado sería del 6%, y el siguiente del 7%, halla 
--los nombres y el salario total actual, del año próximo y del siguiente, de cada empleado. Indique además con SI o NO, 
--si el empleado tiene comisión. Si no tiene comisión, el total se considera igual al salario. Se supone que no existen comisiones negativas.
SELECT apellidos, salario, salario+(salario*0,6), salario+(salario*0,7) FROM emple;

--36. Lista los nombres y fecha de contratación de aquellos empleados que no son vendedores.
SELECT apellidos, fecha_alt FROM emple WHERE oficio LIKE ‘VENDEDOR’;

--47. Obtén la información disponible de los empleados cuyo número es uno de los siguientes: 
--7844, 7900, 7521, 7521, 7782, 7934, 7678 y 7369, pero que no sea uno de los siguientes: 7902, 7839, 7499 ni 7878. 
--La sentencia no debe complicarse innecesariamente, y debe dar el resultado correcto 
--independientemente de lo empleados almacenados en la base de datos.
SELECT apellidos FROM emple WHERE emp_no IN (7844, 7900, 7521, 7782, 7934, 7678,
7369);

--48. Ordena los empleados por su código de departamento, y luego de manera descendente por su número de empleado.
SELECT apellidos FROM emple ORDER BY dept_no, emp_no ASC;

--49. Para los empleados que tengan como jefe a un empleado con código mayor que el suyo, obtén los que 
--reciben de salario más de 1000 y menos de 2000,o que están en el departamento 30.
SELECT apellidos FROM emple WHERE dir>emp_no AND salario BETWEEN 1000 AND 2000
OR dept_no=30;

--50. Obtén el salario más alto de la empresa, el total destinado a comisiones y el número de empleados.
SELECT MAX(salario) ‘MAX_SALARIO’, SUM(comision), COUNT(*) FROM emple;
SELECT apellidos, salario FROM emple WHERE salario=(SELECT MAX(salario) FROM emple);
--(para sacar el apellido con salario maximo)

--51. Halla los datos de los empleados cuyo salario es mayor que el del empleado de código 7934, ordenando por el salario.
SELECT apellidos FROM emple WHERE salario>(SELECT salario FROM emple WHERE
emp_no=7934);

--52. Obtén información en la que se reflejen los nombres, empleos y salarios tanto de los empleados que superan en 
--salario a Tovar como del propio Tovar.
SELECT apellidos, oficio, salario FROM emple WHERE salario>=(SELECT salario FROM
emple WHERE apellidos=’TOVAR’);

--53. Halla el nombre del ultimo empleado por orden alfabético.
SELECT apellidos FROM emple ORDER BY apellidos LIMIT 1;

--54. Halla el salario más alto, el más bajo,y la diferencia entre ellos.
SELECT MAX(salario), MIN(salario), MAX(salario)-MIN(salario) FROM emple;

--55. Sin conocer los resultados del ejercicio anterior, ¿Quienes reciben el salario más alto y el más bajo, 
--y a cuánto ascienden estos salarios?
SELECT MAX(salario), MIN(salario) FROM emple;

--56. Considerando empleados con salario menor de 5000, halla la media de los salarios de los departamentos 
--cuyo salario mínimo supera a 900. Muestra también el código y el nombre de los departamentos.
SELECT AVG(SALARIO), apellidos FROM emple, INNER JOIN depart ON (emple.dept_no=depart_no)
WHERE (salario<5000) GROUP BY apellidos HAVING MIN(salario>900);

--57. ¿Qué empleados trabajan en ciudades de más de cinco letras? Ordena el resultado inversamente por ciudades y 
--normalmente por los nombres de los empleados. FUNCIONES DE AGRUPACIÓN 
SELECT apellidos FROM emple JOIN depart ON (emple.dept_no=depart.dept_no)
WHERE loc LIKE '_____%' ORDER BY loc desc, apellidos;

--58. Halla los empleados cuyo salario supera o coincide con la media del salario de la empresa.
SELECT apellidos, salario FROM emple WHERE salario>=(SELECT AVG(salario) FROM
emple);

--59. Obtén los empleados cuyo salario supera al de sus compañeros de departamento.
SELECT apellidos, dept_no, salario FROM emple E1 WHERE salario IN(SELECT MAX(salario)
FROM emple E2 WHERE E1.dept_no=E2.dept_no
GROUP BY E1.dept_no);

--60. ¿Cuántos empleos diferentes, cuántos empleados, y cuántos salarios diferentes encontramos en el departamento 30, 
y a cuánto asciende la suma de salarios de dicho departamento?
SELECT COUNT(DISTINCT oficio), COUNT(*), COUNT(DISTINCT salario, SUM(salario) FROM
emple WHERE dept_no=30;

--61. ¿Cuántos empleados tienen comisión?
SELECT COUNT(*) FROM emple WHERE NOT comision IS NULL;

--62. ¿Cuántos empleados tiene el departamento 20?
SELECT COUNT(*) FROM emple WHERE dept_no=20;

--63. Halla los departamentos que tienen más de tres empleados, y el número de empleados de los mismos.
SELECT dnombre, COUNT(*) FROM emple INNER JOIN depart ON
emple.dept_no=depart.dept_no GROUP BY dnombre HAVING COUNT(*)>=3;

--64. Obtén los empleados del departamento 10 que tienen el mismo empleo que alguien del departamento de Ventas. 
--Desconocemos el código de dicho departamento.
SELECT apellidos FROM emple WHERE oficio IN(SELECT emple.oficio FROM emple INNER
JOIN depart ON emple.dept_no=depart.dept_no WHERE depart.dnombre = 'VENTAS');

--65. Halla los empleados que tienen por lo menos un empleado a su mando, ordenados inversamente por nombre.
SELECT DISTINCT E2.apellidos AS jefe FROM emple E1 INNER JOIN emple E2 ON
E1.dir=E2.emp_no ORDER BY E2.apellidos ASC;

--66. Obtén información sobre los empleados que tienen el mismo trabajo que que algún empleado que trabaje en Sevilla.
SELECT*FROM emple WHERE oficio IN(SELECT oficio FROM emple INNER JOIN depart ON (EMPLE.DEPT_NO=DEPART.DEPT_NO)
WHERE depart.loc='SEVILLA');

--67. ¿Qué oficios distintos encontramos en la empresa, y cuántos empleados desempeñan cada uno de ellos?
SELECT distinct(oficio), count(apellidos) FROM emple GROUP BY oficio;

--68. Halla la suma de salarios de cada departamento.
SELECT SUM(salario) FROM emple GROUP BY dept_no;

--69. Obtén todos los departamentos sin empleados.
SELECT dept_no FROM depart WHERE dept_no NOT IN(select dept_no FROM emple);

--70. Halla los empleados que no tienen a otro empleado a sus órdenes.
SELECT apellidos,emp_no,dir FROM EMPLE
WHERE apellidos NOT IN(SELECT apellidos FROM emple WHERE emp_no IN
(SELECT dir FROM emple WHERE dir IS NOT NULL));

--71. ¿Cuántos empleados hay en cada departamento, y cuál es la media anual del salario de cada uno 
--(el salario almacenado es mensual)? Indique el nombre del departamento para clarificar el resultado.
SELECT apellidos, COUNT(apellidos), AVG(salario*12), dnombre FROM emple
INNER JOIN depart ON(emple.dept_no=depart.dept_no) GROUP BY dnombre;

--72. Halla los empleados del departamento 30, por orden descendente de comisión CONSULTAS DE DOS TABLAS
SELECT apellidos, dept_no, comision FROM emple WHERE dept_no=30 ORDER BY comision DESC;

--73. Obtén los empleados con el departamento en el que trabajan ordenados por el nombre de departamento.
SELECT apellidos,emple.dept_no,depart.dnombre FROM emple
INNER JOIN depart ON(emple.dept_no=depart.dept_no) ORDER BY depart.dnombre;

--74. Obtén los empleados que trabajan en Sevilla o Madrid
SELECT apellidos, emple.dept_no, depart.dept_no,depart.loc FROM emple
INNER JOIN depart ON(emple.dept_no=depart.dept_no)
WHERE DEPART.LOC='MADRID' OR depart.loc='SEVILLA';

--75. Obtén los empleados que trabajan en el departamento de INVESTIGACIÖN.
SELECT apellidos,depart.dnombre,emple.dept_no FROM emple
INNER JOIN depart ON(emple.dept_no=depart.dept_no) WHERE depart.dnombre='INVESTIGACION';

--76. Obtén un listado en el que se reflejen los empleados y los nombres de sus jefes. En el listado deben aparecer 
--todos los empleados, aunque no tengan jefe, poniendo un nulo el nombre de éste.
 
 
--77. Lista los empleados que tengan el mayor salario de su departamento, mostrando el nombre del empleado, 
--su salario y el nombre del departamento.

--78. Deseamos saber cuántos empleados supervisa cada jefe. Para ello, Obtén un listado en el que se reflejen el 
--código y el nombre de cada jefe, junto al número de empleados que supervisa directamente. 
--Como puede haber empleados sin jefe, para estos se indicar sólo el número de ellos, 
--y los valores restantes (código y nombre del jefe) se dejarán como nulos.
SELECT e2.emp_no, e2.apellidos as JEFE, COUNT(*) FROM emple e1 LEFT JOIN emple e2
ON (e1.dir=e2.emp_no) GROUP BY e2.apellidos;

--79. Hallar el departamento cuya suma de salarios sea la más alta, mostrando esta suma de salarios y el nombre del departamento.
SELECT dnombre, sum(salario) FROM depart INNER JOIN emple ON
depart.dept_no=emple.dept_no GROUP BY dnombre ORDER BY sum(salario) desc LIMIT 1;

--80. Obtén los datos de los empleados que cobren los dos mayores salarios de la empresa.
SELECT apellidos, salario+ifnull(comision, 0) FROM emple ORDER BY salario desc LIMIT 2;

2-
ALTER TABLE ADD COLUMN cod_producto VARCHAR(15) AFTER image_last_update;



SELECT e2.pedido_id, e1.pedido_total SUM(e2.unit_price*e2.cantidad) FROM detalles_pedido e2 
INNER JOIN pedidos e1 ON(e1.pedido_total=SUM(e2.unit_price*e2.cantidad) GROUP BY e1.pedido_id;