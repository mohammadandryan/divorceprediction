package com.PBOTI21.TugasBesar;

import java.util.Scanner;

public class prediksi extends Probabilitas {
    // PROPERTY
    protected int kelas, j1, j2, kj1, kj2, rpb1, rpb2; // Enkapsulasi
    protected double rbys1, rbys2, rb1, rb2;
    Scanner inputan = new Scanner(System.in);

    // METHOD
    public void header() {
        System.out.println("[PREDIKSI LANGGENG-CERAI]");
    }

    public void footer() {
        System.out.println("==========================");
    }

    public void pertanyaan1() {

        System.out.println("Kami memiliki pandangan yang sama tentang bahagia dalam hidup kami?");
        System.out.println("(0) Tidak sama sekali");
        System.out.println("(1) Cenderung tidak");
        System.out.println("(2) Rata rata");
        System.out.println("(3) Cenderung iya");
        System.out.println("(4) 100% iya");
    }

    public int input1() {
        this.j1 = inputan.nextInt();
        return this.j1;

    }

    public void pertanyaan2() {
        System.out.println("Saya tahu teman pasangan saya dan hubungan sosial mereka");
        System.out.println("(0) Tidak sama sekali");
        System.out.println("(1) Cenderung tidak");
        System.out.println("(2) Rata rata");
        System.out.println("(3) Cenderung iya");
        System.out.println("(4) 100% iya");
    }

    public int input2() {
        this.j2 = inputan.nextInt();
        return this.j2;
    }
    public void setJ1(int j1) {
        this.j1 = j1;
    }
    public void setJ2(int j2) {
        this.j2 = j2;
    }

