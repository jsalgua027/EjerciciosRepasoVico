/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listallamadas;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author nacho
 */
public class Llamada {
   private String identificativo;
   private String numeroOrigen;
   private String numeroDestino;
   private LocalDateTime inicioLlamada;
   private LocalDateTime finLlamda;

    public Llamada(String identificativo, String numeroOrigen, String numeroDestino, LocalDateTime inicioLlamada, LocalDateTime finLlamda) {
        this.identificativo = identificativo;
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.inicioLlamada = inicioLlamada;
        this.finLlamda = finLlamda;
    }

    public Llamada() {
    }

    public String getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(String identificativo) {
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
        return "Llamada{" + "identificativo=" + identificativo + ", numeroOrigen=" + numeroOrigen + ", numeroDestino=" + numeroDestino + ", inicioLlamada=" + inicioLlamada + ", finLlamda=" + finLlamda + '}';
    }
    
   
   
}
