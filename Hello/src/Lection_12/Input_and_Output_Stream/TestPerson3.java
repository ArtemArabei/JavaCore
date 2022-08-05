package Lection_12.Input_and_Output_Stream;

import java.io.*;

public class TestPerson3 {

    Person3 createPerson() {
        Person3 person = new Person3();
        person.setName(generateName());
        person.setSurname(generateSurname());
        person.setAge(generateAge());
        System.out.println(person.getName() + " " + person.getSurname()
                + " " + person.getAge() + " лет");
        return person;
    }

    String generateName() {
        String[] names = new String[]{"Алексей", "Владислав", "Максим",
                "Игорь", "Сергей", "Иван", "Олег", "Роман", "Вадим", "Андрей"};
        int rand = (int) (Math.random() * 10);
        return names[rand];
    }

    String generateSurname() {
        String[] surnames = new String[]{"Алексеев", "Петров", "Максимов",
                "Сидоров", "Сергеев", "Иванов", "Чижов", "Романов",
                "Александров", "Андреев"};
        int rand = (int) (Math.random() * 10);
        return surnames[rand];
    }

    int generateAge() {
        int[] ages = new int[]{25, 26, 27, 28, 29, 30, 35, 36, 37, 38};
        int rand = (int) (Math.random() * 10);
        return ages[rand];
    }

    Person3 writePerson(Person3 person) {
        //метод для записи состояния объекта
        try (ObjectOutputStream oos1 = new ObjectOutputStream
                (new FileOutputStream("c:/test/person.dat", true))) {
            oos1.writeObject(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return person;
    }

    void writeInformation(Person3 person) throws IOException {
        //метод для записи текстовой информации об объекте
        File file = new File("c:/test/person.txt");
        file.createNewFile();
        try (FileWriter writer1 = new FileWriter(file, true)) {
            writer1.write(person.getName() + " " + person.getSurname()
                    + " " + person.getAge() + " лет\n");
            writer1.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        TestPerson3 test = new TestPerson3();
        for (int i = 0; i < 10; i++) {
            test.writeInformation(test.writePerson(test.createPerson()));
        }
    }
}
