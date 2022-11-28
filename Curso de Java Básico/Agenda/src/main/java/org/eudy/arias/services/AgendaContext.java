package org.eudy.arias.services;

public class AgendaContext {
    private FileService file = new FileService();
    public void ini(){
        opcionMenuPrincipal();
    }
    private void opcionMenuPrincipal(){
        MenuService.principal();
    }

}
