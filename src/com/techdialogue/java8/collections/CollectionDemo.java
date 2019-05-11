package com.techdialogue.java8.collections;

import com.techdialogue.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Rishabh Rawal
 * @date 12/26/17
 */
public class CollectionDemo {

    public static void main(String[] args){
        Person p1 = new Person("Bob", 18);
        Person p2 = new Person("Dylan", 40);
        Person p3 = new Person("Gopal", 25);
        Person p4 = new Person("Raj", 30);
        Person p5 = new Person("Peter", 22);
        Person p6 = new Person("Shashi", 45);
        Person p7 = new Person("Mukesh", 45);



        List<Person> people = new ArrayList<>(Arrays.asList(new Person[]{p1,p2,p3,p4,p5,p6,p7}));

        System.out.println("Uses Internal Iterator");
        people.forEach(System.out::println);

        System.out.println("=================================");
        System.out.println("Filter using removeIf");
        people.removeIf(p->p.getAge()<20);
        people.forEach(System.out::println);

        System.out.println("=================================");
        System.out.println("Replace using replaceAll");
        people.replaceAll(p->new Person(p.getName().toUpperCase(), p.getAge()));
        people.forEach(System.out::println);

        System.out.println("=================================");
        System.out.println("Sorting using comparator");
        people.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
        people.forEach(System.out::println);

    }
}
