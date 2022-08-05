import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class People {
    private String name;
    private int age;
    private Sex sex;

    public People(String name, int age, Sex sex) {
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    enum Sex {
        MAN, WOMAN;
    }


    public static void main(String[] args) {
        List<People> collectionPeoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMAN),
                new People("Артем", 26, Sex.MAN),
                new People("Маша", 17, Sex.WOMAN),
                new People("Кирилл", 87, Sex.MAN),
                new People("Иван Иванович", 69, Sex.MAN));
        List<People> collectionOfSoldiers = collectionPeoples.stream().
                filter((p) -> p.getAge() >= 18 && p.getAge() <= 27 && p.getSex() == Sex.MAN).
                peek(p -> System.out.println(p.getName())).
                collect(Collectors.toList());
       /* System.out.println(collectionOfSoldiers.stream().
                peek(p -> System.out.println(p.getName())));*/
        System.out.println(collectionPeoples.stream().
                filter((p) -> p.getSex() == Sex.MAN).
                mapToInt(People::getAge).
                average().getAsDouble());
        System.out.println(collectionPeoples.stream().filter((p) -> p.getAge() >= 18).filter((p) -> (p.getSex() == Sex.WOMAN && p.getAge() < 55) || (p.getSex() == Sex.MAN && p.getAge() < 60)).count());
    }
}

