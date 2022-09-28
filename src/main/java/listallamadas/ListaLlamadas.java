/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listallamadas;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class ListaLlamadas {

    private ArrayList<Llamada> registroLlamadas;

    public ListaLlamadas(ArrayList<Llamada> registroLlamadas) {
        this.registroLlamadas = registroLlamadas;
    }

    public ArrayList<Llamada> getRegistroLlamadas() {
        return registroLlamadas;
    }

    public void setRegistroLlamadas(ArrayList<Llamada> registroLlamadas) {
        this.registroLlamadas = registroLlamadas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.registroLlamadas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ListaLlamadas other = (ListaLlamadas) obj;
        return Objects.equals(this.registroLlamadas, other.registroLlamadas);
    }

    @Override
    public String toString() {
        return "ListaLlamadas{" + "registroLlamadas=" + registroLlamadas + '}';
    }

    //metodo que recibe llamada y generas una lista de llamadas
    public ArrayList<Llamada> generarRegistroLlamadas(Llamada aux) {
        ArrayList<Llamada> registroAux = new ArrayList<>();
       
        Scanner datos = new Scanner(System.in);
        int opcion = 0; //variable de control del menu
        System.out.println("Bienvenido al registro de llamadas");
        System.out.println("1.para introducir los datos de cada llamada");
        System.out.println("2.para salir del menu");

        switch (opcion) {
            case 1:
                    do{
                        aux.generarLlamada();
                        registroAux.add(aux);
                        
                    }while(registroAux.size()<4);
                     
                break;
            case 2:
                System.out.println("A seleccionado salir del menu");
                break;
        }

        return registroAux;
    }

}
