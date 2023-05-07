package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }
    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        for (Integer num : source) {
            if (num >= threshold) {
                logger.log("Число " + num + " проходит");
                result.add(num);
            } else {
                logger.log("Число " + num + " не проходит");
            }
        }
        logger.log("Прошло " + result.size() + " элементов");
        logger.log("Результат фильтрации: ");
        return result;
    }

}
