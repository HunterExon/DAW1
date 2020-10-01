--INDICA TODOS LOS DATOS DE LOS USUARIOS (CONSULTA DE PRUEBA)
SELECT * FROM USUARIO;

--¿CUALES SON LAS MATRICULAS DE LOS COCHES Y 
--EL DNI DE LAS PERSONAS DE LOS COCHES VENDIDOS?
SELECT c.matricula, p.dni FROM COCHE c 
INNER JOIN PERSONA p
ON c.persona_dni=p.dni
WHERE fecha_compra IS NOT NULL;

--¿CUANTOS COCHES TIENE LA PERSONA CON NUM_SEG_SOCIAL 44444?
SELECT p.nombre, count(c.matricula) FROM coche c
INNER JOIN PERSONA P
ON c.persona_usuario_id=p.usuario_id
WHERE c.persona_dni=(select p.dni 
from persona p where p.num_seguridad_social='44444') 
GROUP BY p.nombre;

--¿CUALES SON LOS CRIMINALES DE TIPO 1 QUE 
--TIENEN MAS DE 5000 DE DINERO NEGRO?
SELECT p.nombre, c.rango FROM CRIMINAL c 
INNER JOIN PERSONA p 
ON c.persona_dni=p.dni
WHERE c.tipo='TIPO1' AND c.dinero_negro>=5000;

--¿CUANTOS USUARIOS CONTROLA CADA ADMINISTRADOR?
SELECT usuario_id1, count(dni) FROM PERSONA GROUP BY usuario_id1;

--¿CUAL ES LA ID DE LA CASA DE LA PERSONA CON NOMBRE PERSONA1?
SELECT persona_dni, casa_id FROM POSEE p 
WHERE persona_dni=(select dni from persona where nombre='PERSONA1');

--¿CUANTOS OBJETOS TIENE EN SU INVENTARIO EL USUARIO CON NUM_SEG_SOCIAL 11111?
SELECT p.nombre, count(c.objeto_id) FROM CONTENEDOR c
INNER JOIN PERSONA P
ON c.persona_usuario_id=p.usuario_id
WHERE c.persona_dni=(select p.dni from persona p where p.num_seguridad_social='11111') 
GROUP BY p.nombre;

--¿CUALES SON LAS PERSONAS Y EL CARGO DE AQUELLOS QUE TRABAJAN EN EL GOBIERNO?
SELECT p.nombre, t.cargo FROM TRABAJADOR t 
INNER JOIN PERSONA p 
ON t.persona_dni=p.dni
WHERE t.tipo='GOBIERNO';

--¿INDICA LOS OBJETOS QUE TIENE CADA PERSONA?
SELECT p.nombre, o.nombre from contenedor c
INNER JOIN OBJETO o
ON c.objeto_id=o.id
INNER JOIN PERSONA p
ON c.persona_dni=p.dni;

--¿QUIEN ES EL USUARIO CON MÁS DINERO NEGRO?
SELECT c.persona_usuario_id, p.nombre, c.dinero_negro FROM criminal c
INNER JOIN persona p
ON c.persona_usuario_id=p.usuario_id
ORDER BY c.dinero_negro DESC limit 1;

