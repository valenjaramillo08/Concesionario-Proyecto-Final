package co.edu.uniquindio.poo;

public class Camioneta extends Vehiculo {
    public int pasajeros;
    public int puertas;
    public double capacidadMaletero;
    public boolean aireAcondicionado;
    public boolean camaraReversa;
    public boolean velocidadCrucero;
    public int bolsasAire;
    public boolean abs;
    public boolean sensoresColision;
    public boolean sensorTraficoCruzado;
    public boolean asistenteCarril;
    public boolean es4x4;
    public Camioneta(String placa, String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible,
            TipoTransmision tipoTrasnmision, int pasajeros, int puertas, double capacidadMaletero,
            boolean aireAcondicionado, boolean camaraReversa, boolean velocidadCrucero, int bolsasAire, boolean abs,
            boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistenteCarril, boolean es4x4, boolean tecnomecanica) {
        super(placa, marca, modelo, nuevo, tipoCombustible, tipoTrasnmision, tecnomecanica);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.bolsasAire = bolsasAire;
        this.abs = abs;
        this.sensoresColision = sensoresColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistenteCarril = asistenteCarril;
        this.es4x4 = es4x4;
    }

    //////////////////////////////////////////Getterds and Setterds////////////////////////////////
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
    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }
    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
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
    public boolean isSensoresColision() {
        return sensoresColision;
    }
    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }
    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }
    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }
    public boolean isAsistenteCarril() {
        return asistenteCarril;
    }
    public void setAsistenteCarril(boolean asistenteCarril) {
        this.asistenteCarril = asistenteCarril;
    }
    public boolean isEs4x4() {
        return es4x4;
    }
    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }
    
}