package ru.netology;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person mom = personBuilder.setName("mom").setSurName("surNameMom").setCity("Moscow").setAge(35).build();
        System.out.println(mom.hasAge());
        System.out.println(mom.getAge());
        mom.happyBirthday();
        System.out.println(mom.getAge());
    }
}