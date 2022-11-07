package puntosbonus;

public abstract class Cliente {
    private String codigo;
    private String nombre;
    private int anioRegistro;

    public Cliente(String codigo, String nombre, int anioRegistro){
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioRegistro = anioRegistro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioRegistro() {
        return anioRegistro;
    }

    public void setAnioRegistro(int anioRegistro) {
        this.anioRegistro = anioRegistro;
    }   
    
    public double obtenerPuntosPorAnio(){
        int aniosAntiguiedad = 2022 - anioRegistro;
        if(aniosAntiguiedad < 2){
            return 50;
        }else if (aniosAntiguiedad >=2 && aniosAntiguiedad <= 5) {
            return 110;
        }else {
            return 170;
        }
    }

    public double calcularPuntos(){
        int aniosAntiguedad = 2022 - anioRegistro;
        double puntosPorAnio = obtenerPuntosPorAnio();
        return aniosAntiguedad * puntosPorAnio;
    }
    
}
