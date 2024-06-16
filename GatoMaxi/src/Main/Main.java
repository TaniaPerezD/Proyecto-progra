/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import gatomaxi.vista.InicioSesion;
import gatomaxi.vista.PantallaCarga;
import javax.swing.SwingUtilities;

/**
 *
 * @author pdmor
 */
public class Main {
    public static void main(String[] args) {
       // Asegúrate de ejecutar el código de la interfaz de usuario en el hilo de despacho de eventos (Event Dispatch Thread)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crea una instancia de la ventana de inicio de sesión y hazla visible
                PantallaCarga inicioSesion = new PantallaCarga();
                inicioSesion.setVisible(true);
            }
        });
    }
        
        
    }
    

