package org.eudy.arias.models;

import java.util.ArrayList;

public class Contacto {

    private int indexReferencia;

    public int getIndexReferencia() {
        return indexReferencia;
    }

    public void setIndexReferencia(int indexReferencia) {
        this.indexReferencia = indexReferencia;
    }

    public Contacto() {
    }

    public Contacto(String cedula, String nombre, String apellido, String nombreCompleto, ArrayList<Telefono> telefonos, ArrayList<String> emails, ArrayList<String> direcciones) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        NombreCompleto = nombreCompleto;
        this.telefonos = telefonos;
        this.emails = emails;
        this.direcciones = direcciones;
    }

    public Contacto(String cedula, String nombre, String apellido) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        NombreCompleto = Nombre+", "+Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String NombreCompleto;

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    public void setEmails(ArrayList<String> emails) {
        this.emails = emails;
    }

    public ArrayList<String> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(ArrayList<String> direcciones) {
        this.direcciones = direcciones;
    }

    private ArrayList<Telefono> telefonos = new ArrayList<>();
    private ArrayList<String> emails = new ArrayList<>();
    private ArrayList<String> direcciones = new ArrayList<>();


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNombreCompleto() {
        return Nombre+", "+Apellido;
    }

    //public void setNombreCompleto(String nombreCompleto) {
      //  NombreCompleto = nombreCompleto;
   // }

}
