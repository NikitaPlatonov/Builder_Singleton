package ru.netology;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surName;
    private int age;
    private String city;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
        age = -1;
        city = null;
    }
    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        city = null;
    }
    public Person(String name, String surName, int age, String city) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.city = city;
    }

    boolean happyBirthday() {
        if(hasAge()) {
            age = age + 1;
            return true;
        } else {
            return false;
        }
    }
    boolean hasAge() {
        return age != -1;
    }

    boolean hasAddress() {
        return city != null;
    }

    void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "{ Person: " + "\n" +
        "Имя: " + getName() + "\n" +
        "Фамилия: " + getSurName() + "\n" +
        "Возраст: " + getAge() + "\n" +
        "Город проживания: " + getCity() + " }";
    }
}
