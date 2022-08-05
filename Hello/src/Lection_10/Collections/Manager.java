package Lection_10.Collections;

import java.util.*;

public class Manager {

    private List<User> userCollection;

    Manager(List<User> userCollection) {
        this.userCollection = userCollection;
    }

    public void printCollection(List<User> userCollection) {
        for (int i = 0; i < userCollection.size(); i++) {
            System.out.println("Login - " + userCollection.get(i).getLogin()
                    + ",\tpassword - " + userCollection.get(i).getPassword()
                    + ",   \tdate of registration - "
                    + userCollection.get(i).getCreatedDate());
        }
    }

    public void searchUser(String login, String password) {
        if (login(login, password) == true) {
            System.out.println();
            System.out.println("Поиск по логину и паролю дал следующий " +
                    "результат:");
            printCollection(getUserByLogin(login, password));
        } else {
            System.out.println();
            System.out.println("Поиск по логину и паролю не дал результата");
        }
    }

    public boolean login(String login, String password) {
        boolean isUser = false;
        for (int i = 0; i < userCollection.size(); i++) {
            if ((userCollection.get(i).getLogin() == login) &&
                    (userCollection.get(i).getPassword() == password)) {
                isUser = true;
            }
        }
        return isUser;
    }

    public List<User> getUserByLogin(String login, String password) {
        List<User> userCollection2 = new ArrayList<>();
        for (int i = 0; i < userCollection.size(); i++) {
            if ((userCollection.get(i).getLogin() == login) &&
                    (userCollection.get(i).getPassword() == password)) {
                userCollection2.add(userCollection.get(i));
            }
        }
        return userCollection2;
    }

    public boolean addNewUser(User user) {
        boolean isAdd = true;
        Comparator compLogin = new LoginComparator();
        Comparator compPassword = new PasswordComparator();
        for (int i = 0; i < userCollection.size(); i++) {
            if ((compLogin.compare(userCollection.get(i), user) == 0) &&
                    (compPassword.compare(userCollection.get(i), user) == 0)) {
                isAdd = false;
            }
        }
        if (isAdd == true) {
            userCollection.add(user);
            System.out.println();
            System.out.println("Пользователь добавлен в список");
        } else {
            System.out.println();
            System.out.println("Пользователь с таким логином уже есть в " +
                    "списке");
        }
        System.out.println();
        System.out.println("На данный момент список пользователей выглядит " +
                "так:");
        printCollection(userCollection);
        return isAdd;
    }

    public boolean deleteUser(String login) {
        boolean isDeleted = false;
        for (int j = 0; j < (userCollection.size() / 2); j++) {
            for (int i = 0; i < userCollection.size(); i++) {
                if (userCollection.get(i).getLogin() == login) {
                    isDeleted = true;
                    userCollection.remove(i);
                }
            }
        }
        if (isDeleted == false) {
            System.out.println();
            System.out.println("Пользователь с таким логином не обнаружен, " +
                    "удаление не производилось");
        } else {
            System.out.println();
            System.out.println("Пользователь/пользователи с таким логином " +
                    "удален(ы) из списка");
        }
        printCollection(userCollection);
        return isDeleted;
    }

    public void getAllUsers() {
        System.out.println();
        System.out.println("Полный список пользователей на данный момент " +
                "выглядит так:");
        printCollection(userCollection);
    }

    public void getAllUsers(String sortCriterion) {
        switch (sortCriterion) {
            case "login":
                Collections.sort(userCollection, new LoginComparator());
                System.out.println();
                System.out.println("Список пользователей, отсортированый по " +
                        "логину, выглядит так:");
                break;
            case "date":
                Collections.sort(userCollection, new DateComparator());
                System.out.println();
                System.out.println("Список пользователей, отсортированый по " +
                        "дате, выглядит так:");
                break;
        }
        printCollection(userCollection);
    }

    public boolean editUser(User user) {
        boolean isEdited = false;
        Comparator compLogin = new LoginComparator();
        Comparator compPassword = new PasswordComparator();
        for (int i = 0; i < userCollection.size(); i++) {
            if ((compLogin.compare(userCollection.get(i), user) == 0) &&
                    (compPassword.compare(userCollection.get(i), user) == 0)) {
                isEdited = true;
                System.out.println();
                System.out.println("Пользователь найден в списке");
                System.out.println();
                System.out.println("Введите новый логин");
                Scanner entireText = new Scanner(System.in);
                String str;
                str = entireText.nextLine();
                userCollection.get(i).setLogin(str);
                System.out.println();
                System.out.println("Введите новый пароль");
                String str2;
                str2 = entireText.nextLine();
                userCollection.get(i).setPassword(str2);
            }
        }
        if (isEdited == true) {
            System.out.println();
            System.out.println("Логин пользователя успешно изменен");
        } else {
            System.out.println();
            System.out.println("Такого пользователя в списке нет");
        }
        System.out.println();
        System.out.println("На данный момент список пользователей выглядит " +
                "так:");
        printCollection(userCollection);
        return isEdited;
    }

    public static class LoginComparator implements Comparator<User> {
        public int compare(User u1, User u2) {
            return u1.getLogin().compareTo(u2.getLogin());
        }
    }

    public static class PasswordComparator implements Comparator<User> {
        public int compare(User u1, User u2) {
            return u1.getPassword().compareTo(u2.getPassword());
        }
    }

    public static class DateComparator implements Comparator<User> {
        public int compare(User u1, User u2) {
            return u1.getCreatedDate().compareTo(u2.getCreatedDate());
        }
    }
}
