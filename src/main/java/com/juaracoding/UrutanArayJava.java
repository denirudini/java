package com.juaracoding;
import java.util.Arrays;

public class UrutanArayJava {
    public static void main(String[] args) {
        int[] data = {2, 4, 6, 12, 10, 8, 14};

        for (int i = 0; i < data.length - i - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println("array telah diurutkan : " + Arrays.toString(data));
    }
}
