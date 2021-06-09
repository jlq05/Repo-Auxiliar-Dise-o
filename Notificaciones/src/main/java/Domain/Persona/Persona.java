package Domain.Persona;

import java.util.Date;
import java.util.List;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private TipoDocumento tipoDocumento;
    private Integer nroDocumento;
    private Integer nroTramite;
    private List<Contacto> contactos;
}