--De la BD se tienen las siguientes tablas con su información:

/*
TABLA DIRECCION
Id_Direccion Int Clave primaria. No nulo
Direccion Varchar(45) No nulo
Ciudad Varchar(45) No nulo
Pais Varchar(45) No nulo
*/
CREATE TABLE DIRECCION(
	Id_Direccion INT PRIMARY KEY NOT NULL,
	Direccion VARCHAR(45) NOT NULL,
	Ciudad VARCHAR(45) NOT NULL,
	Pais VARCHAR(45) NOT NULL
);

/*
TABLA CATEGORIA
Id_Categoria Int Clave primaria. No nulo. Autoincremental
Nombre Varchar(45) No nulo
*/
CREATE TABLE CATEGORIA(
	Id_Categoria INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	Nombre VARCHAR(45) NOT NULL
);


/*
TABLA CLIENTE
Id_Cliente Int Clave primaria. No nulo
Nombre Varchar(45) No nulo
Apellido Varchar(45) No nulo
Fecha_Nac Date No nulo
Direccion Int Clave foránea, referencia a Id_Direccion. No nulo
*/
CREATE TABLE CLIENTE(
	Id_Cliente INT PRIMARY KEY NOT NULL,
	Nombre VARCHAR(45) NOT NULL,
	Apellido VARCHAR(45) NOT NULL,
	Fecha_Nac DATE NOT NULL,
	FK_Direccion INT NOT NULL,
	FOREIGN KEY (FK_Direccion) REFERENCES direccion(Id_Direccion)
);

/*
TABLA PELICULA
Id_Pelicula Int Clave primaria. No nulo. Autoincremental
Nombre Varchar(45) No nulo
Duracion Int No nulo
Descripcion Blob
Año Int No nulo
Categoria Int Clave foránea, referencia a Id_Categoria. No nulo
*/
CREATE TABLE PELICULA(
	Id_Pelicula INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	Nombre VARCHAR(45) NOT NULL,
	Duracion INT NOT NULL,
	Descripcion BLOB,
	Año INT NOT NULL,
	FK_Categoria INT,
	FOREIGN KEY (FK_Categoria) REFERENCES CATEGORIA(Id_Categoria) ON DELETE CASCADE
);

/*
TABLA INVENTARIO
Id_Inventario Int Clave primaria. No nulo. Autoincremental
Disponible Tinyint(1) Por defecto 1 (disponible)
Pelicula Int Clave foránea, referencia a Id_Pelicula. No nulo
*/
CREATE TABLE INVENTARIO(
	Id_Inventario INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	Disponible TINYINT(1) DEFAULT 1,
	FK_Pelicula INT,
	FOREIGN KEY (FK_Pelicula) REFERENCES PELICULA(Id_Pelicula) ON DELETE CASCADE
);

/*
TABLA ALQUILER
Id_Alquiler Int Clave primaria. No nulo. Autoincremental
Fech_Alquiler Date
Fech_Devolucion Date
Cliente Int Clave foránea, referencia a Id_Cliente. No nulo
Inventario Int Clave foránea, referencia a Id_Inventario. No nulo
*/
CREATE TABLE ALQUILER(
	Id_Alquiler INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	Fech_Alquiler DATE,
	Fech_Devolucion DATE,
	FK_Cliente INT,
	FK_Inventario INT,
	FOREIGN KEY (FK_CLIENTE) REFERENCES CLIENTE(Id_Cliente) ON DELETE CASCADE,
	FOREIGN KEY (FK_INVENTARIO) REFERENCES INVENTARIO(Id_Inventario) ON DELETE CASCADE
);

/*
1. Crear inicialmente todas las tablas, con todas sus columnas. No indicar las claves foráneas.
2. Modificar todas las tablas que tengan clave foránea, haciéndolo así constar.
*/



--ALQUILER DE PELICULAS – DATOS

/*
TABLA DIRECCION
Id_Direccion Direccion Ciudad Pais
1 Urgel,11 Valencia España
2 Casanovas,15 Talavera España
3 Muntaner,20 Madrid España
4 Madrid,98 Zaragoza España
*/
INSERT INTO DIRECCION
	VALUES (1,"Urgel,11","Valencia","España");
