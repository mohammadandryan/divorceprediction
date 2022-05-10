package com.PBOTI21.TugasBesar;

public class App extends Aplikasi {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplikasi().setVisible(true);
            }
        });
    }
}
