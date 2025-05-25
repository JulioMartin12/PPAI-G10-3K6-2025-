package boundary;

import gestor.GestorCierreOrdenInspeccion;

import java.util.Random;
import java.util.Scanner;

public class PantallaCierreOrdenInspeccion {
    private GestorCierreOrdenInspeccion gestor = new GestorCierreOrdenInspeccion();

    public void habilitarventana() {}

    public void seleccionarOpcionCerrarOrdenInspeccion() {
        if(this.gestor.opcionCerrarOrdenInspeccion()) {
            System.out.println("Logueado");
            if(gestor.buscarEmpleadoLogueado()) {
                gestor.buscarOrdenes();
                this.mostarOrdenesOrdenados();
            }else{System.out.println("No SOS EL LOGUEADO");}
         }else {
            System.out.println("No SOS EL LOGUEADO");
        }

    }

    public void mostarMernsajeBusquedaVacia(){}

    public void mostarOrdenesOrdenados(){

             gestor.ordenarXFechaDeFinalizacion();
            System.out.println("Ingrese una Opcion: ");
            Random random = new Random();
            int indiceAleatorio = random.nextInt(gestor.getOrdenes().size()+1);
            System.out.println(indiceAleatorio);
            tomarOrdenSelec(indiceAleatorio);
            solicitarObservacionDeCierre();

    }

    public void solicitarObservacionDeCierre(){

        tomarObservacion();
    }

    public void tomarOrdenSelec(int indice){
        if(indice !=0)
            gestor.tomarOrdenSelec(indice);
    }

    public void tomarObservacion(){
        Scanner escanner = new Scanner(System.in);
        System.out.println("Ingrese la observación de cierre: ");
        String observacion = escanner.nextLine();
        gestor.tomarObservacion(observacion);
    }

    public void tomarTiposComandos(){}

    public void tomarConfirmacion(){}

    public void mostrarMotivosTipo(){}

    public void solicitarConfirmacion(){}




}
