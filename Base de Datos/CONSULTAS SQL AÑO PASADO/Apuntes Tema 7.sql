CREATE TABLE nombre_tabla(
	Columna1 Tipo_dato,
	Columna2 Tipo_dato,
	...................
);

--EJ:
CREATE TABLE Asignaturas(
	Cod NUMBER(2) PRIMARY KEY,
	Nombre VARCHAR2(15) NOT NULL,
	NumHoras NUMBER(2) CHECK (NumHoras (NumHoras>2)),
);
INSERT INTO Asignaturas
	VALUES (1, 'BD', 6);	
INSERT INTO Asignaturas
	VALUES (2, 'PRO', 8);
INSERT INTO Asignaturas
	VALUES (3, 'SIS', 6);	
INSERT INTO Asignaturas (Cod, NumHoras)
	VALUES (4, 3);
	
	
CREATE TABLE Profesor(
	Cod NUMBER(2) PRIMARY KEY,
	Nombre VARCHAR2(15) NOT NULL,
	Teléfono CHAR(3)
	DEFAULT '123'
);
INSERT INTO Profesor
	VALUES (10,'Pepe',120);
INSERT INTO Profesor (Cod, Nombre)
	VALUES (20,'Rosa');
INSERT INTO Profesor
	VALUES (20,'Eva',333);
INSERT INTO Profesor (Nombre, Teléfono)
	VALUES ('Isa',444);
	
	
CREATE TABLE Curso(
	Cod NUMBER(2),
	Nombre VARCHAR2(15) UNIQUE,
	PRIMARY KEY (Cod),
);
INSERT INTO Curso
	VALUES (100,'1ºDAM');
INSERT INTO Curso
	VALUES (100,'2ºDAM');
	
	
CREATE TABLE Alumnos(
	Cod NUMBER(2) CONSTRAINT FK_ALU PRIMARY KEY,
	Nombre VARCHAR2(15),
	Edad NUMBER (2),
	Curso NUMBER(2) REFERENCES Curso
);
INSERT INTO Alumnos
	VALUES(21,'Ana',25,11);
INSERT INTO Alumnos
	VALUES(22,'Jose',19,13);
INSERT INTO Alumnos
	VALUES(21,'Luis',20,11);