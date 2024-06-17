/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

/**
 *
 * @author usuario
 */

import java.util.Date;
import java.time.LocalTime;
public class Factura {
	private int num_autorizacion; //este es el id de la clase
	private int llave_dosificacion;
        private Date fecha_emision;
        private LocalTime hora_emision;
        private int num_factura;
        private int id_empleado;
	private int id_cliente;
	
	
	//Constructores
        public Factura(){
            
        }

        public Factura(int num_autorizacion, int llave_dosificacion, Date fecha_emision, LocalTime hora_emision, int num_factura, int id_empleado, int id_cliente) {
            this.num_autorizacion = num_autorizacion;
            this.llave_dosificacion = llave_dosificacion;
            this.fecha_emision = fecha_emision;
            this.hora_emision = hora_emision;
            this.num_factura = num_factura;
            this.id_empleado = id_empleado;
            this.id_cliente = id_cliente;
        }
        
        //Getter y setter

    public int getNum_autorizacion() {
        return num_autorizacion;
    }

    public void setNum_autorizacion(int num_autorizacion) {
        this.num_autorizacion = num_autorizacion;
    }

    public int getLlave_dosificacion() {
        return llave_dosificacion;
    }

    public void setLlave_dosificacion(int llave_dosificacion) {
        this.llave_dosificacion = llave_dosificacion;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public LocalTime getHora_emision() {
        return hora_emision;
    }

    public void setHora_emision(LocalTime hora_emision) {
        this.hora_emision = hora_emision;
    }

    public int getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(int num_factura) {
        this.num_factura = num_factura;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
        
        
}

