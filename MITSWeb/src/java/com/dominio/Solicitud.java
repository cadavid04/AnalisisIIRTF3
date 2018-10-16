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
public class Solicitud extends SolicitudDTO {
    
    public Solicitud(String idSolicitud, String descripcion, String estado, String tipoSolicitud) {
        super(idSolicitud, descripcion, estado, tipoSolicitud);
    }
    
}
