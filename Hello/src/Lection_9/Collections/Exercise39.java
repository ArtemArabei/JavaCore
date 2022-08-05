package Lection_9.Collections;

import java.util.*;

public class Exercise39 {
    public static void main(String[] args) {
        int numberOfScores = 20; // ���������� ������ ��������
        int satisfactoryScore = 4; // ����������� ������������������ ������
        List ratingList = new ArrayList();
        System.out.println("��������� ������ ������ �������� ���:");
        for (int i = 0; i < numberOfScores; i++) {
            ratingList.add((int) (Math.random() * 11));
        }
        System.out.println(ratingList);
        Iterator iterator = ratingList.iterator();
        while (iterator.hasNext()) {
            if ((int) iterator.next() < satisfactoryScore) {
                iterator.remove();
            }
        }
        System.out.println("������ ��� �������������������� ������ �������� " +
                "���:");
        System.out.println(ratingList);
    }
}
