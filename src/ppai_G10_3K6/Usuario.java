package ppai_G10_3K6;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String contrasena;
    private String nombreUsuario;
    private Empleado empleado;

    public Usuario(String contrasena, String nombreUsuario, Empleado empleado) {
        this.contrasena = contrasena;
        this.nombreUsuario = nombreUsuario;
        this.empleado = empleado;
    }

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void conocerEmpleado(){}

    @Override
    public String toString() {
        return "Usuario{" + "contrasena='" + contrasena + '\'' + ", nombreUsuario='" + nombreUsuario + '\'' + ", empleado=" + empleado + '}';
    }
}
