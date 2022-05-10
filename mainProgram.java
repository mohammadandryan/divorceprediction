package com.PBOTI21.TugasBesar;

public class mainProgram {

    public static void main(String[] args) {
        prediksi prediksi1 = new prediksi();
        Probabilitas probabilitas1 = new Probabilitas();
        prediksi1.header();
        prediksi1.pertanyaan1();
        prediksi1.input1();
        prediksi1.pertanyaan2();
        prediksi1.input2();
        prediksi1.logic();
        // prediksi1.prediksibersyarat();
        // prediksi1.prediksinaivebayes();
        // prediksi1.prediksibayes();
        probabilitas1.deskripsiProb(prediksi1.getKelas());
        probabilitas1.getBayes();
        // probabilitas1.printBayes();
        // probabilitas1.printHasilUji();
        
        prediksi1.footer();
    }
}
