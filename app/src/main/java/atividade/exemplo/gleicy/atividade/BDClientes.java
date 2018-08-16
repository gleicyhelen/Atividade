package atividade.exemplo.gleicy.atividade;

import java.util.ArrayList;
import java.util.List;

public class BDClientes {

    private List<Cliente> clientes;


    public BDClientes() {

        clientes = new ArrayList<>();
    }

    public void inserirCliente(Cliente cliente){

        clientes.add(cliente);

    }

    public List<Cliente> recuperarClientes(){

        return clientes;
    }

}
