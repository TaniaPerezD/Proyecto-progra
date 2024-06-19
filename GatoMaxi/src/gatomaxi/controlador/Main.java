/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gatomaxi.controlador;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import gatomaxi.vista.InicioSesion;


/**
 *
 * @author pdmor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlatMacLightLaf.setup();

    
        
        InicioSesion ini = new InicioSesion();
        ini.setVisible(true); 
    }
    
}
