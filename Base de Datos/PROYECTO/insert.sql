INSERT INTO USUARIO
	VALUES ('01', 'ADMIN1', '001');
INSERT INTO USUARIO
	VALUES ('02', 'ADMIN2', '002');
INSERT INTO USUARIO
	VALUES ('03', 'USUARIO1',null);
INSERT INTO USUARIO
	VALUES ('04', 'USUARIO2',null);
INSERT INTO USUARIO
	VALUES ('05', 'USUARIO3',null);
INSERT INTO USUARIO
	VALUES ('06', 'USUARIO4',null);
INSERT INTO USUARIO
	VALUES ('07', 'USUARIO5',null);
INSERT INTO USUARIO
	VALUES ('08', 'USUARIO6',null);
INSERT INTO USUARIO
	VALUES ('09', 'USUARIO7',null);
INSERT INTO USUARIO
	VALUES ('10', 'USUARIO8',null);

	
INSERT INTO PERSONA
	VALUES ('01111', '11111', 'PERSONA1', 500.00, 350, '01','01');
INSERT INTO PERSONA
	VALUES ('02222', '22222', 'PERSONA2', 500.00, 350, '02','02');
INSERT INTO PERSONA
	VALUES ('03333', '33333', 'PERSONA3', 500.00, 350, '03','01');
INSERT INTO PERSONA
	VALUES ('04444', '44444', 'PERSONA4', 500.00, 350, '04','01');
INSERT INTO PERSONA
	VALUES ('05555', '55555', 'PERSONA5', 500.00, 350, '05','01');
INSERT INTO PERSONA
	VALUES ('06666', '66666', 'PERSONA6', 500.00, 350, '06','01');
INSERT INTO PERSONA
	VALUES ('07777', '77777', 'PERSONA7', 500.00, 350, '07','01');
INSERT INTO PERSONA
	VALUES ('08888', '88888', 'PERSONA8', 500.00, 350, '08','01');
INSERT INTO PERSONA
	VALUES ('09999', '99999', 'PERSONA9', 500.00, 350, '09','01');
INSERT INTO PERSONA
	VALUES ('10000', '00000', 'PERSONA10', 500.00, 350, '10','01');
	
	
INSERT INTO COCHE
	VALUES (111, 150, '2020/01/01', 'M12', 'MUSTANG', 50000, 'ROJO','04444','04');
INSERT INTO COCHE
	VALUES (333, 150, '2020/01/01', 'M13', 'MUSTANG', 50000, 'verde','04444','04');
INSERT INTO COCHE
	VALUES (222, 150, '2020/02/01', 'B4', 'AUDI', 60000, 'NEGRO','03333','03');
	
	
INSERT INTO CONTROLA
	VALUES ('01111','01');
INSERT INTO CONTROLA
	VALUES ('02222','02');
INSERT INTO CONTROLA
	VALUES ('03333','03');
INSERT INTO CONTROLA
	VALUES ('04444','04');
INSERT INTO CONTROLA
	VALUES ('05555','05');
INSERT INTO CONTROLA
	VALUES ('06666','06');
INSERT INTO CONTROLA
	VALUES ('07777','07');
INSERT INTO CONTROLA
	VALUES ('08888','08');
INSERT INTO CONTROLA
	VALUES ('09999','09');
INSERT INTO CONTROLA
	VALUES ('10000','10');
	
	
INSERT INTO CASA
	VALUES (011,200,10000000.00,500,'CALLE DE PRUEBA NUMERO 1');
	
	
INSERT INTO POSEE
	VALUES (011,'01111','01','2020/01/01');
	
	
INSERT INTO OBJETO
	VALUES (00001,25,'PIEDRA');
INSERT INTO OBJETO
	VALUES (00002,30,'PALO');
INSERT INTO OBJETO
	VALUES (00003,40,'PISTOLA');
INSERT INTO OBJETO
	VALUES (00004,50,'MUNICION');
	
	
INSERT INTO CONTENEDOR
	VALUES ('01111','01',00001,2);
INSERT INTO CONTENEDOR
	VALUES ('01111','01',00002,1);
INSERT INTO CONTENEDOR
	VALUES ('02222','02',00003,1);
INSERT INTO CONTENEDOR
	VALUES ('02222','02',00004,2);
	

INSERT INTO INVENTARIO
	VALUES (011,00001,2);
	
	
INSERT INTO TRABAJADOR
	VALUES ('Cargo1', 'GOBIERNO', 5000, '01111', '01');
INSERT INTO TRABAJADOR
	VALUES ('Cargo2', 'PUBLICO', 3000, '02222', '02');
INSERT INTO TRABAJADOR
	VALUES ('Cargo3', 'EMPRESA', 2000, '03333', '03');
INSERT INTO TRABAJADOR
	VALUES ('Cargo4', 'GOBIERNO', 6000, '04444', '04');
INSERT INTO TRABAJADOR
	VALUES ('Cargo5', 'GOBIERNO', 12000, '05555', '05');
	
	
INSERT INTO CRIMINAL
	VALUES ('ORG1', 5000.00, 'BAJO', 'TIPO1', '06666', '06');
INSERT INTO CRIMINAL
	VALUES ('ORG2', 3000.00, 'ALTO', 'TIPO1', '07777', '07');
INSERT INTO CRIMINAL
	VALUES ('ORG1', 2000.00, 'ALTO', 'TIPO3', '08888', '08');
INSERT INTO CRIMINAL
	VALUES ('ORG3', 6000.00, 'BAJO', 'TIPO2', '09999', '09');
INSERT INTO CRIMINAL
	VALUES ('ORG3', 12000.00, 'ALTO', 'TIPO1', '10000', '10');