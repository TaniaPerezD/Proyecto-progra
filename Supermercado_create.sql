-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2024-06-14 03:42:52.589

-- tables
-- Table: CATEGORIA
CREATE TABLE CATEGORIA (
    id_categoria serial  NOT NULL,
    nombre varchar(100)  NOT NULL,
    descripcion text  NOT NULL,
    CONSTRAINT CATEGORIA_pk PRIMARY KEY (id_categoria)
);

-- Table: CLIENTE
CREATE TABLE CLIENTE (
    razon_social varchar(100)  NOT NULL,
    nombre varchar(100)  NOT NULL,
    ap_materno varchar(150)  NOT NULL,
    ap_paterno varchar(150)  NOT NULL,
    telefono decimal(8,0)  NOT NULL,
    CONSTRAINT CLIENTE_pk PRIMARY KEY (razon_social)
);

-- Table: COMPRA
CREATE TABLE COMPRA (
    id_compra serial  NOT NULL,
    id_proveedor int  NOT NULL,
    fecha date  NOT NULL,
    CONSTRAINT COMPRA_pk PRIMARY KEY (id_compra)
);

-- Table: DETALLE_COMPRA
CREATE TABLE DETALLE_COMPRA (
    id_detalle_compra serial  NOT NULL,
    cantidad int  NOT NULL,
    id_compra int  NOT NULL,
    id_producto int  NOT NULL,
    codigo_barra varchar(150)  NOT NULL,
    CONSTRAINT DETALLE_COMPRA_pk PRIMARY KEY (id_detalle_compra)
);

-- Table: DETALLE_VENTA
CREATE TABLE DETALLE_VENTA (
    id_detalle_venta serial  NOT NULL,
    id_venta int  NOT NULL,
    id_producto int  NOT NULL,
    codigo_barra varchar(150)  NOT NULL,
    cantidad int  NOT NULL,
    CONSTRAINT DETALLE_VENTA_pk PRIMARY KEY (id_detalle_venta)
);

-- Table: EMPLEADO
CREATE TABLE EMPLEADO (
    id_empleado serial  NOT NULL,
    nombre varchar(100)  NOT NULL,
    ap_paterno varchar(100)  NOT NULL,
    ap_materno varchar(100)  NOT NULL,
    email varchar(150)  NOT NULL,
    contrasenia varchar(250)  NOT NULL,
    rol varchar(50)  NOT NULL,
    fecha_contratacion date  NOT NULL,
    direccion varchar(250)  NOT NULL,
    CONSTRAINT EMPLEADO_pk PRIMARY KEY (id_empleado)
);

-- Table: FACTURA
CREATE TABLE FACTURA (
    num_autorizacion serial  NOT NULL,
    llave_dosificacion varchar(45)  NOT NULL,
    fecha_emision date  NOT NULL,
    hora_emision time  NOT NULL,
    id_venta int  NOT NULL,
    id_numero int  NOT NULL,
    CONSTRAINT FACTURA_pk PRIMARY KEY (num_autorizacion)
);

-- Table: NUMERO_FACTURA
CREATE TABLE NUMERO_FACTURA (
    id_numero serial  NOT NULL,
    numero decimal(10,0)  NOT NULL,
    anio date  NOT NULL,
    CONSTRAINT NUMERO_FACTURA_pk PRIMARY KEY (id_numero)
);

-- Table: PRODUCTO
CREATE TABLE PRODUCTO (
    id_producto serial  NOT NULL,
    codigo_barra varchar(150)  NOT NULL,
    nombre varchar(150)  NOT NULL,
    descripcion text  NOT NULL,
    precio_compra decimal(10,2)  NOT NULL,
    precio_venta decimal(10,2)  NOT NULL,
    stock_minimo int  NOT NULL,
    stock_maximo int  NOT NULL,
    stock_actual int  NOT NULL,
    imagen varchar(2)  NOT NULL,
    fecha_caducidad date  NOT NULL,
    fecha_ingreso date  NOT NULL,
    marca varchar(100)  NOT NULL,
    industria varchar(100)  NOT NULL,
    area varchar(150)  NOT NULL,
    estanteria varchar(150)  NOT NULL,
    almacen varchar(150)  NOT NULL,
    id_subcategoria int  NOT NULL,
    CONSTRAINT PRODUCTO_pk PRIMARY KEY (id_producto,codigo_barra)
);

