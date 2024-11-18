package co.edu.uniquindio.poo;

public class PickUp extends Vehiculo {
    public int pasajeros;
    public int puertas;
    public boolean aireAcondicionado;
    public boolean camaraReversa;
    public int bolsasAire;
    public boolean abs;
    public boolean es4x4;
    public double capacidadCajaCarga;
    public PickUp(String placa, String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible,
            TipoTransmision tipoTrasnmision, int pasajeros, int puertas, boolean aireAcondicionado,
            boolean camaraReversa, int bolsasAire, boolean abs, boolean es4x4, double capacidadCajaCarga, boolean tecnomecanica) {
        super(placa, marca, modelo, nuevo, tipoCombustible, tipoTrasnmision, tecnomecanica);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.bolsasAire = bolsasAire;
        this.abs = abs;
        this.es4x4 = es4x4;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    ///////////////////////////////////////////Getters and Setters////////////////////////////////////////
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
    public boolean isEs4x4() {
        return es4x4;
    }
    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }
    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }
    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }
}