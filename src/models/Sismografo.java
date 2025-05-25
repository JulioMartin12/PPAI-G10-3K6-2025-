package models;

import java.time.LocalDateTime;

public class Sismografo {


    private LocalDateTime fechaAdquisicion;
    private int identificadorSismografo;
    private double nroSerie;
    private CambioEstado cambioEstado;
    private EstacionSismologica estacionSismologica;
    private Estado estado;

    public Sismografo(LocalDateTime fechaAdquisicion, int identificadorSismografo, double nroSerie, CambioEstado cambioEstado, EstacionSismologica estacionSismologica, Estado estado) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.identificadorSismografo = identificadorSismografo;
        this.nroSerie = nroSerie;
        this.cambioEstado = cambioEstado;
        this.estacionSismologica = estacionSismologica;
        this.estado = estado;
    }

    public Sismografo(LocalDateTime fechaAdquisicion, int identificadorSismografo, double nroSerie) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.identificadorSismografo = identificadorSismografo;
        this.nroSerie = nroSerie;
    }

    public LocalDateTime getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDateTime fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getIdentificadorSismografo() {
        return identificadorSismografo;
    }

    public void setIdentificadorSismografo(int identificadorSismografo) {
        this.identificadorSismografo = identificadorSismografo;
    }

    public double getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(double nroSerie) {
        this.nroSerie = nroSerie;
    }

    public CambioEstado getCambioEstado() {
        return cambioEstado;
    }

    public void setCambioEstado(CambioEstado cambioEstado) {
        this.cambioEstado = cambioEstado;
    }

    public EstacionSismologica getEstacionSismologica() {
        return estacionSismologica;
    }

    public void setEstacionSismologica(EstacionSismologica estacionSismologica) {
        this.estacionSismologica = estacionSismologica;
    }

    public Estado getestado() {
        return estado;
    }

    public void setestado(Estado estado) {
        this.estado = estado;
    }

    public void conocerEstacionSismologica() {}

    public void conocerCambioEstado() {}

    public void conocerestado() {}

    public  void actualizarEstado(Estado estado) {
        this.setestado(estado) ;
    }

    public  boolean sosMiSismografo(Sismografo sismografo){
        return this.getEstacionSismologica().getSismografo().equals(sismografo);
    }



    @Override
    public String toString() {
        return "Sismografo{" +
                "fechaAdquisicion=" + fechaAdquisicion +
                ", identificadorSismografo=" + identificadorSismografo +
                ", nroSerie=" + nroSerie +
                ", cambioEstado=" + cambioEstado +
                ", estacionSismologica=" + estacionSismologica +
                ", estado=" + estado +
                '}';
    }
}


