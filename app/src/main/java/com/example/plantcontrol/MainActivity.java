package com.example.plantcontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPlantName, editTextPlantSpecies, editTextPlantSoil, editTextPlantAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPlantName = findViewById(R.id.editTextPlantName);
        editTextPlantSpecies = findViewById(R.id.editTextPlantSpecies);
        editTextPlantSoil = findViewById(R.id.editTextPlantSoil);
        editTextPlantAbout = findViewById(R.id.editTextPlantAbout);
    }

    public void cleanText(View view){
        editTextPlantName.setText(null);
        editTextPlantSpecies.setText(null);
        editTextPlantSoil.setText(null);
        editTextPlantAbout.setText(null);

        Toast.makeText(this,
                R.string.cleanFields,
                Toast.LENGTH_LONG).show();

        editTextPlantName.requestFocus();



    }

    public void showInfos(View view){
        String plantName = editTextPlantName.getText().toString();

        if (plantName == null || plantName.trim().isEmpty())
            Toast.makeText(this, R.string.nameError, Toast.LENGTH_LONG).show();

        Toast.makeText(this,
                "A planta "+ plantName + " foi registrada",
                Toast.LENGTH_LONG).show();
    }
}