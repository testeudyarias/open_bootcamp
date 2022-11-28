package org.eudy.arias.models;

import java.util.ArrayList;

public class ListContacto {
   private ArrayList<Contacto> listContacto;

    public ArrayList<Contacto> getListContacto() {
        return listContacto;
    }

    public void setListContacto(ArrayList<Contacto> listContacto) {
        this.listContacto = listContacto;
    }

    public ListContacto(ArrayList<Contacto> listContacto) {
        this.listContacto = listContacto;
    }

    public ListContacto() {
    }
}
