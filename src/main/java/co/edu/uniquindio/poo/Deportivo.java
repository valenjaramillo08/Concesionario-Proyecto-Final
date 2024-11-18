package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo{
    public int pasajeros;
    public int puertas;
    public int bolsasAire;
    public int caballosFuerza;
    public double tiempoVelocidad0a100;
    public Deportivo(String placa, String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible,
            TipoTransmision tipoTrasnmision, int pasajeros, int puertas, int bolsasAire, int caballosFuerza,
            double tiempoVelocidad0a100, boolean tecnomecanica) {
        super(placa, marca, modelo, nuevo, tipoCombustible, tipoTrasnmision, tecnomecanica);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.bolsasAire = bolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempoVelocidad0a100 = tiempoVelocidad0a100;
    }

    //////////////////////////////////Getters and Setters/////////////////////////////////////////////////
    /**
     * get pasajeros
     * @return 
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /**
     * set pasajeros
     * @param pasajeros
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    /**
     * get puertas
     * @return
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     * set puertas
     * @param puertas
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    /**
     * get bolsas de aire
     * @return
     */
    public int getBolsasAire() {
        return bolsasAire;
    }

    /**
     * set bolsas de aire
     * @param bolsasAire
     */
    public void setBolsasAire(int bolsasAire) {
        this.bolsasAire = bolsasAire;
    }

    /**
     * get caballos de fuerza
     * @return
     */
    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    /**
     * set caballos de fuerza
     * @param caballosFuerza
     */
    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    /**
     * get tiempo de velocidad
     * @return
     */
    public double getTiempoVelocidad0a100() {
        return tiempoVelocidad0a100;
    }

    /**
     * set tiempos de velocidad
     * @param tiempoVelocidad0a100
     */
    public void setTiempoVelocidad0a100(double tiempoVelocidad0a100) {
        this.tiempoVelocidad0a100 = tiempoVelocidad0a100;
    }

}
