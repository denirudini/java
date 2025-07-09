package com.juaracoding;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Deni");
        sayhello("Deni ", "Rudini");
    }

    static void sayHello(){
        System.out.println("hallo");
    }

    static void sayHello(String name){
        System.out.println("hello " + name);
    }

    static void sayhello(String firstName, String lastName){
        System.out.println("hello " + firstName + lastName);
    }
}
