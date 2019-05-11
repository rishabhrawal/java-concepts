package com.techdialogue.java8.streams;


import com.techdialogue.Utility;

import java.util.stream.IntStream;

public class Recipe1 {

    public static void main(String[] args) {
        //Looping using streams
        IntStream.range(1, 5)
                .forEach(System.out::println);
        Utility.printLine();

        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println);
    }
}
