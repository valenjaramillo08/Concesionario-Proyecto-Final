package co.edu.uniquindio.poo;

public class ClienteYaExisteException extends Exception {
    public ClienteYaExisteException(String mensaje) {
        super(mensaje);
    }
}