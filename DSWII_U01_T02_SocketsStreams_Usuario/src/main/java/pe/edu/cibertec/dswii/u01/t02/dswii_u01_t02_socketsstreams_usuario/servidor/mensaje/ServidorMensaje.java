package pe.edu.cibertec.dswii.u01.t02.dswii_u01_t02_socketsstreams_usuario.servidor.mensaje;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorMensaje {
//FALTA IMPLEMENTAR COMUNICACION DE SERVIDOR MENSAJE A SERVIDOR INICIAR SESION
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(2999)) {
            System.out.println("Servidor de mensajes escuchando en el puerto 2999...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Cliente conectado desde: " + socket.getInetAddress());

                try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                    String mensaje = reader.readLine();
                    System.out.println("Mensaje recibido: " + mensaje);
                }
            }
        } catch (IOException e) {
            System.err.println("Error en el servidor de mensajes:");
            e.printStackTrace();
        }
    }
}
