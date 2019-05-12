package com.techdialogue.java8.comparator;


import com.techdialogue.Person;

import java.util.Comparator;

/**
 * @author Rishabh Rawal 2/15/18
 */
public class Demo {

    //
    Comparator<Person> comp1 = Comparator.comparing(Person::getAge);
    Comparator<Person> comp2 = Comparator.comparing(p->p.getAge());

    //chaining using method reference,
    //Type info is automatically available
    Comparator<Person> comp3 = Comparator.comparing(Person::getAge).thenComparing(Person::getName);

    //chaining using lambda params
    //trouble inferring the type, use explicit lambda
    Comparator<Person> comp4 = Comparator.comparing((Person p)->p.getAge())
            .thenComparing(p->p.getName())
            .thenComparing(p->p.hashCode());

    //providing <return type,firstKey>
    Comparator<Person> comp5 = Comparator.<Person,Integer>comparing(p->p.getAge())
            .thenComparing(p->p.getName())
            .thenComparing(p->p.hashCode());

    Comparator<Person> comp = Comparator.comparing((Person p)->p.getAge())
            .thenComparing(p->p.getName());

}
