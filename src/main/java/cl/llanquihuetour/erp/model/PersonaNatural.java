package cl.llanquihuetour.erp.model;

import cl.llanquihuetour.erp.util.Validador;

import java.time.LocalDate;

/**
 * Representa a una persona natural.
 */
public class PersonaNatural {
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private Rut rut;
    private String correo;
    private String telefono;
    private Direccion direccion;

    public PersonaNatural(String nombres,
                          String apellidos,
                          LocalDate fechaNacimiento,
                          Rut rut,
                          String correo,
                          String telefono,
                          Direccion direccion) {
        Validador.noVacioNulo(nombres, "Nombres");
        Validador.noVacioNulo(apellidos, "Apellidos");
        Validador.noNulo(fechaNacimiento, "Fecha de nacimiento");
        Validador.noNulo(rut, "RUT");
        Validador.noVacioNulo(correo, "Correo");
        Validador.noVacioNulo(telefono, "Teléfono");
        Validador.noNulo(direccion, "Dirección");
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Rut getRut() {
        return rut;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombres(String nombres) {
        Validador.noVacioNulo(nombres, "Nombres");
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        Validador.noVacioNulo(apellidos, "Apellidos");
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        Validador.noNulo(fechaNacimiento, "Fecha de nacimiento");
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setRut(Rut rut) {
        Validador.noNulo(rut, "RUT");
        this.rut = rut;
    }

    public void setCorreo(String correo) {
        Validador.noVacio(correo, "Correo");
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        Validador.noVacio(telefono, "Telefono");
        this.telefono = telefono;
    }

    public void setDireccion(Direccion direccion) {
        Validador.noNulo(direccion, "Dirección");
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "PersonaNatural{\n" +
                "nombres='" + nombres + '\'' +
                "\napellidos='" + apellidos + '\'' +
                "\nfechaNacimiento=" + fechaNacimiento +
                "\nrut=" + rut +
                "\ncorreo='" + correo + '\'' +
                "\ntelefono='" + telefono + '\'' +
                "\ndireccion=" + direccion +
                '}';
    }
}
