package com.juaracoding.oop.abstrack;

public class Pesawat extends Kendaraan {

    public Pesawat(String name) {
        super(name);
    }

    @Override
    public void jalan() {
        System.out.println(this.getName() + " terbang di udara.");
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }
}