INSERT INTO DIRECCION
	VALUES (2,"Casanovas,15","Talavera","España");
INSERT INTO DIRECCION
	VALUES (3,"Muntaner,20","Madrid","España");
INSERT INTO DIRECCION
	VALUES (4,"Madrid,98","Zaragoza","España");

/*
TABLA CATEGORIA
Id_Categoria Nombre
1 Infantil
2 Comedia
3 Thriller
4 Miedo
5 Clasica
6 Musical
*/

INSERT INTO CATEGORIA
	VALUES (1,"Infantil");
INSERT INTO CATEGORIA
	VALUES (2,"Comedia");
INSERT INTO CATEGORIA
	VALUES (3,"Thriller");
INSERT INTO CATEGORIA
	VALUES (4,"Miedo");
INSERT INTO CATEGORIA
	VALUES (5,"Clasica");
INSERT INTO CATEGORIA
	VALUES (6,"Musical");

/*
TABLA CLIENTE
Id_Cliente Nombre Apellido Fech_Nac Direccion
1 María Arnal 07/11/1970 1
2 Pedro Arnal 15/06/1968 1
3 Andrés Arnal 25/01/1990 1
4 Teresa Aliaga 01/05/1959 2
5 Tomás Martín 18/05/1980 3
6 Claudio Pesto 28/12/1947 4
7 Petra Pesto 29/01/1973 4
*/
INSERT INTO CLIENTE
	VALUES (1,"María","Arnal","1970/11/07",1);
INSERT INTO CLIENTE
	VALUES (2,"Pedro","Arnal","1968/06/15",1);
INSERT INTO CLIENTE
	VALUES (3,"Andrés","Arnal","1990/01/25",1);
INSERT INTO CLIENTE
	VALUES (4,"Teresa","Aliaga","1959/05/01",2);
INSERT INTO CLIENTE
	VALUES (5,"Tomás","Martín","1980/05/18",3);
INSERT INTO CLIENTE
	VALUES (6,"Claudio","Pesto","1947/12/28",4);
INSERT INTO CLIENTE
	VALUES (7,"Petra","Pesto","1973/01/29",4);


/*
TABLA PELICULA
ID_Pelicula Nombre Duracion Descripcion Año Categoria
1 El resplandor 146 1980 4
2 Grease 110 1978 6
3 Cabaret 123 1972 6
4 Cars 116 2006 1
5 Los otros 104 País: España 2001 3
*/
INSERT INTO PELICULA (Id_Pelicula, Nombre, Duracion, Año, FK_Categoria)
	VALUES (1,"El resplandor",146,1980,4);
INSERT INTO PELICULA (Id_Pelicula, Nombre, Duracion, Año, FK_Categoria)
	VALUES (2,"Grease",110,1978,6);
INSERT INTO PELICULA (Id_Pelicula, Nombre, Duracion, Año, FK_Categoria)
	VALUES (3,"Cabaret",123,1972,6);
INSERT INTO PELICULA (Id_Pelicula, Nombre, Duracion, Año, FK_Categoria)
	VALUES (4,"Cars",116,2006,1);
INSERT INTO PELICULA
	VALUES (5,"Los otros",104,"País: España",2001,3);
	
/*
TABLA INVENTARIO
ID_Inventario Disponible Pelicula
1 1 3
2 1 5
3 1 4
4 1 2
5 0 1
*/
INSERT INTO INVENTARIO
	VALUES (1,1,3);
INSERT INTO INVENTARIO
	VALUES (2,1,5);
INSERT INTO INVENTARIO
	VALUES (3,1,4);
INSERT INTO INVENTARIO
	VALUES (4,1,2);
INSERT INTO INVENTARIO
	VALUES (5,0,1);


