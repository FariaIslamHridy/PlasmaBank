package com.example.plasmabank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Plasma_Receiver extends AppCompatActivity {

    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plasma__receiver);
        this.setTitle("Plasma Receiver");

        submitButton = (Button)findViewById(R.id.ReceiverSubmitButtonId);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent submitIntent = new Intent(Plasma_Receiver.this,Login_Page.class);
            }
        });
    }
}