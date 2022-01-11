package com.example.lab11;

public class Kitap {

    String ad;
    String yazar;
    int basimYili;
    int sayfaSayisi;

    @Override
    public String toString() {
        return "Kitap{" +
                "ad='" + ad + '\n' +
                ", yazar='" + yazar + '\n' +
                ", basimYili=" + basimYili +"\n"+
                ", sayfaSayisi=" + sayfaSayisi +
                '}';
    }

    public Kitap(String ad, String yazar, int basimYili, int sayfaSayisi) {
        this.ad = ad;
        this.yazar = yazar;
        this.basimYili = basimYili;
        this.sayfaSayisi = sayfaSayisi;
    }
}
