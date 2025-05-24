package models;

import java.time.LocalDateTime;

public class CambioEstado {

    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private Empleado responsable;
    private Estado estado;
    private MotivoFueraServicio motivoFueraServicio;

    public CambioEstado(MotivoFueraServicio motivoFueraServicio, Empleado responsable, LocalDateTime fechaHoraFin, LocalDateTime fechaHoraInicio) {
        this.motivoFueraServicio = motivoFueraServicio;
        this.responsable = responsable;
        this.fechaHoraFin = fechaHoraFin;
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public CambioEstado(LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, Empleado responsable, Estado estado, MotivoFueraServicio motivoFueraServicio) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.responsable = responsable;
        this.estado = estado;
        this.motivoFueraServicio = motivoFueraServicio;
    }

    public Empleado getResponsable() {
        return responsable;
    }

    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public MotivoFueraServicio getMotivoFueraServicio() {
        return motivoFueraServicio;
    }

    public void setMotivoFueraServicio(MotivoFueraServicio motivoFueraServicio) {
        this.motivoFueraServicio = motivoFueraServicio;
    }

    @Override
    public String toString() {
        return "CambioEstado{" +
                "fechaHoraInicio=" + fechaHoraInicio +
                ", fechaHoraFin=" + fechaHoraFin +
                ", responsable=" + responsable +
                ", estado=" + estado +
                ", motivoFueraServicio=" + motivoFueraServicio +
                '}';
    }

    public void conoceEstado() {}
    public void conoceMotivoFueraServicio() {}
}
