CREATE DATABASE sistema_login CHARACTER SET utf8mb4 COLLATE utf8m4_unicode_ci;
USE sistema_login;

CREATE TABLE usuarios (
id INT AUTO_INCREMENT PRIMARY KEY,
usuario VARCHAR(50) NOT NULL UNIQUE,
senha VARCHAR(255) NOT NULL
);

INSERT INTO usuarios (usuario, senha) VALUES ('luiz fernando', '123');

select * from usuarios;