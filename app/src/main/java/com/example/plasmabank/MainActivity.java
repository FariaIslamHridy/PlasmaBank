package com.example.plasmabank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText UseNameEditText, PasswordEditText;
    private Button LoginButton, RegisterButton;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Main Activity");

        UseNameEditText = (EditText) findViewById(R.id.UsernameId);
        PasswordEditText = (EditText) findViewById(R.id.PasswordId);
        LoginButton = (Button) findViewById(R.id.LoginButtonId);
        RegisterButton = (Button) findViewById(R.id.RegisterId);


        LoginButton.setOnClickListener(new View.OnClickListener()
           {
               @Override
               public void onClick(View view) {

                       Intent LoginButtonintent = new Intent(MainActivity.this, Login_Page.class);
                       startActivity(LoginButtonintent);
               }
           }

        );
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent RegisterButtonintent = new Intent(MainActivity.this, Registration_Page.class);
                startActivity(RegisterButtonintent);
            }
        }

        );

    }
}