package com.example.android.justjava;

/**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 *
 */


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {


    int quantity = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        //Ubah Integer ke Sting
        String kirim = String.valueOf(quantity);

        display(quantity);
        displayPrice(quantity*5);




    }




    public void increment(View view) {


        //condition
        //maksimal bisa pesan 10 kopi

        if(quantity>9){
            return;
        }else{

            quantity ++;
            display(quantity);

        }






    }


    public void decrement(View view) {

        if(quantity<2){

            return;

        }else {

            quantity --;
            display(quantity);

        }




    }





    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {

        EditText edit_text_nama_konsumen = (EditText)findViewById(R.id.edit_text_nama_konsumen);
        String nama = edit_text_nama_konsumen.getText().toString();

        String toping = "";

        CheckBox whipeCream = (CheckBox)findViewById(R.id.toping_whipe_cream);
        CheckBox coklat = (CheckBox)findViewById(R.id.toping_coklat);

        if(whipeCream.isChecked()){

            toping += "\n Pakai Whipe Cream";

        }


        if(coklat.isChecked()){

            toping += "\n Pakai Coklat";

        }






        String tampil = "Terima Kasih " + nama +toping+"\n Total Harga "+  NumberFormat.getCurrencyInstance().format(number);


//        Intent pindah = new Intent(MainActivity.this, ResultActivity.class);
//        pindah.putExtra("quantity", tampil);
//        startActivity(pindah);

        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(tampil);
    }
}