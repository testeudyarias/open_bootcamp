package org.eudy.arias.models;

public class Persona {
    private int _id;
    private String _nombre;
    private String _apellido;

    public Persona() {
    }

    public Persona(int _id, String _nombre, String _apellido) {
        this._id = _id;
        this._nombre = _nombre;
        this._apellido = _apellido;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }
}
