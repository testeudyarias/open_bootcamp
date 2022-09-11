package Modelos;

import Interfaces.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("Save");
    }

    @Override
    public void findAll() {
        System.out.println("FindAll");
    }

    @Override
    public void delete() {
        System.out.println("Delete");
    }
}
