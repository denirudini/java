package com.juaracoding.oop.abstrack;

public class Motor extends Kendaraan {

    public Motor(String name) {
        super(name);
    }

    @Override
    public void jalan() {
        System.out.println(this.getName() + " berjalan di darat.");
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }
}