CREATE DATABASE IF NOT EXISTS companydb;

USE companydb;

CREATE TABLE employee (
    id INT(11) NOT NULL AUTO_INCREMENT,
    name VARCHAR(45) DEFAULT NULL,
    salary INT (5) DEFAULT NULL,
    PRIMARY KEY (id)
);

INSERT INTO
    employee
VALUES
    (1, 'Charlie', 9000),
    (2, 'Keyla', 8000),
    (3, 'Danny', 3000),
    (4, 'Jesse', 4000);