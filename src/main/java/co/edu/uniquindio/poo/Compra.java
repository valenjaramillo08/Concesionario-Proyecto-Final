package co.edu.uniquindio.poo;
import java.time.LocalDate;

public class Compra extends Transaccion {

    public Compra(int idTransaccion, LocalDate fecha, Vehiculo vehiculo, Cliente cliente) {
        super(idTransaccion, fecha, vehiculo, cliente);
    }    
}
