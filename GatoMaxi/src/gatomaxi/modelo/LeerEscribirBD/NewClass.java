/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo.LeerEscribirBD;

import gatomaxi.vista.VentaRegistroProductos;
import java.util.Random;

/**
 *
 * @author usuario
 */
public class NewClass {
    
    public static void main(String args[]) {
        
        System.out.println(generateBarcodeNumber(13));
    }
    public static String generateBarcodeNumber(int length) {
        Random random = new Random();
        StringBuilder barcode = new StringBuilder();
        for (int i = 0; i < length; i++) {
            barcode.append(random.nextInt(10)); // Añade un dígito aleatorio (0-9)
        }
        return barcode.toString();
    }
}
