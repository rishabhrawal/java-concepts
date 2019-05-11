package com.techdialogue.java8.streams.stream_samples;


import com.techdialogue.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Rishabh Rawal
 * @date 1/22/18
 */
public class SampleSnippets {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        linearSearch(list,100);

        reverseString("player");

        System.out.println(Character.toChars(2579809));
    }

    /** Iterate over n numbers **/
    public static void iterate(int n){
        Stream.iterate(1, i->i+1)
                .limit(n)
                .forEach(System.out::println);
    }

    /** Sum of n numbers */
    public static int sumOfNumbers(int n){

        return  Stream.iterate(1,i->i+1)
                .limit(n)
                .mapToInt(Integer::intValue) //cannot resolve Integer:parseInt, type mismatch ??
                .sum();
    }

    /** sum of numbers upto n, divisible by 3 and 5  */
    public static int specialSum(int n){
        return Stream.iterate(1, (i) -> i + 1) //UnaryOperator interface
                .limit(n)
                .filter((i) -> i % 3 == 0 || i % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    /** factorial of n  */
    public static int calculateFactorial(int n){
        return Stream.iterate(1,i->i+1)
                .limit(n)
                .reduce(1,(x,y)->x*y);
    }

    /** sort stream of Comparable elements **/
    public static void sortComparable(List<Integer> list){
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }

    /** sort stream **/
    public static void sortGeneral(List<Person> list){

        Comparator<Person> comp = Comparator.comparing(Person::getAge).thenComparing(Person::getName);

        //if comparator not supplied, ??
        list.stream()
                .sorted(comp)
                .forEach(System.out::println);
    }


    /** linear search */
    public static boolean linearSearch(List<Integer> list, int searchValue){

        Optional<Integer>  o = list.stream()
                .filter(i->i==searchValue)
                .findFirst();

        return o.isPresent();
    }

    /** reverse a String using Stream */
    public  static String reverseString(String str){
        return str.chars() //IntStream
                .sorted()
                .mapToObj(Character::toChars)
                .collect(StringBuilder::new,StringBuilder::append,StringBuilder::append)
                .toString();

    }

    /** reverse individual Strings in a list **/
    public static List<String> reverseStringsInList(List<String> list){
        //streams not required
        //list.replaceAll(str->new StringBuilder(str).reverse().toString());

        list.stream()
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.toList());

        list.stream()
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.toCollection(ArrayList::new));


       return  list.stream()
                .map(str->new StringBuilder(str).reverse().toString())
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);

    }
}
