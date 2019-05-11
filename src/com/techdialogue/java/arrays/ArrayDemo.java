package com.techdialogue.java.arrays;


import com.techdialogue.Person;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rishabh Rawal 4/26/18
 */
public class ArrayDemo {

    public static void main (String[] args){
        int[] arr1 = {1,2,3,4,5};

        //Copy using System
        int[] arr2 = new int[3];
        System.arraycopy(arr1,0,arr2, 0,3);
        Arrays.stream(arr2).forEach(System.out::println);

        System.out.println("-----------------------");

        //Copy using Arrays
        arr2 = Arrays.copyOfRange(arr1,0,4);
        Arrays.stream(arr2).forEach(System.out::println);

        System.out.println("-----------------------");

        //Copy using Arrays
        arr2 = Arrays.copyOf(arr1,2);
        Arrays.stream(arr2).forEach(System.out::println);

        System.out.println("-----------------------");

        //search
        System.out.println("found at index : " + Arrays.binarySearch(arr1,4));

        System.out.println("-----------------------");

        //compare
        System.out.println("Comparison result :"+ Arrays.equals(arr1,arr2));

        System.out.println("-----------------------");

        //fill
        Arrays.fill(arr2,9);
        Arrays.stream(arr2).forEach(System.out::println);
        System.out.println("-----------------------");

        //sorting
        Arrays.sort(arr1);
        Arrays.parallelSort(arr1);

        //create Lists Java 8
        Person p1 = new Person("Saurabh", 22);
        Person p2 = new Person("Jadoo", 99);
        List<Person> personList = Arrays.asList(new Person[] {p1,p2});

        //Java 9
        //List<Person>  personList2 = List.of(p1, p2);

    }
}
