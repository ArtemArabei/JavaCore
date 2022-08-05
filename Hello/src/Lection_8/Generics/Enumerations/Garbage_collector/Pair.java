package Lection_8.Generics.Enumerations.Garbage_collector;

public class Pair<M, S> {
    private M month;
    private S season;

    public Pair(M month, S season) {
        this.month = month;
        this.season = season;
    }

    public M getMonth() {
        return month;
    }

    public S getSeason() {
        return season;
    }

    public static String getSeasonName(MonthOfYear value) {
        return value.getSeasonName();
    }
}