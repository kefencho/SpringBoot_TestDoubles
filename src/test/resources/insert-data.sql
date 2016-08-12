INSERT INTO cliente (dni, apellidos, correo, nombre) VALUES ('43610836','Asto Hinostroza','kefenchoed@gmail.com','kencho');
INSERT INTO cliente (dni, apellidos, correo, nombre) VALUES ('78592623','Humareda Romero','elvis@gmail.com','elvis');
INSERT INTO cliente (dni, apellidos, correo, nombre) VALUES ('23157485','Calle Sulca','roy@gmail.com','Roy');
INSERT INTO cliente (dni, apellidos, correo, nombre) VALUES ('59262345','Poblete Mori','manuel@gmail.com','Manuel');
INSERT INTO cliente (dni, apellidos, correo, nombre) VALUES ('23568978','Valentin Palomino','marco@gmail.com','Marco');

INSERT INTO promocion (codigo_promocion, descripcion, descuento) VALUES ('P0001','Coffe Verano','5');
INSERT INTO promocion (codigo_promocion, descripcion, descuento) VALUES ('P0002','Coffe Otoño','4');
INSERT INTO promocion (codigo_promocion, descripcion, descuento) VALUES ('P0003','Coffe Primavera','3');
INSERT INTO promocion (codigo_promocion, descripcion, descuento) VALUES ('P0004','Coffe Invierno','6');

INSERT INTO producto (nombre, codigo, descripcion, estado, precio, cod_promocion) VALUES ('Mocha Frappuccino','CA001','Delicioso mocha batido con hielo y una intensa base de café, decorado con crema batida y topping de mocha.',true,20,'P0001');
INSERT INTO producto (nombre, codigo, descripcion, estado, precio, cod_promocion) VALUES ('Tres leches','CA006','Suave bizcochuelo de vainilla embebido en leche, decorado con crema merengue, canela y chocolate.',true,8.5,'P0002');
INSERT INTO producto (nombre, codigo, descripcion, estado, precio, cod_promocion) VALUES ('Espresso Frappuccino','CA005','Nuestra base de café con hielo batido y leche con un intenso sabor adicional de espresso.',true,18.5,'P0003');
INSERT INTO producto (nombre, codigo, descripcion, estado, precio, cod_promocion) VALUES ('Capuccino','CA004','El balance perfecto. Nuestra carga de espresso acompañada con abundante espuma de leche',true,18.5,'P0004');
INSERT INTO producto (nombre, codigo, descripcion, estado, precio, cod_promocion) VALUES ('Latte','CA003','Leche cremosa y espresso, ligeramente recubierto con suave espuma de leche.',true,19.5,'P0002');
INSERT INTO producto (nombre, codigo, descripcion, estado, precio, cod_promocion) VALUES ('Espresso','CA002','Es la verdadera esencia del café en la forma más concentrada. El espresso de Starbucks es intenso y con un toque acaramelado.',true,18,'P0001');

INSERT INTO orden_venta (id_orden, id_cliente, id_producto) VALUES (1,25786396,'CA001');
INSERT INTO orden_venta (id_orden, id_cliente, id_producto) VALUES (2,36986545,'CA002');
INSERT INTO orden_venta (id_orden, id_cliente, id_producto) VALUES (3,43610836,'CA003');
INSERT INTO orden_venta (id_orden, id_cliente, id_producto) VALUES (4,47583696,'CA004');
INSERT INTO orden_venta (id_orden, id_cliente, id_producto) VALUES (5,48260536,'CA006');