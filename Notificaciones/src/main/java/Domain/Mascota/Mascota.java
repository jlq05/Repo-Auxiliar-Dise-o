package Domain.Mascota;

import Domain.Dueño;
import Domain.Persona.Sexo;

import java.util.List;

public class Mascota {
    private String ID_QR;
    private TipoAnimal tipoAnimal;
    private String nombre;
    private String apellido;
    private Integer edad;
    private Sexo sexo;
    private String descripcionFisica;
    private List<String> fotos;
    private List<Caracteristica> caracteristicas;
    private Dueño dueño;
}
