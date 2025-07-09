package com.juaracoding;

import java.awt.*;
import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        String firstName = "Deni";
        String lastName = "Rudini";
        String fullName = firstName + " " + lastName;
        // String jabatan;
        // String location;
        // double ratingA;
        // String addres;
        // LocalDate birthDay;
        // String phoneNumber;
        // char gender;
        // String email;
        // String site;
        // boolean isEmailVerified;

        System.out.println(fullName);

        //inflicit casting
        short data1 = 100;
        double dataDouble = data1;
        System.out.println(dataDouble);

        //explicit casting
        long l = 250000000000000L;
        int dataInteger = (int) l;
        System.out.println(dataInteger);
        /*
         * Code by JuaraCoding
         * SQA Batch 23
         */
        // byte minRequest = 10;
        // short maxProductInCart = 300;
        // int stock = 99000;
        int price = 10500000; // rule max price < 2M
        // long total = 3000000000L;
        System.out.println(price);
        float rating = 4.9f;
        double saldo = 300000.50;
        System.out.println("Rating = " + rating);
        System.out.printf("%.2f\n", rating);
        System.out.println("-------");
        // char a = 'A';
        // char predikat = 'A';

        String path = "C:\\Users\\Pictures\\logo.png";
        System.out.println(path);

        boolean isStockAvailable = false;

        String firstNameT = "Juara";
        String lastNameT = "Coding";
        System.out.println(firstName + " " + lastName);

        byte age = 100;

        // implicit casting
        short dataT = 100;
        double dataDoubleT = data1;
        System.out.println(dataDoubleT);
        char data2 = 'Z';
        int data3 = data2;
        System.out.println(data3);

        // hitung total bayar setelah diskon
        float discount = 0.19f;
        double totalPayment = price - (price * discount);
        System.out.printf("Total Payment = %.2f\n", totalPayment);

        // explicit casting
        long dataLong = 4000000000L;
        int dataInt = (int) dataLong;
        System.out.println(dataInt);
        int roundedTotalSaldo = (int) saldo;
        System.out.println(roundedTotalSaldo);

        int umur = 81;
        int duplikatUmur = umur;
        duplikatUmur = 1308;
        System.out.println(umur);
        System.out.println(duplikatUmur);

        Rectangle kotak = new Rectangle(0, 0, 20, 30);
        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(80, 90);
        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());

    }
}
