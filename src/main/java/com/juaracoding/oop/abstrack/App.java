package com.juaracoding.oop.abstrack;

public class App {
    public static void main(String[] args) {
        Kendaraan motor = new Motor("Honda Supra X");
        Kendaraan kapalFeri = new KapalLaut("Kapal Feri");
        Kendaraan garuda = new Pesawat("Garuda Boing Banget");
        Kendaraan k = new Kendaraan("Contoh : ") {
            @Override
            public void jalan() {
                System.out.println(this.getName() + "Rada beda..");
            }

        };

        k.jalan();
        motor.jalan();
        kapalFeri.jalan();
        garuda.jalan();
    }
}
