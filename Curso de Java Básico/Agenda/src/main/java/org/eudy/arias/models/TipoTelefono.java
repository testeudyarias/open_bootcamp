package org.eudy.arias.models;

public class TipoTelefono {
    private String nombre;

    public TipoTelefono() {
    }

    public TipoTelefono(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre.toUpperCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }
}
