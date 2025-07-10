package com.juaracoding.oop.abstrack;

public class KapalLaut extends Kendaraan {

    public KapalLaut(String name) {
        super(name);

    }

    @Override
    public void jalan() {
        System.out.println(this.getName() + " berjalan di laut.");
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }
}