    public void logic() {
        // LOGIC UNTUK ATRIBUT 1
        if (this.j1 > 0 && this.j1 < 5) {

            if (this.j1 >= 2) {
                this.kj1 = 1;
            } else {
                this.kj1 = 0;

            }

        } else {
            System.out.println("Jawaban salah");
        }
        // LOGIC UNTUK ATRIBUT 2
        if (this.j2 > 0 && this.j2 < 5) {
            if (this.j2 >= 2) {
                this.kj2 = 1;
            } else {
                this.kj2 = 0;

            }

        } else {
            System.out.println("Jawaban salah");
        }
        // LOGIC UNTUK PREDIKSI
        if (this.kj1 == 1 && this.kj2 == 1) {
            this.rpb1 = 100;
            this.rpb2 = 0;
            this.rbys1 = 0.451388;
            this.rbys2 = 0.000051;
        }
        if (this.kj1 == 1 && this.kj2 == 0) {
            this.rpb1 = 75;
            this.rpb2 = 25;
            this.rbys1 = 0.028812;
            this.rbys2 = 0.005049;
        }
        if (this.kj1 == 0 && this.kj2 == 1) {
            this.rpb1 = 0;
            this.rpb2 = 100;
            this.rbys1 = 0.009212;
            this.rbys2 = 0.005049;
        }
        if (this.kj1 == 0 && this.kj2 == 0) {
            this.rpb1 = 2;
            this.rpb2 = 98;
            this.rbys1 = 0.000588;
            this.rbys2 = 0.480249;
        }
        // BAYES
        if (this.j1 == 0 && this.j2 == 0) {
            this.rb1 = 0;
            this.rb2 = 12.044;
            this.kelas = 1;
        }
        if (this.j1 == 0 && this.j2 == 1) {
            this.rb1 = 0.044;
            this.rb2 = 0.539;
            this.kelas = 2;
        }
        if (this.j1 == 0 && this.j2 == 2) {
            this.rb1 = 0;
            this.rb2 = 0.003;
            this.kelas = 3;
        }
        if (this.j1 == 0 && this.j2 == 3) {
            this.rb1 = 0;
            this.rb2 = 0;
            this.kelas = 4;
        }
        if (this.j1 == 0 && this.j2 == 4) {
            this.rb1 = 0;
            this.rb2 = 0;
            this.kelas = 5;
        }
        if (this.j1 == 1 && this.j2 == 0) {
            this.rb1 = 0;
            this.rb2 = 0.034;
            this.kelas = 6;
        }
        if (this.j1 == 1 && this.j2 == 1) {
            this.rb1 = 0.034;
            this.rb2 = 0.051;
            this.kelas = 7;
        }
        if (this.j1 == 1 && this.j2 == 2) {
            this.rb1 = 0;
            this.rb2 = 0;
            this.kelas = 8;
        }
        if (this.j1 == 1 && this.j2 == 3) {
            this.rb1 = 0;
            this.rb2 = 0;
            this.kelas = 9;
        }
        if (this.j1 == 1 && this.j2 == 4) {
            this.rb1 = 0;
            this.rb2 = 0;
            this.kelas = 10;
        }
        if (this.j1 == 2 && this.j2 == 0) {
            this.rb1 = 0.00692042;
            this.rb2 = 0.00692041;
            this.kelas = 11;
        }
        if (this.j1 == 2 && this.j2 == 1) {
            this.rb1 = 0;
            this.rb2 = 0;
            this.kelas = 12;
        }
        if (this.j1 == 2 && this.j2 == 2) {
            this.rb1 = 0.013;
            this.rb2 = 0;
            this.kelas = 13;

        }
        if (this.j1 == 2 && this.j2 == 3) {
            this.rb1 = 0.003;
            this.rb2 = 0;
            this.kelas = 14;
        }
        if (this.j1 == 2 && this.j2 == 4) {
            this.rb1 = 0.003;
            this.rb2 = 0;
            this.kelas = 15;
        }
        if (this.j1 == 3 && this.j2 == 0) {
            this.rb1 = 0;
            this.rb2 = 0;
            this.kelas = 16;
        }
        if (this.j1 == 3 && this.j2 == 1) {
            this.rb1 = 0;
            this.rb2 = 0;
            this.kelas = 17;
        }
        if (this.j1 == 3 && this.j2 == 2) {
            this.rb1 = 0.584;
            this.rb2 = 0;
            this.kelas = 18;
        }
        if (this.j1 == 3 && this.j2 == 3) {
            this.rb1 = 1.99;
            this.rb2 = 0;
            this.kelas = 19;
        }
        if (this.j1 == 3 && this.j2 == 4) {
            this.rb1 = 0.584;
            this.rb2 = 0;
            this.kelas = 20;
        }
        if (this.j1 == 4 && this.j2 == 0) {
            this.rb1 = 0.003;
            this.rb2 = 0;
            this.kelas = 21;
        }
        if (this.j1 == 4 && this.j2 == 1) {
            this.rb1 = 0.003;
            this.rb2 = 0;
            this.kelas = 22;
        }
        if (this.j1 == 4 && this.j2 == 2) {
            this.rb1 = 0.169;
            this.rb2 = 0;
            this.kelas = 23;
        }
        if (this.j1 == 4 && this.j2 == 3) {
            this.rb1 = 0.346;
            this.rb2 = 0;
            this.kelas = 24;
        }
        if (this.j1 == 4 && this.j2 == 4) {
            this.rb1 = 0.169;
            this.rb2 = 0;
            this.kelas = 25;
        }

    }

    public void prediksibersyarat() {
        System.out.println("=====================================");
        System.out.println("HASIL PREDIKSI PROBABILITAS BERSYARAT");
        System.out.println("POTENSI LANGGENG : " + rpb1 + "%");
        System.out.println("POTENSI CERAI : " + rpb2 + "%");
    }

    public void prediksinaivebayes() {
        System.out.println("=====================================");
        System.out.println("HASIL PREDIKSI NAIVE BAYES");
        System.out.println("POTENSI LANGGENG : " + (rbys1 * 100) + "%");
        System.out.println("POTENSI CERAI : " + (rbys2 * 100) + "%");
    }

    public void prediksibayes() {
        System.out.println("=====================================");
        System.out.println("HASIL PREDIKSI BAYES");
        System.out.println("POTENSI LANGGENG : " + (rb1) + "%");
        System.out.println("POTENSI CERAI : " + (rb2) + "%");
    }

    public String hasilaplikasi(){
        String hasil = "";
        // rb1 = rb1 * 100;
        // rb2 = rb2 * 100;
        int irb1 = (int) rb1;
        int irb2 = (int) rb2;
        if (rb1>rb2){
            hasil = "LANGGENG " + "( Probabilitas = " + kelas + ")";
        } else{
            hasil = "CERAI " + " (Probabilitas = " + kelas + ")";
        }
        return hasil;
    }

    public int getKelas() {
        return kelas;
    }
}
