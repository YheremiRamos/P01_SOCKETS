/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.dswii_u01_t02_socketsstreams_usuario.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Permiso implements Serializable {
    private Long id;
    private String nombre;
    private String descripcion;
    private LocalDateTime fechaCreacion;

    public Permiso(long id, String gestionarUsuarios) {
        this.id = id;
        this.nombre = gestionarUsuarios;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Permiso(Long id, String nombre, String descripcion, LocalDateTime fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Permiso{" + "id=" + id + 
                ", nombre=" + nombre + 
                ", descripcion=" + descripcion +
                ", fechaCreacion=" + fechaCreacion + '}';
    }
   

    
    
    
}
