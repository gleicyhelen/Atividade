package atividade.exemplo.gleicy.atividade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TelaActivity extends AppCompatActivity {

    private int viewAdd = 15;
    private String[] hint;
    private String[] tags;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        hint = getResources().getStringArray(R.array.hint);

        setContentView(R.layout.activity_tela);

        tags = getResources().getStringArray(R.array.tags);

        LinearLayout layoutTela = findViewById(R.id.campoContainer);


        for (int i = 0 ; i < hint.length ; i++ ) {

            EditText editTextLayout = new EditText(this);
            editTextLayout.setId(i);
            editTextLayout.setHint(hint[i]);
            editTextLayout.setTag(tags[i]);

            layoutTela.addView(editTextLayout);
        }


        Button botaoEnviar = new Button(this);
        botaoEnviar.setText("Enviar");

        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LinearLayout primeiroLayout = findViewById(R.id.campoContainer);
                primeiroLayout.setVisibility(View.GONE);

                LinearLayout resultadoLayout = findViewById(R.id.campoResultado);
                resultadoLayout.setVisibility(View.VISIBLE);

                String resultado = "";

                Cliente cliente = new Cliente();


                for (int i = 0; i < hint.length; i++) {
                    EditText editText = findViewById(i);

                    if (!TextUtils.isEmpty(editText.getText().toString())) {
                        resultado += editText.getText().toString() + "\n";
                        cliente.setarCampo(editText.getTag().toString(), editText.getText().toString());
                        editText.setText("");
                    }
                }

                clientes.inserirCliente(cliente);

                ((TextView) findViewById(R.id.campoResultado)).setText(resultado);

            }
        });

        ((Button) findViewById(R.id.btCliente)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent it = new Intent(TelaActivity.this,ClientesActivity.class);
                    startActivity(it);

                    )}



        layoutTela.addView(botaoEnviar);


}

