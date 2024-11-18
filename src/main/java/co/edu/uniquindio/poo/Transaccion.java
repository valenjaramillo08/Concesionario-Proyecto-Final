package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Transaccion {
    
    public int idTransaccion;
    public LocalDate fechaTransaccion;
    public Vehiculo vehiculo;
    public Cliente cliente;
    
    public Transaccion(int idTransaccion, LocalDate fechaTransaccion, Vehiculo vehiculo, Cliente cliente) {
        
        this.idTransaccion = idTransaccion;
        this.fechaTransaccion = fechaTransaccion;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public LocalDate getfechaTransaccion() {
        return fechaTransaccion;
    }

    public void setfechaTransaccion(LocalDate fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public Vehiculo getVehiculos() {
        return vehiculo;
    }

    public void setVehiculos(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Transaccion [idTransaccion=" + idTransaccion + ", fechaTransaccion=" + fechaTransaccion + ", vehiculo="
                + vehiculo + ", cliente=" + cliente + "]";
    }

    
}
