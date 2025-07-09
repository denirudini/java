package com.juaracoding;

public class Variable {
    public static void main(String[] args) {

        // byte minRequest = 10;
        // short maxProductInCart = 300;
        // int stock = 99000;
        // int price = 10500000; // max 2M
        // long total = 3000000000L; // harus inisiasi L
        // float rating = 4.9f; // harus inisialisai f
        // double saldo = 2000000.500;
        // char a = 'A';
        // char b = '5';
        // System.out.printf("%.2f", rating);

        String kata = "Tess";

        while (kata.length() < 12) {

            kata = kata + "y";

        }

        for (int i = 1; i < 5; i++) {

            for (int j = 0; j < i; i++) {

                System.out.print(5 - j);

            }

            System.out.println();

        }

    }
}
