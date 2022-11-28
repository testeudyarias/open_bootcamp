package org.eudy.arias.models;

public class Telefono {
    private String tipo;
    private String telefono;

    public Telefono() {
    }

    public Telefono(String tipo, String telefono) {
        this.tipo = tipo;
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
