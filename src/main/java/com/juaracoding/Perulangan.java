package com.juaracoding;

import java.util.Scanner;


public class Perulangan {
    public static void main(String[] args) {
        // perulangan for loop

//        System.out.println(" Contoh For Loop ");
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("ke-" + i);
//        }
//        System.out.println("loop selesai.");
//        System.out.println();


//        // while loop
//        System.out.println("Contoh While Loop");
//        int count = 5;
//        while (count >= 1) {
//            System.out.println("Hitungan mundur: " + count);
//            count--;
//        }
//        System.out.println("While loop selesai.");
//
//        // do while loop
//        System.out.println("Contoh Do-While Loop ");
//        Scanner scanner = new Scanner(System.in);
//        int angka;
//
//        do {
//            System.out.print("Masukkan angka positif (atau 0 untuk keluar): ");
//            angka = scanner.nextInt();
//            if (angka < 2) {
//                System.out.println("Angka harus positif! Coba lagi.");
//            }
//        } while (angka < 10); // Loop akan terus berjalan selama angka kurang dari pada nilai tersebut
//
//        System.out.println("Anda memasukkan angka: " + angka);
//        System.out.println("Do-while loop selesai.");
//        scanner.close();


        // for each loop
//        System.out.println("Contoh For-Each Loop ");
//        String[] buah = {"Apel", "Jeruk", "Mangga", "Pisang"};
//
//        for (String namaBuah : buah) {
//            System.out.println("Buah: " + namaBuah);
//        }
//        System.out.println("Loop selesai.");
//        System.out.println();
//
//
//        // perulangan bintang
//        int rows = 5;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        // the for loop
//        for (var k=0; k<5; k++){
//            System.out.println(k);
//        }
//
//        for (var l = 0; l<10; l++){ // perulangan secara 10x
//            for (var m = 0 ; m < 20; m++){
//                System.out.println(m); // perintah print 0 s/d 19
//            }
//        }

//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i);
//            }
//        }
//        System.out.println();
//
//        for (int i = 1; i <= 10; i += 2) {
//            System.out.print(i);
//        }
//
//        System.out.println();
//        for (int i = 1; i < 10; i++) {
//            System.out.print(i);
//            int z = i++;
//        }
//        System.out.println();
//
//        //nested for
//        int ukuranKotak = 5;
//
//        for (int baris = 0; baris < ukuranKotak; baris++) {
//            for (int kolom = 0; kolom < ukuranKotak; kolom++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
        // perulangan bintang
        int baris = 5;
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        int tinggi = 5;
//        for (int i = tinggi; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        int l = 5;
//        for (int i = 1; i <= l; i++) {
//            for (int j = 1; j <= (l - i + 1); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        int baris2 = 5;
        for (int i = 1; i <= baris2; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

