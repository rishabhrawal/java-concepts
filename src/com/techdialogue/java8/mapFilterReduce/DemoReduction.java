package com.techdialogue.java8.mapFilterReduce;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * @author Rishabh Rawal
 * @date 12/26/17
 */
public class DemoReduction {

    //valueIfEmpty is the identity element
    public static int reduce(List<Integer> values, int valueIfEmpty, BinaryOperator<Integer> reduction){
        int result = valueIfEmpty;
        for(int value: values){
            result = reduction.apply(result, value);
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5}));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7}));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(new Integer[]{0, 1, 2, 3}));

        BinaryOperator<Integer> op = (i1, i2) -> i1 + i2;

        int reduction = reduce(list1, 0, op);
        System.out.println("Sum: " + reduction);


        //simulate parallel computation, lambda has top be associative

    }
}