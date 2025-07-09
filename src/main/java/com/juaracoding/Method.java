package com.juaracoding;

public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        parameterName("deni", "rudini");
        System.out.println(suhu(30));

        var a = 100;
        var b = 300;
        var c = sum(a, b);

        System.out.println(c);


        System.out.println(hitung(6,2));
    }

    static float suhu(float tempC) {
        return (int) (((tempC * 9.0f) / 5.0f) + 32.0);
    }

    static void sayHelloWorld() {
        System.out.println("Omaghaaaaa");
    }

    static void parameterName(String firstName, String lastName) {
        System.out.println("hai " + firstName + " " + lastName);
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung( int panjang, int lebar){
        return panjang*lebar;
    }

}
