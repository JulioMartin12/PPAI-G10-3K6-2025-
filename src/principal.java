import gestor.GestorCierreOrdenInspeccion;

public class principal {

    public static void main(String[] args) {

        GestorCierreOrdenInspeccion gestorCierreOrdenInspeccion = new GestorCierreOrdenInspeccion();

       gestorCierreOrdenInspeccion.buscarEmpleadoLogueado();
       gestorCierreOrdenInspeccion.buscarOrdenes();
    }
}
