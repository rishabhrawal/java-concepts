package com.techdialogue.java8.collections;

import com.techdialogue.Person;

import java.util.*;

/**
 * @author Rishabh Rawal
 * @date 12/26/17
 */
public class MapChanges {

    public static void main(String[] args){

        Map<String, List<String>> department = new HashMap<>();
        department.put("Computers" , new ArrayList<String>(Arrays.asList( new String[] {"student1", "student2", "student3","student4"})));
        department.put("Civil" , new ArrayList<String>(Arrays.asList( new String[] {"student5", "student6"})));
        department.put("Mechanical" , new ArrayList<String>(Arrays.asList( new String[] {"student7","student8","student9"})));

        //for each, takes a BiConsumer for Key and Value
        department.forEach((dep, students)->System.out.println(dep +" department has  "+students.size()+" students"));

        //building maps of maps or maps of lists with compute functions


        //merging maps
        Map<String, List<Person>> m1 = new HashMap<>();
        Map<String, List<Person>> m2 = new HashMap<>();

        m1.forEach((key,value)->
                    m2.merge(key, value,
                            (existingPeople, newPeople)-> {
                                existingPeople.addAll(newPeople);
                                return existingPeople;
                            })
        );

    }
}
