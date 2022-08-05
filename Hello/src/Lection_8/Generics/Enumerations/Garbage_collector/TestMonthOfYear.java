package Lection_8.Generics.Enumerations.Garbage_collector;

public class TestMonthOfYear {
    public static void main(String[] args) {
        Pair<MonthOfYear, String>[] scheduler = new Pair[12];
        for (int i = 0; i < scheduler.length; i++) {
            scheduler[i] = new Pair<>(MonthOfYear.values()[i],
                    MonthOfYear.values()[i].getSeasonName());
        }
        for (Pair p : scheduler) {
            System.out.println("�����: " + p.getMonth() + " �����: "
                    + p.getSeason());
        }
        System.out.println("\n�����:\n��� ��������� ������ ����� ���� - "
                + Pair.getSeasonName(MonthOfYear.MAY));
    }
}
