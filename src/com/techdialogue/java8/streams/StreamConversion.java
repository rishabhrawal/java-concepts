package com.techdialogue.java8.streams;


import com.techdialogue.Orange;
import com.techdialogue.Utility;

public class StreamConversion {

        public static void main(String[] args) {
            System.out.println("Let us check the original Stream...");
            Utility.getOranges().stream().forEach(System.out::println);
            System.out.println("Stream converted to int...");
            Utility.printLine();
            Utility.getOranges().stream().mapToInt(Orange::getWeight).forEach(System.out::println);
        }

}
