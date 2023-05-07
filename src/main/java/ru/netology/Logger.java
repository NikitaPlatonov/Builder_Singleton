package ru.netology;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger logger;
    private int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String msg) {
        // вычисляем дату и время в настоящий момент
        LocalDateTime now = LocalDateTime.now();
        // задаем формат
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        // дату парсим в строку
        String formattedDateTime = now.format(formatter);
        System.out.println("[" + formattedDateTime + " " + num++ + "]");
    }
}
