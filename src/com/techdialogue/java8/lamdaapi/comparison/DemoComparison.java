package com.techdialogue.java8.lamdaapi.comparison;

import com.techdialogue.Person;

import java.util.Comparator;
import java.util.function.Function;

/**
 * @author Rishabh Rawal
 * @date 12/21/17
 */
public class DemoComparison {

    public static void main(String[] args){

        //Old way pass anonymous methods


        //Old way can be written using the lambda and would still work
        Comparator<Person> cmpAge = (p1,p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpName = (p1, p2) -> p1.getName().compareTo(p2.getName());
        //.. and so on we can have multiple lambda expressions

        /****************************************************************************/
        //Lets try to understand how new Comparator API works
        //it is lot more generic

        //for different use cases we have to create and pass different comparators
        //if somehow we can use functions to get required comparator
        Function<Person, Integer> fAge = p -> p.getAge();
        Function<Person, String>  fName = p -> p.getName();

        //Now a static method comparing() can use this function, and return an appropriate comparator
        Comparator newComparatorAge = Comparator.comparing(fAge);

        //we can simplify it by passing the lambda directly
        Comparator<Person> newComparatorName = Comparator.comparing(p-> p.getName());

        //we can simplify it further by using a method reference
        newComparatorName = Comparator.comparing(Person::getName);

        //chaining comparators, fallback to name comparison if ages are same
        Comparator<Person> cmp =  newComparatorAge.thenComparing(newComparatorName);


        //Final
        Comparator<Person> comparator = Comparator.comparing(Person::getName)
                                        .thenComparing(Person::getName);
    }
}
