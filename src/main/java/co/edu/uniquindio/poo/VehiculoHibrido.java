package co.edu.uniquindio.poo;

public class VehiculoHibrido extends Vehiculo {
    private double autonomia; // Autonomía en km
    private String tiempoRecarga;
    private boolean enchufable;
    private boolean hibridiLigero;
    public VehiculoHibrido(String placa, String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible,
            TipoTransmision tipoTrasnmision, double autonomia, String tiempoRecarga, boolean tecnomecanica, boolean enchufable, boolean hibridiLigero) {
        super(placa, marca, modelo, nuevo, tipoCombustible, tipoTrasnmision, tecnomecanica);
        this.autonomia = autonomia;
        this.tiempoRecarga = tiempoRecarga;
        this.enchufable = enchufable;
        this.hibridiLigero = hibridiLigero;
    }

    ////////////////////////////////////////////Getters and Setters//////////////////////////////////////////////
    public double getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }
    public String getTiempoRecarga() {
        return tiempoRecarga;
    }
    public void setTiempoRecarga(String tiempoRecarga) {
        this.tiempoRecarga = tiempoRecarga;
    }
    public boolean isEnchufable() {
        return enchufable;
    }
    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }
    public boolean isHibridiLigero() {
        return hibridiLigero;
    }
    public void setHibridiLigero(boolean hibridiLigero) {
        this.hibridiLigero = hibridiLigero;
    }
    
}
