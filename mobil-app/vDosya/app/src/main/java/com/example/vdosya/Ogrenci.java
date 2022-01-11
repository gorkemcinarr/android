package com.example.vdosya;

public class Ogrenci {

    private int siraNo;
    private String ogrenciNo;
    private String soyadAd;
    private String bolum;

    public Ogrenci(int siraNo, String ogrenciNo, String soyadAd, String bolum) {
        this.siraNo = siraNo;
        this.ogrenciNo = ogrenciNo;
        this.soyadAd = soyadAd;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Sira: "+siraNo+"Ogrenci No: "+ogrenciNo+"Soyad-ad: "+soyadAd+"Bölüm: "+bolum;
    }
}
