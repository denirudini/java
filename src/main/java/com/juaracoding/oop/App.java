package com.juaracoding.oop;

public class App {
    public static void main(String[] args) {
        /**
         * Karena kita mendefinisikan properti name dan age di kelas Person,
         * maka properti tersebut akan tersedia di semua "objek" kelas Person.
         */
        Person person = new Person();

        /*
         * Artinya kita dapat menetapkan nilai
         * dari field name dan age dari objek kelas Person.
         */
        person.name = "Deni Rudini";
        person.age = 23;

        /**
         * Oleh karena itu, kita juga bisa membaca
         */
        System.out.println(person.name); // Dudi
        System.out.println(person.age); // 23

        System.out.printf("Nama ku '%s' aku berumur '%d'\n", person.name, person.age);

        person.sayHelloWorld(); // Omaghaaaaa

//        Mobil mobil = new Mobil();
//        mobil.merk = "Toyota";
//        mobil.warna = "Merah";
//        mobil.tahun = 2020;
//        mobil.maju();
        
        person.setThis("Deni", 23);
        System.out.println("Nama saya " + person.name + " umur saya " + person.age);

       

        /**
         * this adalah object reference itu sendiri
         * "this" = person
         */
        person.setName("Andika")
                .setAge(23)
                .sayHelloWorld();
        
    }
}
