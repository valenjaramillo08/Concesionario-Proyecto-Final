package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Venta extends Transaccion{

    public Venta(int idTransaccion, LocalDate fecha, Vehiculo vehiculo, Cliente cliente) {
        super(idTransaccion,fecha, vehiculo, cliente);
    }

}
