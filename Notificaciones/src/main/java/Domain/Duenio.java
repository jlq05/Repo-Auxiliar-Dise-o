package Domain;

import Domain.Mascota.Mascota;
import Domain.Persona.Contacto;
import Domain.Persona.Persona;

import java.util.List;

public class Duenio extends Persona {

    private List<Mascota> mascotas;
    private List<Contacto> contactos;

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

}
