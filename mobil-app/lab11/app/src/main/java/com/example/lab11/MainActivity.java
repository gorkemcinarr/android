package com.example.lab11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Kitap> kitaplar;
    private ArrayAdapter<Kitap> adaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.listView);

        kitaplar = new ArrayList<>();
        kitaplar.add(new Kitap("Suç Ceza","Dostoveski",2005,205));
        kitaplar.add(new Kitap("SAvas Barış","Tolstoy",2005,205));
        kitaplar.add(new Kitap("Palto","Gogol",2020,100));

        adaptor=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,kitaplar);
        listView.setAdapter(adaptor);

    }

}