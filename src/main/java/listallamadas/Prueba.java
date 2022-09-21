/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listallamadas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Llamada> listaLlamadas = new ArrayList<>();
        Scanner menu = new Scanner(System.in);
      boolean control= true;
      
     Llamada primera= new Llamada();
     
     primera.generarLlamda();
        System.out.println("*******************************************************");
        System.out.println(primera);
    }
    
}
