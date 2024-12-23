/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.dswii_u01_t02_socketsstreams_usuario.cliente.iniciarSesion;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import pe.edu.cibertec.dswii.u01.t02.dswii_u01_t02_socketsstreams_usuario.model.Usuario;


public class ClienteIniciarSesion {
     private String host;
    private int puerto;

    public ClienteIniciarSesion(String host, int puerto) {
        this.host = host;
        this.puerto = puerto;
    }
    
    
        public void enviarCliente(Usuario usuario) throws IOException {

       //Lógica para enviar la transferencia con sockets
        Socket socketCliente = new Socket(this.host, this.puerto);
        OutputStream flujoSalida = socketCliente.getOutputStream();
        
        ObjectOutputStream escritorMensaje = new ObjectOutputStream(flujoSalida);
        escritorMensaje.writeObject(usuario);
        System.out.println("Mensaje enviado!");
        System.out.println("Cuerpo del mensaje" + " - " + usuario);
        escritorMensaje.close();
        flujoSalida.close();
        socketCliente.close();
    
    
    }

    
}
