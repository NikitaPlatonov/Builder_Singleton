package ru.netology;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person mom = personBuilder.setName("mom").setSurName("surNameMom").build();
        System.out.println(mom);
    }
}