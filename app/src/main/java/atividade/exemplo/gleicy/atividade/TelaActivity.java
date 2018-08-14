package atividade.exemplo.gleicy.atividade;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class TelaActivity extends AppCompatActivity {

    private int viewAdd = 14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tela);

        LinearLayout layoutTela = findViewById(R.id.campoContainer);


        for (int i = 0 ; i < viewAdd ; i++ ) {

            EditText editTextLayout = new EditText(this);
            editTextLayout.setId(i);
            editTextLayout.setHint("Digite o seu nome: " + i);

            layoutTela.addView(editTextLayout);
        }


        Button botaoEnviar = new Button(this);
        botaoEnviar.setText("Enviar");

        layoutTela.addView(botaoEnviar);
    }
}
