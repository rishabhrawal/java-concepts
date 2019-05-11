package com.techdialogue.java.datatype;

import java.util.Arrays;

public class StringCharDemo {

    public static void main (String[] args){

        String s = "some value";

        /**
         * String to char
         */

        //loop
        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }

        //stream
        s.chars().
                forEach(System.out::print); //generates IntStream
        System.out.println();


        s.chars().
                forEach(i->System.out.print((char)i)); //just cast int value to char to get the corresponding char value
        System.out.println();
        System.out.println("------------------------------------------------");

        /**
         * tokenisation
         */
        String[] tokens  = s.split(" ");
        Arrays.stream(tokens)
                .forEach(System.out::print);

        /**
         * substring concat
         */



    }
}
