package com.example.plasmabank;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.security.Signature;
import java.util.ArrayDeque;
import java.util.Calendar;

public class Plasma_Donor extends AppCompatActivity {

    private Button submitButton;
    private EditText DonorName;
    private EditText DonorPhone;
    private EditText DonorEmail;
    private EditText DonorAddress;
    private EditText DonorPassword;
    Spinner DonorSpinner;

    DatabaseReference databaseReference ;
    private Signature fireBaseDatabase;
    private Object Plasma_Donor_Modal;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plasma__donor);
        this.setTitle("Plasma Donor");

        DonorName = (EditText) findViewById(R.id.DonorUsernameId);
        DonorPhone = (EditText) findViewById(R.id.DonorPhoneNumberId);
        DonorEmail = (EditText) findViewById(R.id.DonorEmailId);
        DonorAddress = (EditText) findViewById(R.id.DonorAddressId);
        DonorPassword = (EditText) findViewById(R.id.DonorPasswordId);
        DonorSpinner = (Spinner) findViewById(R.id.DonorSpinnerId);

        databaseReference = FirebaseDatabase.getInstance().getReference();
        submitButton = (Button)findViewById(R.id.DonorSubmitButtonId);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference dataBaseReference = null;
                String id = dataBaseReference.push().getKey();
                Plasma_Donor_Modal donorModal = new Plasma_Donor_Modal(id, DonorName.getText().toString(),DonorPhone.getText().toString(), DonorEmail.getText().toString(), DonorAddress.getText().toString(),DonorPassword.getText().toString(), DonorSpinner.getSelectedItem().toString());
                Task<Void> setValue = dataBaseReference.child(id).setValue("");

            }
        });

    }
}