package com.example.computador;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /*  FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        Button preço = (Button) findViewById(R.id.preço);
        preço.setOnClickListener(new Button.OnClickListener() {
                                     public void onClick(View v) {
                                         openActivitycalcular1();
                                     }

                                 }

        );
        Button rendimento = (Button) findViewById(R.id.rendimento);
        rendimento.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                openActivityrendimento1();
            }
        });
        Button botao = (Button) findViewById(R.id.button2);
        botao.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view){
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.noticiasautomotivas.com.br/tanque-de-combustivel-quantos-litros-cabem-nos-modelos-nacionais/"));
                startActivity(browserIntent);
        }

        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openActivitycalcular1() {
        Intent intent = new Intent(this, rendimento1.class);
        startActivity(intent);

    }
    public void openActivityrendimento1(){
        Intent intent = new Intent(this, calcular1.class);
        startActivity(intent);
    }

}
