package com.example.plasmabank;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.security.Signature;

public class Plasma_Receiver extends AppCompatActivity {

    private Button submitButton;
    private EditText ReceiverName;
    private EditText ReceiverPhone;
    private EditText ReceiverEmail;
    private EditText ReceiverAddress;
    private EditText ReceiverPassword;
    Spinner ReceiverSpinner;

    DatabaseReference databaseReference ;
    private Signature fireBaseDatabase;
    private Object Plasma_Receive_Modal;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plasma__receiver);
        this.setTitle("Plasma Receiver");
        ReceiverName = (EditText) findViewById(R.id.ReceiverUsernameId);
        ReceiverPhone = (EditText) findViewById(R.id.ReceiverPhoneNumberId);
        ReceiverEmail = (EditText) findViewById(R.id.ReceiverEmailId);
        ReceiverAddress = (EditText) findViewById(R.id.ReceiverAddressId);
        ReceiverPassword = (EditText) findViewById(R.id.ReceiverPasswordId);
        ReceiverSpinner = (Spinner) findViewById(R.id.ReceiverSpinnerId);

        databaseReference = FirebaseDatabase.getInstance().getReference();
        submitButton = (Button)findViewById(R.id.ReceiverSubmitButtonId);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference dataBaseReference = null;
                String id = dataBaseReference.push().getKey();
                Plasma_Receive_Modal ReceiverModal = new Plasma_Receive_Modal(id, ReceiverName.getText().toString(),ReceiverPhone.getText().toString(), ReceiverEmail.getText().toString(), ReceiverAddress.getText().toString(),ReceiverPassword.getText().toString(), ReceiverSpinner.getSelectedItem().toString());
                Task<Void> setValue = dataBaseReference.child(id).setValue("");
            }
        });

    }
}