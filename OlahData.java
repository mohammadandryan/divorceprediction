package com.PBOTI21.TugasBesar;

public class OlahData extends Data {
    public int getP1(int x) {
        return super.p1[x]; // INHERITENCE
    }

    public int getP2(int x) {
        return super.p1[x]; // INHERITENCE
    }

    public int getKelas(int x) {
        return super.p1[x]; // INHERITENCE
    }

    public int getFkl(int x) {
        int loop = 0;
        int fkl = 0;
        while (loop < super.kelas.length) {
            // if (x < 5) {
            if (super.p1[loop] == (x - 1) / 5 && super.p2[loop] == (x - 1) % 5 && super.kelas[loop] == 1) {
                fkl += 1;
            }
            // }

            loop++;
        }

        return fkl;
    }

    public int getTotalFkl() {
        int loop = 0;
        int total = 0;
        while (loop < super.kelas.length) {
            total += getFkl(loop);
            loop++;
        }
        return total;
    }

    public int getFkc(int x) {
        int loop = 0;
        int fkc = 0;
        while (loop < super.kelas.length) {
            // if (x < 5) {
            if (super.p1[loop] == (x - 1) / 5 && super.p2[loop] == (x - 1) % 5 && super.kelas[loop] == 0) {
                fkc += 1;
            }
            // }

            loop++;
        }

        return fkc;
    }

    public int getTotalFkc() {
        int loop = 0;
        int total = 0;
        while (loop < super.kelas.length) {
            total += getFkc(loop);
            loop++;
        }
        return total;
    }

    public int getTotalAll() {
        int total = getTotalFkc() + getTotalFkl();
        return total;
    }

    
}
