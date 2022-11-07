package puntosbonus;

public class ClienteVip extends Cliente{
    
    private int numeroVisitas;
    private String nivel;

    public ClienteVip(String codigo, String nombre, int anioRegistro, int numeroVisitas, String nivel) {
        super(codigo, nombre, anioRegistro);
        this.numeroVisitas = numeroVisitas;
        this.nivel = nivel;
    }

    public int getNumeroVisitas() {
        return numeroVisitas;
    }

    public void setNumeroVisitas(int numeroVisitas) {
        this.numeroVisitas = numeroVisitas;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public double calcularPuntos(){
        return 15 * numeroVisitas;
    }

}