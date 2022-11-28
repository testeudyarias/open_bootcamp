package org.eudy.arias.services;

import org.eudy.arias.config.Constantes;
import org.eudy.arias.models.*;
import org.eudy.arias.store.StoreRam;

import java.util.ArrayList;

public class ContactoService {
    FileService fileService = new FileService(Constantes.CONTACTOS);
    private  String json="";
    private ListContacto listContacto=null;
    private void getStored(){
        json = fileService.Read();
    }

    public  ListContacto getAll(){
        this.getStored();
        if (json.isEmpty())
        {
            listContacto = new ListContacto();
            return listContacto;
        }
        listContacto = JsonConvertService.deserialize(json, ListContacto.class);
        return listContacto;
    }
    public void showTable(){
        this.getAll();
        if (this.listContacto==null || this.listContacto.getListContacto() == null ) {
            System.out.println("No hay contacto");
            return;
        }
        if (this.listContacto.getListContacto().size()>0) {
            int c = 0;
            for (var item :this.listContacto.getListContacto()) {
                c++;
                System.out.println(java.text.MessageFormat.format(
                        "Index: {0} | Cedula: {5} | Nombre: {1} | Telefonos: {2} | Direcciones: {3} | Emails: {4} ",
                        c,
                        item.getNombreCompleto().toUpperCase(),
                        item.getTelefonos().size(),
                        item.getDirecciones().size(),
                        item.getEmails().size(),
                        item.getCedula()
                        )
                );
            }
        }else
            System.out.println("No hay registro");
    }

    private void _add(Contacto contacto){

        this.listContacto.getListContacto().add(contacto);
        String jsonContacto = JsonConvertService.serialize(listContacto);
        fileService.Create(jsonContacto);
    }
    public void add(){
        getAll();
        if (this.listContacto == null || this.listContacto.getListContacto()==null)
        {
            this.listContacto = new ListContacto();
            this.listContacto.setListContacto(new ArrayList<Contacto>());
        }
        Contacto contacto = Validadciones.validarContactoNoVacio();
        _add(contacto);
    }

    private void _delete(String id){
        int index =-1;
        try {
            index = Integer.parseInt(id);
            getAll();
            listContacto.getListContacto().remove(index-1);
            String jsonContacto = JsonConvertService.serialize(listContacto);
            fileService.Create(jsonContacto);
        }catch (Exception e){
            System.out.println("No se puede eliminar el registro");
        }
    }
    public void delete(){
        String respConfir = InputTextService.TextWithLabel("Realmente desea eliminar un registro? Si(S) o No(N)");
        if (respConfir.toLowerCase().equals("si")||respConfir.toLowerCase().equals("s")){
            String indexEliminar = InputTextService.TextWithLabel("Indique el index que desea eliminar");
            _delete(indexEliminar);
        }
    }

    private void _update(Contacto contacto){
        try {
            getAll();
            var aux = listContacto.getListContacto().get(contacto.getIndexReferencia()-1);
            if (!contacto.getCedula().isEmpty())
                aux.setCedula(contacto.getCedula());
            if (!contacto.getCedula().isEmpty())
                aux.setNombre(contacto.getNombre());
            if (!contacto.getCedula().isEmpty())
                aux.setApellido(contacto.getApellido());

            listContacto.getListContacto().set(contacto.getIndexReferencia()-1,aux);
            String jsonContacto = JsonConvertService.serialize(listContacto);
            fileService.Create(jsonContacto);
        }catch (Exception e){
            System.out.println("No se puede editar el registro");
        }
    }
    public void update(){
        Contacto contacto = Validadciones.validarContactoUpdateNoVacio(new Contacto());
        _update(contacto);
    }

    public Boolean seleccionarContacto(){
        try {
            String indexEditar = InputTextService.TextWithLabel("Indique el index del contacto a seleccionar");
            int index = Integer.parseInt(indexEditar);
            getAll();
            StoreRam.contactoSeleccionada = this.listContacto.getListContacto().get(index-1);
            StoreRam.index = index-1;
            return true;
        }catch (Exception e){
            return false;
        }

    }


