package com.PBOTI21.TugasBesar;

import javax.swing.*;

public class TabelPengujian extends Data {
    String datas[][] = new String[170][5];
    JFrame f;
    Probabilitas prob = new Probabilitas();
    double[] bayes = prob.getBayes();
    String[] hasilUji = prob.getHasilUji();

    TabelPengujian() {
        
        for (int i = 0; i < 170; i++) {
            this.datas[i][0] = Integer.toString(super.p1[i]);
            this.datas[i][1] = Integer.toString(super.p2[i]);
            this.datas[i][2] = Integer.toString(super.kelas[i]);
            this.datas[i][3] = Integer.toString((int) this.bayes[i]);
            this.datas[i][4] = this.hasilUji[i];
        }
        f = new JFrame();
        String data[][] = { { "1", "Mohammad Andryan", "Unlimited" } };
        
        String column[] = { "Atribut 17", "Atribut 30", "Kelas", "Prediksi Bayes", "Status Prediksi" };
        JTable jt = new JTable(this.datas, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TabelPengujian();
    }
}