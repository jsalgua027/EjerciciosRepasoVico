/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listallamadas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Llamada {

    /* lo ideal es quwe los numeros identificativos sean un String pero por simplicidad 
     voy a generar un entero aleatorio, a la persona que le solicito los datos de la llamada no tiene porque saber el número de ID */
    private int identificativo;
    private String numeroOrigen;
    private String numeroDestino;
    private LocalDateTime inicioLlamada;
    private LocalDateTime finLlamda;
    private long totalLlamada;
    
    public Llamada(int identificativo, String numeroOrigen, String numeroDestino, LocalDateTime inicioLlamada, LocalDateTime finLlamda, long totalLlamada) {
        this.identificativo = (int) (Math.random() * 50 + 1);
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.inicioLlamada = inicioLlamada;
        this.finLlamda = finLlamda;
        this.totalLlamada=totalLlamada;
    }

    public Llamada() {
    }

    public long getTotalLlamada() {
        return totalLlamada;
    }
    
    
    
    public int getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }

    public String getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(String numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public LocalDateTime getInicioLlamada() {
        return inicioLlamada;
    }

    public void setInicioLlamada(LocalDateTime inicioLlamada) {
        this.inicioLlamada = inicioLlamada;
    }

    public LocalDateTime getFinLlamda() {
        return finLlamda;
    }

    public void setFinLlamda(LocalDateTime finLlamda) {
        this.finLlamda = finLlamda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.identificativo);
        hash = 23 * hash + Objects.hashCode(this.numeroOrigen);
        hash = 23 * hash + Objects.hashCode(this.numeroDestino);
        hash = 23 * hash + Objects.hashCode(this.inicioLlamada);
        hash = 23 * hash + Objects.hashCode(this.finLlamda);
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
        final Llamada other = (Llamada) obj;
        if (!Objects.equals(this.identificativo, other.identificativo)) {
            return false;
        }
        if (!Objects.equals(this.numeroOrigen, other.numeroOrigen)) {
            return false;
        }
        if (!Objects.equals(this.numeroDestino, other.numeroDestino)) {
            return false;
        }
        if (!Objects.equals(this.inicioLlamada, other.inicioLlamada)) {
            return false;
        }
        return Objects.equals(this.finLlamda, other.finLlamda);
    }
        

    @Override
    public String toString() {
        return "Llamada{" + "identificativo=" + identificativo + ", numeroOrigen=" + numeroOrigen + ", numeroDestino=" + numeroDestino + ", inicioLlamada=" + inicioLlamada + ", finLlamda=" + finLlamda + ", totalLlamada=" + getTotalLlamada()+ '}';
    }

   
        // el método generarFechaLlamada genera sirve para generar las fechas y horas que necesito para generar las llamadas
    public LocalDateTime generarFechaLlamada() {
        Scanner datos = new Scanner(System.in);
        int anio, mes, dia, hora, minutos, segundos;

        System.out.println("Vamos a ver la fecha de la llamada");
        System.out.println("Indique el año= ");
        anio = datos.nextInt();
        System.out.println("Indique el  numero de mes= ");
        mes = datos.nextInt();
        System.out.println("Indique el dia= ");
        dia = datos.nextInt();
        System.out.println("Vamos a ver la hora exacta de la llamada");
        System.out.println("Indique la hora= ");
        hora = datos.nextInt();
        System.out.println("Indique los minutos = ");
        minutos = datos.nextInt();
        System.out.println("Indique los segundos = ");
        segundos = datos.nextInt();
        LocalDateTime fechaAux = LocalDateTime.of(anio, mes, dia, hora, minutos, segundos);

        return fechaAux;
    }

    // metodo generar llamdas, este metodo va a pedir directamente por Scanner los datos para crear una llamada;
    public Llamada generarLlamada() {
        Scanner entrada = new Scanner(System.in);// entrada de datos
        Llamada auxLlamada = new Llamada();// objeto Llamada que va a devolver el metodo
        int numeroId = (int) (Math.random() * 50 + 1);
        this.identificativo = numeroId;
        System.out.println("Indique el número de  teléfono de origen");
        this.numeroOrigen = entrada.nextLine();
        System.out.println("FECHA Y HORA INICIO LLAMADA");
        this.inicioLlamada=generarFechaLlamada();
        System.out.println("Indique el número de teléfono de destino");
        this.numeroDestino=entrada.nextLine();
         System.out.println("FECHA Y HORA FIN DE LLAMADA");
        this.finLlamda=generarFechaLlamada();
        this.totalLlamada= Duration.between(inicioLlamada, finLlamda).toSeconds();
        return auxLlamada;

    }
}
