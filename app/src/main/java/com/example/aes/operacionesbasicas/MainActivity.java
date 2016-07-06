package com.example.aes.operacionesbasicas;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText_valor1;
    EditText editText_valor2;
    TextView textViewResultado;
    RadioButton radioButtonSuma;
    RadioButton radioButtonResta;
    RadioButton radioButtonMultiplicacion;
    RadioButton radioButtonDivision;
    Button buttonCalcular;
    int Opcion=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
         editText_valor1=(EditText)findViewById(R.id.editText_valor1);
         editText_valor2= (EditText)findViewById(R.id.editText_valor2);
         textViewResultado=(TextView)findViewById(R.id.tvResultado);
         radioButtonSuma=(RadioButton)findViewById(R.id.radioButtonSuma);
         radioButtonResta=(RadioButton)findViewById(R.id.radioButtonResta);
         radioButtonMultiplicacion=(RadioButton)findViewById(R.id.radioButtonMultiplicacion);
         radioButtonDivision=(RadioButton)findViewById(R.id.radioButtonDivision);
         buttonCalcular=(Button)findViewById(R.id.buttonCalcular);

      buttonCalcular.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Calcular(Integer.parseInt(editText_valor1.getText().toString()),Integer.parseInt(editText_valor2.getText().toString()));
          }
      });

    }

    public void Calcular(int a ,int b ) {
        int res = 0;
        if (radioButtonSuma.isChecked() == true) {
            res = a + b;

        } else {
            if (radioButtonResta.isChecked() == true) {
                res = a - b;

            }
        else{
            if (radioButtonMultiplicacion.isChecked() == true) {
                res = a + b;

            }else {

                    if (radioButtonDivision.isChecked() == true) {
                        res = a / b;

                    }

            }
        }
    }


        textViewResultado.setText(Integer.toString(res));

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
}
