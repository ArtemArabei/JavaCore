package Lection_8.Generics.Enumerations.Garbage_collector;

public class TestSeasons {
    public static void main(String[] args) {
        Trinity<Seasons, String, Integer>[] scheduler = new Trinity[4];
        scheduler[0] = new Trinity<>(Seasons.WINTER,
                Seasons.WINTER.getDescription(),
                Seasons.WINTER.getCountOfDays());
        scheduler[1] = new Trinity<>(Seasons.SPRING,
                Seasons.SPRING.getDescription(),
                Seasons.SPRING.getCountOfDays());
        scheduler[2] = new Trinity<>(Seasons.SUMMER,
                Seasons.SUMMER.getDescription(),
                Seasons.SUMMER.getCountOfDays());
        scheduler[3] = new Trinity<>(Seasons.AUTUMN,
                Seasons.AUTUMN.getDescription(),
                Seasons.AUTUMN.getCountOfDays());
        Trinity.printStartSeasons(scheduler); // для удобства выводим стартовое описание сезонов года
        Trinity.printSeasons(scheduler); // решение задания 35
        Trinity.printNextSeason(scheduler); // решение задания 36
        Trinity.printCountOfDays(scheduler); // решение задания 37
    }
}
