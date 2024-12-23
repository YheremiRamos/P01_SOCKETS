/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.dswii_u01_t02_socketsstreams_usuario.cliente.mensaje;

import java.io.IOException;

public class ClienteMensajeMain {
    
     public static void main(String[] args) {
        //localhost = 127.0.0.1 -
        ClienteMensaje cliente = new ClienteMensaje("localhost", 2999);
        try {
            cliente.enviarMensaje("Este es un mensaje que el cliente esta enviando");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    
}
