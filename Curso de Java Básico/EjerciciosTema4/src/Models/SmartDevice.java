package Models;

public class SmartDevice {
    protected String Tipo;
    protected String Marca;
    protected String Modelo;

    public SmartDevice() {
    }

    public SmartDevice(String tipo, String marca, String modelo) {
        Tipo = tipo;
        Marca = marca;
        Modelo = modelo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("""
                Smart {0}
                Marca {1}
                Modelo {2}
                """,this.getTipo(),this.getMarca(),this.getModelo());
    }
}
