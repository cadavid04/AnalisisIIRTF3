/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio;

/**
 *
 * @author itmanager
 */
public class SolicitudDTO {
    private String idSolicitud;
    private String descripcion;
    private String estado;
    private String tipoSolicitud;

    public SolicitudDTO(String idSolicitud, String descripcion, String estado, String tipoSolicitud) {
        this.idSolicitud = idSolicitud;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipoSolicitud = tipoSolicitud;
    }

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }
    
    
}
