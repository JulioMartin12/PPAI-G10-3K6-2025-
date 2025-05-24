package gestor;

import models.*;

import java.time.LocalDateTime;


public class GestorCierreOrdenInspeccion {
    private  CargasDatos cargarDatos;
    private LocalDateTime fechaActual;
    private OrdenDeInspeccion ordenSeleccionada;
    private Empleado empleadoLogueado;
    private String notificacionMail;
    private String comentarioMotivos;
    private  Sismografo sismografoElegido;
    private String observacion;
    private  Sesion sesionLogueado;
    private  Usuario usuarioLogueado;



    public GestorCierreOrdenInspeccion() {
        cargarDatos = new CargasDatos();
    }


    public LocalDateTime getFechaActual() {
        return fechaActual;
    }

    public boolean opcionCerrarOrdenInspeccion() {
        return this.buscarEmpleadoLogueado();
    }

    public boolean buscarEmpleadoLogueado(){
        for (Sesion sesion : this.cargarDatos.getSesiones()){
            if(sesion.getFechaHoraHasta() == null) {
                this.sesionLogueado = sesion;
                this.usuarioLogueado = sesion.getUsuario();
                this.buscarOrdenes();
             return true;
            }
        }
        return false;
    }

    public void buscarOrdenes(){

    }

    public void tomarOrdenSelec(){}

    public void tomarObservacion(){}

    public void buscarOrdenSelect(){}

    public void habilitarBajaSismografo(){}

    public void tomarConfirmacion(){}

    public void tomarSeleccionMotivoTipo(){}

    public void tomarComentario(){}

    public void validaDatos(){}

    public void actualizarOrden(){}

    public void actualizarEstadoSismogrado(){}

    public void buscarNotificables(){}

    public void generarNotificacion(){}

    public void notificarResponsable(){}

    public  void finCU(){}




}
