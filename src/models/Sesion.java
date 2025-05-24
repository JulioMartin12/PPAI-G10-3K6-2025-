package models;


import java.time.LocalDateTime;

public class Sesion {
    private LocalDateTime fechaHoraDesde;
    private LocalDateTime fechaHoraHasta;
    private Usuario usuario;

    public Sesion(LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta, Usuario usuario) {
        this.fechaHoraDesde = fechaHoraDesde;
        this.fechaHoraHasta = fechaHoraHasta;
        this.usuario = usuario;
    }

    public LocalDateTime getFechaHoraDesde() {
        return fechaHoraDesde;
    }

    public void setFechaHoraDesde(LocalDateTime fechaHoraDesde) {
        this.fechaHoraDesde = fechaHoraDesde;
    }

    public LocalDateTime getFechaHoraHasta() {
        return fechaHoraHasta;
    }

    public void setFechaHoraHasta(LocalDateTime fechaHoraHasta) {
        this.fechaHoraHasta = fechaHoraHasta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario sosSesionActual(Sesion sesion) {
        if( sesion.getUsuario().equals(this.getUsuario()) && sesion.getFechaHoraHasta() == null ) {
            return sesion.getUsuario();
        }
          return null;
    }
}


