package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText textUser, textPass;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textUser = findViewById(R.id.textUser);
        textPass = findViewById(R.id.textPass);
        textView2 = findViewById(R.id.textView2);
    }

    public void Login(View v) {
        String Username, Password;

        Username = textUser.getText().toString();
        Password = textPass.getText().toString();

        if (Username.equals("parcialETps1") && Password.equals("p4rC14l#tp$")) {
            startActivity(new Intent(MainActivity.this, MainActivity2.class));

        } else {
            textView2.setText("Contro no son correctosaseña y/o usuari");
        }
    }


}