package com.juaracoding;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {

//        int num = 3;
//        int x;
//        if (num > 2) {
//            x = 10 * num + 2;
//            System.out.println(x);
//        } else {
//            System.out.println("variable num tidak lebih dari 2");
//        }
//
//        // if else untuk mencari bilangan genap //
//
//        int z = 120;
//        if (z % 2 == 0) {
//            if (z / 100 != 0) {
//                System.out.println(z + " bilangan genap lebih daripada seratus");
//            } else {
//                if (z / 10 != 0) {
//                    System.out.println(z + " bilangan genap lebih dari sepuluh");
//                }
//            }
//        }else {
//            System.out.println(z +" bukan bilangan genap");
//        }

//        // nested if else
//        int myVal = 200;
//        boolean remainderOn = true;
//        if (myVal > 100) {
//            if (remainderOn == true) {
//                myVal = myVal % 100;
//            } else {
//                myVal = myVal / 100;
//            }
//            System.out.println(myVal + " myVal is out of range");
//        } else {
//            System.out.println(myVal + " myVal is in range");
//        }

//        // bilangan ganjil genap
//        int number = 5;
//        if (number % 2 == 0) {
//            System.out.println(number + " ini adalah genap");
//        } else {
//            System.out.println(number + " ini adalah ganjil");
//        }

        // ketersediaan stok
//        int stock = 2;
//        if (stock <= 1  ){
//            System.out.println(stock  + " stock habis");
//        }else {
//            System.out.println(stock + " stock tersedia");
//        }
//
//        int jmlPembelian = 1 ;
//        if (stock >= jmlPembelian){
//            System.out.println( "sesuai tersedia");
//        } else {
//            System.out.println("melebihi stock tersedia");
//        }
//
//        int minReq = 2 ;
//        if(jmlPembelian >= minReq){
//            System.out.println("item tersedia ");
//        }else {
//            System.out.println(minReq + " masuk kerajang");
//        }


//        // nested if else
//        int stock = 3;
//        int jmlPembelian = 3; // mengubah jumlah pembelian
//        int price = 2200000; // Harga per unit
//
//        // Diskon
//        double discountPercentage = 0.05; // 5%
//        int minPriceForDiscount = 5000000; //
//
//
//        // Pengecekan jumlah pembelian
//        if (jmlPembelian <= 0) {
//            System.out.println("Jumlah pembelian harus lebih dari 0.");
//            return;
//        }
//
//        if (stock > 0) {
//            if (jmlPembelian <= stock) {
//                long totalPrice = (long) jmlPembelian * price; // Gunakan long untuk menghindari overflow jika harga besar
//
//                System.out.println("Total Harga Awal = Rp" + totalPrice);
//
//                // Diskon
//                double finalPrice = totalPrice; // Inisialisasi harga akhir dengan total harga awal
//                double discountAmount = 0;
//
//                if (totalPrice >= minPriceForDiscount) {
//                    discountAmount = totalPrice * discountPercentage;
//                    finalPrice = totalPrice - discountAmount;
//                    System.out.println("Anda mendapatkan Diskon (" + (int)(discountPercentage * 100) + "%) = Rp" + (long)discountAmount);
//                } else {
//                    System.out.println("Tidak ada diskon yang berlaku untuk total pembelian ini.");
//                }
//
//                System.out.println("Total Harga Akhir = Rp" + (long)finalPrice);
//
//            } else {
//                System.out.println("stock kurang");
//            }
//        } else {
//            System.out.println("stock habis");
//        }

        // if else penilaian
        int nilai = 20;
        String grade;
        if (nilai < 0 || nilai > 100) {
            grade = "Nilai Tidak Valid (Harus antara 0-100)";
        } else if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 75) {
            grade = "B";
        } else if (nilai >= 50) {
            grade = "C";
        } else if (nilai >= 25) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Nilai Anda: " + nilai);
        System.out.println("Grade Anda: " + grade);
        System.out.println("-------------------------------");

        // pemakaian switch
        int hari = 1;
        String namaHari;

        switch (hari) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
                namaHari = "Jumat";
                break;
            case 7:
                namaHari = "Sabtu";
                break;
            default:
                namaHari = "Hari tidak valid";
                break;
        }
        System.out.println("Hari ini adalah " + namaHari);

        String pilihTipeEkspedisi = "KARGO"; // Anda bisa mengganti nilai ini untuk menguji tipe ekspedisi lainnya
        int hargaEkspedisi = 0;

        if (pilihTipeEkspedisi.toLowerCase().equals("kargo")) {
            hargaEkspedisi = 28000;
        } else if (pilihTipeEkspedisi.equals("reguler")) {
            hargaEkspedisi = 40000;
        } else if (pilihTipeEkspedisi.equals("express")) {
            hargaEkspedisi = 50000;
        } else if (pilihTipeEkspedisi.equals("instant")) {
            hargaEkspedisi = 55000;
        } else {
            System.out.println("Invalid input");
        }
        System.out.println("Ekspedisi = " + pilihTipeEkspedisi);
        System.out.println("Harga = " + hargaEkspedisi);

        int pilihPengiriman = 3;
        String namaPengiriman;
        var ongkir = 0;
        switch (pilihPengiriman) {
            case 1:
                namaPengiriman = "reguler";
                ongkir = 20000;
                break;
            case 2:
                namaPengiriman = "instant";
                ongkir = 10000;
                break;
            case 3:
                namaPengiriman = "express";
                ongkir = 15000;
                break;
            case 4:
                namaPengiriman = "kargo";
                ongkir = 18000;
                break;
            default:
                namaPengiriman = "pengiriman tidak valid";
                break;
        }
        System.out.println("nama jasa pengiriman : " + namaPengiriman);
        System.out.println("harga : " + ongkir);

        // login
        String userName = "user123";
        String password = "passABC";
        Scanner inputScanner = new Scanner(System.in);
        System.out.println(" Login ");

        // input userName
        System.out.print("Masukkan Username: ");
        String usernameInput = inputScanner.nextLine();

        // input password
        System.out.print("Masukkan Password: ");
        String passwordInput = inputScanner.nextLine();


        if (usernameInput.equals(userName)  && passwordInput.equals(password)) {
            System.out.println("\nLogin Berhasil! Selamat datang, " + usernameInput + "!");
        } else {
            System.out.println("\nLogin Gagal! Username atau password salah.");
        }
        inputScanner.close();
    }
}