    public void showTableDireccion(){
        if (StoreRam.contactoSeleccionada == null ) {
            System.out.println("No hay direccion");
            return;
        }
        var direcciones =StoreRam.contactoSeleccionada.getDirecciones();
        if (direcciones.size()>0) {
            int c = 0;
            for (var item :direcciones) {
                c++;
                System.out.println(java.text.MessageFormat.format(
                                "Index: {0} | Direccion: {1} ",
                                c,
                                item
                        )
                );
            }
        }else
            System.out.println("No hay registro");
    }


    private void _addDireccion(String direccion){
        getAll();
        StoreRam.contactoSeleccionada.getDirecciones().add(direccion);
        this.listContacto.getListContacto().set(StoreRam.index,StoreRam.contactoSeleccionada);
        String jsonDireccion = JsonConvertService.serialize(this.listContacto);
        fileService.Create(jsonDireccion);
    }
    public void addDireccion(){
        String direccion = InputTextService.TextWithLabel("Ingresar la direccion");
        _addDireccion(direccion);
    }

    private void _updateDireccion(String id,String direccion){
        int index =-1;
        try {
            index = Integer.parseInt(id);
            getAll();
            StoreRam.contactoSeleccionada.getDirecciones().set(index-1,direccion);
            this.listContacto.getListContacto().set(StoreRam.index,StoreRam.contactoSeleccionada);
            String jsonDireccion = JsonConvertService.serialize(this.listContacto);
            fileService.Create(jsonDireccion);
        }catch (Exception e){
            System.out.println("No se puede editar el registro");
        }
    }
    public void updateDireccion(){
        String indexEditar = InputTextService.TextWithLabel("Indique el index que desea editar");
        String direccion = InputTextService.TextWithLabel("Ingrese la direccion");
        _updateDireccion(indexEditar,direccion);
    }


    private void _deleteDireccion(String id){
        int index =-1;
        try {
            index = Integer.parseInt(id);
            getAll();
            StoreRam.contactoSeleccionada.getDirecciones().remove(index-1);
            this.listContacto.getListContacto().set(StoreRam.index,StoreRam.contactoSeleccionada);
            String jsonDireccion = JsonConvertService.serialize(this.listContacto);
            fileService.Create(jsonDireccion);
        }catch (Exception e){
            System.out.println("No se puede eliminar el registro");
        }
    }
    public void deleteDireccion(){
        String respConfir = InputTextService.TextWithLabel("Realmente desea eliminar un registro? Si(S) o No(N)");
        if (respConfir.toLowerCase().equals("si")||respConfir.toLowerCase().equals("s")){
            String indexEliminar = InputTextService.TextWithLabel("Indique el index que desea eliminar");
            _deleteDireccion(indexEliminar);
        }
    }



    public void showTableEmail(){
        if (StoreRam.contactoSeleccionada == null ) {
            System.out.println("No hay email");
            return;
        }
        var emails =StoreRam.contactoSeleccionada.getEmails();
        if (emails.size()>0) {
            int c = 0;
            for (var item :emails) {
                c++;
                System.out.println(java.text.MessageFormat.format(
                                "Index: {0} | Email: {1} ",
                                c,
                                item
                        )
                );
            }
        }else
            System.out.println("No hay registro");
    }


    private void _addEmail(String email){
        getAll();
        StoreRam.contactoSeleccionada.getEmails().add(email);
        this.listContacto.getListContacto().set(StoreRam.index,StoreRam.contactoSeleccionada);
        String jsonEmail = JsonConvertService.serialize(this.listContacto);
        fileService.Create(jsonEmail);
    }
    public void addEmail(){
        String email = InputTextService.TextWithLabel("Ingresar el email");
        _addEmail(email);
    }

    private void _updateEmail(String id,String email){
        int index =-1;
        try {
            index = Integer.parseInt(id);
            getAll();
            StoreRam.contactoSeleccionada.getEmails().set(index-1,email);
            this.listContacto.getListContacto().set(StoreRam.index,StoreRam.contactoSeleccionada);
            String jsonEmail = JsonConvertService.serialize(this.listContacto);
            fileService.Create(jsonEmail);
        }catch (Exception e){
            System.out.println("No se puede editar el registro");
        }
    }
    public void updateEmail(){
        String indexEditar = InputTextService.TextWithLabel("Indique el index que desea editar");
        String email = InputTextService.TextWithLabel("Ingrese el email");
        _updateEmail(indexEditar,email);
    }


