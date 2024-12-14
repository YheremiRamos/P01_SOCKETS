package pe.edu.cibertec.dswii.u01.t02.dswii_u01_t02_socketsstreams_usuario.servidor.iniciarSesion;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import pe.edu.cibertec.dswii.u01.t02.dswii_u01_t02_socketsstreams_usuario.model.Usuario;

public class ServidorIniciarSesion {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(3000)) {
            System.out.println("Servidor de iniciar sesión escuchando en el puerto 3000...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Cliente conectado desde: " + socket.getInetAddress());

                try (ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {
                    Usuario usuario = (Usuario) ois.readObject();
                    System.out.println("Usuario recibido: " + usuario);
                } catch (ClassNotFoundException e) {
                    System.err.println("Clase no encontrada al leer el objeto Usuario.");
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.err.println("Error en el servidor de iniciar sesión:");
            e.printStackTrace();
        }
    }
}
