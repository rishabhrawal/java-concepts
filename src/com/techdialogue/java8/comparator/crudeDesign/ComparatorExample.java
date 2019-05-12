package com.techdialogue.java8.comparator.crudeDesign;

import java.util.function.Function;

/**
 * @author Rishabh Rawal
 * @date 12/21/17
 *
 * Example to show how things are happening inside Java Camparator class
 * This is how lambda api can be implemented
 */

@FunctionalInterface
public interface ComparatorExample<T> {

    public int compare(T t1, T t2);

    /*public static ComparatorExample<Person> comparing(Function<Person,Integer> f){
        return (p1, p2) -> f.apply(p1) - f.apply(p2);
    }*/

    //made more generic, it can make use of autoboxing for int
    public static<U> ComparatorExample<U> comparing(Function<U, Comparable> f){
        return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
    }

    //method to chain
    public default ComparatorExample<T> thenComparing(ComparatorExample<T> cmp){
        return (p1,p2) -> compare(p1,p2)==0 ?cmp.compare(p1,p2) : cmp.compare(p1,p2);
    }

    //in order to pass functions to thenComparing instead of comparator
    public default ComparatorExample<T> thenComparing(Function<T,  Comparable> f){
        ComparatorExample<T> cmp = comparing(f);
        return thenComparing(cmp);
    }

}
