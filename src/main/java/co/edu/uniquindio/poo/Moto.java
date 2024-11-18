package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
    public int cambios;
    public double velocidadMaxima;
    public int cilindraje;
    public Moto(String placa, String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible,
            TipoTransmision tipoTrasnmision, int cambios, double velocidadMaxima, int cilindraje, boolean tecnomecanica) {
        super(placa, marca, modelo, nuevo, tipoCombustible, tipoTrasnmision, tecnomecanica);
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
    }

    ////////////////////////////////Getters and Setters///////////////////////////////////////////////
    public int getCambios() {
        return cambios;
    }
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}
