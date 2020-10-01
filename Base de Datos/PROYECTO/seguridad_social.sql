CREATE DEFINER=`root`@`localhost` FUNCTION `seguridad_social`(num_dni VARCHAR(15)) RETURNS varchar(50) CHARSET utf8mb4
    DETERMINISTIC
BEGIN
	DECLARE num_ss varchar(40) default 'DESCONOCIDO';
    SELECT num_seguridad_social INTO num_ss
    FROM persona
    WHERE dni=num_dni;
	RETURN num_ss;
END