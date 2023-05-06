package ru.netology;

public class PersonBuilder {
    private String name;
    private String surName;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurName(String surName) {
        this.surName = surName;
        return this;
    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }
    public Person build() {
        if(name == null) {
            throw new IllegalStateException("Поле name является обязательным");
        }
        if(surName == null) {
            throw new IllegalStateException("Поле surName является обязательным");
        }
        if (age < 0) {
            throw new IllegalStateException("Возраст не может быть меньше нуля");
        }
        return new Person(name,surName,age,city);
    }
}
