package com.github.gabrielsilper.models;

public class PopulacaoPorFaixaEtaria {
    private String municipio;
    private String populacao0A10;
    private String populacao11A20;
    private String populacao21A30;
    private String populacao31A40;
    private String populacao41Mais;

    public PopulacaoPorFaixaEtaria() {
    }

    public PopulacaoPorFaixaEtaria(String municipio, String populacao0A10, String populacao11A20, String populacao21A30, String populacao31A40, String populacao41Mais) {
        this.municipio = municipio;
        this.populacao0A10 = populacao0A10;
        this.populacao11A20 = populacao11A20;
        this.populacao21A30 = populacao21A30;
        this.populacao31A40 = populacao31A40;
        this.populacao41Mais = populacao41Mais;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getPopulacao0A10() {
        return populacao0A10;
    }

    public void setPopulacao0A10(String populacao0A10) {
        this.populacao0A10 = populacao0A10;
    }

    public String getPopulacao11A20() {
        return populacao11A20;
    }

    public void setPopulacao11A20(String populacao11A20) {
        this.populacao11A20 = populacao11A20;
    }

    public String getPopulacao21A30() {
        return populacao21A30;
    }

    public void setPopulacao21A30(String populacao21A30) {
        this.populacao21A30 = populacao21A30;
    }

    public String getPopulacao31A40() {
        return populacao31A40;
    }

    public void setPopulacao31A40(String populacao31A40) {
        this.populacao31A40 = populacao31A40;
    }

    public String getPopulacao41Mais() {
        return populacao41Mais;
    }

    public void setPopulacao41Mais(String populacao41Mais) {
        this.populacao41Mais = populacao41Mais;
    }

    @Override
    public String toString() {
        return "PopulacaoPorFaixaEtaria{" +
                "municipio='" + municipio + '\'' +
                ", populacao0A10='" + populacao0A10 + '\'' +
                ", populacao11A20='" + populacao11A20 + '\'' +
                ", populacao21A30='" + populacao21A30 + '\'' +
                ", populacao31A40='" + populacao31A40 + '\'' +
                ", populacao41Mais='" + populacao41Mais + '\'' +
                '}';
    }
}
