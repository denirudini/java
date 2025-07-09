package com.juaracoding;

public class MethodReternValue {
    public static void main(String[] args) {
        var resultTambah = hitung(100,"+",100);
        System.out.println(resultTambah);
        var resultKurang = hitung(200,"-",100);
        System.out.println(resultKurang);
        var resultKali = hitung(300, "*",5);
        System.out.println(resultKali);
        var resultBagi= hitung(1000, "/", 50);
        System.out.println(resultBagi);

    }
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total ;
    }
    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
            default:
                return 0;
        }
    }
}
