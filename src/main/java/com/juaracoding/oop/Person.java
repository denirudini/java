package com.juaracoding.oop;

public class Person {
    String name;
    int age;

    void sayHelloWorld() {
        System.out.println("Omaghaaaaa " + name );
    }
    
    void setThis(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person setName(String name) {
        this.name = name;
        return this;
    }

   Person setAge(int age) {
    this.age = age;
    return this;
  }

   String getName() {
    return name;
  }

  int getAge() {
    return age;
  }

}
