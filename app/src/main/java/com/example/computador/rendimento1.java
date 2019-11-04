package com.example.computador;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class rendimento1 extends AppCompatActivity {
    EditText inicial;
    EditText final1;
    EditText litros;
    EditText porcentagem;
    TextView rendimento;
    double resultado;
    TextView rendeu;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rendimento1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final EditText inicial = (EditText) findViewById(R.id.inicial);
        final EditText final1 = (EditText) findViewById(R.id.final1);
        final EditText litros = (EditText) findViewById(R.id.litros);
        final EditText porcentagem = (EditText) findViewById(R.id.porcentagem);
        final TextView rendeu = (TextView) findViewById(R.id.rendeu);
        final Button clear = (Button) findViewById(R.id.clear);
        Button button = (Button) findViewById(R.id.button);
        final TextView km = (TextView) findViewById(R.id.km);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((inicial.getText().length() > 0) && (final1.getText().length() > 0) && (litros.getText().length() > 0) && (porcentagem.getText().length() > 0)){
                    double op1 = Double.parseDouble(inicial.getText().toString());
                    double op2 = Double.parseDouble(final1.getText().toString());
                    double op3 = Double.parseDouble(litros.getText().toString());
                    double op4 = Double.parseDouble(porcentagem.getText().toString());
                    resultado = (op2 - op1)/(op3 * (op4/100));
                    String inuNilaiString = Double.toString(resultado);
                    rendeu.setText(inuNilaiString);
                    km.setText("Km/L");
                }else Toast.makeText(rendimento1.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                clear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        inicial.setText("");
                        final1.setText("");
                        litros.setText("");
                        porcentagem.setText("");
                        rendeu.setText("");
                        km.setText("");

                    }
                    });
            }
        });


    }
}