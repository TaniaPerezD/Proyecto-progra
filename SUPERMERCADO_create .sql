-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2024-06-17 02:52:46.222

-- tables
-- Table: CATEGORIA
CREATE TABLE CATEGORIA (
    id_categoria decimal(15,0)  NOT NULL,
    nombre varchar(100)  NOT NULL,
    descripcion text  NOT NULL,
    CONSTRAINT CATEGORIA_pk PRIMARY KEY (id_categoria)
);

-- Table: CLIENTE
CREATE TABLE CLIENTE (
    id_cliente decimal(10,0)  NOT NULL,
    nit varchar(50)  NOT NULL,
    telefono decimal(8,0)  NOT NULL,
    email varchar(100)  NOT NULL,
    razon_social varchar(100)  NOT NULL,
    estado varchar(30)  NOT NULL,
    CONSTRAINT CLIENTE_pk PRIMARY KEY (id_cliente)
);

-- Table: COMPRA
CREATE TABLE COMPRA (
    id_compra decimal(20,0)  NOT NULL,
    id_proveedor int  NOT NULL,
    fecha date  NOT NULL,
    CONSTRAINT COMPRA_pk PRIMARY KEY (id_compra)
);

-- Table: DETALLE_COMPRA
CREATE TABLE DETALLE_COMPRA (
    id_detalle_compra decimal(20,0)  NOT NULL,
    id_compra decimal(20,0)  NOT NULL,
    id_producto decimal(10,0)  NOT NULL,
    codigo_barra varchar(150)  NOT NULL,
    cantidad int  NOT NULL,
    CONSTRAINT DETALLE_COMPRA_pk PRIMARY KEY (id_detalle_compra)
);

-- Table: DETALLE_FACTURA
CREATE TABLE DETALLE_FACTURA (
    id_detalle_factura decimal(20,0)  NOT NULL,
    id_producto decimal(10,0)  NOT NULL,
    codigo_barra varchar(150)  NOT NULL,
    num_autorizacion varchar(60)  NOT NULL,
    cantidad int  NOT NULL,
    CONSTRAINT DETALLE_FACTURA_pk PRIMARY KEY (id_detalle_factura)
);

-- Table: EMPLEADO
CREATE TABLE EMPLEADO (
    id_empleado decimal(10,0)  NOT NULL,
    nombre varchar(100)  NOT NULL,
    ap_paterno varchar(100)  NOT NULL,
    ap_materno varchar(100)  NOT NULL,
    email varchar(150)  NOT NULL,
    contrasenia varchar(100)  NOT NULL,
    rol varchar(50)  NOT NULL,
    fecha_contratacion date  NOT NULL,
    direccion varchar(250)  NOT NULL,
    usuario varchar(30)  NOT NULL,
    estado varchar(30)  NOT NULL,
    CONSTRAINT EMPLEADO_pk PRIMARY KEY (id_empleado)
);

-- Table: FACTURA
CREATE TABLE FACTURA (
    num_autorizacion varchar(60)  NOT NULL,
    id_empleado decimal(10,0)  NOT NULL,
    id_cliente decimal(10,0)  NOT NULL,
    llave_dosificacion varchar(45)  NOT NULL,
    fecha_emision date  NOT NULL,
    hora_emision time  NOT NULL,
    num_factura int  NOT NULL,
    CONSTRAINT FACTURA_pk PRIMARY KEY (num_autorizacion)
);

-- Table: PRODUCTO
CREATE TABLE PRODUCTO (
    id_producto decimal(10,0)  NOT NULL,
    codigo_barra varchar(150)  NOT NULL,
    id_subcategoria decimal(15,0)  NOT NULL,
    nombre varchar(150)  NOT NULL,
    descripcion text  NOT NULL,
    precio_compra decimal(10,2)  NOT NULL,
    precio_venta decimal(10,2)  NOT NULL,
    descuento decimal(10,2)  NOT NULL,
    stock_minimo int  NOT NULL,
    stock_maximo int  NOT NULL,
    stock_actual int  NOT NULL,
    imagen varchar(255)  NOT NULL,
    fecha_caducidad date  NOT NULL,
    fecha_ingreso date  NOT NULL,
    marca varchar(100)  NOT NULL,
    industria varchar(100)  NOT NULL,
    area varchar(150)  NOT NULL,
    estanteria varchar(150)  NOT NULL,
    almacen varchar(150)  NOT NULL,
    estado varchar(30)  NOT NULL,
    CONSTRAINT PRODUCTO_pk PRIMARY KEY (id_producto,codigo_barra)
);

