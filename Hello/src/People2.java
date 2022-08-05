import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class People2 {
    public static void main(String[] args) {
        List<People1> peoples = Arrays.asList(
                new People1("Вася", 16, Sex1.MAN),
                new People1("Петя", 23, Sex1.MAN),
                new People1("Елена", 42, Sex1.WOMAN),
                new People1("Артем", 26, Sex1.MAN),
                new People1("Маша", 17, Sex1.WOMAN),
                new People1("Кирилл", 87, Sex1.MAN),
                new People1("Иван Иванович", 69, Sex1.MAN));
        List<People1> peoplesArmy = peoples.stream()
                .filter(p -> p.getAge() > 18 && p.getAge() < 27 && p.getSex().equals(Sex1.MAN))
                .peek(p -> System.out.println(p.getName()))
                .collect(Collectors.toList());
        double menAverageAge = peoples.stream().filter(p -> p.getSex().equals(Sex1.MAN))
                .mapToInt(People1::getAge).average().getAsDouble();
        System.out.println(menAverageAge);
        long countWork = peoples.stream().
                filter(p -> (p.getAge() > 18 && p.getAge() < 60 && p.getSex().equals(Sex1.MAN))
                        || (p.getAge() > 18 && p.getAge() < 55 && p.getSex().equals(Sex1.WOMAN)))
                .peek(p -> System.out.println(p.getName()))
                .count();
        System.out.println("work " + countWork);
    }
}

class People1 {
    private String name;
    private int age;
    private Sex1 sex;

    public People1(String name, int age, Sex1 sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex1 getSex() {
        return sex;
    }

    public void setSex(Sex1 sex) {
        this.sex = sex;
    }
}

enum Sex1 {
    MAN, WOMAN;
}
