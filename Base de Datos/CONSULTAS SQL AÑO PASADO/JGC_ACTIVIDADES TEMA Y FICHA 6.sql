--CASO PRACTICO 1
DESC PROFESORES;
	SELECT * FROM PROFESORES;

INSERT INTO PROFESORES(APELLIDOS,ESPECIALIDAD,COD_CENTRO) 
	VALUES ('QUIROGA MARTÍN, A. ISABEL','INFORMÁTICA',45);

INSERT INTO PROFESORES(APELLIDOS,ESPECIALIDAD)
	VALUES ('SECO JIMÉMEZ, ERNESTO','LENGUA');

INSERT INTO PROFESORES(APELLIDOS,ESPECIALIDAD,COD_CENTRO,DNI) 
	VALUES ('GONZALEZ SEVILLA, MIGUEL A.','HISTORIA',22,23444800);

--ACTIVIDAD PROPUESTA 1
INSERT INTO PROFESORES(APELLIDOS,ESPECIALIDAD,COD_CENTRO,DNI) 
	VALUES ('PEREZ MARTÍNEZ, PEPE','SISTEMAS INFORMATICOS',70,75452789);

--CASO PRACTICO 3
UPDATE CENTROS SET DIRECCION='C/PILÓN 13', NUM_PLAZAS=295 
	WHERE COD_CENTRO=22;

UPDATE CENTROS SET DIRECCION='C/PILÓN 13', NUM_PLAZAS=295;

--ACTIVIDAD PROPUESTA 3
UPDATE EMPLE SET SALARIO=SALARIO+100
	WHERE DEPT_NO=10;

UPDATE EMPLE SET COMISION= NVL(COMISION,0+10)
	WHERE DEPT_NO=10;

--EJERCICIOS DE SQL TEMA 6 (FICHA)--

--1
INSERT INTO ASIGNATURAS VALUES ('9','Matemáticas');
INSERT INTO ASIGNATURAS VALUES ('10','Inglés');
INSERT INTO ASIGNATURAS VALUES ('11','Mecanografía');

--2
INSERT INTO ALUMNOS (APENOM, DNI)
	VALUES ('Cantón, David','1288888');
		
--3
UPDATE ALUMNOS SET POBLA='Aranjuez'
	WHERE POBLA='Madrid';

--4
UPDATE ALUMNOS SET DIREC='c\Sol,nº4'
  WHERE DNI='1288888';
  
UPDATE ALUMNOS SET POBLA='Sevilla'
  WHERE DNI='1288888';
  
--5
UPDATE LIBRERIA SET ESTANTE='F'
	WHERE ESTANTE='E';
	
UPDATE ASIGNATURAS SET NOMBRE='Form. y Orient. Laboral'
	WHERE NOMBRE='FOL';
	
--6
UPDATE LIBRERIA SET EJEMPLARES=EJEMPLARES+2
	WHERE TEMA LIKE 'D%' 
	AND (TEMA LIKE '%P%' OR TEMA LIKE '%B%');
	
--7
UPDATE  LIBRERIA SET EJEMPLARES=EJEMPLARES*1.1
	WHERE ESTANTE='B' OR ESTANTE='C';
	
--8
UPDATE NOTAS_ALUMNOS SET NOTA1='8', NOTA2='3'
	WHERE NOMBRE_ALUMNO='Díaz Sánchez, Maria';
	
--9
UPDATE NOTAS_ALUMNOS SET NOTA3=NOTA3+1 WHERE NOTA2=5;

--10
UPDATE NOTAS_ALUMNOS SET NOTA3=NOTA3+1 
	WHERE ((NOTA1+NOTA2+NOTA3)/3)>6;

--11
UPDATE EMPLE SET SALARIO=(SELECT SALARIO FROM EMPLE 
							WHERE APELLIDO='MARTIN'),
				COMISION=(SELECT COMISION*2 FROM EMPLE 
							WHERE APELLIDO='ARROYO')
	WHERE DEPT_NO=(SELECT DEPT_NO FROM DEPART 
					WHERE DNOMBRE='VENTAS') 
	AND OFICIO!='VENDEDOR';

--12
UPDATE EMPLE SET SALARIO=(SELECT SALARIO*1.1 FROM EMPLE 
							WHERE APELLIDO='SALA'),
				 COMISION=(SELECT COMISION*1.1 FROM EMPLE 
							WHERE APELLIDO='SALA')
	WHERE DEPT_NO=(SELECT DEPT_NO FROM DEPART 
					WHERE DNOMBRE='VENTAS') 
	AND OFICIO='VENDEDOR';

--13
DELETE ALUMNOS 
	WHERE POBLA='SEVILLA';

--14
DELETE ASIGNATURAS 
	WHERE COD IN(3,6) 
	AND NOMBRE LIKE 'A%';

--15
DELETE ASIGNATURAS 
	WHERE COD IN(2,5) 
	OR NOMBRE LIKE 'P%';

--16
DELETE EMPLE 
	WHERE OFICIO='ANALISTA' 
	AND DEPT_NO=(SELECT DEPT_NO FROM DEPART WHERE LOC='MADRID');