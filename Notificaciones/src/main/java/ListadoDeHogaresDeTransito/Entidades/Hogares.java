package ListadoDeHogaresDeTransito.Entidades;

import java.util.List;

public class Hogares {
   public String id;
   public String nombre;
   public Ubicacion ubicacion;
   public String telefono;
   public Admisiones admisiones;
   public Integer capacidad;
   public Integer lugaresDisponibles;
   public Boolean patio;
   public List<String> caracteristicas;
}
