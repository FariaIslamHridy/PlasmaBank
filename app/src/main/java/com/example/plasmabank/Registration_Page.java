package com.example.plasmabank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuthException;

public class Registration_Page extends AppCompatActivity {


    private Button submitButton;
    private TextView rFullName, rPhoneNumber,  rEmailId, rAddressId, rPassword;
    private FirebaseAuthException fAuth;


    public Registration_Page() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration__page);
        this.setTitle("Registration Page");


        submitButton = (Button) findViewById(R.id.SubmitButtonId);
        submitButton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                finish();
                                                Intent submitIntent = new Intent(Registration_Page.this, MainActivity.class);
                                            }
                                        }
        );
    }}