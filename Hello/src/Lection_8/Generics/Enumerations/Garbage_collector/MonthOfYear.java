package Lection_8.Generics.Enumerations.Garbage_collector;

public enum MonthOfYear {
    JANUARY("Winter"), FEBRUARY("Winter"), MARCH("Spring"),
    APRIL("Spring"), MAY("Spring"), JUNE("Summer"),
    JULY("Summer"), AUGUST("Summer"), SEPTEMBER("Autumn"),
    OCTOBER("Autumn"), NOVEMBER("Autumn"), DECEMBER("Winter");

    private String season;

    MonthOfYear(String season) {
        this.season = season;
    }

    public String getSeasonName() {
        return season;
    }
}

