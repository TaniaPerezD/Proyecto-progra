/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Listado_Proveedores {
    ArrayList<Proveedor> lista;

    public Listado_Proveedores() {
        lista = new ArrayList();
    }
    
    public void AgregarProveedores(Proveedor p){
        lista.add(p);
    }
    
    
    
    
    
    
}
