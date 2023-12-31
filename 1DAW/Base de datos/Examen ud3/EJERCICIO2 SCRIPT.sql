CREATE DATABASE CINES;
USE CINES;

CREATE TABLE SUCURSAL(
ID_SUCURSAL INT NOT NULL AUTO_INCREMENT,
NUM_SALAS INT NOT NULL COMMENT 'NUMERO DE LA SALSA',
UBICACION VARCHAR(45) NOT NULL COMMENT 'DIRECCION DE LA SUCURSAL',
CONSTRAINT PK_SUCURSAL PRIMARY KEY (ID_SUCURSAL)
);

CREATE TABLE TRABAJADOR (
ID_TRABAJADOR INT NOT NULL AUTO_INCREMENT COMMENT 'IDENTIFICADOR DE EL TRABAJADOR',
NOMBRE VARCHAR(45) NOT NULL COMMENT 'NOMBRE DE EL TRABAJADOR',
EDAD INT NOT NULL COMMENT 'EDAD DE EL TRABAJADOR',
CONSTRAINT PK_TRABAJADOR PRIMARY KEY (ID_TRABAJADOR)
);

CREATE TABLE SALA (
ID_SALA INT NOT NULL AUTO_INCREMENT COMMENT 'IDENTIFICADOR DE LA SALA',
NUM_SALA INT NOT NULL COMMENT 'NUMERO DE LA SALA',
NUM_BUTACA INT NOT NULL COMMENT 'NUMERO DE LA BUTACA',
ID_SUCURSAL INT NOT NULL COMMENT 'NUMERO DE LA SUCURSAL',
CONSTRAINT PK_SALA PRIMARY KEY (ID_SALA),
CONSTRAINT FK_SALA FOREIGN KEY (ID_SUCURSAL) REFERENCES SUCURSAL(ID_SUCURSAL)
);

CREATE TABLE PALOMITERO(
ID_PALOMITERO INT NOT NULL AUTO_INCREMENT COMMENT 'IDENTIFICADOR DE LOS PALOMITEROS',
TIPO_PALOMITAS VARCHAR(45) NULL COMMENT 'TIPO DE PALOMITAS',
ID_TRABAJADOR INT NOT NULL COMMENT 'IDENTIFICADOR DE EL TRABAJADOR',
CONSTRAINT PK_PALOMITERO PRIMARY KEY (ID_PALOMITERO, ID_TRABAJADOR),
CONSTRAINT FK_PALOMITERO FOREIGN KEY (ID_TRABAJADOR) REFERENCES TRABAJADOR(ID_TRABAJADOR)
);

CREATE TABLE TAQUILLERO(
ID_TAQUILLERO INT NOT NULL AUTO_INCREMENT COMMENT 'IDENTIFICADOR DE LOS TAQUILLEROS',
TURNO VARCHAR(45) NULL COMMENT 'TURNOS DE LOS TAQUILLEROS',
NOMBRE VARCHAR(45) NULL COMMENT 'NOMBRE DE LOS TAQUILLEROS',
ID_TRABAJADOR INT NOT NULL COMMENT 'IDENTIFICADOR DE LOS TRABAJADORES',
ID_SUCURSAL INT NULL COMMENT 'IDENTIFICADOR DE LA SUCURSAL',
CONSTRAINT PK_TAQUILLERO PRIMARY KEY (ID_TAQUILLERO, ID_TRABAJADOR),
CONSTRAINT FK_TAQUILLERO FOREIGN KEY (ID_SUCURSAL) REFERENCES SUCURSAL(ID_SUCURSAL),
CONSTRAINT FK_TAQUILLERO2 FOREIGN KEY (ID_TRABAJADOR) REFERENCES TRABAJADOR(ID_TRABAJADOR)
);

CREATE TABLE ACOMODADOR(
ID_ACOMODADOR INT NOT NULL AUTO_INCREMENT COMMENT 'iDENTIFICADOR DE LOS ACOMODODADORES',
TURNO VARCHAR(45) NULL COMMENT 'TURNO DE LOS ACOMODADORES',
ID_SALA INT NULL COMMENT 'IDENTIFICADOR DE LA SALA',
ID_TRABAJADOR INT NOT NULL COMMENT 'IDENTIFICADOR DE LOS TRABAJADORES',
CONSTRAINT PK_ACOMODADOR PRIMARY KEY (ID_ACOMODADOR, ID_TRABAJADOR),
CONSTRAINT FK_ACOMODADOR FOREIGN KEY (ID_SALA) REFERENCES SALA(ID_SALA),
CONSTRAINT FK_ACOMODADOR2 FOREIGN KEY (ID_TRABAJADOR) REFERENCES TRABAJADOR(ID_TRABAJADOR)
);



