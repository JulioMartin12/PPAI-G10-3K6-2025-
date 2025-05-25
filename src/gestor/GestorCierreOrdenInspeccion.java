package gestor;

import models.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


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
    private List<OrdenDeInspeccion> ordenes = new ArrayList<>();
    private Estado estadoRealizado;









	public GestorCierreOrdenInspeccion() {
        cargarDatos = new CargasDatos();
    }
	
    public List<OrdenDeInspeccion> getOrdenes() {
		return ordenes;
	}


	public void setOrdenes(List<OrdenDeInspeccion> ordenes) {
		this.ordenes = ordenes;
	}


    public LocalDateTime getFechaActual() {
        return fechaActual;
    }
    
	public Estado getEstadoRealizado() {
		return estadoRealizado;
	}

	public void setEstadoRealizado(Estado estadoRealizado) {
		this.estadoRealizado = estadoRealizado;
	}

    public boolean opcionCerrarOrdenInspeccion() {
        return this.buscarEmpleadoLogueado();
    }

    public boolean buscarEmpleadoLogueado(){
        for (Sesion sesion : this.cargarDatos.getSesiones()){
            if(sesion.sosSesionActual(this.cargarDatos.enElsistema())!=null) {
                this.sesionLogueado = sesion;
                this.usuarioLogueado = sesion.getUsuario();
                this.empleadoLogueado = this.usuarioLogueado.getEmpleado();
             return true;
            }
        }
        return false;
    }

    public void buscarOrdenes(){
           for (Estado estado: this.cargarDatos.getEstados() ) {
            if (estado.sosCompletamenteRealizada()) {
                this.estadoRealizado = estado;
            }
        }
        for (OrdenDeInspeccion ordenDeInspeccion : this.cargarDatos.getOrdenesDeInspeccion() ) {

            if (ordenDeInspeccion.getEmpleado().equals(this.empleadoLogueado )&& estadoRealizado != null) {
                if ( ordenDeInspeccion.getEstado().equals(estadoRealizado)) {
                    ordenes.add(ordenDeInspeccion);
    			}

                }
    		}

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

    public void ordenarXFechaDeFinalizacion(){
        if(!getOrdenes().isEmpty()){
            getOrdenes().sort(Comparator.comparing(OrdenDeInspeccion::getFechaHoraFinalizacion));
            for (OrdenDeInspeccion ordenDeInspeccion : getOrdenes()) {
                System.out.println("Número de orden: "+ordenDeInspeccion.getNumeroOrden()+" Fecha Finalización:"+ordenDeInspeccion.getFechaHoraFinalizacion() + " Nombre Estacion: " + ordenDeInspeccion.getEstacionSismologica().getNombre() + " Identificador Estacion: " + ordenDeInspeccion.getEstacionSismologica().getCodigoEstacion());
            }
        }
    }

    public  void finCU(){}




}
