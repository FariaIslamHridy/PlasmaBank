package com.example.plasmabank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Information extends AppCompatActivity {
    private Button EmergencyPostEditId, SearchEditId, CovidNewsEditId, MedicinesEditId, FoodEditId, ExerciseEditId, ExperienceEditId;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        this.setTitle("Information Page");


        Log.d("ck", "onCreate: Login");
        EmergencyPostEditId =  findViewById(R.id.EmergencyPostId);
        SearchEditId = findViewById(R.id.SearchId);
        CovidNewsEditId = findViewById(R.id.CovidNewsId);
        MedicinesEditId =  findViewById(R.id.MedicinesId);
        FoodEditId = findViewById(R.id.FoodId);
        ExerciseEditId = findViewById(R.id.ExerciseId);
        ExperienceEditId = findViewById(R.id.ExperienceId);

        EmergencyPostEditId.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {

                                                  Intent EmergencyPostEditIdintent = new Intent(Information.this, Emergency_Post.class);
                                                  startActivity(EmergencyPostEditIdintent);
                                              }
                                          }

        );
        SearchEditId.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {

                                                    Intent SearchEditIdintent = new Intent(Information.this, Search.class);
                                                    startActivity(SearchEditIdintent);
                                                }
                                            }

        );
        CovidNewsEditId.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View view) {

                                                     Intent CovidNewsEditIdintent = new Intent(Information.this, Covid_News.class);
                                                     startActivity(CovidNewsEditIdintent);
                                                 }
                                             }
        );
        MedicinesEditId.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {

                                                  Intent MedicinesEditIdintent = new Intent(Information.this, Covid_Medicines.class);
                                                  startActivity(MedicinesEditIdintent);
                                              }
                                          }

        );
        FoodEditId.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {

                                                    Intent FoodEditIdintent = new Intent(Information.this, Covid_Food.class);
                                                    startActivity(FoodEditIdintent);
                                                }
                                            }

        );
        ExerciseEditId.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View view) {

                                                     Intent ExerciseEditIdintent = new Intent(Information.this, Covid_Exercise.class);
                                                     startActivity(ExerciseEditIdintent);
                                                 }
                                             }

        );
        ExperienceEditId.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {

                                                    Intent ExperienceEditIdintent = new Intent(Information.this, Covid_Experience.class);
                                                    startActivity(ExperienceEditIdintent);
                                                }
                                            }

        );

    }
}