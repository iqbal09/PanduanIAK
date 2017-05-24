package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        TextView quantity = (TextView)findViewById(R.id.quantity);

        Bundle bbb = getIntent().getExtras();
        if (bbb != null) {

            int nilai = 0;



            String jawaban1 = bbb.getString("jawaban1");
            String jawaban2 = bbb.getString("jawaban2");

            if(jawaban1.toLowerCase().contains("soekarno")){

                nilai ++;

            }

            if(jawaban2.toLowerCase().contains("yme")){

                nilai ++;

            }



            quantity.setText(jawaban1+"\n"+jawaban2+"\n"+"NILAI = "+nilai);

        }





    }
}
