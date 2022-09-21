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
//        ArrayList<Llamada> listaLlamadas = new ArrayList<>(); // ArryList donde guardo todas las llamadas
//        Scanner menu = new Scanner(System.in);
//        boolean control = true; //variable para el control del bucle
//        int opciones; // variable para la gestión del menu del programa
//
//        Llamada primera = new Llamada();

        ArrayList<Llamada> registroAux = new ArrayList<>();
        Scanner datos = new Scanner(System.in);
        int opcion = 0; //variable de control del menu
        System.out.println("Bienvenido al registro de llamadas");
        System.out.println("1.para introducir los datos de cada llamada");
        System.out.println("2.para salir del menu");
        opcion = datos.nextInt();
        do {
            switch (opcion) {
                case 1:
                   
                    System.out.println("A seleccionado introducir datos, comencemos!!!");

                    break;
                case 2:
                    System.out.println("A seleccionado salir del menu");
                    break;
            }
        } while (opcion != 2);

    }

}
