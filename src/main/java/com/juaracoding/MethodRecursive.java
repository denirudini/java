package com.juaracoding;

public class MethodRecursive {
    public static void main(String[] args) {
        System.out.println(factorRecursive(5));
        System.out.println(factorialLoop(5));
        factorialLooping(10);

    }

    static int factorialLoop(int value) {
        var result = 1;
        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    static int factorRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorRecursive(value - 1);
        }
    }

    static void factorialLooping(int nilai) {
        if (nilai == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Looping " + nilai);
            factorialLooping(nilai - 1);
        }
    }
}
