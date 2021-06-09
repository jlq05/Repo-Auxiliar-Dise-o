package Domain.Persona;

import FormaDeNotificacion.FormaDeNotificacion;

import java.util.List;

public class Contacto {

    private String nombre;
    private String apellido;
    private Integer telefono;
    private String email;
    private Integer nroTramite;
    private List<FormaDeNotificacion> formasDeNotificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNroTramite() {
        return nroTramite;
    }

    public void setNroTramite(Integer nroTramite) {
        this.nroTramite = nroTramite;
    }

    public List<FormaDeNotificacion> getFormasDeNotificacion() {
        return formasDeNotificacion;
    }

    public void setFormasDeNotificacion(List<FormaDeNotificacion> formasDeNotificacion) {
        this.formasDeNotificacion = formasDeNotificacion;
    }

}