/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listallamadas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListaLlamadas agenda = new  ListaLlamadas();

        agenda.generarRegistroLlamadas();
         
        System.out.println("------- LISTA ORDENADA POR FECHA tiempoTotal de llamada -------");
        agenda.generarRegistroLlamadas().stream()
                .sorted((p1,p2)->(int)p1.getTotalLlamada()-(int)p2.getTotalLlamada());
                
        for (int i = 0; i < agenda.generarRegistroLlamadas().size(); i++) {
            System.out.println(agenda.getRegistroLlamadas().toString()); 
        }
        

    }

}
