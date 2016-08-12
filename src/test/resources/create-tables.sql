DROP TABLE cliente IF EXISTS;
CREATE TABLE cliente (
    dni integer NOT NULL,
    apellidos character varying(255),
    correo character varying(255),
    nombre character varying(255),
    PRIMARY KEY (dni)
);
    
DROP TABLE promocion IF EXISTS;
CREATE TABLE promocion (
    codigo_promocion character varying(255) NOT NULL,
    descripcion character varying(255),
    descuento integer,
    PRIMARY KEY (codigo_promocion)
);

DROP TABLE producto IF EXISTS;
CREATE TABLE producto (
    nombre character varying(200),
    codigo character varying(5) NOT NULL,
    descripcion character varying(200),
    estado boolean,
    precio double precision,
    cod_promocion character varying(5),
    PRIMARY KEY (codigo),
    FOREIGN KEY (cod_promocion) REFERENCES  promocion(codigo_promocion)
);

DROP TABLE orden_venta IF EXISTS;
CREATE TABLE orden_venta (
    id_orden integer NOT NULL,
    id_cliente integer,
    id_producto character varying(5),
    PRIMARY KEY (id_orden),
    FOREIGN KEY (id_producto) REFERENCES  producto(codigo),
    FOREIGN KEY (id_cliente) REFERENCES  cliente(dni)
);
