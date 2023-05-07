package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаю программу");
        logger.log("Введите входные данные: размер списка и верхнюю границу значений через пробел");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if (parts.length != 2) {
            logger.log("Завершаю программы из-за ошибки");
            throw new NumberFormatException("Нужно ввести два числа через пробел");
        }
        int count;
        int border;
        try {
            count = Integer.parseInt(parts[0]);
            border = Integer.parseInt(parts[1]) + 1;
        } catch (NumberFormatException e) {
            logger.log("Завершаю программы из-за ошибки");
            throw new NumberFormatException("Некорректный формат");
        }
        logger.log("Создаем и наполняем список");
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            randomList.add(random.nextInt(border));
        }
        logger.log("Случайно созданный список: ");
        for (int num : randomList) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
        logger.log("Введите число для фильтрации: ");
        int numberFilter = scanner.nextInt();
        Filter filter = new Filter(numberFilter);
        List<Integer> output = filter.filterOut(randomList);
        for (int num : output) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        logger.log("Завершаю работу программы");

    }
}