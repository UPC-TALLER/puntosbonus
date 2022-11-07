package puntosbonus;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Cliente> clientes;

    public Tienda() {
        this.clientes = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public boolean existeClienteVipNivel1() {
        for (Cliente x: clientes){
            if (x instanceof ClienteVip && ((ClienteVip) x).getNivel().equals("Nivel 1") ) {
                return true;
            }
        }
        return false;
    }

    public double obtenerPromedio(){
        double sumaTotal = 0;
        for(Cliente c: clientes){
            sumaTotal = sumaTotal + c.calcularPuntos();// sumaTotal+= c.calcularPuntos()
        }
        return  sumaTotal / clientes.size();
    }

    /**
     * @return
     */
    public double obtenerClientesSobrePromedio(){
        double promedio = obtenerPromedio();
        int clienteSobrePromedio = 0;

        for(Cliente c: clientes){
            if(c.calcularPuntos()> promedio){
                clienteSobrePromedio = clienteSobrePromedio + 1;// clienteSobrePromedio++
            }
        }
        return clienteSobrePromedio*100 /clientes.size();
    } 

    
}
