import java.time.*;

public class DateOfBirth {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1987, Month.JULY, 25);
        System.out.println(dateOfBirth);
        System.out.println(today);
        System.out.println(today.isAfter(dateOfBirth));
        System.out.println(today.isBefore(dateOfBirth));
    }
}
