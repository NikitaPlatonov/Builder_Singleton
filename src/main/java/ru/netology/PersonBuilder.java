package ru.netology;

public class PersonBuilder {
    private String name;
    private String surName;
    private int age;
    private String city;
/**

 * int countCallMethodSetAge - счетчик того, сколько раз был вызван метод setAge.
 * Если он был вызван 0 раз, тогда возраст устанавливается -1 - что с точки зрения логики класса Person означает, что возраст неизвестен.

*/
    private int countCallMethodSetAge;

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
        countCallMethodSetAge++;
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
        if(countCallMethodSetAge == 0) {
            age = -1;
        }
        countCallMethodSetAge = 0;
        return new Person(name,surName,age,city);
    }
}
