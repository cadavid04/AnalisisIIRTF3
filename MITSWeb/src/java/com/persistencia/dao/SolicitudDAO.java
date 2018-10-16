/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persistencia.dao;

import com.dominio.Solicitud;
import java.util.List;

/**
 *
 * @author itmanager
 */
public interface SolicitudDAO {
    
    public boolean crearSolicitud(Solicitud solicitud);
    public List<Solicitud> getAllSolicitud(); 
    public boolean eliminarSolicitud(Solicitud solicitud); 
    public boolean actualizarSolicitud(Solicitud solicitud); 
    
}
