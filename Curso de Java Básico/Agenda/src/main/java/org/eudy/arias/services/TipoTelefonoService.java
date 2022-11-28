package org.eudy.arias.services;

import java.util.ArrayList;
import java.util.List;

import org.eudy.arias.models.Contacto;
import org.eudy.arias.models.ListContacto;
import org.eudy.arias.models.ListTipoTelefono;
import org.eudy.arias.models.TipoTelefono;

import org.eudy.arias.config.Constantes;

public class TipoTelefonoService {

    FileService fileService = new FileService(Constantes.TIPO_TELEFONO);
    private  String json="";
    private ListTipoTelefono listTipoTelefono=null;
    private void getStored(){
        json = fileService.Read();
    }
    public  ListTipoTelefono getAll(){
         this.getStored();
         if (json.isEmpty())
         {
             listTipoTelefono = new ListTipoTelefono();
             return listTipoTelefono;
         }
         listTipoTelefono = JsonConvertService.deserialize(json, ListTipoTelefono.class);
         return listTipoTelefono;
    }
    public void showTable(){
        this.getAll();
        if (this.listTipoTelefono==null || this.listTipoTelefono.getListTipoTelefono() == null ) {
            System.out.println("No hay contacto");
            return;
        }
        if (this.listTipoTelefono.getListTipoTelefono().size()>0) {
            int c = 0;
            for (var item :this.listTipoTelefono.getListTipoTelefono()) {
                c++;
                System.out.println(java.text.MessageFormat.format("Index: {0} | Nombre: {1} ", c, item.getNombre().toUpperCase()));
            }
        }else
            System.out.println("No hay registro");
    }
    private void _add(TipoTelefono tipoTelefono){

        this.listTipoTelefono.getListTipoTelefono().add(tipoTelefono);
        String jsonTipoTelefono = JsonConvertService.serialize(listTipoTelefono);
        fileService.Create(jsonTipoTelefono);
    }
    public void add(){
        getAll();
        if (this.listTipoTelefono == null || this.listTipoTelefono.getListTipoTelefono()==null)
        {
            this.listTipoTelefono = new ListTipoTelefono();
            this.listTipoTelefono.setListTipoTelefono(new ArrayList<TipoTelefono>());
        }
        String nombre = InputTextService.TextWithLabel("Ingresar el nombre del tipo de telefono");
        _add(new TipoTelefono(nombre));
    }
    private void _delete(String id){
        int index =-1;
        try {
            index = Integer.parseInt(id);
            getAll();
            listTipoTelefono.getListTipoTelefono().remove(index-1);
            String jsonTipoTelefono = JsonConvertService.serialize(listTipoTelefono);
            fileService.Create(jsonTipoTelefono);
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

    private void _update(String id,TipoTelefono tipoTelefono){
        int index =-1;
        try {
            index = Integer.parseInt(id);
            getAll();
            listTipoTelefono.getListTipoTelefono().set(index-1,tipoTelefono);
            String jsonTipoTelefono = JsonConvertService.serialize(listTipoTelefono);
            fileService.Create(jsonTipoTelefono);
        }catch (Exception e){
            System.out.println("No se puede editar el registro");
        }
    }
    public void update(){
        String indexEditar = InputTextService.TextWithLabel("Indique el index que desea editar");
        String nombreEditar = InputTextService.TextWithLabel("Ingrese el nombre");
        _update(indexEditar,new TipoTelefono(nombreEditar));
    }

    public String getByIndex(String index){
        int i =-1;
        try {
            i = Integer.parseInt(index);
            getAll();
            if (listTipoTelefono.getListTipoTelefono().size()<=0) return "CASA";
            var tipo =listTipoTelefono.getListTipoTelefono().get(i-1);
            return tipo.getNombre();
        }catch (Exception e){
            System.out.println("No es un index correcto");
            return "";
        }
    }

}
