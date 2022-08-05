package Lection_10.Collections;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class TestUser {

    public static void main(String[] args) {
        List<User> userCollection = new ArrayList<>();
        Manager sysAdmin = new Manager(userCollection);
        userCollection.add(new User("Ivan", "252fs42",
                LocalDate.of(2022, Month.JUNE, 03)));
        userCollection.add(new User("Ann", "28ter53",
                LocalDate.of(2022, Month.MAY, 13)));
        userCollection.add(new User("Alex", "30vcdg5",
                LocalDate.of(2022, Month.JANUARY, 25)));
        userCollection.add(new User("Max", "20sgdgh",
                LocalDate.of(2022, Month.FEBRUARY, 01)));
        userCollection.add(new User("Helen", "3dgd111",
                LocalDate.of(2022, Month.APRIL, 19)));
        userCollection.add(new User("Mary", "25gdfg6",
                LocalDate.of(2022, Month.MARCH, 15)));
        userCollection.add(new User("Alex", "304cdg5",
                LocalDate.of(2022, Month.JANUARY, 25)));
        System.out.println("Стартовый список пользователей выглядит так:");
        sysAdmin.printCollection(userCollection);
        sysAdmin.searchUser("Ivan", "252fs42");
        sysAdmin.addNewUser(new User("Alex", "30vc1dg5",
                LocalDate.of(2022, Month.MARCH, 15)));
        sysAdmin.deleteUser("Alex");
        sysAdmin.getAllUsers();
        sysAdmin.getAllUsers("login");
        sysAdmin.getAllUsers("date");
        sysAdmin.editUser(new User("Helen", "3dgd111",
                LocalDate.of(2022, Month.APRIL, 19)));
    }
}
