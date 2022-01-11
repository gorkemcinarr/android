package com.example.vdosya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Ogrenci> ogrenciler;
    private ArrayAdapter<Ogrenci> adaptor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        ogrenciler=new ArrayList<>();
        dosyadanOkuListeyiDoldur("sinifListesi.csv");

        adaptor=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,ogrenciler);
        listView.setAdapter(adaptor);

    }
    private void dosyadanOkuListeyiDoldur(String dosyaAdi) {


        //DOSYADAN OKUMA
        try (InputStream is = getAssets().open(dosyaAdi);
             InputStreamReader isr = new InputStreamReader(is,"Windows-1254");
             BufferedReader br = new BufferedReader(isr);) {

            //br.readLine();  //İlk satır başlık satırı ise o satırı okuyup, sonraki satıra geçiyoruz.
            //Dosyanın başında ilgilenmeyip, sadece okuyup geç

            String satir=br.readLine();  //bilgi içeren ilk satır
            while (satir!=null)
            {
                String[] dizi=satir.split(";");

                int siraNo=Integer.parseInt(dizi[0]);
                String ogrenciNo=dizi[1];
                String soyadAd=dizi[2];
                String bolum=dizi[3];

                Ogrenci ogr = new Ogrenci(siraNo,ogrenciNo,soyadAd,bolum);



                satir=br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}