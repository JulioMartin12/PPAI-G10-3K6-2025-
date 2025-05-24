package gestor;

import models.*;

import java.time.LocalDateTime;


public class GestorCierreOrdenInspeccion {

    private LocalDateTime fechaActual;
    private OrdenDeInspeccion ordenSeleccionada;
    private Empleado empleadoLogueado;
    private String notificacionMail;
    private String comentarioMotivos;
    private  Sismografo sismografoElegido;
    private String observacion;
    private  Sesion sesionLogueado;



    public GestorCierreOrdenInspeccion() {

    }


    public LocalDateTime getFechaActual() {
        return fechaActual;
    }

    public void opcionCerrarOrdenInspeccion() {}

    public void buscarEmpleadoLogueado(){}

    public void buscarOrdenes(){}

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
