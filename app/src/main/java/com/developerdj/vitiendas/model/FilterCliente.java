package com.developerdj.vitiendas.model;

public class FilterCliente {

    private String buscar;
    private String categoria;
    private String ciudad;
    private String zona;

    public FilterCliente(String buscar, String categoria, String ciudad, String zona) {
        this.buscar = buscar;
        this.categoria = categoria;
        this.ciudad = ciudad;
        this.zona = zona;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
