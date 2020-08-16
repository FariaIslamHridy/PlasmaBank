package com.example.plasmabank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Plasma_Receive_Modal extends AppCompatActivity {
    String  ReceiverName, ReceiverPhone, ReceiverEmail, ReceiverAddress, ReceiverPassword;
    public Plasma_Receive_Modal(String id, String s, String toString, String string, String s1, String toString1, String string1) {
    }

    public Plasma_Receive_Modal() {
    }

    public Plasma_Receive_Modal(String ReceiverName, String ReceiverPhone, String ReceiverEmail, String ReceiverAddress, String ReceiverPassword)
    {
        this.ReceiverName = ReceiverName;
        this.ReceiverPhone = ReceiverPhone;
        this.ReceiverEmail = ReceiverEmail;
        this.ReceiverAddress = ReceiverAddress;
        this.ReceiverPassword = ReceiverPassword;

    }

    public String getReceiverName() {
        return ReceiverName;
    }

    public void setReceiverName(String receiverName) {
        ReceiverName = receiverName;
    }

    public String getReceiverPhone() {
        return ReceiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        ReceiverPhone = receiverPhone;
    }

    public String getReceiverEmail() {
        return ReceiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        ReceiverEmail = receiverEmail;
    }

    public String getReceiverAddress() {
        return ReceiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        ReceiverAddress = receiverAddress;
    }

    public String getReceiverPassword() {
        return ReceiverPassword;
    }

    public void setReceiverPassword(String receiverPassword) {
        ReceiverPassword = receiverPassword;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plasma__receive__modal);
    }
}