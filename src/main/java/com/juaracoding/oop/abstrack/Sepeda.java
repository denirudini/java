package com.juaracoding.oop.abstrack;

public class Sepeda extends Kendaraan {

    public Sepeda(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Unimplemented method 'startEngine'");
    }

    @Override
    public void stopEngine() {
        throw new UnsupportedOperationException("Unimplemented method 'stopEngine'");
    }

    @Override
    public void jalan() {
        System.out.println(this.getName() + " berjalan di darat.");
    }

}
