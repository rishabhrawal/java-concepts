package com.techdialogue.java8.collections;

import com.techdialogue.Person;

import java.util.*;

/**
 * @author Rishabh Rawal
 * @date 12/26/17
 */
public class MapDemo {

    public static void main(String[] args){

        Person p1 = new Person("Bob", 18);
        Person p2 = new Person("Dylan", 40);
        Person p3 = new Person("Gopal", 25);
        Person p4 = new Person("Raj", 30);
        Person p5 = new Person("Peter", 22);
        Person p6 = new Person("Shashi", 45);
        Person p7 = new Person("Mukesh", 45);

        List<Person> parisList = Arrays.asList(new Person[] {p1,p2});
        List<Person> londonList = Arrays.asList(new Person[] {p6,p7});
        Map<String, List<Person>>  map1 = new HashMap<>();

        //got an empty list instead of null
        System.out.println("People from Paris: "+ map1.getOrDefault("paris", Collections.EMPTY_LIST));

        //adding data using putIfAbsent
        map1.putIfAbsent("paris", parisList);
        map1.putIfAbsent("london", londonList);
        System.out.println("People from Paris: "+ map1.getOrDefault("paris", Collections.EMPTY_LIST));

        Map<String, List<Person>>  map2 = new HashMap<>();
        //compute if absent, to compute and put a new value if absent
        map2.computeIfAbsent("london", city -> new ArrayList<Person>()).add(p3);
        map2.computeIfAbsent("london", city -> new ArrayList<Person>()).add(p4); //new arraylist is not computed, since already present
        System.out.println("People from London: "+ map2.getOrDefault("london", Collections.EMPTY_LIST));

        map2.computeIfAbsent("delhi", city -> new ArrayList<Person>()).add(p5);
        map2.computeIfAbsent("delhi", city -> new ArrayList<Person>()).add(p6);


        //List generated using Arrays.asList will give error on adding new values
        System.out.println("Merging valuess ....");
        //merge demo
        map1.forEach((city,people)->{
            map2.merge(city, people,
                    (peopleFromMap2, peopleFromMap1)-> {
                        peopleFromMap2.addAll(peopleFromMap1);
                        return peopleFromMap2;
                    });
        });


        System.out.println(map2);

    }
}
