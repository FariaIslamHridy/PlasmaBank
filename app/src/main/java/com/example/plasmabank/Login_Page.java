
package com.example.plasmabank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;

public class Login_Page extends AppCompatActivity {

    private Button BeADonorButton, NeedPlasmaButton, InformationButton;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__page);
        this.setTitle("Login Page");


        BeADonorButton = findViewById(R.id.DonorId);
        NeedPlasmaButton = findViewById(R.id.PlasmaReceiverId);
        InformationButton = findViewById(R.id.InformationId);


        BeADonorButton.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {
                                                  Log.d("man", "BeADonorButton: Login");
                                                  Intent BeADonorButtonintent = new Intent(Login_Page.this, Plasma_Donor.class);
                                                  startActivity(BeADonorButtonintent);
                                              }
                                          }

        );
        NeedPlasmaButton.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    Log.d("man", "NeedPlasmaButton: Login");

                                                    Intent NeedPlasmaButtonintent = new Intent(Login_Page.this, Plasma_Receiver.class);
                                                    startActivity(NeedPlasmaButtonintent);
                                                }
                                            }

        );
        InformationButton.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View view) {
                                                     Log.d("man", "InformationButton: Login");
                                                     Intent InformationButtonintent = new Intent(Login_Page.this, Information.class);
                                                     startActivity(InformationButtonintent);
                                                 }
                                             }

        );
    }
}