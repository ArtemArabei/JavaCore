package Lection_9.Collections;

import java.util.*;

public class Exercise41 {
    public static void main(String[] args) {
        int numberOfScores = 20; // количество оценок учеников
        int maxScore = 0; // максимальная оценка
        int buf = 0; // буффер
        List ratingList = new ArrayList();
        System.out.println("Стартовый список оценок выглядит так:");
        for (int i = 0; i < numberOfScores; i++) {
            ratingList.add((int) (Math.random() * 11));
        }
        System.out.println(ratingList);
        Iterator iterator = ratingList.iterator();
        while (iterator.hasNext()) {
            buf = (int) iterator.next();
            if (buf > maxScore) {
                maxScore = buf;
            }
        }
        System.out.println("Самая высокая оценка такая:");
        System.out.println(maxScore);
    }
}
