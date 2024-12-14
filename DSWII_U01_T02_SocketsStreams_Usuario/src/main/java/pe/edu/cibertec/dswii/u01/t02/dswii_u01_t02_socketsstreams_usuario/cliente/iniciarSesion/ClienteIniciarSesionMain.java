/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.dswii_u01_t02_socketsstreams_usuario.cliente.iniciarSesion;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDateTime;
import pe.edu.cibertec.dswii.u01.t02.dswii_u01_t02_socketsstreams_usuario.model.Permiso;
import pe.edu.cibertec.dswii.u01.t02.dswii_u01_t02_socketsstreams_usuario.model.Rol;
import pe.edu.cibertec.dswii.u01.t02.dswii_u01_t02_socketsstreams_usuario.model.Usuario;

/**
 *
 * @author Fatima
 */
public class ClienteIniciarSesionMain {

    public static void main(String[] args) {
        // Crear permisos para los roles
        List<Permiso> permisosAdmin = Arrays.asList(
                new Permiso(1L, "GESTIONAR_USUARIOS"),
                new Permiso(2L, "GESTIONAR_ROLES")
        );

        List<Permiso> permisosUser = Arrays.asList(
                new Permiso(3L, "VISUALIZAR_DATOS")
        );

        // Crear roles con permisos
        Rol admin = new Rol(1L, "ADMIN", "Administrador", LocalDateTime.now(), permisosAdmin);
        Rol user = new Rol(2L, "USER", "Usuario Regular", LocalDateTime.now(), permisosUser);

        // Crear el cliente y el usuario a enviar
        ClienteIniciarSesion clienteIniciarSesion = new ClienteIniciarSesion("localhost", 3000);

        Usuario usuario = new Usuario(
                1,
                "Fátima",
                "123",
                "fatima@gmail.com",
                Boolean.TRUE,
                "11/12/2024",
                "11/12/2024",
                Arrays.asList(admin, user)
        );

        // Enviar el usuario al servidor
        try {
            clienteIniciarSesion.enviarCliente(usuario);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
