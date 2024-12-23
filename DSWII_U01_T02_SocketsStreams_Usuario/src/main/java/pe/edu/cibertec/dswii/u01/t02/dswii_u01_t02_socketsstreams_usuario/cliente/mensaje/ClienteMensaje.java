/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.dswii_u01_t02_socketsstreams_usuario.cliente.mensaje;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteMensaje {
   
    
    private String host;
    private int puerto;

    public ClienteMensaje(String host, int puerto) {
        this.host = host;
        this.puerto = puerto;
    }
    
      public void enviarMensaje(String mensaje) throws IOException {

        Socket socketCliente = new Socket(this.host, this.puerto);
        OutputStream flujoSalida = socketCliente.getOutputStream();
        PrintWriter escritorMensaje = new PrintWriter(flujoSalida, true);
        escritorMensaje.println(mensaje);

        System.out.println("Mensaje enviado!");
        System.out.println("Cuerpo del mensaje: " + " - " + mensaje);
        escritorMensaje.close();
        flujoSalida.close();
        socketCliente.close();
    }

    
}
