package com.example.plasmabank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Covid_Medicines extends AppCompatActivity {

    private TextView medicines;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid__medicines);
        this.setTitle("Covid Medicines");
        medicines = (TextView)findViewById(R.id.MedicineListId);
    }
}