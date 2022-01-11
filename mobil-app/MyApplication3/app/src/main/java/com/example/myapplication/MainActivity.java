package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<HavaDurumu> havalar;
    private ArrayAdapter<HavaDurumu> adaptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        havalar=new ArrayList<>();
        dosyadanOkuListeyiDoldur("hava.csv");

        adaptor=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,havalar);
        listView.setAdapter(adaptor);
    }
    private void dosyadanOkuListeyiDoldur(String dosyaAdi) {


        //DOSYADAN OKUMA
        try (InputStream is = getAssets().open(dosyaAdi);
             InputStreamReader isr = new InputStreamReader(is,"Windows-1254");
             BufferedReader br = new BufferedReader(isr);) {

            br.readLine();  //İlk satır başlık satırı ise o satırı okuyup, sonraki satıra geçiyoruz.
            //Dosyanın başında ilgilenmeyip, sadece okuyup geç

            String satir=br.readLine();  //bilgi içeren ilk satır
            while (satir!=null)
            {
                //TODO:  AYIKLAMA(PARSING İŞLEMİ)
                String[] dizi=satir.split(",");

                String DATE_TIME=dizi[0];
                String OBSERVATORY_NAME=dizi[1];
                double AVERAGE_TEMPERATURE=Double.parseDouble(dizi[5]);
                double AVERAGE_HUMIDITY=Double.parseDouble(dizi[8]);

                HavaDurumu hd = new HavaDurumu(DATE_TIME,OBSERVATORY_NAME,AVERAGE_TEMPERATURE,AVERAGE_HUMIDITY);
                havalar.add(hd);
                satir=br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}