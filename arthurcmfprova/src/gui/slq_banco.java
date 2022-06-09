/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Arthur
 * 
 * 
 create database arthurcmf;
use arthurcmf;

CREATE TABLE `arthurcmf`.`medico` (
  `id_medico` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `especialidade` INT,
  `crm` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_medico`),
  UNIQUE INDEX `id_medico_UNIQUE` (`id_medico` ASC) VISIBLE);

CREATE TABLE `arthurcmf`.`paciente` (
  `id_paciente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `cpf` VARCHAR(45) NOT NULL,
  `idade` INT,
  PRIMARY KEY (`id_paciente`));

CREATE TABLE `arthurcmf`.`consulta` (
  `id_consulta` INT NOT NULL AUTO_INCREMENT,
  `id_medico` INT NOT NULL,
  `id_paciente` INT NOT NULL,
  `convenio` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_consulta`),
  FOREIGN KEY (`id_medico`) REFERENCES medico(`id_medico`),
  FOREIGN KEY (`id_paciente`) REFERENCES paciente(`id_paciente`)
);

 */

    

