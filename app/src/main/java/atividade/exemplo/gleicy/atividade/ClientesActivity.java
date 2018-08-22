package atividade.exemplo.gleicy.atividade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ClientesActivity extends AppCompatActivity {

    List <Cliente> clientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);

        clientes = TelaActivity.bdListaClientes.recuperarClientes();

        layoutInflater inflater = (LayoutInflater) this.getSystemService(this.LAYOUT_INFLATER_SERVICE) ;

        for (Cliente cliente : clientes){

            View v = inflater.inflate(R.layout.item_cliente, null, false);

            ((TextView)v.findViewById(R.id.Nome)).setText(cliente.getNome());

            ((LinerarLayout)findViewByID(R.id.campoContainer)).addView(v);

        }
    }
}
