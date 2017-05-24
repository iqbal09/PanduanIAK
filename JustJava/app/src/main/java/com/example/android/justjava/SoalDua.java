package com.example.android.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SoalDua extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_dua);

    }

    public void submitJawaban(View view) {

        RadioGroup  radioGroup = (RadioGroup) findViewById(R.id.radioQuestion);
        int selectedId = radioGroup.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton radioButton = (RadioButton) findViewById(selectedId);


        Toast.makeText(SoalDua.this,
                radioButton.getText(), Toast.LENGTH_SHORT).show();


        Bundle bbb = getIntent().getExtras();
        if (bbb != null) {



            String jawaban1 = bbb.getString("jawaban1");
            String jawaban2 = String.valueOf(radioButton.getText());

            Intent pindah = new Intent(SoalDua.this, ResultActivity.class);
            pindah.putExtra("jawaban1", jawaban1);
            pindah.putExtra("jawaban2", jawaban2);
            startActivity(pindah);


        }








    }








}
