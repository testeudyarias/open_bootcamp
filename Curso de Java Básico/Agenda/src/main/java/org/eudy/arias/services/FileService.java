package org.eudy.arias.services;


import java.io.*;

public class FileService {
    private String archivo="";

    public FileService() {
    }

    public FileService(String archivo) {
        this.archivo = archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String Read(String archivo){
        //Leer
        try {
            InputStream fileInputStream = new FileInputStream(archivo);
            String texto = new String(fileInputStream.readAllBytes());
            return texto;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }
    public Boolean exists(){
       return java.nio.file.Files.exists(java.nio.file.Paths.get(archivo));
    }
    public String Read(){
        //Leer
        try {
            if (exists()) {
                if (archivo.equals("") || archivo.isEmpty() || archivo.isBlank())
                    throw new Exception("Debe indicar que archivo usara");
                InputStream fileInputStream = new FileInputStream(archivo);
                String texto = new String(fileInputStream.readAllBytes());
                return texto;
            }else
                return "";
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "";
    }
    public void Write(String texto, String archivo){
        try {
            //Append
            PrintStream printStream = new PrintStream(archivo);
            printStream.append(texto+"\n");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public void Write(String texto){
        try {
            if (archivo.equals("") || archivo.isEmpty() || archivo.isBlank())
                throw new Exception("Debe indicar que archivo usara");
            //Append
            PrintStream printStream = new PrintStream(archivo);
            printStream.append(texto+"\n");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void Create(String texto, String archivo){
        try {
            //Crear y reescribir
            PrintStream printStream = new PrintStream(archivo);
            printStream.append(texto+"\n");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public void Create(String texto){
        try {
            if (archivo.equals("") || archivo.isEmpty() || archivo.isBlank())
                throw new Exception("Debe indicar que archivo usara");
            //Crear y reescribir
            PrintStream printStream = new PrintStream(archivo);
            printStream.print(texto+"\n");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
