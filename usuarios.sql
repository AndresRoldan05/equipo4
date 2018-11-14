DROP DATABASE IF EXISTS modulo_tres_db;
CREATE DATABASE modulo_tres_db;
USE modulo_tres_db;

DROP TABLE IF EXISTS usuarios;
CREATE TABLE usuarios (
id INT NOT NULL,
nombre VARCHAR(50) NOT NULL,
apellido VARCHAR(50),
cargo VARCHAR(50) NOT NULL,
telefono VARCHAR(50),
username VARCHAR(50) NOT NULL,
password VARCHAR(50) NOT NULL,
rol VARCHAR(50) NOT NULL,
direccion VARCHAR(50),
departamento VARCHAR(50),
nacimiento VARCHAR(50),
PRIMARY KEY (id)
);
