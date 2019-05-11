package com.techdialogue.java8.streams;


import com.techdialogue.Orange;
import com.techdialogue.Utility;

import java.util.Comparator;

public class Sorting {

    public static void main(String[] args) {


        Utility.getOranges()
                .stream()
                .sorted(Comparator.comparing((Orange::getWeight)))
                .forEach(System.out::println);

        Utility.printLine();
        Utility.getOranges()
                .stream()
                .sorted(Comparator.comparing((Orange::getWeight)).thenComparing(Orange::getPicked))
                .forEach(System.out::println);
    }
}
