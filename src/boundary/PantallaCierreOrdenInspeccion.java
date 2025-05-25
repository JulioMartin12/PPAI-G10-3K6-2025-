package boundary;

import gestor.GestorCierreOrdenInspeccion;

public class PantallaCierreOrdenInspeccion {
    private GestorCierreOrdenInspeccion gestor = new GestorCierreOrdenInspeccion();

    public void habilitarventana() {}

    public void seleccionarOpcionCerrarOrdenInspeccion() {
        if(this.gestor.opcionCerrarOrdenInspeccion()) {
            System.out.printf("Logueado");
            gestor.buscarEmpleadoLogueado();
            gestor.buscarOrdenes();
            System.out.printf("" + gestor.getOrdenes().size());
        }else {
            System.out.printf("No SOS EL LOGUEADO");
        }

    }

    public void mostarMernsajeBusquedaVacia(){}

    public void mostarOrdenesOrdenados(){}

    public void solicitarObservacionDeCierre(){}

    public void tomarOrdenSelec(){}

    public void tomarObservacion(){}

    public void tomarTiposComandos(){}

    public void tomarConfirmacion(){}

    public void mostrarMotivosTipo(){}

    public void solicitarConfirmacion(){}




}
