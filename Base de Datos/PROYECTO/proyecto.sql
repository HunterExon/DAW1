-- MySQL Script generated by MySQL Workbench
-- Mon Feb 24 10:11:24 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`USUARIO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`USUARIO` (
  `id` VARCHAR(12) NOT NULL,
  `nombre` VARCHAR(20) NOT NULL,
  `id_admin` INT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `nombre_UNIQUE` (`nombre` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`PERSONA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`PERSONA` (
  `dni` VARCHAR(9) NOT NULL,
  `num_seguridad_social` VARCHAR(15) NULL,
  `nombre` VARCHAR(20) NOT NULL,
  `dinero` DOUBLE NOT NULL,
  `espacio` INT NOT NULL,
  `USUARIO_id` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`dni`),
  UNIQUE INDEX `num_seguridad_social_UNIQUE` (`num_seguridad_social` ASC) VISIBLE,
  CONSTRAINT `fk_PERSONA_USUARIO1`
    FOREIGN KEY (`USUARIO_id`)
    REFERENCES `mydb`.`USUARIO` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`COCHE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`COCHE` (
  `matricula` INT NOT NULL,
  `velocidad` INT NOT NULL,
  `fecha_compra` DATE NULL,
  `modelo` VARCHAR(30) NOT NULL,
  `marca` VARCHAR(30) NOT NULL,
  `precio` DOUBLE NOT NULL,
  `color` VARCHAR(20) NULL,
  `PERSONA_dni` VARCHAR(9) NOT NULL,
  `PERSONA_USUARIO_id` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`matricula`),
  CONSTRAINT `fk_COCHE_PERSONA1`
    FOREIGN KEY (`PERSONA_dni`)
    REFERENCES `mydb`.`PERSONA` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`CONTROLA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CONTROLA` (
  `PERSONA_dni` VARCHAR(9) NOT NULL,
  `USUARIO_id` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`PERSONA_dni`, `USUARIO_id`),
  CONSTRAINT `fk_PERSONA_has_USUARIO_PERSONA1`
    FOREIGN KEY (`PERSONA_dni`)
    REFERENCES `mydb`.`PERSONA` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PERSONA_has_USUARIO_USUARIO1`
    FOREIGN KEY (`USUARIO_id`)
    REFERENCES `mydb`.`USUARIO` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`CASA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CASA` (
  `id` INT NOT NULL,
  `tamaño` INT NOT NULL,
  `precio` DOUBLE NOT NULL,
  `espacio` INT NOT NULL,
  `direccion` VARCHAR(35) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`POSEE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`POSEE` (
  `CASA_id` INT NOT NULL,
  `PERSONA_dni` VARCHAR(9) NOT NULL,
  `PERSONA_USUARIO_id` VARCHAR(12) NOT NULL,
  `fecha_compra` DATE NOT NULL,
  PRIMARY KEY (`CASA_id`, `PERSONA_dni`, `PERSONA_USUARIO_id`),
  CONSTRAINT `fk_CASA_has_PERSONA_CASA1`
    FOREIGN KEY (`CASA_id`)
    REFERENCES `mydb`.`CASA` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CASA_has_PERSONA_PERSONA1`
    FOREIGN KEY (`PERSONA_dni`)
    REFERENCES `mydb`.`PERSONA` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`OBJETO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`OBJETO` (
  `id` INT NOT NULL,
  `peso` INT NOT NULL,
  `nombre` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`CONTENEDOR`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CONTENEDOR` (
  `PERSONA_dni` VARCHAR(9) NOT NULL,
  `PERSONA_USUARIO_id` VARCHAR(12) NOT NULL,
  `OBJETO_id` INT NOT NULL,
  `cantidad` INT NOT NULL,
  PRIMARY KEY (`PERSONA_dni`, `PERSONA_USUARIO_id`, `OBJETO_id`),
  CONSTRAINT `fk_PERSONA_has_OBJETO_PERSONA1`
    FOREIGN KEY (`PERSONA_dni`)
    REFERENCES `mydb`.`PERSONA` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PERSONA_has_OBJETO_OBJETO1`
    FOREIGN KEY (`OBJETO_id`)
    REFERENCES `mydb`.`OBJETO` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`INVENTARIO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`INVENTARIO` (
  `CASA_id` INT NOT NULL,
  `OBJETO_id` INT NOT NULL,
  `cantidad` INT NOT NULL,
  PRIMARY KEY (`CASA_id`, `OBJETO_id`),
  CONSTRAINT `fk_CASA_has_OBJETO_CASA1`
    FOREIGN KEY (`CASA_id`)
    REFERENCES `mydb`.`CASA` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CASA_has_OBJETO_OBJETO1`
    FOREIGN KEY (`OBJETO_id`)
    REFERENCES `mydb`.`OBJETO` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TRABAJADOR`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TRABAJADOR` (
  `cargo` VARCHAR(20) NOT NULL,
  `tipo` VARCHAR(30) NOT NULL,
  `sueldo` DOUBLE NOT NULL,
  `PERSONA_dni` VARCHAR(9) NOT NULL,
  `PERSONA_USUARIO_id` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`PERSONA_dni`, `PERSONA_USUARIO_id`),
  CONSTRAINT `fk_TRABAJADOR_PERSONA1`
    FOREIGN KEY (`PERSONA_dni`)
    REFERENCES `mydb`.`PERSONA` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`CRIMINAL`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CRIMINAL` (
  `organizacion` VARCHAR(30) NULL,
  `dinero_negro` DOUBLE NOT NULL,
  `rango` VARCHAR(30) NULL,
  `tipo` VARCHAR(30) NOT NULL,
  `PERSONA_dni` VARCHAR(9) NOT NULL,
  `PERSONA_USUARIO_id` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`PERSONA_dni`, `PERSONA_USUARIO_id`),
  CONSTRAINT `fk_CRIMINAL_PERSONA1`
    FOREIGN KEY (`PERSONA_dni`)
    REFERENCES `mydb`.`PERSONA` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


