package com.PBOTI21.TugasBesar;

public class Probabilitas extends Data {
    double[] bayes = new double[170];
    String[] hasilUji = new String[170];
    OlahData data = new OlahData();

    public double getPL(int x) {
        double probabilitas = (double) data.getFkl(x) / (double) data.getTotalFkl();
        return probabilitas;
    }

    public double getPC(int x) {
        double probabilitas = (double) data.getFkc(x) / (double) data.getTotalFkc();
        return probabilitas;
    }

    // POLIMORFIS
    public double getPL() {
        double probabilitas = (double) data.getTotalFkl() / (double) data.getTotalAll();
        return probabilitas;
    }

    public double getPC() {
        double probabilitas = (double) data.getTotalFkc() / (double) data.getTotalAll();
        return probabilitas;
    }

    public double getEvidence() {
        int loop = 1;
        double evidence = 0;
        while (loop < 26) {

            evidence = evidence + getPL(loop) * getPL();

            loop++;
        }
        return evidence;
    }

    public double getBayesL(int x) {
        Probabilitas prob = new Probabilitas();
        double bayes = (double) prob.getPL(x) * getPL() / getEvidence();
        return bayes;
    }

    public double getBayesC(int x) {
        Probabilitas prob = new Probabilitas();
        double bayes = (double) prob.getPC(x) * getPC() / getEvidence();
        return bayes;
    }

    public double getBayes(int x) {
        Probabilitas prob = new Probabilitas();
        if (prob.getBayesL(x) > prob.getBayesC(x)) {
            return prob.getBayesL(x);
        } else {
            return prob.getBayesC(x);
        }

    }

    public int getKelas(int x) {
        Probabilitas prob = new Probabilitas();
        if (prob.getBayesL(x) > prob.getBayesC(x)) {
            return 1;
        } else {
            return 0;
        }

    }

    

    public void deskripsiProb(int x) {
        Probabilitas prob = new Probabilitas();
        System.out.println("=====================");
        System.out.println("PREDIKSI BAYES REVISI");
        System.out.println("Probabilitas langgeng kategori " + x + " adalah : " + prob.getPL(x));
        System.out.println("Probabilitas cerai Kategori " + x + " adalah : " + prob.getPC(x));
        System.out.println("Probabilitas langgeng adalah : " + prob.getPL());
        System.out.println("Probabilitas cerai adalah : " + prob.getPC());
        System.out.println("Probabilitas cerai adalah : " + getEvidence());
        System.out.println("Probabilitas Bayes Langgeng adalah : " + prob.getBayesL(x));
        System.out.println("Probabilitas Bayes Cerai adalah : " + prob.getBayesC(x));
        if (prob.getBayesL(x) > prob.getBayesC(x)) {
            System.out.println("Peluang Kategori " + x + " langgeng");
            System.out.println("Probabilitas Bayes : " + prob.getBayesL(x));
        } else {
            System.out.println("Peluang Kategori " + x + " cerai");
            System.out.println("Probabilitas Bayes : " + prob.getBayesC(x));
        }

    }

    public double[] getBayes() {
        int loop = 0;
        Probabilitas prob = new Probabilitas();
        while (loop < 170) {
            int x = data.getP1(loop);
            int y = data.getP1(loop);
            int z = prob.getKelas(x, y);
            this.bayes[loop] = getKelas(z);
            loop++;
        }
        return this.bayes;
    }

    public double getKelasBayes(int x){
        return this.bayes[x];
    }

    

    public void printBayes() {
        int loop = 0;
        Probabilitas prob = new Probabilitas();
        while (loop < 170) {
            System.out.println("Kelas " + loop + " adalah : " + this.bayes[loop]);
            loop++;
            loop++;
        }
    }

    public void printHasilUji() {
        int loop = 0;
        while (loop < 170) {
            if (super.kelas[loop] == this.bayes[loop]) {
                this.hasilUji[loop] = "Benar";
            } else {
                this.hasilUji[loop] = "Salah";
            }
            System.out.println("Kelas ke-" + (loop + 1) + " : " + hasilUji[loop]);
            loop++;
        }
    }
    public String[] getHasilUji() {
        int loop = 0;
        while (loop < 170) {
            if (super.kelas[loop] == this.bayes[loop]) {
                this.hasilUji[loop] = "Benar";
            } else {
                this.hasilUji[loop] = "Salah";
            }
            loop++;
        }
        return this.hasilUji;
    }

    public int getKelas(int x, int y) {
        int k = 1;
        int kelas = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x == i && y == j) {
                    kelas = k;
                }
                k++;
            }
        }
        return kelas;

    }

    public static void main(String[] args) {
        Probabilitas prob = new Probabilitas();
        OlahData data = new OlahData();

        for (int i = 0; i < 170; i++) {
            int x = data.getP1(i);
            int y = data.getP1(i);
            int z = prob.getKelas(x, y);
            System.out.println(prob.getKelas(z));
        }

    }
}
