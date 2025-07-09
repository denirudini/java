package com.juaracoding;

public class Array {
    public static void main(String[] args) {
//        String[] buahBuahan;
//        buahBuahan = new String[3];
//        buahBuahan[0] = "mangga";
//        buahBuahan[1] = "jambu";
//        buahBuahan[2] = "Durian";
//
//        System.out.println(buahBuahan.length);
//        System.out.println(buahBuahan[1]);
//
//
//        int[] arrayInt = new int[]{10, 11, 12, 13, 14, 15};
//        arrayInt[0] = 0;
//
//        System.out.println(arrayInt[0]);
//        System.out.println(arrayInt[2]);
//
        String[][] members = {
                {"Deni", "rudini", "sanjaya"},
                {"gilbert", "Romusa", "andrew"},
                {"joko", "anwaar", "hahah"}
        };

        System.out.println(members[0][2]);
        System.out.println(members[1][1]);
        System.out.println(members[2][0]);
//
//        System.out.println("mengeluarkan semua data array");
//
//        for (int i =0 ; i< members.length; i++){
//            for (int j =0; j < members[i].length; j++){
//                System.out.print(members[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int kontrakan[] = new int[8];
//        int hargaPerOrang = 300_000;
//
//        kontrakan[0] = 4;
//        kontrakan[1] = 4;
//        kontrakan[2] = 2;
//        kontrakan[3] = 7;
////        kontrakan[4] = 2;
////        kontrakan[5] = 6;
//        kontrakan[6] = 1;
//        kontrakan[7] = 3;

//        for (int index = 0; index < kontrakan.length; index++) {
//            System.out.println("Kontrakan ke " + index + ", bulanan/orang = " + kontrakan[index] * hargaPerOrang + "/"
//                    + kontrakan[index]);
//        }

        int[] kontrakan = {4, 2, 2, 7, 0, 0, 1, 3};
        int hargaPerOrang = 300000;
        int pendapatanTotal = 0;
        int bonus = 0;
        for (int tampung : kontrakan) {
            if (tampung == 0) {
                continue;
            }
            pendapatanTotal += tampung * hargaPerOrang;
            if (tampung % 4 == 0) {
                bonus += 2 * hargaPerOrang;
            }
        }
        pendapatanTotal += bonus;
        System.out.println("Pendapatan per bulan: " + pendapatanTotal);


    }
}

