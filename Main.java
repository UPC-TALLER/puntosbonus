package puntosbonus;

import java.util.List;

public class Main {

    public static void main(String[] args) {
    
    Tienda tienda = new Tienda();

    ClienteRegular regular1 = new ClienteRegular("CR01", "Carlos",2002, 100 );
    //ClienteRegular regular2;

    ClienteVip vip1 = new ClienteVip("CV01","Jhon", 2000, 5,"Nivel 1");

    tienda.registrarCliente(regular1);
    tienda.registrarCliente(vip1);

    List<Cliente> clientesRegistrados = tienda.getClientes();
    for(Cliente c: clientesRegistrados){
        System.out.println("Cliente = " + c.getCodigo()+" "+c.getNombre()+ " " +c.getAnioRegistro() );
    }

    System.out.println("Existe algún cliente vip de nivel 1");
    System.out.println(tienda.existeClienteVipNivel1()? "Si": "No");
    
    System.out.println("Porcentaje de clientes promedio");
    System.out.println(tienda.obtenerClientesSobrePromedio() + "%");
    }  

}
