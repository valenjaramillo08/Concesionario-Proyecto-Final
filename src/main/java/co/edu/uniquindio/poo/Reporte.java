package co.edu.uniquindio.poo;

import java.util.Collection;

public class Reporte {
    public Collection<Transaccion> transacciones;
    public Administrador administrador;
    public Reporte(Collection<Transaccion> transacciones, Administrador administrador) {
        this.transacciones = transacciones;
        this.administrador = administrador;
    }

    ////////////////////////////////////Getters and Setters///////////////////////////////////
    public Collection<Transaccion> getTransacciones() {
        return transacciones;
    }
    public void setTransacciones(Collection<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
    public Administrador getAdministrador() {
        return administrador;
    }
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
    
}
