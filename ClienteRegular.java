package puntosbonus;

public class ClienteRegular extends Cliente {

    private int cantidadCompras;

    public ClienteRegular(String codigo, String nombre, int anioRegistro, int cantidadCompras) {
        super(codigo, nombre, anioRegistro);
        this.cantidadCompras = cantidadCompras;
    }

    public int getCantidadCompras() {
        return cantidadCompras;
    }

    public void setCantidadCompras(int cantidadCompras) {
        this.cantidadCompras = cantidadCompras;
    }
    

}
