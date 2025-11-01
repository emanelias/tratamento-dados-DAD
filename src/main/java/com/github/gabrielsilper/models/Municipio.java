package com.github.gabrielsilper.models;

public class Municipio {
    private String codigoIbge;
    private String uf;
    private String municipio;

    public Municipio() {
    }

    public Municipio(String codigoIbge, String uf, String municipio) {
        this.codigoIbge = codigoIbge;
        this.uf = uf;
        this.municipio = municipio;
    }

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(String codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "codigoIbge='" + codigoIbge + '\'' +
                ", uf='" + uf + '\'' +
                ", municipio='" + municipio + '\'' +
                '}';
    }
}
