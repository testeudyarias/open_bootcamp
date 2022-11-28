package org.eudy.arias.services;

import org.eudy.arias.models.Contacto;
import org.eudy.arias.models.Telefono;

import java.util.ArrayList;

public class Validadciones {
    public boolean siEstaVacio(String texto){
        return texto.isEmpty();
    }
    public static Contacto validarContactoNoVacio(){
        String cedula ="";
        String nombre = "";
        String apellido ="";
        String email = "";
        String direccion = "";
        String celular = "";
        String tel_oficina = "";
        String tel_casa = "";
        Contacto contacto = new Contacto();
        do {

            if (cedula.isEmpty())
            cedula = InputTextService.TextWithLabel("Ingresar la cedula");
            if (nombre.isEmpty())
            nombre = InputTextService.TextWithLabel("Ingresar el nombre");
            if (apellido.isEmpty())
            apellido = InputTextService.TextWithLabel("Ingresar el apellido");
            if (email.isEmpty())
            email = InputTextService.TextWithLabel("Ingresar el email");
            if (direccion.isEmpty())
            direccion = InputTextService.TextWithLabel("Ingresar la direccion");
            if (celular.isEmpty())
            celular = InputTextService.TextWithLabel("Ingresar el celular");
            if (tel_oficina.isEmpty())
            tel_oficina = InputTextService.TextWithLabel("Ingresar el telefono de la oficina");
            if (tel_casa.isEmpty())
            tel_casa = InputTextService.TextWithLabel("Ingresar el telefono de la casa");

            if ( !cedula.isEmpty() &&
            !nombre.isEmpty() &&
            !apellido.isEmpty() &&
            !email.isEmpty()  &&
            !direccion.isEmpty()  &&
            !celular.isEmpty()  &&
            !tel_oficina.isEmpty()  &&
            !tel_casa.isEmpty() ){

                contacto.setCedula(cedula);
                contacto.setNombre(nombre);
                contacto.setApellido(apellido);


                ArrayList<String> direcciones = new ArrayList<>();
                direcciones.add(direccion);
                contacto.setDirecciones(direcciones);

                ArrayList<String> emails = new ArrayList<>();
                emails.add(email);
                contacto.setEmails(emails);

                ArrayList<Telefono> telefonos = new ArrayList<>();
                telefonos.add(new Telefono("CELULAR",celular));
                telefonos.add(new Telefono("CASA",tel_casa));
                telefonos.add(new Telefono("OFICINA",tel_oficina));
                contacto.setTelefonos(telefonos);
                break;
            }
        }while (true);
        return contacto;
    }
    public static Contacto validarContactoUpdateNoVacio(Contacto contacto){
        String indexEditar ="";
        int index=-1;

        String cedula =contacto.getCedula();
        String nombre = contacto.getNombre();
        String apellido =contacto.getApellido();
        int c = 0;
        do {

            if (indexEditar.isEmpty() || c==0 || index == -1)
                indexEditar = InputTextService.TextWithLabel("Indique el index que desea editar");
            if (c==0 )
                cedula = InputTextService.TextWithLabel("Ingresar la cedula");
            if (c==0)
                nombre = InputTextService.TextWithLabel("Ingresar el nombre");
            if (c==0)
                apellido = InputTextService.TextWithLabel("Ingresar el apellido");

            c++;
            soloNumeroEntero(indexEditar);

            if ( index>=0 ){

                contacto.setIndexReferencia(index);
                contacto.setCedula(cedula);
                contacto.setNombre(nombre);
                contacto.setApellido(apellido);
                break;
            }
        }while (true);
        return contacto;
    }

    public static int soloNumeroEntero(String n){
        try {
            return Integer.parseInt(n);
        }catch (Exception e){
            System.out.println("Solo se acepta numero entero para el campo index");
            return -1;
        }
    }

}
