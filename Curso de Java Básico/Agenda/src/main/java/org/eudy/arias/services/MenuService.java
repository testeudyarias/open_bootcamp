package org.eudy.arias.services;

import org.eudy.arias.models.Contacto;
import org.eudy.arias.models.TipoTelefono;
import org.eudy.arias.store.StoreRam;

public class MenuService {

    public static void principal(){
        String opcion="0";
        do {
            System.out.println(" Agenda Telefonica ");
            System.out.println("0.  Salir");
            System.out.println("1.  Contacto");
            System.out.println("2.  Tipo Telefono");

            opcion = InputTextService.Text();
            if (opcion.equals("0")) return;
            opcionPrincipal(opcion);
        }while (true);
    }
    public static void opcionPrincipal(String opcion){
        switch (opcion){
            case "1":
                contacto();
                break;
            case "2":
                tipoTelefono();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    public static void tipoTelefono(){

        do {

            System.out.println(" Tipo Telefono ");
            System.out.println("0.  Salir");
            System.out.println("1.  Ingresar");
            System.out.println("2.  Eliminar");
            System.out.println("3.  Listar");
            System.out.println("4.  Editar");
            String opcion = InputTextService.Text();
            if (opcion.equals("0")) return;
            opcionTipoTelefono(opcion);

        }while (true);
    }

    public static void opcionTipoTelefono(String opcion){
        TipoTelefonoService tipoTelefonoService = new TipoTelefonoService();
        switch (opcion){
            case "1":
                tipoTelefonoService.add();
                break;
            case "2":
                tipoTelefonoService.delete();
                break;
            case "3":
                tipoTelefonoService.showTable();
                break;
            case "4":
                  tipoTelefonoService.update();
                 break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    public static void contacto(){
        do {
            System.out.println(" Contacto ");
            System.out.println("0.  Salir");
            System.out.println("1.  Ingresar");
            System.out.println("2.  Eliminar");
            System.out.println("3.  Listar");
            System.out.println("4.  Editar");
            System.out.println("5.  View");
            String opcion = InputTextService.Text();
            if (opcion.equals("0")) return;
            opcionContacto(opcion);

        }while (true);
    }
    public static void opcionContacto(String opcion){
        ContactoService contactoService = new ContactoService();
        switch (opcion){
            case "1":
                contactoService.add();
                break;
            case "2":
                contactoService.delete();
                break;
            case "3":
                contactoService.showTable();
                break;
            case "4":
                contactoService.update();
                break;
            case "5":
                contactoView();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    public static void contactoView(){
        do {
            System.out.println(" Contacto -> View ");
            System.out.println("0.  Salir");
            System.out.println("1.  Listar Contactos");
            System.out.println("2.  Seleccionar contacto");
            String opcion = InputTextService.Text();
            if (opcion.equals("0")) return;
            opcionContactoView(opcion);
        }while (true);
    }
    public static void opcionContactoView(String opcion){
        ContactoService contactoService = new ContactoService();
        switch (opcion){
            case "1":
                contactoService.showTable();
                break;
            case "2":
                if(contactoService.seleccionarContacto()){
                    contactoSeleccionado();
                }
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    public static void contactoSeleccionado(){
        do {
            System.out.println(" Contacto -> View -> "+ StoreRam.contactoSeleccionada.getNombreCompleto()+" - "+StoreRam.contactoSeleccionada.getCedula());
            System.out.println("0.  Salir");
            System.out.println("1.  Direccion");
            System.out.println("2.  Email");
            System.out.println("3.  Telefono");
            //System.out.println("4.  Actualizar Datos (Nombre, Cedula)");
            String opcion = InputTextService.Text();
            if (opcion.equals("0")) return;
            opcionContactoSeleccionado(opcion);
        }while (true);
    }
    public static void opcionContactoSeleccionado(String opcion){
        ContactoService contactoService = new ContactoService();
        switch (opcion){
            case "1":
                contactoSeleccionadoDireccion();
                break;
            case "2":
                contactoSeleccionadoEmail();
                break;
            case "3":
                 contactoSeleccionadoTelefono();
                break;
//            case "4":
//
//                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    public static void contactoSeleccionadoDireccion(){
        do {
            System.out.println(" Contacto -> View -> "+ StoreRam.contactoSeleccionada.getNombreCompleto()+" - "+StoreRam.contactoSeleccionada.getCedula()+" -> Direccion ");
            System.out.println("0.  Salir");
            System.out.println("1.  Listar");
            System.out.println("2.  Ingresar");
            System.out.println("3.  Editar");
            System.out.println("4.  Eliminar");
            String opcion = InputTextService.Text();
            if (opcion.equals("0")) return;
            opcionContactoSeleccionadoDireccion(opcion);
        }while (true);
    }
    public static void opcionContactoSeleccionadoDireccion(String opcion){
        ContactoService contactoService = new ContactoService();
        switch (opcion){
            case "1":
                contactoService.showTableDireccion();
                break;
            case "2":
                contactoService.addDireccion();
                break;
            case "3":
                contactoService.updateDireccion();
                break;
            case "4":
                contactoService.deleteDireccion();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }


    public static void contactoSeleccionadoEmail(){
        do {
            System.out.println(" Contacto -> View -> "+ StoreRam.contactoSeleccionada.getNombreCompleto()+" - "+StoreRam.contactoSeleccionada.getCedula()+" -> Email ");
            System.out.println("0.  Salir");
            System.out.println("1.  Listar");
            System.out.println("2.  Ingresar");
            System.out.println("3.  Editar");
            System.out.println("4.  Eliminar");
            String opcion = InputTextService.Text();
            if (opcion.equals("0")) return;
            opcionContactoSeleccionadoEmail(opcion);
        }while (true);
    }
    public static void opcionContactoSeleccionadoEmail(String opcion){
        ContactoService contactoService = new ContactoService();
        switch (opcion){
            case "1":
                contactoService.showTableEmail();
                break;
            case "2":
                contactoService.addEmail();
                break;
            case "3":
                contactoService.updateEmail();
                break;
            case "4":
                contactoService.deleteEmail();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }





    public static void contactoSeleccionadoTelefono(){
        do {
            System.out.println(" Contacto -> View -> "+ StoreRam.contactoSeleccionada.getNombreCompleto()+" - "+StoreRam.contactoSeleccionada.getCedula()+" -> Telefono ");
            System.out.println("0.  Salir");
            System.out.println("1.  Listar");
            System.out.println("2.  Ingresar");
            System.out.println("3.  Editar");
            System.out.println("4.  Eliminar");
            String opcion = InputTextService.Text();
            if (opcion.equals("0")) return;
            opcionContactoSeleccionadoTelefono(opcion);
        }while (true);
    }
    public static void opcionContactoSeleccionadoTelefono(String opcion){
        ContactoService contactoService = new ContactoService();
        switch (opcion){
            case "1":
                contactoService.showTableTelefono();
                break;
            case "2":
                contactoService.addTelefono();
                break;
            case "3":
                contactoService.updateTelefono();
                break;
            case "4":
                contactoService.deleteTelefono();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }


}

