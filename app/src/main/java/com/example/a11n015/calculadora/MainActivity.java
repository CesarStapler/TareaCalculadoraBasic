package com.example.a11n015.calculadora;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText valor1, valor2;
    Button suma, resta, multiplicacion, division;
    TextView resultado;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1= findViewById(R.id.Valor1);
        valor2= findViewById(R.id.Valor2);

        suma= findViewById(R.id.button);
        resta= findViewById(R.id.button2);
        multiplicacion= findViewById(R.id.button3);
        division= findViewById(R.id.button4);
        resultado= findViewById(R.id.resul);

        suma.setOnClickListener(this);

        resta.setOnClickListener(this);
        multiplicacion.setOnClickListener(this);
        division.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int n1= Integer.parseInt(valor1.getText().toString());
        int n2= Integer.parseInt(valor2.getText().toString());
        int resp =0;

        switch (v.getId()){
            case R.id.button:
                resp= n1+n2;
                break;

            case R.id.button2:
                resp= n1-n2;
                break;

            case R.id.button3:
                resp= n1*n2;
                break;

            case R.id.button4:
                resp= n1/n2;
                break;
        }

        resultado.setText(""+resp);

    }
}
