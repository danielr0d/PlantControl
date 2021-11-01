package com.example.plantcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListPlant extends AppCompatActivity {

    private listViewPlant listViewPlant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_plant);

        listViewPlant = findViewById(R.id.listViewPlant);
    }
}