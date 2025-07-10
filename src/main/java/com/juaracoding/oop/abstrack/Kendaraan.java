package com.juaracoding.oop.abstrack;

public abstract class Kendaraan {
    private String name;

    public Kendaraan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void jalan();
}