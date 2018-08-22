package atividade.exemplo.gleicy.atividade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BDClientes extends AppCompatActivity {

    private List<Cliente> clientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdclientes);

        clientes = new ArrayList<>();

        public void inserirCliente(Cliente clientes){

            clientes.add(clientes);

        }

        public List<Cliente> recuperarClientes(){

            return clientes;
        }

}
