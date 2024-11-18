package co.edu.uniquindio.poo;

public class Van extends Vehiculo {
    public int pasajeros;
    public int puertas;
    public double capacidadMaletero;
    public boolean aireAcondicionado;
    public boolean camaraReversa;
    public int bolsasAire;
    public boolean abs;
    public Van(String placa, String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible,
            TipoTransmision tipoTrasnmision, int pasajeros, int puertas, double capacidadMaletero,
            boolean aireAcondicionado, boolean camaraReversa, int bolsasAire, boolean abs, boolean tecnomecanica) {
        super(placa, marca, modelo, nuevo, tipoCombustible, tipoTrasnmision, tecnomecanica);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.bolsasAire = bolsasAire;
        this.abs = abs;
    }

    /////////////////////////////////Getters and Setters//////////////////////////////////////////////////
    public int getPasajeros() {
        return pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    public boolean isCamaraReversa() {
        return camaraReversa;
    }
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }
    public int getBolsasAire() {
        return bolsasAire;
    }
    public void setBolsasAire(int bolsasAire) {
        this.bolsasAire = bolsasAire;
    }
    public boolean isAbs() {
        return abs;
    }
    public void setAbs(boolean abs) {
        this.abs = abs;
    }
}