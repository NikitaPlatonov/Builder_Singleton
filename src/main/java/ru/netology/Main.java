package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Введите входные данные:\n размер списка и верхнюю границу значений через пробел");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        logger.log("Создаем и наполняем список");
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(parts[0]); i++) {
            randomList.add(random.nextInt(Integer.parseInt(parts[1] + 1)));
        }
        logger.log("Отфильтрованный список: ");
        randomList.forEach(System.out::print);
    }
}