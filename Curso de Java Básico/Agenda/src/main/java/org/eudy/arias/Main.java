package org.eudy.arias;

import org.eudy.arias.models.ListTipoTelefono;
import org.eudy.arias.models.Persona;
import org.eudy.arias.models.TipoTelefono;
import org.eudy.arias.services.AgendaContext;
import org.eudy.arias.services.JsonConvertService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new AgendaContext().ini();
    }
}