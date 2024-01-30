create database Location;
use Location;

CREATE TABLE paises (
  id INT NOT NULL AUTO_INCREMENT,
  pais VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE estados (
	id INT NOT NULL AUTO_INCREMENT,
    estado VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE municipios (
	id INT NOT NULL AUTO_INCREMENT,
    municipio VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

-- Inserts de la tabla países
INSERT INTO paises (pais) VALUES 
("México"),
("Argentina"),
("Brasil"),
("Canada"),
("Estados Unidos");

-- Inserts de la tabla estados
INSERT INTO estados (estado) VALUES 
("Estado de México"),
("Morelos"),
("Yucatán"),
("Guerrero"),
("Ciudad de México");

-- Inserts de la tabla municipios
INSERT INTO municipios (municipio) VALUES 
("Cuernavaca"),
("Tepoztlán"),
("Amacuzac"),
("Jojutla"),
("Tlayacapan");