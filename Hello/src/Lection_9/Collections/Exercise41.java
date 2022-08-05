package Lection_9.Collections;

import java.util.*;

public class Exercise41 {
    public static void main(String[] args) {
        int numberOfScores = 20; // ���������� ������ ��������
        int maxScore = 0; // ������������ ������
        int buf = 0; // ������
        List ratingList = new ArrayList();
        System.out.println("��������� ������ ������ �������� ���:");
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
        System.out.println("����� ������� ������ �����:");
        System.out.println(maxScore);
    }
}
