package Lection_5.Packages_classes_objects.Access_modifiers.Constructors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
     String name;
     int age;

     Person(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public static class AgeComparator implements Comparator<Person> {
         public int compare(Person p1, Person p2) {
             if (p1.age == p2.age)
                 return 0;
             else if (p1.age > p2.age)
                 return 1;
             else
                 return -1;
         }
     }

    public static class NameComparator implements Comparator<Person> {
        public int compare(Person p1,Person p2) {
            return p1.name.compareTo(p2.name);
        }
    }

        public static void main(String args[]) {

            List<Person> persons = new ArrayList<>();

            persons.add(new Person("Иван", 23));
            persons.add(new Person("Андрей", 27));
            persons.add(new Person("Ольга", 21));

            System.out.println("Сортировка по имени:");

            Collections.sort(persons, new NameComparator());

            for(Person person : persons){
                System.out.println(person.name + " "
                        + person.age);
            }

            System.out.println("Сортировка по возрасту:");

            Collections.sort(persons, new AgeComparator());

            for(Person person : persons){
                System.out.println(person.name + " "
                        + person.age);
            }
        }
    }