/*
TABLA ALQUILER
ID_Alquiler Fech_Alquiler Fech_Devolucion Cliente Inventario
1 07/04/2003 21/04/2003 2 3
2 14/04/2003 28/04/2003 6 2
3 10/06/2003 24/06/2003 2 1
4 14/06/2003 24/06/2003 5 3
5 05/08/2003 29/08/2003 1 2
*/
INSERT INTO ALQUILER
	VALUES (1,"2003/04/07","2003/04/21",2,3);
INSERT INTO ALQUILER
	VALUES (2,"2003/04/14","2003/04/28",6,2);
INSERT INTO ALQUILER
	VALUES (3,"2003/06/10","2003/06/24",2,1);
INSERT INTO ALQUILER
	VALUES (4,"2003/06/14","2003/06/24",5,3);
INSERT INTO ALQUILER
	VALUES (5,"2003/08/05","2003/08/29",1,2);

--CONSULTAS SIMPLES

--1. Listar todos los registros de Categoria.
select * from categoria;

--2. Listar todos los registros de Cliente.
select * from cliente;

--3. Listar las ciudades de la tabla Direccion.
select ciudad from direccion;

--4. Obtén una lista de todas las películas (su nombre).
select nombre from pelicula;

--5. Listar los identificadores de alquiler y las fechas de alquiler.
select id_alquiler, fech_alquiler from alquiler;

--6. Listar las películas, su duración y año.
select nombre, duracion, año from pelicula;

--7. Cambia el año de la película Cars, el nuevo año será 2005.
select nombre, año from pelicula where nombre="Cars";
update pelicula set año=2005 where nombre="Cars";
select nombre, año from pelicula where nombre="Cars";

--8. Listar la tabla Inventario
select * from inventario;

--9. Cambia la fecha de devolución del cliente 6. Su nueva fecha será 29/04/2003.
select fk_cliente, fech_devolucion from alquiler where fk_cliente=6;
update alquiler set fech_devolucion="2003/04/29" where fk_cliente=6;
select fk_cliente, fech_devolucion from alquiler where fk_cliente=6;

--10. Muestra un listado de todas las ciudades (no deben repetirse).
select ciudad from direccion order by ciudad;

--11. Insertar una nueva categoría de película: Suspense.
INSERT INTO CATEGORIA
	VALUES (7,"Suspense");

--12. Añadir la dirección: Avda. de Alemania, Zaragoza, España.
INSERT INTO DIRECCION
	VALUES (5,"Avda. de Alemania","Zaragoza","España");

--13. Cambiar la duración de la película El resplandor a 150 minutos.
select nombre, duracion from pelicula where nombre="El resplandor";
update pelicula set duracion=150 where nombre="El resplandor";
select nombre, duracion from pelicula where nombre="El resplandor";

--14. Borra el alquiler del cliente 1.
select * from alquiler;
delete from alquiler where fk_cliente=1;
select * from alquiler;


--15. Cambia la ciudad y el país de la calle Urgel, 11. Ahora serán: Roma, Italia.
select direccion, ciudad, pais from direccion where direccion="Urgel,11";
update direccion set ciudad="Roma", pais="Italia" where direccion="Urgel,11";
select direccion, ciudad, pais from direccion where direccion="Urgel,11";

--16. Obtener los nombres de todos los clientes cuyo apellido es Pesto.
select nombre, apellido from cliente where apellido="Pesto";

--17. Obtener el nombre y apellido de todos los clientes nacidos antes de 1980.
select nombre, apellido, fecha_nac from cliente where fecha_nac < "1980/01/01";

--18. Cambia la disponibilidad de las películas con número de inventario 2: ahora no estará disponible, y con número de inventario 8: ahora estará disponible
select * from inventario;
update inventario set disponible=0 where id_inventario=2;
update inventario set disponible=1 where id_inventario=8;
select * from inventario;

--19. Lista todas las ciudades agrupadas por país.
select ciudad, pais from direccion order by pais;

--20. Obtén un listado de toda la información de las Peliculas
select * from pelicula;




------------------------------------
alter table pedidos modify pedido_id PRIMARY KEY;
alter table detalles_pedido add FOREIGN KEY (pedido_id) REFERENCES pedidos(pedido_id);