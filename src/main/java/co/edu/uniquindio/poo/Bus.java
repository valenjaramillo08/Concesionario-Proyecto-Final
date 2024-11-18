package co.edu.uniquindio.poo;

public class Bus extends Vehiculo{
    public int pasajeros;
    public int puertas;
    public double capacidadMaletero;
    public boolean aireAcondicionado;
    public boolean camaraReversa;
    public int bolsasAire;
    public boolean abs;
    public int ejes;
    public int salidasEmergencia;
    public Bus(String placa, String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible,
            TipoTransmision tipoTrasnmision, int pasajeros, int puertas, double capacidadMaletero,
            boolean aireAcondicionado, boolean camaraReversa, int bolsasAire, boolean abs, int ejes,
            int salidasEmergencia, boolean tecnomecanica) {
        super(placa, marca, modelo, nuevo, tipoCombustible, tipoTrasnmision, tecnomecanica);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.bolsasAire = bolsasAire;
        this.abs = abs;
        this.ejes = ejes;
        this.salidasEmergencia = salidasEmergencia;
    }

    //////////////////////////////Getterds and Setterds////////////////////////////////////////////
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
    public int getEjes() {
        return ejes;
    }
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
    public int getSalidasEmergencia() {
        return salidasEmergencia;
    }
    public void setSalidasEmergencia(int salidasEmergencia) {
        this.salidasEmergencia = salidasEmergencia;
    }

}