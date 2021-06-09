package Implementaciones;

import Domain.Foto.CaracteristicaFoto;
import Domain.Foto.FotoNormalizada;
import Domain.Mascota.Caracteristica;
import Domain.Mascota.Caracteristicas;
import Domain.Mascota.Mascota;
import Domain.NormalizadorFoto;
import Domain.Persona.Contacto;
import Domain.Persona.Permiso;
import Domain.Persona.Rol;
import Domain.Persona.Usuario;
import FormaDeNotificacion.FormaDeNotificacion;
import Validador.ValidadorContrasenia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Implementaciones {

    List<Mascota> mascotas = new ArrayList<>();

    public void registrarMascota(Mascota mascota) throws IOException {
        Scanner scanner = new Scanner(System.in);
        mascotas.add(mascota);
        System.out.println("Desea generar un usuario? [Si = 1 / No = 0]: ");
        if(scanner.hasNext()) {
            generarUsuario();
        }
    }

    Caracteristicas caracteristicasObligatorias;

    public void agregarCaracteristicas(Caracteristica... caracteristicas) {
        for(Caracteristica c : caracteristicas) {
            caracteristicasObligatorias.getCaracteristicasObligatorias().add(c);
        }
    }

    FotoNormalizada fotoNormalizada;
    CaracteristicaFoto caracteristicaFoto;

    public FotoNormalizada normalizarForo(String pathFoto) {
        NormalizadorFoto adapter = null;
        return adapter.normalizarFoto(pathFoto, caracteristicaFoto);
    }

    ValidadorContrasenia validadorContrasenia;

    List<Usuario> usuarios = new ArrayList<>();
    List<Permiso> permisosAdmin = new ArrayList<>();

    public Usuario generarUsuario() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese contrasenia: ");
        String contrasenia = scanner.nextLine();
        while(!validadorContrasenia.validate(contrasenia, false)) {
            System.out.println("Intente nuevamente...");
            System.out.println("Ingrese contrasenia: ");
            contrasenia = scanner.nextLine();
        }
        System.out.println("Usuario creado!");
        return new Usuario(usuario, contrasenia, null);
    }

    public void generarAdmin() throws IOException {
        Usuario usuario = generarUsuario();
        usuario.setRol(new Rol("Administrador", permisosAdmin));
        usuarios.add(usuario);
    }

    public void mascotaEncontrada(Integer idMascota) {
        Mascota mascota = mascotas.get(idMascota);
        for(Contacto c : mascota.getDuenio().getContactos()) {
            for(FormaDeNotificacion fdn : c.getFormasDeNotificacion()) {
                fdn.notificar();
            }
        }
    }

    List<Permiso> permisosVoluntario = new ArrayList<>();

    public void generarVoluntario() throws IOException {
        Usuario usuario = generarUsuario();
        usuario.setRol(new Rol("Voluntario", permisosVoluntario));
        usuarios.add(usuario);
    }

}
