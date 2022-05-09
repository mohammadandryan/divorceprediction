package com.PBOTI21.TugasBesar;

public class TesOlahData extends OlahData {

    public void deskripsiData(int x) {
        OlahData data = new OlahData();
        System.out.println("Frekuensi kategori ke " + x + " langgeng adalah :" + data.getFkl(x));
        System.out.println("Frekuensi kategori ke " + x + " cerai adalah :" + data.getFkc(x));
        System.out.println("Total frekuensi langgeng adalah : " + data.getTotalFkl());
        System.out.println("Total frekuensi cerai adalah : " + data.getTotalFkc());
        System.out.println("Total frekuensi seluruhnya adalah : " + data.getTotalAll());
    }

    public static void main(String[] args) {
        TesOlahData tes = new TesOlahData();
        tes.deskripsiData(1);
    }
}
