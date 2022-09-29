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

        
         //  Llamada uno = new Llamada();
           
//           uno.generarLlamada();
           ListaLlamadas agenda = new ListaLlamadas();
           
           agenda.generarRegistroLlamadas();
           
           for (int i = 0; i < agenda.getRegistroLlamadas().size(); i++) {
            System.out.println(agenda.getRegistroLlamadas().toString()); 
        }
          
           
        
           
    }

}
