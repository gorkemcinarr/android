package com.example.haf06;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int totalOrderNumber = 0;
    int totalPriceNumber = 0;
    int productPrice = 5;

    public TextView Quantity;
    public TextView totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Quantity = findViewById(R.id.Quantity);
        totalPrice = findViewById(R.id.Price);
    }

    public void increment(View view) {
        totalOrderNumber++;
        Quantity.setText(""+totalOrderNumber);
        totalPrice.setText(""+ totalOrderNumber * 5  +" TL");
    }

    public void decrement(View view) {
        if(totalOrderNumber >= 1) {
            totalOrderNumber--;
        }
        Quantity.setText(""+totalOrderNumber);
        totalPrice.setText(""+ totalOrderNumber * 5 + " TL");
    }
}
