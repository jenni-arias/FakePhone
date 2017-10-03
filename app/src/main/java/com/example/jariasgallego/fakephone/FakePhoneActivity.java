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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        num_telefono = (EditText) findViewById(R.id.num_telefono);
        btn_trucar = (Button) findViewById(R.id.btn_trucar);
    }

    public void clicat(View v) {
        concat_num = (EditText) findViewById(R.id.num_telefono);
        Button boto = (Button) v;                                    // Convertir en botón la variable Boton
        String num = boto.getText().toString();
        num_telefono.setText(concat_num.getText().toString() + num);
        btn_trucar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FakePhoneActivity.this, "Trucant al... " + num_telefono.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void clicat_esborra(View v) {
        num_telefono.setText("");
    }

}

// TODO: Traducir todo correctamente e intentar mejorar el código.

