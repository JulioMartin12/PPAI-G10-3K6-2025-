package models;

import java.time.LocalDateTime;

public class Sismografo {


    private LocalDateTime fechaAdquisicion;
    private int identificadorSismografo;
    private double nroSerie;
    private CambioEstado cambioEstado;
    private EstacionSismologica estacionSismologica;
    private Estado estadoActual;

    public Sismografo(LocalDateTime fechaAdquisicion, int identificadorSismografo, double nroSerie, CambioEstado cambioEstado, EstacionSismologica estacionSismologica, Estado estadoActual) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.identificadorSismografo = identificadorSismografo;
        this.nroSerie = nroSerie;
        this.cambioEstado = cambioEstado;
        this.estacionSismologica = estacionSismologica;
        this.estadoActual = estadoActual;
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

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public void conocerEstacionSismologica() {}

    public void conocerCambioEstado() {}

    public void conocerEstadoActual() {}

    public  void actualizarEstado(){}

    public  void sosMiSismografo(){}



    @Override
    public String toString() {
        return "Sismografo{" +
                "fechaAdquisicion=" + fechaAdquisicion +
                ", identificadorSismografo=" + identificadorSismografo +
                ", nroSerie=" + nroSerie +
                ", cambioEstado=" + cambioEstado +
                ", estacionSismologica=" + estacionSismologica +
                ", estadoActual=" + estadoActual +
                '}';
    }
}


