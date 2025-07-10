package com.juaracoding.oop.abstrack;

public class App {
    public static void main(String[] args) {
        Motor motor = new Motor("Honda Supra X");
        Kendaraan kapalFeri = new KapalLaut("Kapal Feri");
        Pesawat garuda = new Pesawat("Garuda Boing Banget");
        Kendaraan sepeda = new Sepeda("Ontel Cap Kembang");

        motor.jalan();
        motor.startEngine();
        motor.stopEngine();

        kapalFeri.jalan();

        garuda.startEngine();
        garuda.jalan();
        garuda.stopEngine();

        sepeda.startEngine();

    }
}
