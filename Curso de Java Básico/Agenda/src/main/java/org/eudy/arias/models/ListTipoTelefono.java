package org.eudy.arias.models;

import java.util.ArrayList;

public class ListTipoTelefono {

    public ArrayList<TipoTelefono> getListTipoTelefono() {
        return listTipoTelefono;
    }

    public void setListTipoTelefono(ArrayList<TipoTelefono> listTipoTelefono) {
        this.listTipoTelefono = listTipoTelefono;
    }

    public ListTipoTelefono(ArrayList<TipoTelefono> listTipoTelefono) {
        this.listTipoTelefono = listTipoTelefono;
    }

    public ListTipoTelefono() {
        this.listTipoTelefono = new ArrayList<>();
    }

    private ArrayList<TipoTelefono> listTipoTelefono;
}
