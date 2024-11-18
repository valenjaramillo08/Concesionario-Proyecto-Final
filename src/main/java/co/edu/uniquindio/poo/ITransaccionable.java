package co.edu.uniquindio.poo;

import java.time.LocalDate;

public interface ITransaccionable {
    /**
     * metodo para que el empleado realice la compra de un vehiculo
     * @param vehiculo
     * @param fechaTransaccion
     * @param cliente
     * @return
     * @throws TransaccionInvalidaException 
     * @throws VehiculoYaExisteException 
     */
    boolean realizarCompra(Vehiculo vehiculo,LocalDate fechaTransaccion, Cliente cliente) throws VehiculoYaExisteException, TransaccionInvalidaException;

    /**
     * metodo para que el empleado de en alquiler un vehiculo
     * @param vehiculo
     * @param fechaTransaccion
     * @param fechaFinal
     * @param cliente
     * @return
     * @throws TransaccionInvalidaException 
     * @throws VehiculoNoEncontradoException 
     */
    boolean realizarAlquiler(Vehiculo vehiculo,LocalDate fechaTransaccion, LocalDate fechaFinal, Cliente cliente) throws VehiculoNoEncontradoException, TransaccionInvalidaException;

    /**
     * metodo para que el empleado realice una venta de un vehiculo
     * @param vehiculo
     * @param fechaTransaccion
     * @param cliente
     * @return
     * @throws TransaccionInvalidaException 
     * @throws VehiculoNoEncontradoException 
     */
    boolean realizarVenta(Vehiculo vehiculo,LocalDate fechaTransaccion, Cliente cliente) throws VehiculoNoEncontradoException, TransaccionInvalidaException;
}
