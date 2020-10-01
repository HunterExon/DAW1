--1. Obtener los datos de los equipos menos los de Valencia y Madrid.
SELECT * FROM equipo;
--2. Calcular el número de jugadores que miden más de 2 metros.
SELECT * FROM jugador WHERE altura >=2;
--3. Calcular el salario medio de todos los jugadores.
SELECT AVG(salario) AS media_salario FROM jugador;
--4. Encontrar el salario más alto, el más bajo y la diferencia entre ambos.
SELECT MAX(salario) AS máximo, MIN(salario) AS mínimo, MAX(salario)-MIN(salario) AS diferencia FROM jugador;
--5. Hallar el número de ciudades en las que hay equipos registrados.
--6. Obtener el salario neto mensual de cada jugador suponiendo un IRPF del 18%.
--7. Obtener los 5 primeros registros de la tabla jugador.
--8. Obtener los datos de los tres últimos equipos clasificados (son 6 equipos en total)
--9. Obtener los datos de partidos de marzo de 2010.
--10. Obtener los datos de los equipos cuyo nombre termine por vocal.
--11. Seleccionar el nombre de los jugadores de los equipos 1 y 2 que jueguen como pivot.
--12. Calcula el número de jugadores de cada equipo (INNER JOIN).
--13. Seleccionar el salario mínimo, máximo de los jugadores y salario medio de los
--jugadores de cada equipo, pero sólo deben aparecer aquellos registros en los que el
--salario máximo sea mayor de 100000 .
--14. Seleccionar el salario medio de cada equipo, pero solo para aquellos cuya media sea superior a 50000.
--15. Número de partidos celebrados cada mes de febrero.
SELECT MONTHNAME(STR_TO_DATE(fecha,'%d-%m-%y')),
COUNT(*)
FROM partido
GROUP BY MONTHNAME(STR_TO_DATE(fecha,'%d-%m-%y'))
HAVING MONTHNAME(STR_TO_DATE(fecha,'%d-%m-%y'))='February';
--16. Id de equipo salario total de cada equipo para equipos con más de 4 jugadores registrados.
SELECT e.id_equipo, SUM(j.salario) AS salario_total
FROM jugador j INNER JOIN equipo e1
ON j.equipo = e.id_equipo
GROUP BY e.id_equipo
HAVING COUNT(j.id_jugador)>4;
--(EXTRA)1. Saca por pantalla el nombre de los equipos que se enfrentran entre sí en un partido.
SELECT p.id_partido, e1.nombre AS 'LOCAL', 	e2.nombre VISITANTE
FROM partido p INNER JOIN equipo e1
ON p.'local'=e1.id_equipo
INNER JOIN equipo e2
ON p.visitante=e2.id_equipo;
--(EXTRA)2. ¿Cuantos partidos ha jugado un equipo?