    private void _deleteEmail(String id){
        int index =-1;
        try {
            index = Integer.parseInt(id);
            getAll();
            StoreRam.contactoSeleccionada.getEmails().remove(index-1);
            this.listContacto.getListContacto().set(StoreRam.index,StoreRam.contactoSeleccionada);
            String jsonEmail = JsonConvertService.serialize(this.listContacto);
            fileService.Create(jsonEmail);
        }catch (Exception e){
            System.out.println("No se puede eliminar el registro");
        }
    }
    public void deleteEmail(){
        String respConfir = InputTextService.TextWithLabel("Realmente desea eliminar un registro? Si(S) o No(N)");
        if (respConfir.toLowerCase().equals("si")||respConfir.toLowerCase().equals("s")){
            String indexEliminar = InputTextService.TextWithLabel("Indique el index que desea eliminar");
            _deleteEmail(indexEliminar);
        }
    }








    public void showTableTelefono(){
        if (StoreRam.contactoSeleccionada == null ) {
            System.out.println("No hay telefono");
            return;
        }
        var telefonos =StoreRam.contactoSeleccionada.getTelefonos();
        if (telefonos.size()>0) {
            int c = 0;
            for (var item :telefonos) {
                c++;
                System.out.println(java.text.MessageFormat.format(
                                "Index: {0} | Telefono: {1} | Tipo: {2} ",
                                c,
                                item.getTelefono(),
                                item.getTipo()
                        )
                );
            }
        }else
            System.out.println("No hay registro");
    }


    private void _addTelefono(Telefono telefono){
        getAll();
        StoreRam.contactoSeleccionada.getTelefonos().add(telefono);
        this.listContacto.getListContacto().set(StoreRam.index,StoreRam.contactoSeleccionada);
        String jsonTelefono = JsonConvertService.serialize(this.listContacto);
        fileService.Create(jsonTelefono);
    }
    public void addTelefono(){
        String telefono = InputTextService.TextWithLabel("Ingresar el telefono");
        var tipoTelefono = new TipoTelefonoService();
        tipoTelefono.showTable();
        String tipo = "";
        while (true){
            String indexTipo = InputTextService.TextWithLabel("Ingresar el index del tipo telefono que desea");
            tipo = tipoTelefono.getByIndex(indexTipo);
            if (!tipo.isEmpty()) break;
        }
        _addTelefono(new Telefono(tipo,telefono));
    }

    private void _updateTelefono(String id,Telefono telefono){
        int index =-1;
        try {
            index = Integer.parseInt(id);
            getAll();
            StoreRam.contactoSeleccionada.getTelefonos().set(index-1,telefono);
            this.listContacto.getListContacto().set(StoreRam.index,StoreRam.contactoSeleccionada);
            String jsonEmail = JsonConvertService.serialize(this.listContacto);
            fileService.Create(jsonEmail);
        }catch (Exception e){
            System.out.println("No se puede editar el registro");
        }
    }
    public void updateTelefono(){

        String indexEditar = InputTextService.TextWithLabel("Indique el index que desea editar");
        String telefono = InputTextService.TextWithLabel("Ingresar el telefono");
        var tipoTelefono = new TipoTelefonoService();
        tipoTelefono.showTable();
        String tipo = "";
        while (true){
            String indexTipo = InputTextService.TextWithLabel("Ingresar el index del tipo telefono que desea");
            tipo = tipoTelefono.getByIndex(indexTipo);
            if (!tipo.isEmpty()) break;
        }
        _updateTelefono(indexEditar,new Telefono(tipo,telefono));

    }


    private void _deleteTelefono(String id){
        int index =-1;
        try {
            index = Integer.parseInt(id);
            getAll();
            StoreRam.contactoSeleccionada.getTelefonos().remove(index-1);
            this.listContacto.getListContacto().set(StoreRam.index,StoreRam.contactoSeleccionada);
            String jsonTelefono = JsonConvertService.serialize(this.listContacto);
            fileService.Create(jsonTelefono);
        }catch (Exception e){
            System.out.println("No se puede eliminar el registro");
        }
    }
    public void deleteTelefono(){
        String respConfir = InputTextService.TextWithLabel("Realmente desea eliminar un registro? Si(S) o No(N)");
        if (respConfir.toLowerCase().equals("si")||respConfir.toLowerCase().equals("s")){
            String indexEliminar = InputTextService.TextWithLabel("Indique el index que desea eliminar");
            _deleteTelefono(indexEliminar);
        }
    }




}
