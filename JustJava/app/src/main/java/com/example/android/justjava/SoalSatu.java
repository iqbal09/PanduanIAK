package com.example.android.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SoalSatu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_satu);

    }

    public void submitJawaban(View view) {

        RadioGroup  radioGroup = (RadioGroup) findViewById(R.id.radioQuestion);
        int selectedId = radioGroup.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton radioButton = (RadioButton) findViewById(selectedId);


        Toast.makeText(SoalSatu.this,
                radioButton.getText(), Toast.LENGTH_SHORT).show();


        // Fungsi Intent
        Intent pindah = new Intent(SoalSatu.this, SoalDua.class);
        pindah.putExtra("jawaban1", radioButton.getText());
        startActivity(pindah);








    }








}
