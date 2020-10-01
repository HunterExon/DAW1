CREATE DEFINER=`root`@`localhost` FUNCTION `dni_user`(userid VARCHAR(35)) RETURNS varchar(100) CHARSET utf8mb4
    DETERMINISTIC
BEGIN
	DECLARE resultado VARCHAR(100) DEFAULT 'NO EXITSTE EL USUARIO';
	DECLARE dni VARCHAR(50);
    DECLARE id VARCHAR(35);
	SELECT CONCAT("USUARIO: ", u.nombre, " ID: ", u.id, " DNI: ") INTO resultado
		FROM usuario u INNER JOIN controla c
        ON c.USUARIO_id=u.id
		WHERE u.id=id;
    SELECT CONCAT(resultado, p.PERSONA_dni) INTO resultado
		FROM persona p
        WHERE c.USUARIO_id=p.USUARIO_id;
	RETURN resultado;
END