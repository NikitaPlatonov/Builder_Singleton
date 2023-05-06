package ru.netology;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person mom = personBuilder.setName("mom").setSurName("surNameMom").setCity("Moscow").build();
        System.out.println(mom);
        Person son = mom.newChildBuilder().setName("Nikita").build();
        System.out.println(son);
    }
}