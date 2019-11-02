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

public class calcular1 extends AppCompatActivity {

    EditText alcool1;
    EditText gasolina1;
    EditText alcool2;
    EditText gasolina2;
    TextView resposta;
    double op1;
    double op2;
    double op3;
    double op4;
    double resultado1;
    double resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final TextView resposta = (TextView) findViewById(R.id.resposta);
        final EditText alcool1 = (EditText) findViewById(R.id.preço1);
        final EditText gasolina1 = (EditText) findViewById(R.id.preço2);
        final EditText alcool2 = (EditText) findViewById(R.id.km1);
        final EditText gasolina2 = (EditText) findViewById(R.id.km2);
        Button calcular = (Button) findViewById(R.id.floatingActionButton);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((alcool1.getText().length() > 0) && (gasolina1.getText().length() > 0) && (alcool2.getText().length() > 0) && (gasolina2.getText().length() > 0)) {
                    double op1;
                    double op2;
                    double op3;
                    double op4;
                    double resultado1;
                    double resultado2;

                    op1 = Double.parseDouble(alcool1.getText().toString());
                    op2 = Double.parseDouble(alcool2.getText().toString());
                    op3  = Double.parseDouble(gasolina1.getText().toString());
                    op4 = Double.parseDouble(gasolina2.getText().toString());
                    resultado1 =  op2/op1;
                    resultado2 = op4/op3;
                    if(resultado1>resultado2) {
                        resposta.setText("Compensa colocar alcool");
                    } else{
                        resposta.setText("Compensa colocar Gasolina");
                    }
                }//else{
                    //Toast.makeText( this,  "Por favor preencha todos os campos",Toast.LENGTH_SHORT).show();
                //}
            }
        });
    }
    /*public void compensa(View v) {
        if ((alcool1.getText().length() > 0) && (gasolina1.getText().length() > 0) && (alcool2.getText().length() > 0) && (gasolina2.getText().length() > 0)) {
            double op1;
            double op2;
            double op3;
            double op4;
            double resultado1;
            double resultado2;

            op1 = Double.parseDouble(alcool1.getText().toString());
            op2 = Double.parseDouble(alcool2.getText().toString());
            op3  = Double.parseDouble(gasolina1.getText().toString());
            op4 = Double.parseDouble(gasolina2.getText().toString());
            resultado1 =  op2/op1;
            resultado2 = op4/op3;
            if(resultado1>resultado2) {
                resposta.setText("Compensa colocar alcool");
            } else{
                resposta.setText("Compensa colocar Gasolina");
            }
        }else{
            Toast.makeText( this,  "Por favor preencha todos os campos",Toast.LENGTH_SHORT).show();
        }*/
    }


