package Lection_21.Task_4;

public class Player {

    private String name;
    private int age;
    boolean isActive;

    public Player() {
    }

    Player(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String toString() {
        return "Имя - " + name + ", возраст - " + age + " лет, активность - "
                + isActive;
    }
}
