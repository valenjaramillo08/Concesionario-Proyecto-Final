package co.edu.uniquindio.poo;

public class Vehiculo {
    public String placa;
    public String marca;
    public String modelo;
    public boolean nuevo;
    public TipoCombustible tipoCombustible;
    public TipoTransmision tipoTrasnmision;
    public boolean tecnomecanica;
    
    public Vehiculo(String placa,String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible,
            TipoTransmision tipoTrasnmision, boolean tecnomecanica) {
        this.placa=placa;        
        this.marca = marca;
        this.modelo = modelo;
        this.nuevo = nuevo;
        this.tipoCombustible = tipoCombustible;
        this.tipoTrasnmision = tipoTrasnmision;
        this.tecnomecanica = tecnomecanica;
    }

    /////////////////////////////////////////////Getters and Setters//////////////////////////////////////////////////

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean isNuevo() {
        return nuevo;
    }
    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }
    public boolean isTecnomecanica() {
        return tecnomecanica;
    }
    public void setTecnomecanica(boolean tecnomecanica) {
        this.tecnomecanica = tecnomecanica;
    }
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public TipoTransmision getTipoTrasnmision() {
        return tipoTrasnmision;
    }
    public void setTipoTrasnmision(TipoTransmision tipoTrasnmision) {
        this.tipoTrasnmision = tipoTrasnmision;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Vehiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", nuevo=" + nuevo
                + ", tipoCombustible=" + tipoCombustible + ", tipoTrasnmision=" + tipoTrasnmision + ", tecnomecanica="
                + tecnomecanica + "]";
    }
    
}
