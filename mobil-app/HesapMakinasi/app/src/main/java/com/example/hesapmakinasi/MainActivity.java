package com.example.hesapmakinasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button[] rakamButonlari =new Button[10];
    private int [] rakamIdleri={R.id.buton0,R.id.buton1,R.id.buton2,R.id.buton3,R.id.buton4,
            R.id.buton5,R.id.buton6,R.id.buton7,R.id.buton8,R.id.buton9};
    private Button[] islemButonlari = new Button[4];
    private int [] islemidleri= {R.id.butoncarp,R.id.butoncıkart,R.id.butontopla,R.id.butonbol};

    private TextView sonucTV;
    private double sayi1,sayi2,toplam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < rakamButonlari.length;i++){

            rakamButonlari[i]=findViewById(rakamIdleri[i]);
            rakamButonlari[i].setOnClickListener(this);
        }
        IslemDinleyici islemDinleyici=new IslemDinleyici();
        for (int i = 0; i < islemButonlari.length;i++){

            islemButonlari[i]=findViewById(rakamIdleri[i]);
            islemButonlari[i].setOnClickListener(islemDinleyici);
        }
    }

    @Override
    public void onClick(View v) {
        sonucTV.setText(sonucTV.getText().toString()+((Button) v).getText().toString());
    }

    class IslemDinleyici implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            sayi1 = Double.parseDouble(sonucTV.getText().toString());
            sonucTV.setText("");
        }
    }
}