-- Table: PROMOCIONES
CREATE TABLE PROMOCIONES (
    id_promocion serial  NOT NULL,
    descuento decimal(7,2)  NOT NULL,
    fecha_inicio date  NOT NULL,
    fecha_fin date  NOT NULL,
    id_producto int  NOT NULL,
    codigo_barra varchar(150)  NOT NULL,
    CONSTRAINT PROMOCIONES_pk PRIMARY KEY (id_promocion)
);

-- Table: PROVEEDOR
CREATE TABLE PROVEEDOR (
    id_proveedor serial  NOT NULL,
    nombre varchar(150)  NOT NULL,
    direccion varchar(150)  NOT NULL,
    telefono numeric(8,0)  NOT NULL,
    email varchar(100)  NOT NULL,
    tipo_persona varchar(155)  NOT NULL,
    razon_social varchar(150)  NOT NULL,
    CONSTRAINT PROVEEDOR_pk PRIMARY KEY (id_proveedor)
);

-- Table: SUBCATEGORIA
CREATE TABLE SUBCATEGORIA (
    id_subcategoria serial  NOT NULL,
    nombre varchar(150)  NOT NULL,
    id_categoria int  NOT NULL,
    CONSTRAINT SUBCATEGORIA_pk PRIMARY KEY (id_subcategoria)
);

-- Table: VENTA
CREATE TABLE VENTA (
    id_venta serial  NOT NULL,
    razon_social varchar(100)  NOT NULL,
    id_empleado int  NOT NULL,
    fecha_venta date  NOT NULL,
    metodo_pago varchar(60)  NOT NULL,
    hora_venta time  NOT NULL,
    CONSTRAINT VENTA_pk PRIMARY KEY (id_venta)
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

-- Reference: DETALLE_VENTA_PRODUCTO (table: DETALLE_VENTA)
ALTER TABLE DETALLE_VENTA ADD CONSTRAINT DETALLE_VENTA_PRODUCTO
    FOREIGN KEY (id_producto, codigo_barra)
    REFERENCES PRODUCTO (id_producto, codigo_barra)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: DETALLE_VENTA_VENTA (table: DETALLE_VENTA)
ALTER TABLE DETALLE_VENTA ADD CONSTRAINT DETALLE_VENTA_VENTA
    FOREIGN KEY (id_venta)
    REFERENCES VENTA (id_venta)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FACTURA_NUMERO_FACTURA (table: FACTURA)
ALTER TABLE FACTURA ADD CONSTRAINT FACTURA_NUMERO_FACTURA
    FOREIGN KEY (id_numero)
    REFERENCES NUMERO_FACTURA (id_numero)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FACTURA_VENTA (table: FACTURA)
ALTER TABLE FACTURA ADD CONSTRAINT FACTURA_VENTA
    FOREIGN KEY (id_venta)
    REFERENCES VENTA (id_venta)  
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

-- Reference: VENTA_CLIENTE (table: VENTA)
ALTER TABLE VENTA ADD CONSTRAINT VENTA_CLIENTE
    FOREIGN KEY (razon_social)
    REFERENCES CLIENTE (razon_social)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: VENTA_EMPLEADO (table: VENTA)
ALTER TABLE VENTA ADD CONSTRAINT VENTA_EMPLEADO
    FOREIGN KEY (id_empleado)
    REFERENCES EMPLEADO (id_empleado)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

