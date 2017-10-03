package com.example.jariasgallego.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FakePhoneActivity extends AppCompatActivity {

    EditText num_telefono, concat_num;
    Button btn_trucar;
    private String all_numbers[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        num_telefono = (EditText) findViewById(R.id.num_telefono);
        btn_trucar = (Button) findViewById(R.id.btn_trucar);

    // TODO: QUE EN EL TOAST SALGAN LOS NUMEROS MARCADOS

        btn_trucar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast1 = Toast.makeText(getApplicationContext(), "Toast por defecto", Toast.LENGTH_SHORT);
                toast1.show();
            }
        });

    }

    public void clicat(View v) {
        concat_num = (EditText) findViewById(R.id.num_telefono);
        Button boto = (Button) v;                                    // Convertir en botón la variable Boton
        String num = boto.getText().toString();
        num_telefono.setText(concat_num.getText().toString() + num);
    }

    public void clicat_esborra(View v) {
        Button boto = (Button) v;
        String num = boto.getText().toString();
        num_telefono.setText("");
    }

}

 /*
    public void clicat_trucar (View v) {
        Button boto = (Button) v;
        String num = boto.getText().toString();
        String resultado = String.format("Trucant al %d" , num);
   //     Toast.makeText(FakePhoneActivity.this, resultado, Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "algo?", Toast.LENGTH_LONG).show();

    }
    */


/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        num_telefono = (EditText) findViewById(R.id.num_telefono);
        btn_trucar = (Button) findViewById(R.id.btn_trucar);

        btn_trucar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast1 = Toast.makeText(getApplicationContext(), "Toast por defecto", Toast.LENGTH_SHORT);
                toast1.show();
            }
        });

    }

*/