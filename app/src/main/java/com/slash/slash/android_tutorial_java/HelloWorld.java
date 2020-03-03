package com.slash.slash.android_tutorial_java;

/**
 * Created by juhyang on 2020-03-03.
 */
public class HelloWorld {

    String name;
    int age;
    int grade;

    public HelloWorld(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void greet() {
        System.out.println("Hello World !");
    }

    public int foo() {
        return age + 10;
    }
}