-- Table: PROMOCIONES
CREATE TABLE PROMOCIONES (
    id_promocion decimal(10,0)  NOT NULL,
    id_producto decimal(10,0)  NOT NULL,
    codigo_barra varchar(150)  NOT NULL,
    fecha_inicio date  NOT NULL,
    fecha_fin date  NOT NULL,
    CONSTRAINT PROMOCIONES_pk PRIMARY KEY (id_promocion)
);

-- Table: PROVEEDOR
CREATE TABLE PROVEEDOR (
    id_proveedor serial  NOT NULL,
    nombre varchar(150)  NOT NULL,
    direccion varchar(150)  NOT NULL,
    telefono numeric(8,0)  NOT NULL,
    email varchar(100)  NOT NULL,
    razon_social varchar(150)  NOT NULL,
    cedula_ruc varchar(20)  NOT NULL,
    estado varchar(30)  NOT NULL,
    CONSTRAINT PROVEEDOR_pk PRIMARY KEY (id_proveedor)
);

-- Table: SUBCATEGORIA
CREATE TABLE SUBCATEGORIA (
    id_subcategoria decimal(15,0)  NOT NULL,
    nombre varchar(150)  NOT NULL,
    id_categoria decimal(15,0)  NOT NULL,
    CONSTRAINT SUBCATEGORIA_pk PRIMARY KEY (id_subcategoria)
);

-- foreign keys
-- Reference: COMPRA_PROVEEDOR (table: COMPRA)
ALTER TABLE COMPRA ADD CONSTRAINT COMPRA_PROVEEDOR
    FOREIGN KEY (id_proveedor)
    REFERENCES PROVEEDOR (id_proveedor)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: DETALLE_COMPRA_COMPRA (table: DETALLE_COMPRA)
ALTER TABLE DETALLE_COMPRA ADD CONSTRAINT DETALLE_COMPRA_COMPRA
    FOREIGN KEY (id_compra)
    REFERENCES COMPRA (id_compra)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: DETALLE_COMPRA_PRODUCTO (table: DETALLE_COMPRA)
ALTER TABLE DETALLE_COMPRA ADD CONSTRAINT DETALLE_COMPRA_PRODUCTO
    FOREIGN KEY (id_producto, codigo_barra)
    REFERENCES PRODUCTO (id_producto, codigo_barra)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: DETALLE_VENTA_FACTURA (table: DETALLE_FACTURA)
ALTER TABLE DETALLE_FACTURA ADD CONSTRAINT DETALLE_VENTA_FACTURA
    FOREIGN KEY (num_autorizacion)
    REFERENCES FACTURA (num_autorizacion)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: DETALLE_VENTA_PRODUCTO (table: DETALLE_FACTURA)
ALTER TABLE DETALLE_FACTURA ADD CONSTRAINT DETALLE_VENTA_PRODUCTO
    FOREIGN KEY (id_producto, codigo_barra)
    REFERENCES PRODUCTO (id_producto, codigo_barra)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FACTURA_CLIENTE (table: FACTURA)
ALTER TABLE FACTURA ADD CONSTRAINT FACTURA_CLIENTE
    FOREIGN KEY (id_cliente)
    REFERENCES CLIENTE (id_cliente)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FACTURA_EMPLEADO (table: FACTURA)
ALTER TABLE FACTURA ADD CONSTRAINT FACTURA_EMPLEADO
    FOREIGN KEY (id_empleado)
    REFERENCES EMPLEADO (id_empleado)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: PRODUCTO_SUBCATEGORIA (table: PRODUCTO)
ALTER TABLE PRODUCTO ADD CONSTRAINT PRODUCTO_SUBCATEGORIA
    FOREIGN KEY (id_subcategoria)
    REFERENCES SUBCATEGORIA (id_subcategoria)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: PROMOCIONES_PRODUCTO (table: PROMOCIONES)
ALTER TABLE PROMOCIONES ADD CONSTRAINT PROMOCIONES_PRODUCTO
    FOREIGN KEY (id_producto, codigo_barra)
    REFERENCES PRODUCTO (id_producto, codigo_barra)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: SUBCATEGORIA_CATEGORIA (table: SUBCATEGORIA)
ALTER TABLE SUBCATEGORIA ADD CONSTRAINT SUBCATEGORIA_CATEGORIA
    FOREIGN KEY (id_categoria)
    REFERENCES CATEGORIA (id_categoria)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

