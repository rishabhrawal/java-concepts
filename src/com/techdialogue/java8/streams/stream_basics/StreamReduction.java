package com.techdialogue.java8.streams.stream_basics;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Rishabh Rawal
 * @date 1/22/18
 */
public class StreamReduction {



    /******************************  Reduce operations **********
     * ****************************  Collect operations ********
     * ****************************  Collect Aggregate operations ********
     * ****************************  Match operations **********
     * ****************************  Find operations ***********
     * ****************************  Min, Max, Count ***********
     * ****************************  Sum, Average, SummaryStatistics **** Only for primitive*/




    /********************************   Reduce operations **********
     * identity
     * accumulator
     * combiner */

    //If your reduce operation involves adding elements to a collection,
    // then every time your accumulator function processes an element,
    // it creates a new collection that includes the element, which is inefficient
    //use Stream.collect()
    public static void reduceWithIdentity(List<Integer> list){
        Integer sum = list.stream()
                .reduce(0,(x,y)->x+y);
        //identity for accumulator
    }

    public static void reduceWithoutIdentity(List<Integer> list){
        Optional<Integer> optional = list.stream()
                .reduce((x,y)->x+y);
    }

    //combination of map and reduce, using combiner
    public static void reduceFromOneTypeToAnother(List<String> list){
        list.stream()
                .reduce(0,(sum,str)->sum+str.length(),(sum1,sum2)->sum1+sum2);
        //identity is for combiner
    }


    /********************************   Collect operations *********/

    public static void simplCollect(List<String> list){
        list.stream()
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
    }

    public static void collectWithCollectors(List<String> list){
        list.stream()
                .collect(Collectors.toList());

        list.stream()
                .collect((Collectors.toSet()));

        list.stream()
                .collect((Collectors.toCollection(ArrayDeque::new)));
    }


    public static void collectToMap(List<String> list){
        list.stream()
                .collect(Collectors.toMap(str->str,String::length));

        //merge is called when duplicate keys are found
        list.stream()
                .collect(Collectors
                        .toMap(str->str, String::length, (v1,v2)->v1));

        //provide the map, ordering
        list.stream()
                .collect(Collectors
                        .toMap(str->str,String::length, (v1,v2)->v1, LinkedHashMap::new));
    }

    /********************************  Collect aggregation ********
     */

    public static void aggregatedCollect(List<String> list){



    }


    /********************************   Match operations ***********
     * short circuit in nature
     * */
    public static void matchOperations(List<String> list){

        boolean bool;

        bool = list.stream()
                .anyMatch(e->e.equalsIgnoreCase("john"));

        bool= list.stream()
                .allMatch(e->e.equalsIgnoreCase("john"));

        bool = list.stream()
                .noneMatch(e->e.equalsIgnoreCase("John"));
    }

    /********************************   Find operations ************
     * shortcircuit in nature
     * */
    public static void findOperations(List<String> list){

        Optional<String> op;

        op = list.stream()
                .findFirst();

        op = list.stream()
                .findAny();
    }


    /********************************   min, max, count ************/
    public static void aggregateOperations(List<String> list){

        long cnt = list.stream()
                    .count();
        Optional<String> op;

        op = list.stream()
                        .min(Comparator.comparing(str->str.length()));

        op = list.stream()
                .max(Comparator.comparing(String::length).reversed());
    }




    /********************************  sum, average, summaryStatistics ****
     * only available for primitive streams
     */
    public static void aggregtePrimitive(List<Integer> list){
        long sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        OptionalDouble average = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        IntSummaryStatistics stat = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

    }

}
