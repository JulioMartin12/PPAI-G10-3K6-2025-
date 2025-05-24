package gestor;

import models.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CargasDatos {
    List<Rol> roles = new ArrayList<>();
    List<Empleado> empleados = new ArrayList<>();
    List<MotivoTipo> motivos = new ArrayList<>();
    List<Estado> estados = new ArrayList<>();
    List<Usuario> usuarios = new ArrayList<>();
    List<Sesion> sesiones = new ArrayList<>();
    List<EstacionSismologica> estaciones = new ArrayList<>();
    List<Sismografo> sismografos = new ArrayList<>();
    List<CambioEstado> cambioEstados = new ArrayList<>();

    public CargasDatos() {

        iniciarDatos();
    }



    private void iniciarDatos() {
    crearRoles();

    }

    private void crearRoles() {
        Rol administradorDeRed = new Rol("Administrador de Red", "Gestiona la infraestructura de red y la seguridad del sistema.");
        roles.add(administradorDeRed);
        Rol encargadoDeInstalaciones = new Rol("Encargado de Instalaciones", "Supervisa y coordina la instalación de equipos y sensores.");
        roles.add(encargadoDeInstalaciones);
        Rol sismografo = new Rol("Sismógrafo", "Registra y almacena eventos sísmicos en tiempo real.");
        roles.add(sismografo);
        Rol responsableDeInspecciones = new Rol("Responsable de Inspecciones", "Realiza verificaciones periódicas del estado del sistema.");
        roles.add(responsableDeInspecciones);
        Rol consultorDeReporte = new Rol("Consultor de Reportes", "Genera informes técnicos y estadísticos sobre los eventos sísmicos.");
        roles.add(consultorDeReporte);


        Empleado carlos = new Empleado("Carlos", "Gómez", "carlos@empresa.com", "123456789", administradorDeRed);
        empleados.add(carlos);
        Empleado laura = new Empleado("Laura", "Martínez", "laura@empresa.com", "987654321", sismografo);
        empleados.add(laura);
        Empleado mario = new Empleado("Mario", "Ruiz", "mario@empresa.com", "456123789", responsableDeInspecciones);
        empleados.add(mario);
        Empleado lucia = new Empleado("Lucía", "Fernández", "lucia@empresa.com", "321654987", consultorDeReporte);
        empleados.add(lucia);
        Empleado roberto = new Empleado("Roberto", "Pérez", "roberto@empresa.com", "789456123", encargadoDeInstalaciones);
        empleados.add(roberto);
        Empleado silvia = new Empleado("Silvia", "López", "silvia@empresa.com", "159753486", responsableDeInspecciones);
        empleados.add(silvia);

        MotivoTipo averiaPorVibracion = new MotivoTipo("Avería por vibración", "El sismógrafo sufrió daños debido a vibraciones excesivas.");
        MotivoTipo desgasteComponente = new MotivoTipo("Desgaste de componente", "Algún componente interno del sismógrafo se encuentra desgastado.");
        MotivoTipo falloRegistro = new MotivoTipo("Fallo en sistema de registro", "El sistema de registro de datos dejó de funcionar.");
        MotivoTipo vandalismo = new MotivoTipo("Vandalismo", "El equipo fue dañado intencionalmente por terceros.");
        MotivoTipo falloAlimentacion = new MotivoTipo("Fallo en fuente de alimentación", "La fuente de energía dejó de funcionar correctamente.");
        MotivoTipo inspeccion = new MotivoTipo("Inhabilitación por inspección", "El sismógrafo está fuera de servicio por inspección.");


        motivos.add(averiaPorVibracion);
        motivos.add(desgasteComponente);
        motivos.add(falloRegistro);
        motivos.add(vandalismo);
        motivos.add(falloAlimentacion);
        motivos.add(inspeccion);

        Estado registrado = new Estado("Registrado", "El evento sísmico fue registrado en el sistema.");
        Estado asignado = new Estado("Asignado", "El evento fue asignado a un sismólogo para su análisis.");
        Estado detectado = new Estado("Detectado", "El sismólogo detectó un evento sísmico en los datos.");
        Estado confirmado = new Estado("Confirmado", "El sismólogo confirmó que se trata de un evento sísmico.");
        Estado enAnalisis = new Estado("En Análisis", "El evento está siendo analizado.");
        Estado clasificado = new Estado("Clasificado", "El evento fue clasificado según su tipo y magnitud.");
        Estado conDatosIncompletos = new Estado("Con Datos Incompletos", "El evento tiene datos incompletos.");
        Estado validado = new Estado("Validado", "El evento fue validado por un segundo sismólogo.");
        Estado descartado = new Estado("Descartado", "El evento fue descartado por ser un falso positivo.");
        Estado publicado = new Estado("Publicado", "El evento fue publicado en el portal para ser visible al público.");


        estados.add(registrado);
        estados.add(asignado);
        estados.add(detectado);
        estados.add(confirmado);
        estados.add(enAnalisis);
        estados.add(clasificado);
        estados.add(conDatosIncompletos);
        estados.add(validado);
        estados.add(descartado);
        estados.add(publicado);


        Usuario admin = new Usuario("admin", "admin123",mario);
        Usuario juan = new Usuario("juanperez", "contraseña1",carlos);
        Usuario maria = new Usuario("mariagomez", "claveSegura2025",lucia);
        Usuario invitado = new Usuario("invitado", "visitante",silvia);

        usuarios.add(admin);
        usuarios.add(juan);
        usuarios.add(maria);
        usuarios.add(invitado);

        Sesion sesion1 = new Sesion(LocalDateTime.of(2025, 5, 23, 9, 0), LocalDateTime.of(2025, 5, 23, 11, 0), juan);
        Sesion sesion2 = new Sesion(LocalDateTime.of(2025, 5, 23, 12, 0),invitado);
        Sesion sesion3 = new Sesion(LocalDateTime.of(2025, 5, 22, 14, 30), LocalDateTime.of(2025, 5, 22, 15, 0), maria);
        Sesion sesion5 = new Sesion(LocalDateTime.of(2025, 5, 20, 8, 15), LocalDateTime.of(2025, 5, 20, 9, 45), admin);

        sesiones.add(sesion1);
        sesiones.add(sesion2);
        sesiones.add(sesion3);
        sesiones.add(sesion5);

        Sismografo sismo1 = new Sismografo("SMG-100", "MarcaX", 2022);
        Sismografo sismo2 = new Sismografo("SMG-200", "MarcaY", 2023);
        Sismografo sismo3 = new Sismografo("SMG-300", "MarcaZ", 2021);

        EstacionSismologica estacion1 = new EstacionSismologica(
                "EST001", "DOC-12345", LocalDateTime.of(2023, 3, 15, 10, 30),
                -34.6037, -58.3816, "Estación Central", 987654, sismo1
        );

        EstacionSismologica estacion2 = new EstacionSismologica(
                "EST002", "DOC-54321", LocalDateTime.of(2024, 1, 22, 8, 15),
                -40.8123, -65.0321, "Estación Sur", 123456, sismo2
        );

        EstacionSismologica estacion3 = new EstacionSismologica(
                "EST003", "DOC-67890", LocalDateTime.of(2022, 7, 9, 14, 45),
                -31.4201, -64.1888, "Estación Norte", 456789, sismo3
        );

        estaciones.add(estacion1);
        estaciones.add(estacion2);
        estaciones.add(estacion3);



    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<MotivoTipo> getMotivos() {
        return motivos;
    }

    public void setMotivos(List<MotivoTipo> motivos) {
        this.motivos = motivos;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(List<Sesion> sesiones) {
        this.sesiones = sesiones;
    }
}
