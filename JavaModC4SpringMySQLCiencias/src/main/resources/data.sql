DROP TABLE IF EXISTS asignado;
DROP TABLE IF EXISTS cientifico;
DROP TABLE IF EXISTS proyecto;


CREATE TABLE IF NOT EXISTS cientifico (
                        id INT AUTO_INCREMENT,
						dni VARCHAR(8) DEFAULT NULL,
						nomApels VARCHAR(255) DEFAULT NULL,
						PRIMARY KEY(id)
						);
					
CREATE TABLE IF NOT EXISTS proyecto (
						id INT AUTO_INCREMENT,
						nombre VARCHAR(255) DEFAULT NULL,
						horas INT DEFAULT NULL,
						PRIMARY KEY(id)
						);
						
CREATE TABLE IF NOT EXISTS asignado (
                        id INT AUTO_INCREMENT,
						cientifico INT,
						proyecto INT,
                        PRIMARY KEY(id),
						KEY(cientifico, proyecto),
                        CONSTRAINT cientifico_fk FOREIGN KEY (cientifico) REFERENCES cientifico (id)
                        ON DELETE CASCADE ON UPDATE CASCADE,
                        CONSTRAINT proyecto_fk FOREIGN KEY (proyecto) REFERENCES proyecto (id)
                        ON DELETE CASCADE ON UPDATE CASCADE
						);
						
					
INSERT INTO cientifico (dni, nomApels) VALUES ('12345678', 'Juan Pérez');
INSERT INTO cientifico (dni, nomApels) VALUES ('23456789', 'Ana García');
INSERT INTO cientifico (dni, nomApels) VALUES ('34567890', 'Pedro González');
INSERT INTO cientifico (dni, nomApels) VALUES ('45678901', 'María López');
INSERT INTO cientifico (dni, nomApels) VALUES ('56789012', 'José Martínez');
INSERT INTO cientifico (dni, nomApels) VALUES ('67890123', 'Elena Sánchez');
INSERT INTO cientifico (dni, nomApels) VALUES ('78901234', 'Carlos Ruiz');
INSERT INTO cientifico (dni, nomApels) VALUES ('89012345', 'Laura García');
INSERT INTO cientifico (dni, nomApels) VALUES ('90123456', 'Manuel Pérez');
INSERT INTO cientifico (dni, nomApels) VALUES ('01234567', 'Sara Rodríguez');


INSERT INTO proyecto (nombre, horas) VALUES ('Proyecto 1', 100);
INSERT INTO proyecto (nombre, horas) VALUES ('Proyecto 2', 200);
INSERT INTO proyecto (nombre, horas) VALUES ('Proyecto 3', 150);
INSERT INTO proyecto (nombre, horas) VALUES ('Proyecto 4', 300);
INSERT INTO proyecto (nombre, horas) VALUES ('Proyecto 5', 250);
INSERT INTO proyecto (nombre, horas) VALUES ('Proyecto 6', 175);
INSERT INTO proyecto (nombre, horas) VALUES ('Proyecto 7', 80);
INSERT INTO proyecto (nombre, horas) VALUES ('Proyecto 8', 120);
INSERT INTO proyecto (nombre, horas) VALUES ('Proyecto 9', 90);
INSERT INTO proyecto (nombre, horas) VALUES ('Proyecto 10', 400);


INSERT INTO asignado (cientifico, proyecto) VALUES (1, 10);
INSERT INTO asignado (cientifico, proyecto) VALUES (2, 9);
INSERT INTO asignado (cientifico, proyecto) VALUES (3, 8);
INSERT INTO asignado (cientifico, proyecto) VALUES (4, 7);
INSERT INTO asignado (cientifico, proyecto) VALUES (5, 6);
INSERT INTO asignado (cientifico, proyecto) VALUES (6, 5);
INSERT INTO asignado (cientifico, proyecto) VALUES (7, 4);
INSERT INTO asignado (cientifico, proyecto) VALUES (8, 3);
INSERT INTO asignado (cientifico, proyecto) VALUES (9, 2);
INSERT INTO asignado (cientifico, proyecto) VALUES (10, 1);