package com.developerdj.vitiendas.model;

public class Config {
    private String dominio;
    private String puerto;

    private String logo;
    private String titulo;

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Config{" +
                "dominio='" + dominio + '\'' +
                ", puerto='" + puerto + '\'' +
                ", logo='" + logo + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
