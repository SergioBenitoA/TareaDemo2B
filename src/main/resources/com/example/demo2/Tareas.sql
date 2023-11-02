DROP DATABASE IF EXISTS Tareas;
CREATE DATABASE Tareas;
Use Tareas;


CREATE TABLE Tareas(
 Id int unsigned auto_increment primary key,
 Titulo varchar(20),
 Descripcion varchar(50),
 Dia varchar(20),
);

INSERT INTO Tareas  VALUES
    (1,"Acceso a datos","la tarea de aadd","Lunes"),
    (2,"SGE","esta es la desc","Viernes");
