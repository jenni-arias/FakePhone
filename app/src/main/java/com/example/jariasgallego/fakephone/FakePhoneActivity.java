package com.example.jariasgallego.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FakePhoneActivity extends AppCompatActivity {

    EditText num_telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

         num_telefono = (EditText) findViewById(R.id.num_telefono);
    }

    private int all_numbers[] = {
            R.id.btn_1, R.id.btn_2
    };


    public void clicat(View v) {
        Button boto = (Button) v;                   // Convertir en botón la variable Botón
        String s = boto.getText().toString();
        num_telefono.setText(s);
    }
}

     /*   all_questions = getResources().getStringArray(R.array.all_questions);
                answer_is_correct = new boolean[all_questions.length];
                answer = new int[all_questions.length];
                for (int i = 0; i< answer.length; i++) {
        answer[i] = -1;
        }*/