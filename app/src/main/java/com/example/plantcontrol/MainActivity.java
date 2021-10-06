package com.example.plantcontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPlantName, editTextPlantSpecies, editTextPlantSoil, editTextPlantAbout;
    private CheckBox checkBoxInfo;
    private RadioGroup radioGroupTypes;
    private Spinner spinnerPeriod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerPeriod = findViewById(R.id.spinnerPeriod);
        editTextPlantName = findViewById(R.id.editTextPlantName);
        editTextPlantSpecies = findViewById(R.id.editTextPlantSpecies);
        editTextPlantSoil = findViewById(R.id.editTextPlantSoil);
        editTextPlantAbout = findViewById(R.id.editTextPlantAbout);
        checkBoxInfo = findViewById(R.id.checkBoxInfo);
        radioGroupTypes = findViewById(R.id.radioGroupTypes);

    }

    public void popularSpinner(){

        ArrayList<String> lista = new ArrayList<>();

        lista.add(getString(R.string.germ));
        lista.add(getString(R.string.emerg));
        lista.add(getString(R.string.vegt));
        lista.add(getString(R.string.reprd));

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        lista);

        spinnerPeriod.setAdapter(adapter);
    }

    public void cleanText(View view){

        editTextPlantName.setText(null);
        editTextPlantSpecies.setText(null);
        editTextPlantSoil.setText(null);
        editTextPlantAbout.setText(null);
        checkBoxInfo.setChecked(false);
        radioGroupTypes.clearCheck();


        Toast.makeText(this,
                R.string.cleanFields,
                Toast.LENGTH_LONG).show();

        editTextPlantName.requestFocus();



    }

    public void showInfos(View view){

        String plantName = editTextPlantName.getText().toString();
        String msgCheckBox;
        String msgRadioGroup = "";
        String msgSpinner = "";
        String ling = (String) spinnerPeriod.getSelectedItem();

        if (ling != null) {
            msgSpinner = ling +getString(R.string.was_selected);
        } else {
            msgSpinner = "nenhum periodo foi selecionado";
        }

        if (plantName == null || plantName.trim().isEmpty())
            Toast.makeText(this, R.string.nameError, Toast.LENGTH_LONG).show();

        if (checkBoxInfo.isChecked()){
            msgCheckBox = " a planta nao possui descricao";
        } else {
            msgCheckBox = " a planta possui descricao";
        }

        switch (radioGroupTypes.getCheckedRadioButtonId()){
            case R.id.radioButtonAngiosperma:
                msgRadioGroup = "Angiosperma";
                break;
            case R.id.radioButtonBriofita:
                msgRadioGroup = "Briofita";
                break;

            case R.id.radioButtonPteridofita:
                msgRadioGroup = "Pteridofita";
                break;

            case R.id.radioButtonGimnosperma:
                msgRadioGroup = "Gimnosperma";
                break;

        }

        Toast.makeText(this,
                "A planta " + plantName + " foi registrada e " + msgCheckBox + " O filo escolhido foi: " + msgRadioGroup + " e o periodo dela e: "+ msgSpinner ,
                Toast.LENGTH_LONG).show();


    }


    public void uncheckBox(View view){
        checkBoxInfo.setChecked(false);
    }
}