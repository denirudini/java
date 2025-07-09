package com.juaracoding;

public class MethodArgument {
    public static void main(String[] args) {
        int[] nilai= {75,90,60,40};
        sayCongrats("Deni Rudini",nilai);
        int[] nilai2 = {80,75,60,100};
        sayCongrats("Diana Amelia", nilai2);
        sayCongrats("yuhu", 70,90,87,67,90);
    }

    static void sayCongrats(String name, int... nilai) {
        var total = 0;
        for (var value : nilai) {
            total += value;
        }
        var finalValue = total / nilai.length;

        if (finalValue >= 75) {
            System.out.println("Nilai anda : " + finalValue + " Selamat " + name + " anda Lulus");
        } else {
            System.out.println("Nilai anda : " + finalValue + " Maaf " + name + " anda tidak lulus");
        }
    }
}
