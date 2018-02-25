package com.example.jm.jimmy_1202150108_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText user,pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        login = findViewById(R.id.button);
    }

    public void login(View view) {
        String usernamelogin = user.getText().toString();
        String passwordlogin = pass.getText().toString();

        //membuat Username dan Password untuk Login
        if (usernamelogin.equals("EAD") && passwordlogin.equals("MOBILE")){
            Toast.makeText(getApplicationContext(),"Login berhasil",Toast.LENGTH_SHORT).show();
            Intent pindah = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(pindah);
        }else{
            Toast.makeText(getApplicationContext(),"Username dan Password salah",Toast.LENGTH_SHORT).show();
        }
    }
}
