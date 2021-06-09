package Domain.Persona;

import java.util.List;

public class Rol {

    public Rol(String descripcion, List<Permiso> permisos) {
        this.descripcion = descripcion;
        this.permisos = permisos;
    }

    private String descripcion;
    private List<Permiso> permisos;

    void ejecutar() {};

}
