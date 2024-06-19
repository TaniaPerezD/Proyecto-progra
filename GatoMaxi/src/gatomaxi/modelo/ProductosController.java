/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gatomaxi.vista.VentanaCompraProv;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;


public class ProductosController implements ActionListener{
    private Producto prod;
    private ProductosDao dao;
    private VentanaCompraProv views;
    DefaultTableModel modelo = new DefaultTableModel();

    public ProductosController(Producto prod, ProductosDao dao, VentanaCompraProv views) {
        this.prod = prod;
        this.dao = dao;
        this.views = views;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
   
}
