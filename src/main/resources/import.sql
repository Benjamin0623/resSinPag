/* Populate tabla clientes */

INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (id, region_id, nombre, apellido, email, create_at) VALUES(9, 2, 'Mr. John', 'Doe', 'john.doe@gmail.com', SYSDATE);
INSERT INTO clientes (id, region_id, nombre, apellido, email, create_at) VALUES(10, 1, 'Andrés', 'Guzmán', 'profesor@bolsadeideas.com', SYSDATE);
INSERT INTO clientes (id, region_id, nombre, apellido, email, create_at) VALUES(11, 4, 'Linus', 'Torvalds', 'linus.torvalds@gmail.com', SYSDATE);
INSERT INTO clientes (id, region_id, nombre, apellido, email, create_at) VALUES(12, 4, 'Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', SYSDATE);
INSERT INTO clientes (id, region_id, nombre, apellido, email, create_at) VALUES(13, 4, 'Erich', 'Gamma', 'erich.gamma@gmail.com', SYSDATE);
INSERT INTO clientes (id, region_id, nombre, apellido, email, create_at) VALUES(14, 3, 'Richard', 'Helm', 'richard.helm@gmail.com', SYSDATE);
INSERT INTO clientes (id, region_id, nombre, apellido, email, create_at) VALUES(15, 3, 'Ralph', 'Johnson', 'ralph.johnson@gmail.com', SYSDATE);
INSERT INTO clientes (id, region_id, nombre, apellido, email, create_at) VALUES(16, 3, 'John', 'Vlissides', 'john.vlissides@gmail.com', SYSDATE);
INSERT INTO clientes (id, region_id, nombre, apellido, email, create_at) VALUES(17, 3, 'Dr. James', 'Gosling', 'james.gosling@gmail.com', SYSDATE);
INSERT INTO clientes (id, region_id, nombre, apellido, email, create_at) VALUES(18, 5, 'Magma', 'Lee', 'magma.lee@gmail.com', SYSDATE);
INSERT INTO clientes (id, region_id, nombre, apellido, email, create_at) VALUES(19, 6, 'Tornado', 'Roe', 'tornado.roe@gmail.com', SYSDATE);
INSERT INTO clientes (id, region_id, nombre, apellido, email, create_at) VALUES(20, 7, 'Jade', 'Doe', 'jane.doe@gmail.com', SYSDATE);

/* Creamos algunos usuarios con sus roles */
INSERT INTO usuarios (id, username, password, enabled, nombre, apellido, email, cia) VALUES (21, 'andres','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1, 'Andres', 'Guzman','profesor@bolsadeideas.com', '01');
INSERT INTO usuarios (id, username, password, enabled, nombre, apellido, email, cia) VALUES (22, 'admin','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',1, 'John', 'Doe','jhon.doe@bolsadeideas.com', '01');

INSERT INTO roles (id, authority) VALUES (23, 'ROLE_USER');
INSERT INTO roles (id, authority) VALUES (24, 'ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (21, 23);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (22, 24);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (22, 23);