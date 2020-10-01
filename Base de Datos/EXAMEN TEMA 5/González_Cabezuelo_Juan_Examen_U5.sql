1-
USE `employees`;
DROP function IF EXISTS `sueldo_medio`;

DELIMITER $$
USE `employees`$$
CREATE DEFINER=`root`@`localhost` FUNCTION `sueldo_medio`(numero char(4)) RETURNS varchar(100) CHARSET utf8mb4
    DETERMINISTIC
BEGIN
	DECLARE resultado varchar(100) default 'DEPARTAMENTO DESCONOCIDO';
	DECLARE s1 DOUBLE;
    DECLARE s2 DOUBLE;
    
    SELECT ROUND(AVG(s.salary)) INTO s1 
    FROM salaries s INNER JOIN dept_emp de
			ON s.emp_no=de.emp_no
			WHERE de.dept_no=numero;
            
	SELECT ROUND(AVG(s.salary)) INTO s2
    FROM salaries s;
    
    IF s1 > s2
	THEN
		SELECT CONCAT("DEPT: ", numero, " | SUELDO MEDIO: ", ROUND(AVG(s.salary)), " | SUELDO SUPERIOR A LA MEDIA") INTO resultado
        FROM salaries s INNER JOIN dept_emp de
			ON s.emp_no=de.emp_no
			WHERE de.dept_no=numero;
	ELSE
		SELECT CONCAT("DEPT: ", numero, " | SUELDO MEDIO: ", ROUND(AVG(s.salary)), " | SUELDO SUPERIOR A LA MEDIA") INTO resultado
        FROM salaries s INNER JOIN dept_emp de
			ON s.emp_no=de.emp_no
			WHERE de.dept_no=numero;
	END IF;
	RETURN resultado;
END$$

2-
USE `employees`;
DROP procedure IF EXISTS `manager_departamento`;

DELIMITER $$
USE `employees`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `manager_departamento`(numero char(6))
BEGIN
	DECLARE nombre VARCHAR(20);
    DECLARE num_dep VARCHAR(20);
    DECLARE empleados VARCHAR(20);


    IF (SELECT dm.dept_no dm FROM dept_manager dm WHERE dm.emp_no=numero) IS NOT NULL
	THEN
        SET nombre = (SELECT dp.dept_name FROM departments dp 
        INNER JOIN dept_manager dm
        ON dm.dept_no=dp.dept_no
        WHERE dm.emp_no = numero);
        
        SET num_dep = (SELECT dept_no FROM dept_manager WHERE emp_no=numero);
        
        SET empleados = (SELECT COUNT(*) FROM employees e
		INNER JOIN dept_emp de
        ON de.emp_no=e.emp_no
        WHERE de.dept_no = num_dep);
        
		SELECT CONCAT("NOMBRE DE LOS DEPARTAMENTOS: ", nombre) AS NOMBRES;
        SELECT CONCAT("TOTAL DE EMPLEADOS ACTUALES: ", empleados) AS EMPLEADOS;
	ELSE
		SELECT CONCAT("NO HA DIRIGIDO NUNCA UN DEPARTAMENTO") AS RESULTADO;
	END IF;
END$$

DELIMITER ;

3-
USE `employees`;
DROP function IF EXISTS `gastos_departamento`;

DELIMITER $$
USE `employees`$$
CREATE DEFINER=`root`@`localhost` FUNCTION `gastos_departamento`(numero char(4)) RETURNS varchar(100) CHARSET utf8mb4
    DETERMINISTIC
BEGIN
	DECLARE resultado varchar(100) default 'DEPARTAMENTO DESCONOCIDO';
    
	SELECT CONCAT("DEPT: ", numero, " | GASTO EN SALARIOS ", SUM(s.salary)) INTO resultado
        FROM salaries s INNER JOIN dept_emp de
			ON s.emp_no=de.emp_no
			WHERE de.dept_no=numero;
	RETURN resultado;
END$$

DELIMITER ;

4-
USE `employees`;
DROP procedure IF EXISTS `datos_empleado`;

DELIMITER $$
USE `employees`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `datos_empleado`(numero char(6))
BEGIN
	DECLARE nombre VARCHAR(20);
    DECLARE num_dep VARCHAR(20);
    DECLARE empleados VARCHAR(20);

    IF (SELECT dm.dept_no dm FROM dept_manager dm WHERE dm.emp_no=numero) IS NOT NULL
	THEN
        SET nombre = (SELECT dp.dept_name FROM departments dp 
        INNER JOIN dept_manager dm
        ON dm.dept_no=dp.dept_no
        WHERE dm.emp_no = numero);
        
        SET num_dep = (SELECT dept_no FROM dept_manager WHERE emp_no=numero);
        
        SET empleados = (SELECT COUNT(*) FROM employees e
		INNER JOIN dept_emp de
        ON de.emp_no=e.emp_no
        WHERE de.dept_no = num_dep);
        
		SELECT CONCAT("NOMBRE DEL DEPARTAMENTO QUE DIRIGE: ", nombre) AS DATOS;
        SELECT CONCAT("TOTAL DE EMPLEADOS ACTUALES: ", empleados) AS EMPLEADOS;
        
        SELECT CONCAT("NOMBRE: ", e.first_name, " ", e.last_name) AS EMPLEADOS 
        FROM employees e
		INNER JOIN dept_emp de
        ON de.emp_no=e.emp_no
        WHERE de.dept_no = num_dep;
	ELSE
		SELECT CONCAT("NO DIRIGE NINGÚN DEPARTAMENTO") AS RESULTADO;
	END IF;
END$$

DELIMITER ;

5-
USE `employees`;
DROP procedure IF EXISTS `contratos`;

DELIMITER $$
USE `employees`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `contratos`(fecha1 DATE, fecha2 DATE)
BEGIN
    SELECT CONCAT(MONTHNAME(e.hire_date), " ", YEAR(e.hire_date), ": ", COUNT(*), " contrataciones") AS CONTRATOS FROM employees e 
    WHERE (e.hire_date>=fecha1 AND e.hire_date<=fecha2) 
    GROUP BY MONTH(e.hire_date), YEAR(e.hire_date)
    ORDER BY e.hire_date;
END$$

DELIMITER ;





